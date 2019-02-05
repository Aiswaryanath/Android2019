package com.example.admin.mzcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Addactivity extends AppCompatActivity {
    String s1,s2,s3;
    EditText ed1,ed2,ed3;
    int a1,a2,a3;
    Button b,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addactivity);
        ed1=(EditText)findViewById(R.id.number1);
        ed2=(EditText)findViewById(R.id.number2);
        ed3=(EditText)findViewById(R.id.result);
        ed3.setVisibility(View.VISIBLE);
        b=(Button)findViewById(R.id.add);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();
                a1 = Integer.parseInt(s1);
                a2 = Integer.parseInt(s2);
                a3=a1+a2;
                s3 = String.valueOf(a3);
                ed3.setVisibility(View.VISIBLE);
                ed3.setText(s3);
            }
        });
        b1=(Button)findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),WelcomeActivity.class);
                startActivity(i);
            }
        });
    }
}
