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

import java.util.List;

public class Category extends AppCompatActivity {
Toolbar tb;
TextView tv;
ImageView goback;
GridView gridView;
int logo[];
String text[];
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
        CustomAdapter2 customAdapter2 = null;
        if(temp.equals("MATHS")||temp.equals("SCIENCE")) {
            logo = new int[]{R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve, R.drawable.assignment};
            text=new String[]{"CLASS 9","CLASS 10","CLASS 11","CLASS 12","ASSIGNMENT"};
            customAdapter2 = new CustomAdapter2(getApplicationContext(), logo, text, temp);
        }
        else if(temp.equals("ENGLISH")){
            logo = new int[]{R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve, R.drawable.nda,R.drawable.force};
            text=new String[]{"CLASS 9","CLASS 10","CLASS 11","CLASS 12","NDA","AFCAT"};
            customAdapter2 = new CustomAdapter2(getApplicationContext(), logo, text, temp);
        }
        else if(temp.equals("PHYSICS"))
        {
            logo = new int[]{R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve, R.drawable.nda,R.drawable.force};
            text=new String[]{"CLASS 9","CLASS 10","CLASS 11","CLASS 12","NDA","AFCAT"};
            customAdapter2 = new CustomAdapter2(getApplicationContext(), logo, text, temp);
        }
        else if(temp.equals("NDA"))
        {
            logo = new int[]{R.drawable.maths,R.drawable.assignment};
            text=new String[]{"MATHS","GS"};
            customAdapter2 = new CustomAdapter2(getApplicationContext(), logo, text, temp);
        }
        else if(temp.equals("AFCAT"))
        {
            logo = new int[]{R.drawable.maths,R.drawable.testseries};
            text=new String[]{"MATHS","EKT"};
            customAdapter2 = new CustomAdapter2(getApplicationContext(), logo, text, temp);
        }
        else if(temp.equals("TEST SERIES"))
        {
            logo = new int[]{R.drawable.maths,R.drawable.assignment};
            text=new String[]{"MATHS","GS"};
            customAdapter2 = new CustomAdapter2(getApplicationContext(), logo, text, temp);
        }
            goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Category.super.onBackPressed();
            }
        });
        gridView=findViewById(R.id.gridclass);
        
        gridView.setAdapter(customAdapter2);
    }
}
