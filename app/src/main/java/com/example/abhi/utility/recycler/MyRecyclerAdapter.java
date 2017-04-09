package com.example.abhi.utility.recycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.abhi.utility.BMI;
import com.example.abhi.utility.Calendar;
import com.example.abhi.utility.Compass;
import com.example.abhi.utility.Flashlight;
import com.example.abhi.utility.Notes;
import com.example.abhi.utility.R;
import com.example.abhi.utility.RulerActivity;
import com.example.abhi.utility.SocialMediaTabSel;
import com.example.abhi.utility.Timer;
import com.example.abhi.utility.WebActivity;
import com.example.abhi.utility.calactivities.CalculatorMainAct;

import java.util.ArrayList;

/**
 * Created by abhi on 26/2/17.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder>  {

    Context c;
    ArrayList<Option> options;
    String opn;
    private int lastPosition = -1;



    public MyRecyclerAdapter(Context c, ArrayList<Option> options) {
        this.c = c;
        this.options = options;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewlayoutmain, parent, false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.nameText.setText(options.get(position).getOptionname());
        holder.img.setImageResource(options.get(position).getOptionimg());
        setAnimation(holder.itemView, position);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                opn = options.get(pos).getOptionname();
                Intent i = new Intent();
                switch (opn) {
                    case "calculator":
                        i = new Intent(c, CalculatorMainAct.class);
                        break;

                    case "b":
                        i = new Intent(c, SocialMediaTabSel.class);
                        break;

                    case "flashlight":
                        i = new Intent(c, Flashlight.class);
                        break;

                    case "compass":
                        i = new Intent(c, Compass.class);
                        break;

                    case "timer":
                        i = new Intent(c, Timer.class);
                        break;

                    case "calendar":
                        i = new Intent(c, Calendar.class);
                        break;

                    case "bmi":
                        i = new Intent(c, BMI.class);
                        break;

                    case "notes":
                        i = new Intent(c, Notes.class);
                        break;
                    case "ruler":
                        i = new Intent(c, RulerActivity.class);
                        break;

                    case "facebook":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "fb");
                        break;
                    case "google":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "go");
                        break;
                    case "twitter":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "tw");
                        break;
                    case "instagram":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "in");
                        break;
                    case "linkedin":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "ln");
                        break;
                    case "quora":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "qu");
                        break;
                    case "news":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "ne");
                        break;
                    case "doctors":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "do");
                        break;
                    case "uber":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "ub");
                        break;
                    case "hotels":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "ho");
                        break;

                    case "piano":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "pi");
                        break;

                    case "flappy bird":
                        i = new Intent(c, WebActivity.class);
                        i.putExtra("website", "flp");
                        break;


                }

                c.startActivity(i);

            }
        });


    }

    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }
    @Override
    public int getItemCount() {
        return options.size();
    }


}

