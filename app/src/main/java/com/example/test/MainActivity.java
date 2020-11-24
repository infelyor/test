package com.example.test;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountDownTimer cdt = new CountDownTimer(10000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                int time = (int)millisUntilFinished / 1000;

                TextView tv = (TextView)findViewById(R.id.test);
                tv.setText(time);
            }

            @Override
            public void onFinish() {
                finish();
            }
        }.start();
    }
}