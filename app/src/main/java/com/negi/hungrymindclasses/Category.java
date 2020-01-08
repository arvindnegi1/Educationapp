package com.negi.hungrymindclasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
RecyclerView recyclerView;
int logo[];
String text[];
int clr[];
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
       RecCategory recCategory=null;
        assert temp != null;
        switch (temp) {
            case "MATHS":
            case "SCIENCE":
            case "ENGLISH":
            case "TEST SERIES":
                logo = new int[]{R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve};
                text = new String[]{"CLASS 6","CLASS 7","CLASS 8","CLASS 9", "CLASS 10", "CLASS 11", "CLASS 12"};
                clr=new int[]{R.color.l1,R.color.l2,R.color.l3,R.color.l4,R.color.light_green,R.color.l2,R.color.l3};
                recCategory= new RecCategory(getApplicationContext(), logo, text, temp,clr);
                break;
            case "AFCAT":
            case "NDA":logo = new int[]{R.drawable.maths,R.drawable.assignment,R.drawable.testseries,R.drawable.english};
                text = new String[]{"MATHS","GS","OLD PAPER","ENGLISH"};
                clr=new int[]{R.color.l1,R.color.l2,R.color.l3,R.color.l4};
                recCategory= new RecCategory(getApplicationContext(), logo, text, temp,clr);
                break;


        }
            goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Category.super.onBackPressed();
            }
        });

        recyclerView=findViewById(R.id.recv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(recCategory);
    }
}
