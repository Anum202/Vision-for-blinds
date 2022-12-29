package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    TextView tv = (TextView) findViewById(R.id.welcome_tv);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        registerForContextMenu(tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.context, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemid = item.getItemId();
        if(itemid == R.id.m1){
            tv.setText("Home Screen selected.");
        }
        if(itemid == R.id.m2){
            tv.setText("Image Captioning selected.");
        }
        if(itemid == R.id.m3){
            tv.setText("OCR Detection selected.");
        }
        if(itemid == R.id.m4){
            tv.setText("Currency Detection selected.");
        }
        if(itemid == R.id.m5){
            tv.setText("Color Detection selected.");
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int itemid = item.getItemId();
        if(itemid == R.id.c1){
            Toast.makeText(getApplicationContext(),"About Us selected.", Toast.LENGTH_SHORT).show();
            //tv.setText("About Us selected.");
        }
        if(itemid == R.id.c2){
            Toast.makeText(getApplicationContext(),"Contact Us selected.", Toast.LENGTH_SHORT).show();
            //tv.setText("Contact Us selected.");
        }
        if(itemid == R.id.c3){
            Toast.makeText(getApplicationContext(),"Settings selected.", Toast.LENGTH_SHORT).show();
            //tv.setText("Settings selected.");
        }
        if(itemid == R.id.c4){
            Toast.makeText(getApplicationContext(),"Logout selected.", Toast.LENGTH_SHORT).show();
            //tv.setText("Logout selected.");
        }
        return super.onContextItemSelected(item);
    }
}
