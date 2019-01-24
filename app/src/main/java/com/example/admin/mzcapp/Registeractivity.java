package com.example.admin.mzcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registeractivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button  b1,b2;
    String getname,getadmnno,getmobileno,getemailid,getpassword,getconformpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractivity);
        ed1 = (EditText) findViewById(R.id.name);
        ed2 = (EditText) findViewById(R.id.admnno);
        ed3 = (EditText) findViewById(R.id.mobileno);
        ed4 = (EditText) findViewById(R.id.emailid);
        ed5 = (EditText) findViewById(R.id.username);
        ed6 = (EditText) findViewById(R.id.password);
        ed7 = (EditText) findViewById(R.id.conformpasswordd);
        b1=(Button)findViewById(R.id.register);
        b2=(Button)findViewById(R.id.alreadyregister);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getname=ed1.getText().toString();
                getadmnno=ed2.getText().toString();
                getmobileno=ed3.getText().toString();
                getpassword=ed4.getText().toString();
                getconformpassword=ed5.getText().toString();

Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });





    }
}
