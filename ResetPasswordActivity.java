package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        Button reset = (Button) findViewById(R.id.reset_btn);
        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText newPass = (EditText) findViewById(R.id.newpass_id);
                EditText cPass = (EditText) findViewById(R.id.cpass_id);

                String newPassStr = newPass.getText().toString();
                String cPassStr = cPass.getText().toString();

                if(TextUtils.isEmpty(newPassStr)){
                    Toast.makeText(getApplicationContext(), "PLEASE ENTER NEW PASSWORD !", Toast.LENGTH_LONG).show();
                    return;
                }
                if(TextUtils.isEmpty(cPassStr)){
                    Toast.makeText(getApplicationContext(), "PLEASE CONFITM NEW PASSWORD !", Toast.LENGTH_LONG).show();
                    return;
                }
                else{
                    Toast.makeText(getApplicationContext(), "Password reset successfully.\n\n Enter credentials to login.", Toast.LENGTH_LONG).show();
                }
                Intent i = new Intent(ResetPasswordActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}