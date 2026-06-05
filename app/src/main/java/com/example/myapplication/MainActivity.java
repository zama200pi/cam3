package com.example.myapplication;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText tsx;
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
        tsx=findViewById(R.id.edit_query);

        btnPos.setOnClickListener(v -> {
            String s=tsx.getText().toString();

            if(!s.isEmpty()){counts+=Integer.parseInt(s);}
            txtCountdown.setText("count: "+counts);
        });

        btnNeg.setOnClickListener(v -> {

            String s=tsx.getText().toString();

            if(!s.isEmpty()){counts-=Integer.parseInt(s);}
            txtCountdown.setText("count: "+counts);
        });
    }
}