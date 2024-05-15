package com.example.advancedprogrammingproject;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LeranSeasonsAnime extends AppCompatActivity {
    int seasonid=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_leran_seasons_anime);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Creating Views for the two images
        ImageView ball1 = findViewById(R.id.seasonimage);
        TextView text1 = findViewById(R.id.season_name);
        text1.setText(R.string.seasons_winter);
        // Creating Animations using ObjectAnimators
        ObjectAnimator Animateball1 = ObjectAnimator.ofFloat(ball1, "translationX", 700f);
        Animateball1.setDuration(4000);
        ConfigureBackButton();

        // Adding onClick Listeners to check the correct side
        ball1.setOnClickListener(new View.OnClickListener() {
            //@RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                //Toast.makeText(OnScreenBall.this, "Lucky!", Toast.LENGTH_SHORT).show();
            }
        });
        // Adding Animation End Listener
        Animateball1.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);

                if(seasonid==3)
                {
                    Animateball1.cancel();
                }
                else
                {
                    if(seasonid==0){
                        ball1.setImageResource(R.drawable.spring_season);
                        seasonid+=1;
                        text1.setText(R.string.seasons_spring);
                        Animateball1.start();
                    }
                    else
                    if(seasonid==1){
                        ball1.setImageResource(R.drawable.summer_season);
                        seasonid+=1;
                        text1.setText(R.string.seasons_summer);
                        Animateball1.start();
                    }
                    else
                    if(seasonid==2){
                        ball1.setImageResource(R.drawable.autumn_season);
                        seasonid+=1;
                        text1.setText(R.string.seasons_autumn);
                        Animateball1.start();
                    }
                    else
                    {
                        Animateball1.cancel();
                    }

                }
            }
        });
        Animateball1.start();

    }

    public void ConfigureBackButton() {
        Button BackToMenuButton = (Button) findViewById(R.id.BackToMenu);
        BackToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}