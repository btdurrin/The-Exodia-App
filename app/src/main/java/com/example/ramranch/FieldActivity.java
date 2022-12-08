package com.example.ramranch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FieldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field);



        ImageView imgView = (ImageView)findViewById(R.id.imageView5);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                imgView.setVisibility(View.VISIBLE);
            }
        };
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(runnable,2000);




        Button back1Button = findViewById(R.id.bButton);
        back1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FieldActivity.this, MainActivity.class));
            }
        });





    }
}