package com.example.abhi.utility.Main_fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abhi.utility.R;
import com.example.abhi.utility.recycler.MyRecyclerAdapter;
import com.example.abhi.utility.recycler.Option;

import java.util.ArrayList;


public class GamesFrag extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_games, null);

        //Recycler

        RecyclerView rv = (RecyclerView) v.findViewById(R.id.mainrec);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(), getMainOptions()));
        return v;
    }

    private ArrayList<Option> getMainOptions() {
        ArrayList<Option> options = new ArrayList<>();

        Option option = new Option(R.drawable.piano, "piano tiles");
        options.add(option);

        option = new Option(R.drawable.flappy, "flappy bird");
        options.add(option);


        return options;

    }
    @Override
    public String toString() {
        return "games";
    }
}


