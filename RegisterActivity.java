package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button register = (Button) findViewById(R.id.register_btn);
        register.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText user = (EditText) findViewById(R.id.username_id);
                EditText email = (EditText) findViewById(R.id.email_id);
                EditText pass = (EditText) findViewById(R.id.pass_id);

                String userStr = user.getText().toString();
                String emailStr = email.getText().toString();
                String passStr = pass.getText().toString();

                if(TextUtils.isEmpty(userStr)){
                    Toast.makeText(getApplicationContext(), "PLEASE ENTER USERNAME !",Toast.LENGTH_LONG).show();
                    return;
                }
                if(TextUtils.isEmpty(emailStr)){
                    Toast.makeText(getApplicationContext(), "PLEASE ENTER EMAIL !",Toast.LENGTH_LONG).show();
                    return;
                }
                if(TextUtils.isEmpty(passStr)){
                    Toast.makeText(getApplicationContext(), "PLEASE ENTER PASSWORD !",Toast.LENGTH_LONG).show();
                    return;
                }
                else{
                    Toast.makeText(getApplicationContext(), "User registered successfully !\n\nEnter credentials to login.",Toast.LENGTH_LONG).show();
                }
                Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                i.putExtra("username",userStr);
                i.putExtra("email",emailStr);
                i.putExtra("pass",passStr);

                startActivity(i);
            }
        });

        Button login = (Button) findViewById(R.id.login_btn);
        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

    }
}