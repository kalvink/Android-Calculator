package com.kk.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = (TextView)findViewById(R.id.textView);
        final Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("0");
            }
        });
        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("1");
            }
        });
        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("2");
            }
        });
        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("3");
            }
        });
        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("4");
            }
        });
        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("5");
            }
        });
        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("6");
            }
        });
        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("7");
            }
        });
        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("8");
            }
        });
        final Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("9");
            }
        });
        final Button buttonequal = findViewById(R.id.buttonequal);
        buttonequal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("=");
            }
        });
        final Button buttonplus = findViewById(R.id.buttonplus);
        buttonplus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("+");
            }
        });
        final Button buttonminus = findViewById(R.id.buttonminus);
        buttonminus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("-");
            }
        });
        final Button buttonmultiply = findViewById(R.id.buttonmultiply);
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("x");
            }
        });
        final Button buttondivision = findViewById(R.id.buttondivision);
        buttondivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("÷");
            }
        });
    }
}
