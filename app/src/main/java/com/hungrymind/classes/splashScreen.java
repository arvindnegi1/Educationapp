package com.hungrymind.classes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class splashScreen extends AppCompatActivity {
LinearLayout l2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        l2=findViewById(R.id.lay2);
        Animation bottom= AnimationUtils.loadAnimation(splashScreen.this,R.anim.bottomup);
        l2.setAnimation(bottom);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splashScreen.this,MainActivity.class));
                finish();
            }
        },3000);

    }
}
