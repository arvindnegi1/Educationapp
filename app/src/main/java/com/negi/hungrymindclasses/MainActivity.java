package com.negi.hungrymindclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
FloatingActionButton fab,fabfb,fabyt;
int show=0;
GridView subjects;
int logo[]={R.drawable.maths,R.drawable.physics,R.drawable.chemistry,R.drawable.english,R.drawable.nda,R.drawable.force,R.drawable.video,R.drawable.testseries};
   String text[]={"MATHS","PHYSICS","CHEMISTRY","ENGLISH","NDA","AFCAT","VIDEO LECTURE","TEST SERIES"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    fab=findViewById(R.id.link);
    fabfb=findViewById(R.id.fb);
    fabyt=findViewById(R.id.youtube);
    subjects=findViewById(R.id.subject);
    fab.setOnClickListener(this);
    CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),logo,text);
    subjects.setAdapter(customAdapter);
    }

    @Override
    public void onClick(View v) {
        if(v==fab)
        {
            if(show==0)
            {
                fabfb.show();
                fabyt.show();
                fab.setImageResource(R.drawable.ic_cancel_black_24dp);
                show=1;
            }
            else{
                fabfb.hide();
                fabyt.hide();
                fab.setImageResource(R.drawable.ic_share_black_24dp);
                show=0;
            }
        }
    }
}
