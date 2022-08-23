package com.example.lifeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("lifecycle","onCreate");
        Toast.makeText(getApplicationContext(),"onCreate",Toast.LENGTH_LONG).show();
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();

            }
        });
    }

    protected void onStart(){
        super.onStart();
        Log.i("lifecycle","onStart");
        Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("lifecycle","onResume");
        Toast.makeText(getApplicationContext(),"onResume",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("lifecycle","onPause");
        Toast.makeText(getApplicationContext(),"onPause",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("lifecycle","onStop");
        Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("lifecycle","onRestart");
        Toast.makeText(getApplicationContext(),"onRestart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("lifecycle","onDestroy");
        Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_LONG).show();
    }
    public void openActivity(){
        Intent i= new Intent(this,MainActivity2.class);
        startActivity(i);
    }

}