package com.hungrymind.classes;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecCategory extends RecyclerView.Adapter<RecCategory.RecCategoryHolder> {
    Context mcontext;
    int[] logo;
    String text[],course;
    int clr[];
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
        View view=LayoutInflater.from(mcontext).inflate(R.layout.allcla,parent,false);
        RecCategoryHolder holder=new RecCategoryHolder(view);

        return holder;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull RecCategory.RecCategoryHolder holder, final int position) {
       holder.l3.setBackgroundColor(mcontext.getColor(clr[position]));
        holder.tv.setText(text[position]);
        holder.img.setImageResource(logo[position]);
        final Intent intent=new Intent(mcontext,Reference.class);
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (course)
                {
                    case "MATHS": switch (text[position])
                    {
                        case "CLASS 6":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/math/6th-math/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 7":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/math/7th/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 8":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/math/8th/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 9":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/math/9th/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 10":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/math/10th/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 11":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/math/11th/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 12":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/math/12th/");
                            mcontext.startActivity(intent);
                            break;

                    }
                        break;

                    case "SCIENCE":switch (text[position])
                    {
                        case "CLASS 6":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/science/6th-science/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 7":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/science/7th-science/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 8":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/science/8th-science/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 9":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/science/9th-science/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 10":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/science/10th-science/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 11":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/science/11th-science/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 12":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/science/12th-science/");
                            mcontext.startActivity(intent);
                            break;
                            case "PHYSICS":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/physics/");
                            mcontext.startActivity(intent);
                            break;
                        case "CHEMISTRY":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/chemistry/");
                            mcontext.startActivity(intent);
                            break;
                    }
                        break;


                    case "ENGLISH":switch (text[position])
                    {
                        case "CLASS 6":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/english/6th-english/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 7":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/english/7th-english/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 8":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/english/8th-english/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 9":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/english/9th-english/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 10":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/english/10th-english/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 11":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/english/11th-english/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 12":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/english/12th-english/");
                            mcontext.startActivity(intent);
                            break;
                    }
                        break;
                    case "TEST SERIES":switch (text[position])
                    {
                        case "CLASS 6":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/test-series/6th/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 7":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/test-series/7th-test-series/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 8":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/test-series/8th-test-series/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 9":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/test-series/9th-test-series/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 10":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/test-series/10th-test-series/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 11":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/test-series/11th-test-series/");
                            mcontext.startActivity(intent);
                            break;
                        case "CLASS 12":
                            Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl","https://hungrymindclasses.com/category/test-series/12th-test-series/");
                            mcontext.startActivity(intent);
                            break;
                    }
                      break;
                    case "AFCAT":switch (text[position]) {
                        case "MATHS":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "https://hungrymindclasses.com/category/afcat/maths-afcat/");
                            mcontext.startActivity(intent);
                            break;
                        case "EKT":
                            Toast.makeText(mcontext, "" + course + text[position], Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "https://hungrymindclasses.com/category/afcat/maths-afcat/");
                            mcontext.startActivity(intent);
                            break;
                        case "OLD PAPER":
                            Toast.makeText(mcontext, "" + course + text[position], Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "https://hungrymindclasses.com/category/afcat/old-paper-afcat/");
                            mcontext.startActivity(intent);
                            break;
                        case "ENGLISH":
                            Toast.makeText(mcontext, "" + course + text[position], Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "https://hungrymindclasses.com/category/afcat/english-afcat/");
                            mcontext.startActivity(intent);
                            break;
                    }

                        break;
                    case "NDA":switch (text[position]) {
                        case "MATHS":
                            // Toast.makeText(mcontext,""+course+text[position],Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "https://hungrymindclasses.com/category/nda/maths/");
                            mcontext.startActivity(intent);
                            break;
                        case "GS":
                            Toast.makeText(mcontext, "" + course + text[position], Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "https://hungrymindclasses.com/category/nda/gs/");
                            mcontext.startActivity(intent);
                            break;
                        case "OLD PAPER":
                            Toast.makeText(mcontext, "" + course + text[position], Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "https://hungrymindclasses.com/category/afcat/old-paper-nda/");
                            mcontext.startActivity(intent);
                            break;
                        case "ENGLISH":
                            Toast.makeText(mcontext, "" + course + text[position], Toast.LENGTH_SHORT).show();

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("indexurl", "https://hungrymindclasses.com/category/nda/english-nda/");
                            mcontext.startActivity(intent);
                            break;
                    }
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return logo.length;
    }

    public class RecCategoryHolder extends RecyclerView.ViewHolder {
        LinearLayout l3;
        ImageView img;
        TextView tv;

        CardView cv;
        public RecCategoryHolder(@NonNull View itemView) {
            super(itemView);
            l3=itemView.findViewById(R.id.lay3);
            img=itemView.findViewById(R.id.logo);
            tv=itemView.findViewById(R.id.classtext);
            cv=itemView.findViewById(R.id.cardla);


        }
    }
}
