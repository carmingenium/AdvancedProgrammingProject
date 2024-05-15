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

public class MonthCountingPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_month_counting_play);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ConfigureQuitButton();
        RadioGroup Ans1 = (RadioGroup) findViewById(R.id.Answer1);
        RadioGroup Ans2 = (RadioGroup) findViewById(R.id.Answer2);
        RadioGroup Ans3 = (RadioGroup) findViewById(R.id.Answer3);
        // Uncheck or reset the radio buttons initially
        Ans1.clearCheck();
        Ans2.clearCheck();
        Ans3.clearCheck();

        Ans1.setOnCheckedChangeListener(
                new RadioGroup
                        .OnCheckedChangeListener() {
                    @Override

                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId) {

                        RadioButton ans2 = findViewById(R.id.radio13);

                        if(ans2.isChecked())
                        {
                            Toast.makeText(MonthCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(MonthCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        Ans2.setOnCheckedChangeListener(
                new RadioGroup
                        .OnCheckedChangeListener() {
                    @Override

                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId) {

                        RadioButton ans2 = findViewById(R.id.radio22);

                        if(ans2.isChecked())
                        {
                            Toast.makeText(MonthCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(MonthCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        Ans3.setOnCheckedChangeListener(
                new RadioGroup
                        .OnCheckedChangeListener() {
                    @Override

                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId) {

                        RadioButton ans2 = findViewById(R.id.radio31);

                        if(ans2.isChecked())
                        {
                            Toast.makeText(MonthCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(MonthCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
    public void ConfigureQuitButton() {
        Button playButton = (Button) findViewById(R.id.monthcount_play_quit);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}