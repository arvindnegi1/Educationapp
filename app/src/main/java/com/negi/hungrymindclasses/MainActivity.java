package com.negi.hungrymindclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
FloatingActionButton fab,fabfb,fabyt,fabtweet,fabinsta;
int show=0;
GridView subjects;
int logo[]={R.drawable.maths,R.drawable.science,R.drawable.english,R.drawable.physics,R.drawable.nda,R.drawable.force,R.drawable.video,R.drawable.testseries};
   String text[]={"MATHS","SCIENCE","ENGLISH","PHYSICS","NDA","AFCAT","VIDEO LECTURE","TEST SERIES"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    fab=findViewById(R.id.link);
    fabfb=findViewById(R.id.fb);
    fabyt=findViewById(R.id.youtube);
    fabtweet=findViewById(R.id.tweet);
    fabinsta=findViewById(R.id.insta);
    subjects=findViewById(R.id.subject);
    fab.setOnClickListener(this);
    fabfb.setOnClickListener(this);
    fabyt.setOnClickListener(this);
    fabtweet.setOnClickListener(this);
    fabinsta.setOnClickListener(this);
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
                fabinsta.show();
                fabtweet.show();
                fab.setImageResource(R.drawable.ic_cancel_black_24dp);
                show=1;
            }
            else{
                fabfb.hide();
                fabyt.hide();
                fabinsta.hide();
                fabtweet.hide();
                fab.setImageResource(R.drawable.ic_timeline_black_24dp);
                show=0;
            }
        }
        else if(v==fabfb)
        {
            Toast.makeText(MainActivity.this,"FACEBOOK",Toast.LENGTH_SHORT).show();

        }
        else if(v==fabyt)
        {
            Toast.makeText(MainActivity.this,"YOUTUBE",Toast.LENGTH_SHORT).show();
        }
    }
}
