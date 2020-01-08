package com.negi.hungrymindclasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecCategory extends RecyclerView.Adapter<RecCategory.RecCategoryHolder> {
    Context mcontext;
    int[] logo;
    String text[],course;
    int[] clr;
    public RecCategory(Context mcontext, int[] logo, String text[], String course,int [] clr)
    {
       this.mcontext=mcontext;
       this.logo=logo;
       this.text=text;
       this.course=course;
       this.clr=clr;
    }
    @NonNull
    @Override
    public RecCategory.RecCategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(mcontext).inflate(R.layout.allclass,parent,false);
        RecCategoryHolder holder=new RecCategoryHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecCategory.RecCategoryHolder holder, int position) {
        holder.l3.setBackgroundColor(clr[position]);
        holder.tv.setText(text[position]);
        holder.img.setImageResource(logo[position]);
    }

    @Override
    public int getItemCount() {
        return logo.length;
    }

    public class RecCategoryHolder extends RecyclerView.ViewHolder {
        LinearLayout l3;
        ImageView img;
        TextView tv;
        public RecCategoryHolder(@NonNull View itemView) {
            super(itemView);
            l3=itemView.findViewById(R.id.lay3);
            img=itemView.findViewById(R.id.logo);
            tv=itemView.findViewById(R.id.classtext);


        }
    }
}
