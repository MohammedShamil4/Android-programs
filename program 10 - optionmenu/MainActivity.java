package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.option,menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        Intent intent=new Intent();

        switch (item.getItemId()){
            case R.id.second:
                intent.setClass(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                return true;

            case R.id.third:
                intent.setClass(MainActivity.this,MainActivity3.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}