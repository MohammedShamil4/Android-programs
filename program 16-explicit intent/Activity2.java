package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button bck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        bck = findViewById(R.id.button2);
    }

    public void changeActivity(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}