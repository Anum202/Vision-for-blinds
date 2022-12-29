package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        Button reset = (Button) findViewById(R.id.reset_btn);
        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText email = (EditText) findViewById(R.id.email_id);

                String emailStr = email.getText().toString();

                if(TextUtils.isEmpty(emailStr)){
                    Toast.makeText(getApplicationContext(), "PLEASE ENTER EMAIL !", Toast.LENGTH_LONG).show();
                    return;
                }
                else{
                    Toast.makeText(getApplicationContext(), "RESET YOUR PASSWORD NOW.", Toast.LENGTH_LONG).show();
                }
                Intent i = new Intent(ForgetPasswordActivity.this,ResetPasswordActivity.class);
                startActivity(i);
            }
        });
    }
}