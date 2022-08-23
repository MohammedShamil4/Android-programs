package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2,b3,b4;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextNumberDecimal3);
        e2=findViewById(R.id.editTextNumberDecimal4);
        b1=findViewById(R.id.button3);
        b2=findViewById(R.id.button4);
        b3=findViewById(R.id.button5);
        b4=findViewById(R.id.button6);
        t=findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a+b;
                t.setText(Float.toString(c));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a-b;
                t.setText(Float.toString(c));

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a*b;
                t.setText(Float.toString(c));

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a/b;
                t.setText(Float.toString(c));

            }
        });

    }
}