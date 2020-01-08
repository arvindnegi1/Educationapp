package com.hungrymind.classes;

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
        final Intent intent=new Intent(mcontext,Reference.class);

        LinearLayout second=convertView.findViewById(R.id.category);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (course)
                {
                    case "MATHS": switch (text[position])
                                    {
                                        case "CLASS 9":
                                           // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/math/9th/");
                                            mcontext.startActivity(intent);
                                            break;
                                        case "CLASS 10":
                                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/math/10th/");
                                            mcontext.startActivity(intent);
                                            break;
                                        case "CLASS 11":
                                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/math/11/");
                                            mcontext.startActivity(intent);
                                            break;
                                        case "CLASS 12":
                                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/math/12th/");
                                            mcontext.startActivity(intent);
                                            break;
                                        case "ASSIGNMENT":
                                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/test-series/");
                                            mcontext.startActivity(intent);
                                            break;
                                    }
                        break;
                    case "SCIENCE":switch (text[position])
                    {
                        case "CLASS 9":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/science/9th-science/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 10":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/science/10th-science/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 11":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/science/11th/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 12":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/science/12th-science/");
                            mcontext.startActivity(intent);
                            break;
                        case "ASSIGNMENT":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/test-series/");
                            mcontext.startActivity(intent);
                            break;
                    }
                        break;
                    case "ENGLISH":switch (text[position])
                    {
                        case "CLASS 9":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/english/9th/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 10":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/english/10th/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 11":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/english/11th/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 12":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/english/12th/");
                            mcontext.startActivity(intent);
                            break;
                        case "NDA":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/english/nda/");
                            mcontext.startActivity(intent);
                            break;
                        case "AFCAT":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","http://hungrymindclasses.com/category/english/afcat/");
                            mcontext.startActivity(intent);
                            break;
                    }
                        break;
                    case "AFCAT":switch (text[position]) {
                        case "MATHS":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "http://hungrymindclasses.com/category/afcat/maths/");
                            mcontext.startActivity(intent);
                            break;
                        case "EKT":
                            Toast.makeText(mcontext, "" + course + text[position], Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "http://hungrymindclasses.com/category/afcat/ekt");
                            mcontext.startActivity(intent);
                            break;
                    }

                        break;
                    case "NDA":switch (text[position]) {
                        case "MATHS":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "http://hungrymindclasses.com/category/nda/maths");
                            mcontext.startActivity(intent);
                            break;
                        case "GS":
                            Toast.makeText(mcontext, "" + course + text[position], Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "http://hungrymindclasses.com/category/nda/gs/");
                            mcontext.startActivity(intent);
                            break;
                    }
                        break;
                }
            }
        });
        return convertView;
    }
}
