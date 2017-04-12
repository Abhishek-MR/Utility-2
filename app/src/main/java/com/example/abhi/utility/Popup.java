package com.example.abhi.utility;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Popup extends AppCompatActivity {
    String data;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getExtras().getString("website");
        setContentView(R.layout.activity_popup);

        ImageView imageView1 = (ImageView) findViewById(R.id.imgfirst);
        ImageView imageView2 = (ImageView) findViewById(R.id.imgsec);
        TextView textView1 = (TextView) findViewById(R.id.txtfirst);
        TextView textView2 = (TextView) findViewById(R.id.txtsec);



        switch (data){
            case "cb" :
                imageView1.setImageResource(R.drawable.uber);
                textView1.setText("Uber");
                imageView2.setImageResource(R.drawable.ola);
                textView2.setText("Ola");
                break;
            case "bu" :
                imageView1.setImageResource(R.drawable.redbus);
                textView1.setText("RedBus");
                imageView2.setImageResource(R.drawable.abhibus);
                textView2.setText("Abhibus");
                break;
            case "mu" :
                imageView1.setImageResource(R.drawable.gaana);
                textView1.setText("GAANA");
                imageView2.setImageResource(R.drawable.wynk);
                textView2.setText("WYNK");
                break;
            case "ne" :
                imageView1.setImageResource(R.drawable.toi);
                textView1.setText("TOI");
                imageView2.setImageResource(R.drawable.hindu);
                textView2.setText("THE HINDU");
                break;


        }




        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .6), (int) (height * .4));

    }



    public void on1Click(View v){
        Intent i = new Intent(this,WebActivity.class);
        switch (data){
            case "cb" :
                i.putExtra("website", "ub");
                break;
            case "bu" :
                i.putExtra("website", "rb");
                break;

            case "mu":
                i.putExtra("website","ga");
                break;
            case "ne":
                i.putExtra("website","toi");
                break;

        }

        startActivity(i);
        finish();
    }

    public void on2Click(View v){
        Intent i = new Intent(this,WebActivity.class);
        switch (data){
            case "cb" :
                i.putExtra("website", "ol");
                break;
            case "bu" :
                i.putExtra("website", "ab");
                break;

            case "mu":
                i.putExtra("website","wy");
                break;
            case "ne":
                i.putExtra("website","hi");
                break;
        }
        startActivity(i);
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
