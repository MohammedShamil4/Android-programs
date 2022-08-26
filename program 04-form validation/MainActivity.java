package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fn,ln,pd;
    RadioButton m,f;
    Button b;
    Switch n;
    CheckBox c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dec();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    Toast.makeText(MainActivity.this, "successfully registered", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void dec(){
        fn=findViewById(R.id.editTextTextPersonName);
        ln=findViewById(R.id.editTextTextPersonName2);
        pd=findViewById(R.id.editTextTextPassword);
        m=findViewById(R.id.radioButton5);
        f=findViewById(R.id.radioButton6);
        b=findViewById(R.id.button);
        n=findViewById(R.id.switch1);
        c=findViewById(R.id.checkBox);

    }
    public Boolean validate(){


        Boolean status=false;
       String fns=fn.getText().toString();
       String lns=ln.getText().toString();
       String pds=pd.toString();


        if(fns.equals("")){
            Toast.makeText(this, "Enter FirstName", Toast.LENGTH_SHORT).show();
        }
        else if (lns.equals("")){
            Toast.makeText(this, "Enter LastName", Toast.LENGTH_SHORT).show();
        }else if (pds.length()<3){
            Toast.makeText(this, "Enter Valid Password", Toast.LENGTH_SHORT).show();

        }else if (!m.isChecked() && !f.isChecked()){
            Toast.makeText(this, "Please select Gender", Toast.LENGTH_SHORT).show();
        }else if(!n.isChecked()){
            Toast.makeText(this, "Please On the Switch", Toast.LENGTH_SHORT).show();
        }else if(!c.isChecked()){
            Toast.makeText(this, " please agree to the terms & conditions", Toast.LENGTH_SHORT).show();
        }else
        {
            return status=true;
        }
        return status;

    }





}