package com.negi.hungrymindclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
FloatingActionButton fab,fabfb,fabyt;
int show=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    fab=findViewById(R.id.link);
    fabfb=findViewById(R.id.fb);
    fabyt=findViewById(R.id.youtube);
    fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==fab)
        {
            if(show==0)
            {
                fabfb.show();
                fabyt.show();
                show=1;
            }
            else{
                fabfb.hide();
                fabyt.hide();
                show=0;
            }
        }
    }
}
