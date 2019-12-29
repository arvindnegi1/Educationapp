package com.negi.hungrymindclasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter2 extends BaseAdapter {
    Context mcontext;
    int logo[];
    String text[];
    public CustomAdapter2(Context mcontext,int[] logo,String text[])
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
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(mcontext).inflate(R.layout.custom_grid,null);
        ImageView img=convertView.findViewById(R.id.images);
        TextView tv=convertView.findViewById(R.id.subtext);
        img.setImageResource(logo[position]);
        tv.setText(text[position]);
        return convertView;
    }
}
