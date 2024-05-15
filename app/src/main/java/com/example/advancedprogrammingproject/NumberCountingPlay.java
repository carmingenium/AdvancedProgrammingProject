package com.example.advancedprogrammingproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NumberCountingPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_number_counting_play);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ConfigureQuitButton();
        ConfigureQ0Input();
        ConfigureQ1Input();
        ConfigureQ2Input();
        ConfigureQ3Input();
        ConfigureQ4Input();
        ConfigureQ5Input();
        ConfigureQ6Input();
        ConfigureQ7Input();
        ConfigureQ8Input();
        ConfigureQ9Input();
    }
    public void ConfigureQuitButton() {
        Button playButton = (Button) findViewById(R.id.numbercount_quit);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void ConfigureQ0Input() {
        EditText answer1 = (EditText) findViewById(R.id.question0);
        answer1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans1 ;
                String val1 = answer1.getText().toString();
                if(!val1.isEmpty()) {
                    try {
                        ans1 = Integer.parseInt(answer1.getText().toString());
                        if (ans1 == 0) {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ1Input() {

        EditText answer1 = (EditText) findViewById(R.id.question1);
        answer1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans1 ;
                String val1 = answer1.getText().toString();
                if(!val1.isEmpty()) {
                    try {
                        ans1 = Integer.parseInt(answer1.getText().toString());
                        if (ans1 == 1) {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ2Input() {

        EditText answer1 = (EditText) findViewById(R.id.question2);
        answer1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans1 ;
                String val1 = answer1.getText().toString();
                if(!val1.isEmpty()) {
                    try {
                        ans1 = Integer.parseInt(answer1.getText().toString());
                        if (ans1 == 2) {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ3Input() {

        EditText answer1 = (EditText) findViewById(R.id.question3);
        answer1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans1 ;
                String val1 = answer1.getText().toString();
                if(!val1.isEmpty()) {
                    try {
                        ans1 = Integer.parseInt(answer1.getText().toString());
                        if (ans1 == 3) {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ4Input() {

        EditText answer1 = (EditText) findViewById(R.id.question4);
        answer1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans1 ;
                String val1 = answer1.getText().toString();
                if(!val1.isEmpty()) {
                    try {
                        ans1 = Integer.parseInt(answer1.getText().toString());
                        if (ans1 == 4) {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ5Input() {

        EditText answer1 = (EditText) findViewById(R.id.question5);
        answer1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans1 ;
                String val1 = answer1.getText().toString();
                if(!val1.isEmpty()) {
                    try {
                        ans1 = Integer.parseInt(answer1.getText().toString());
                        if (ans1 == 5) {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ6Input() {

        EditText answer1 = (EditText) findViewById(R.id.question6);
        answer1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans1 ;
                String val1 = answer1.getText().toString();
                if(!val1.isEmpty()) {
                    try {
                        ans1 = Integer.parseInt(answer1.getText().toString());
                        if (ans1 == 6) {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ7Input() {

        EditText answer1 = (EditText) findViewById(R.id.question7);
        answer1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans1 ;
                String val1 = answer1.getText().toString();
                if(!val1.isEmpty()) {
                    try {
                        ans1 = Integer.parseInt(answer1.getText().toString());
                        if (ans1 == 7) {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ8Input() {

        EditText answer1 = (EditText) findViewById(R.id.question8);
        answer1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans1 ;
                String val1 = answer1.getText().toString();
                if(!val1.isEmpty()) {
                    try {
                        ans1 = Integer.parseInt(answer1.getText().toString());
                        if (ans1 == 8) {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ9Input() {

        EditText answer1 = (EditText) findViewById(R.id.question9);
        answer1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans1 ;
                String val1 = answer1.getText().toString();
                if(!val1.isEmpty()) {
                    try {
                        ans1 = Integer.parseInt(answer1.getText().toString());
                        if (ans1 == 9) {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(NumberCountingPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}