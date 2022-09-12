package com.example.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
 EditText e1,e2;
 RadioButton f,n;
 RadioGroup genderGrp;
 Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPersonName2);
        genderGrp=findViewById(R.id.rd);
        f=findViewById(R.id.radioButton6);
        n=findViewById(R.id.radioButton5);
        b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registration();
            }
        });
    }
    private void registration(){
        SharedPreferences share=getSharedPreferences("Test_data",MODE_PRIVATE);
        SharedPreferences.Editor editor=share.edit();
        editor.putString("fname",e1.getText().toString());
        editor.putString("lname",e2.getText().toString());
        String radioValue="";
        switch (genderGrp.getCheckedRadioButtonId())
        {
            case R.id.radioButton5: radioValue="male";
            break;
            case R.id.radioButton6: radioValue="female";
            break;
            default:break;
        }
        editor.putString("gender",radioValue);
        editor.apply();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}