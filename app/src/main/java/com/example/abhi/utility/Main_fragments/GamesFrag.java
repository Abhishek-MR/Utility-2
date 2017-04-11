package com.example.abhi.utility.Main_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.abhi.utility.R;
import com.example.abhi.utility.recycler.MyRecyclerAdapter;
import com.example.abhi.utility.recycler.Option;

import java.util.ArrayList;


public class GamesFrag extends Fragment {

    CardView offcardView,oncardView;
    RecyclerView rvon,rvoff;
    int offcount,oncount;
    ImageView onimg,offimg;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_games, null);

        //Recycler


        offcardView = (CardView) v.findViewById(R.id.offlinecard);

        oncardView = (CardView) v.findViewById(R.id.onlinecard);

        rvon = (RecyclerView) v.findViewById(R.id.onrec);

        rvoff = (RecyclerView) v.findViewById(R.id.offrec);

        offimg = (ImageView) v.findViewById(R.id.offimg);

        onimg = (ImageView) v.findViewById(R.id.onimg);


        offcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (offcount % 2 == 0)
                    offimg.setScaleY(1);
                if (offcount % 2 != 0)
                    offimg.setScaleY(-1);
                setoffrv();
            }
        });

        oncardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oncount % 2 == 0)
                    onimg.setScaleY(1);
                if (oncount % 2 != 0)
                    onimg.setScaleY(-1);
                setonrv();
            }
        });






        return v;
    }

    private ArrayList<Option> getOnlineOptions() {
        ArrayList<Option> options = new ArrayList<>();

        Option option = new Option(R.drawable.piano, "piano tiles");
        options.add(option);

        option = new Option(R.drawable.flappy, "flappy bird");
        options.add(option);

        option = new Option(R.drawable.icon, "Stack tower");
        options.add(option);

        option = new Option(R.drawable.icon, "2048");
        options.add(option);

        return options;

    }

    private ArrayList<Option> getOfflineOptions() {
        ArrayList<Option> options = new ArrayList<>();

        Option option = new Option(R.drawable.logo, "minesweeper");
        options.add(option);



        return options;

    }

    public void setoffrv()
    {

        offcount++;
        rvoff.setHasFixedSize(true);
        rvoff.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rvoff.setAdapter(new MyRecyclerAdapter(this.getActivity(), getOfflineOptions()));
        rvoff.setVisibility(((offcount%2==0)?View.GONE:View.VISIBLE));

    }

    public void setonrv()
    {
        oncount++;
        rvon.setHasFixedSize(true);
        rvon.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rvon.setAdapter(new MyRecyclerAdapter(this.getActivity(), getOnlineOptions()));
        rvon.setVisibility(((oncount%2==0)?View.GONE:View.VISIBLE));

    }



    @Override
    public String toString() {
        return "games";
    }
}


