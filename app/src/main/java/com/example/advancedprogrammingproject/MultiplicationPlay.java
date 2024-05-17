package com.example.advancedprogrammingproject;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MultiplicationPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication_play);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ConfigureQ1Input();
        ConfigureQ2Input();
        ConfigureQ3Input();
        ConfigureQ4Input();
        ConfigureQ5Input();
        ConfigureQuit();
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
                        if (ans1 == 5) {
                            Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_LONG).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ2Input() {

        EditText answer = (EditText) findViewById(R.id.question2);
        answer.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans ;
                String val = answer.getText().toString();
                if(!val.isEmpty()) {
                    try {
                        ans = Integer.parseInt(answer.getText().toString());
                        if (ans == 42) {
                            Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_LONG).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ3Input() {

        EditText answer = (EditText) findViewById(R.id.question3);
        answer.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans ;
                String val = answer.getText().toString();
                if(!val.isEmpty()) {
                    try {
                        ans = Integer.parseInt(answer.getText().toString());
                        if (ans == 20) {
                            Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_LONG).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ4Input() {

        EditText answer = (EditText) findViewById(R.id.question4);
        answer.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans ;
                String val = answer.getText().toString();
                if(!val.isEmpty()) {
                    try {
                        ans = Integer.parseInt(answer.getText().toString());
                        if (ans == 14) {
                            Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_LONG).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
    public void ConfigureQ5Input() {

        EditText answer = (EditText) findViewById(R.id.question5);
        answer.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                int ans ;
                String val = answer.getText().toString();
                if(!val.isEmpty()) {
                    try {
                        ans = Integer.parseInt(answer.getText().toString());
                        if (ans == 77) {
                            Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_LONG).show();
                        }
                    }
                    catch (NumberFormatException excl) {
                        Toast.makeText(MultiplicationPlay.this, getString(R.string.Warn_TextOnly), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
    public void ConfigureQuit(){
        Button quitButton = (Button) findViewById(R.id.multip_play_quit);
        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}