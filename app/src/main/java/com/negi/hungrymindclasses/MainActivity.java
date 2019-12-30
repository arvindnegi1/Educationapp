package com.negi.hungrymindclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
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
            Intent webintent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/hungrymindclass/"));
            startActivity(webintent);
        }
        else if(v==fabyt)
        {
            Intent appintent=new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube/channel/UCrMgn-WIYnYLqVqtf-xl-VA/?guided_help_flow=5"));
            Intent webintent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/channel/UCrMgn-WIYnYLqVqtf-xl-VA/?guided_help_flow=5"));
            try {
                startActivity(appintent);
            }catch (ActivityNotFoundException ex)
            {
                startActivity(webintent);
            }
        }
        else if(v==fabtweet)
        {
            Intent webintent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/hungrymindclass"));
            startActivity(webintent);
        }
        else if(v==fabinsta)
        {
            Intent webintent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/hungrymindclass/"));
            startActivity(webintent);
        }

    }
}
