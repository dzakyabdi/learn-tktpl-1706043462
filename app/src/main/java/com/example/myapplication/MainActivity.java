package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public boolean finish = false;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startIntent(View v) {
        Intent intent = new Intent(this, StopwatchActivity.class);
        startActivity(intent);
    }
    
    @Override
    public void onBackPressed() {
        if(finish) {
            finish();
        } 
        else {
            Toast.makeText(this, "press the back button one more time", Toast.LENGTH_SHORT).show();
            finish = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    finish = false;
                }
            }, 3 * 1000);
        }
    }
}