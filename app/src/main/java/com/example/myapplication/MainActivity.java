package com.example.myapplication;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtCountdown;
    Button btnPos;
    Button btnNeg;

    int counts=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCountdown = findViewById(R.id.txtCountdown);
        btnPos = findViewById(R.id.btnPos);
        btnNeg = findViewById(R.id.btnNeg);

        btnPos.setOnClickListener(v -> {

            counts+=3;
            txtCountdown.setText("count: "+counts);
        });

        btnNeg.setOnClickListener(v -> {

            counts-=5;
            txtCountdown.setText("count: "+counts);
        });
    }
}