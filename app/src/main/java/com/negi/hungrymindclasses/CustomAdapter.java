package com.negi.hungrymindclasses;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class CustomAdapter extends BaseAdapter {

    Context mcontext;
    int logo[];
    String text[];
    public CustomAdapter(Context mcontext,int[] logo,String text[])
    {
        this.mcontext=mcontext;
        this.logo=logo;
        this.text=text;
    }
    @Override
    public int getCount() {
        return logo.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(mcontext).inflate(R.layout.custom_grid,null);
        ImageView img=convertView.findViewById(R.id.images);
        TextView tv=convertView.findViewById(R.id.subtext);
        img.setImageResource(logo[position]);
        tv.setText(text[position]);
        LinearLayout cat;
        cat=convertView.findViewById(R.id.category);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mcontext,""+text[position],Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(mcontext,Category.class);
                intent.putExtra("cat",text[position]);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mcontext.startActivity(intent);
            }
        });
        return convertView;
    }
}
