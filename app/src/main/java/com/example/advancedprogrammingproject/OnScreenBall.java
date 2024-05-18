package com.example.advancedprogrammingproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.annotation.RequiresApi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class OnScreenBall extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_on_screen_ball);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Creating Views for the two images
        ImageView ball1 = findViewById(R.id.ballobject);
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
                View view1 = ball1;
                // Place the glasses again in the top
                float currentY = view1.getY();
                // End the animations
                if(currentY+120>=500)
                {
                    Animateball1.cancel();
                }
                else {
                    view1.setY(currentY+120);
                    Animateball1.start();
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