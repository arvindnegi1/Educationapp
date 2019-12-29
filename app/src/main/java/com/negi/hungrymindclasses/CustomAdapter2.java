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

public class CustomAdapter2 extends BaseAdapter {
    Context mcontext;
    int logo[];
    String text[];
    String course;
    public CustomAdapter2(Context mcontext,int[] logo,String text[],String course)
    {
        this.mcontext=mcontext;
        this.logo=logo;
        this.text=text;
        this.course=course;
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
        LinearLayout second=convertView.findViewById(R.id.category);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (course)
                {
                    case "PHYSICS": switch (text[position])
                                    {
                                        case "CLASS 9":
                                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                                            Intent intent=new Intent(mcontext,Reference.class);
                                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                            mcontext.startActivity(intent);
                                            break;
                                        case "CLASS 10":
                                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                                            break;
                                        case "CLASS 11":
                                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                                            break;
                                        case "CLASS 12":
                                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                                            break;
                                        case "ASSIGNMENT":
                                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                                            break;
                                    }
                        break;
                    case "MATHS":
                        break;
                    case "ENGLISH":
                        break;
                    case "AFCAT":
                        break;
                    case "NDA":
                        break;
                }
            }
        });
        return convertView;
    }
}
