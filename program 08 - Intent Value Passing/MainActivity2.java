package com.example.intentvaluepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t=findViewById(R.id.textView);
        Bundle extra=getIntent().getExtras();
        String text1=extra.getString("Name");
        t.setText("Name : "+text1);
    }
}