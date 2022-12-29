package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.login_btn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email = (EditText) findViewById(R.id.email_id);
                EditText pass = (EditText) findViewById(R.id.pass_id);

                String emailStr = email.getText().toString();
                String passStr = pass.getText().toString();

                if(TextUtils.isEmpty(emailStr)){
                    Toast.makeText(getApplicationContext(), "PLEASE ENTER EMAIL !",Toast.LENGTH_LONG).show();
                    return;
                }
                if(TextUtils.isEmpty(passStr)){
                    Toast.makeText(getApplicationContext(), "PLEASE ENTER PASSWORD !",Toast.LENGTH_LONG).show();
                    return;
                }
                else{
                    Toast.makeText(getApplicationContext(), "User logged in successfully !\n\nWelcome to our application.",Toast.LENGTH_LONG).show();
                }

                Intent i = new Intent(LoginActivity.this, WelcomeActivity.class);
                i.putExtra("email", emailStr);
                i.putExtra("pass", passStr);

                startActivity(i);
            }
        });

        Button forget = (Button) findViewById(R.id.forget_btn);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
                startActivity(i);
            }
        });

    }
}