package com.example.advancedprogrammingproject;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SeasonLearn extends AppCompatActivity {
    String seasonname ="win";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_season_learn);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ConfigureQuitButton();
        ConfigurePlayButton();
        ConfigureNextButton();
        seasonname = "win";
    }
    public void ConfigurePlayButton() {
        Button playButton = (Button) findViewById(R.id.seasons_play);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(SeasonLearn.this, MonthCountingPlay.class));
            }
        });
    }
    public void ConfigureQuitButton() {
        Button playButton = (Button) findViewById(R.id.seasons_quit);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void ConfigureNextButton() {
        Button playButton = (Button) findViewById(R.id.next);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(seasonname.equals("win"))
                {
                    ImageView img = (ImageView) findViewById(R.id.imageView1);
                    img.setVisibility(View.INVISIBLE);
                    ImageView img2 = (ImageView) findViewById(R.id.imageView2);
                    img2.setVisibility(View.VISIBLE);
                    img2.requestFocus();
                    seasonname="spr";
                }
                else
                {
                    if(seasonname.equals("spr"))
                    {
                        ImageView img = (ImageView) findViewById(R.id.imageView2);
                        img.setVisibility(View.INVISIBLE);
                        ImageView img2 = (ImageView) findViewById(R.id.imageView3);
                        img2.setVisibility(View.VISIBLE);
                        img2.requestFocus();
                        seasonname="sum";
                    }
                    else
                    {
                        if(seasonname.equals("sum"))
                        {
                            ImageView img = (ImageView) findViewById(R.id.imageView3);
                            img.setVisibility(View.INVISIBLE);
                            ImageView img2 = (ImageView) findViewById(R.id.imageView4);
                            img2.setVisibility(View.VISIBLE);
                            img2.requestFocus();
                            seasonname="aut";
                        }
                        else
                        {
                            if(seasonname.equals("aut"))
                            {
                                ImageView img = (ImageView) findViewById(R.id.imageView4);
                                img.setVisibility(View.INVISIBLE);
                                ImageView img2 = (ImageView) findViewById(R.id.imageView1);
                                img2.setVisibility(View.VISIBLE);
                                img2.requestFocus();
                                seasonname="win";
                            }
                        }
                    }
                }
            }
        });
    }
}