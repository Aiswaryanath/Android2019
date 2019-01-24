package com.example.admin.mzcapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {
String usr,pass,getUsr,getPass,checkusername;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        SharedPreferences sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
        checkusername = sharedPreferences.getString("username",null);
        if (checkusername!=null)
        {
            Intent i=new Intent(getApplicationContext(),WelcomeActivity.class);
            startActivity(i);
        }
        b=(Button)findViewById(R.id.logout);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=getSharedPreferences("login",MODE_PRIVATE).edit();
                editor.clear();
                editor.apply();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        SharedPreferences s=getSharedPreferences("login",MODE_PRIVATE);
        getUsr=sharedPreferences.getString("username",null);
        getPass=sharedPreferences.getString("password",null);
        Toast.makeText(getApplicationContext(),getUsr,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),getPass,Toast.LENGTH_LONG).show();
        Intent i=getIntent();
//        usr=i.getExtras().getString("username");
//        pass=i.getStringExtra("password");
//        Toast.makeText(getApplicationContext(),usr,Toast.LENGTH_LONG).show();
//        Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();
    }
}
