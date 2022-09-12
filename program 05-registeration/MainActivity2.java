package com.example.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
  Button b2;
  TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t=findViewById(R.id.textView);
        b2=findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetch();
            }
        });
    }
    private void fetch(){
        SharedPreferences share=getSharedPreferences("Test_data",MODE_PRIVATE);
        t.setText(" First name : "+share.getString("fname","")+"\n Last name : "+share.getString("lname","")
        +"\n Gender : "+share.getString("gender",""));
    }
}