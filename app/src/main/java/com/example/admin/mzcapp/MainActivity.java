package com.example.admin.mzcapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
    Button b,b1,b2;
    String getusername,getpassword,checkusername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
        checkusername = sharedPreferences.getString("username",null);
        if (checkusername!=null)
        {
            Intent i=new Intent(getApplicationContext(),WelcomeActivity.class);
            startActivity(i);
        }
        ed1 = (EditText) findViewById(R.id.username);
        ed2 = (EditText) findViewById(R.id.password);
        b=(Button)findViewById(R.id.login);
        b1=(Button)findViewById(R.id.register);
        b2=(Button)findViewById(R.id.calculator);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getusername=ed1.getText().toString();
                getpassword=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getusername,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getpassword,Toast.LENGTH_LONG).show();
                if (getusername.equals("mzc")&&getpassword.equals("college"))
                {
                    SharedPreferences.Editor editor=getSharedPreferences("login",MODE_PRIVATE).edit();
                    editor.putString("username",getusername);
                    editor.putString("password",getpassword);
                    editor.apply();//editor.commit();
                    Intent i=new Intent(getApplicationContext(),WelcomeActivity.class);
                    i.putExtra("username",getusername);
                    i.putExtra("password",getpassword);
                    startActivity(i);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Registeractivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),CalculatorActivity.class);
                startActivity(i);
            }
        });

    }
}
