package com.example.advancedprogrammingproject;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class SpellingPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spelling_play);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ConfigureQuitButton();
        ConfigureCheckButton();
    }
    public void ConfigureQuitButton() {
        Button playButton = (Button) findViewById(R.id.btn_quit);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void ConfigureCheckButton() {
        Button playButton = (Button) findViewById(R.id.btn_check);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView wordTxt = (TextView) findViewById(R.id.txt1);
                String WordGiven = wordTxt.getText().toString();

                EditText splTxt1 = (EditText) findViewById(R.id.spell1);
                String spl1 = splTxt1.getText().toString();
                EditText splTxt2 = (EditText) findViewById(R.id.spell2);
                String spl2 = splTxt2.getText().toString();
                EditText splTxt3 = (EditText) findViewById(R.id.spell3);
                String spl3 = splTxt3.getText().toString();
                EditText splTxt4 = (EditText) findViewById(R.id.spell4);
                String spl4 = splTxt4.getText().toString();
                EditText splTxt5 = (EditText) findViewById(R.id.spell5);
                String spl5 = splTxt5.getText().toString();
                EditText splTxt6 = (EditText) findViewById(R.id.spell6);
                String spl6 = splTxt6.getText().toString();
                EditText splTxt7 = (EditText) findViewById(R.id.spell7);
                String spl7 = splTxt7.getText().toString();

                boolean success = true;

                if(WordGiven.substring(0,1).equals(spl1))
                {
                    splTxt1.setTextColor(Color.parseColor("Black"));
                    if (WordGiven.substring(1, 2).equals(spl2))
                    {
                        splTxt2.setTextColor(Color.parseColor("Black"));
                        if (WordGiven.substring(2, 3).equals(spl3))
                        {
                            splTxt3.setTextColor(Color.parseColor("Black"));
                            if (WordGiven.substring(3, 4).equals(spl4))
                            {
                                splTxt4.setTextColor(Color.parseColor("Black"));
                                if (WordGiven.substring(4, 5).equals(spl5))
                                {
                                    splTxt5.setTextColor(Color.parseColor("Black"));
                                    if (WordGiven.substring(5, 6).equals(spl6))
                                    {
                                        splTxt6.setTextColor(Color.parseColor("Black"));
                                        if (WordGiven.substring(6, 7).equals(spl7))
                                        {
                                            success = true;
                                            splTxt7.setTextColor(Color.parseColor("Black"));
                                        } else {
                                            success = false;
                                            splTxt7.setTextColor(Color.parseColor("Red"));
                                        }
                                    } else {
                                        success = false;
                                        splTxt6.setTextColor(Color.parseColor("Red"));
                                    }
                                } else {
                                    success = false;
                                    splTxt5.setTextColor(Color.parseColor("Red"));
                                }
                            } else {
                                success = false;
                                splTxt4.setTextColor(Color.parseColor("Red"));
                            }
                        } else {
                            success = false;
                            splTxt3.setTextColor(Color.parseColor("Red"));
                        }

                    } else {
                        success = false;
                        splTxt2.setTextColor(Color.parseColor("Red"));
                    }

                }
                else{
                    success = false;
                    splTxt1.setTextColor(Color.parseColor("Red"));
                }
                if (success) {
                    Toast.makeText(SpellingPlay.this, getString(R.string.Warn_Success), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SpellingPlay.this, getString(R.string.Warn_Failed), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}