package com.negi.hungrymindclasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Category extends AppCompatActivity {
Toolbar tb;
TextView tv;
ImageView goback;
GridView gridView;
int logo[]={R.drawable.nine,R.drawable.ten,R.drawable.eleven,R.drawable.twelve,R.drawable.assignment};
  String text[]={"CLASS 9","CLASS 10","CLASS 11","CLASS 12","ASSIGNMENT"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        tb=findViewById(R.id.topcat);
        tv=tb.findViewById(R.id.texttop);
        goback=tb.findViewById(R.id.back);
        Intent intent=getIntent();
        String temp=intent.getStringExtra("cat");
        tv.setText(temp);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Category.super.onBackPressed();
            }
        });
        gridView=findViewById(R.id.gridclass);
        CustomAdapter2 customAdapter2=new CustomAdapter2(getApplicationContext(),logo,text,temp);
        gridView.setAdapter(customAdapter2);
    }
}
