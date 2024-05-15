package com.example.advancedprogrammingproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LearnSeasonsPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_learn_seasons_play);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RadioGroup Ans1 = (RadioGroup) findViewById(R.id.Answer1);
        RadioGroup Ans2 = (RadioGroup) findViewById(R.id.Answer2);
        RadioGroup Ans3 = (RadioGroup) findViewById(R.id.Answer3);
        // Uncheck or reset the radio buttons initially
        Ans1.clearCheck();
        Ans2.clearCheck();
        Ans3.clearCheck();
        ConfigureQuitButton();

        Ans1.setOnCheckedChangeListener(
                new RadioGroup
                        .OnCheckedChangeListener() {
                    @Override

                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId) {

                        RadioButton ans2 = findViewById(R.id.radio2);

                        if(ans2.isChecked())
                        {
                            Toast.makeText(LearnSeasonsPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(LearnSeasonsPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        Ans2.setOnCheckedChangeListener(
                new RadioGroup
                        .OnCheckedChangeListener() {
                    @Override

                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId) {

                        RadioButton ans3 = findViewById(R.id.radio21);
                        if(ans3.isChecked())
                        {
                            Toast.makeText(LearnSeasonsPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(LearnSeasonsPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        Ans3.setOnCheckedChangeListener(
                new RadioGroup
                        .OnCheckedChangeListener() {
                    @Override

                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId) {
                        RadioButton ans1 = findViewById(R.id.radio33);

                        if(ans1.isChecked())
                        {
                            Toast.makeText(LearnSeasonsPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(LearnSeasonsPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
    public void ConfigureQuitButton() {
        Button playButton = (Button) findViewById(R.id.Season_learn_quit);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}