package com.example.abhi.utility.Main_fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.abhi.utility.R;
import com.example.abhi.utility.SocialMediaTabSel;
import com.example.abhi.utility.recycler.MyRecyclerAdapter;
import com.example.abhi.utility.recycler.Option;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;

/**
 * Created by abhi on 26/2/17.
 */

public class WebFrag extends Fragment {

    public int array[] = {0,0,0};
    int count;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_social,null);
        //Recycler

        RecyclerView rv = (RecyclerView) v.findViewById(R.id.socialrec);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getMainOptions()));

        CardView cardView= (CardView)v.findViewById(R.id.card_view);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[0]=0;
                array[1]=0;
                array[1]=0;
                Dialog dialog;
                final String[] items = {"facebook","twitter","instagram"};
                final ArrayList itemsSelected = new ArrayList();


                AlertDialog.Builder builder = new AlertDialog.Builder(WebFrag.this.getActivity());
                builder.setTitle("Select the websites you need");
                builder.setCancelable(false);
                builder.setMultiChoiceItems(items, null,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int selectedItemId,
                                                boolean isSelected) {
                                if (isSelected) {
                                    array[selectedItemId] = 1;
                                    //Toast.makeText(getActivity(),"fb:"+array[0]+"ins:"+array[1]+"tw:"+array[2],Toast.LENGTH_SHORT).show();
                                    itemsSelected.add(selectedItemId);
                                } else if (itemsSelected.contains(selectedItemId)) {
                                    array[selectedItemId] = 0;
                                    //Toast.makeText(getActivity(),"fb:"+array[0]+"ins:"+array[1]+"tw:"+array[2],Toast.LENGTH_SHORT).show();
                                    itemsSelected.remove(Integer.valueOf(selectedItemId));
                                }
                            }
                        })
                        .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {


                                //Your logic when OK button is clicked
                                for (int i=0;i<3;i++)
                                {
                                    if(array[i]==1) count++;
                                }
                                if (count==0)
                                    Toast.makeText(getActivity(),"Select at least one Website",LENGTH_LONG).show();
                                else{
                                Toast.makeText(getActivity(),"fb:"+array[0]+"tw:"+array[1]+"ins:"+array[2],LENGTH_LONG).show();
                                Intent intent = new Intent(WebFrag.this.getActivity(), SocialMediaTabSel.class);
                                intent.putExtra("numbers", array);
                                startActivity(intent);}
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                array[0]=0;
                                array[1]=0;
                                array[1]=0;
                            }
                        });
                dialog = builder.create();
                dialog.show();
            }
        });

        return v;

    }

    private ArrayList<Option> getMainOptions() {
        ArrayList<Option> options =new ArrayList<>();

        Option option = new Option(R.drawable.fb,"facebook");
        options.add(option);

        option = new Option(R.drawable.tw,"twitter");
        options.add(option);

        option = new Option(R.drawable.ins,"instagram");
        options.add(option);

        option = new Option(R.drawable.linkdin,"linkedin");
        options.add(option);

        option = new Option(R.drawable.quora,"quora");
        options.add(option);

        option = new Option(R.drawable.happy,"b");
        options.add(option);

        option = new Option(R.drawable.happy,"b");
        options.add(option);

        option = new Option(R.drawable.happy,"b");
        options.add(option);

        option = new Option(R.drawable.happy,"b");
        options.add(option);



        return options;



    }

    @Override
    public String toString() {
        return "Social";
    }
}