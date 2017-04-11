package com.example.abhi.utility;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.widget.Toast;

import com.example.abhi.utility.web_fragments.FB;
import com.example.abhi.utility.web_fragments.INS;
import com.example.abhi.utility.web_fragments.TW;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_LONG;

public class SocialMediaTabSel extends AppCompatActivity {
    public String web;
    public String data = "fb";
    private int temp,temp1;
    int arrayB[];
    String count[]={"ONE","TWO","THREE"};
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    FB fb1 = new FB();
    INS ins = new INS();
    TW tw = new TW();
    int count_tab;
    private int[] tabIcons = {
            R.drawable.fb,
            R.drawable.tw,
            R.drawable.ins
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //data = getIntent().getExtras().getString("website");
        arrayB = getIntent().getExtras().getIntArray("numbers");

        //counting number of tabs
        for (int i=0;i<3;i++) {
            if (arrayB[i] == 1)            count_tab++;
        }

        setContentView(R.layout.activity_tab_web_social);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();


        Bundle bundle = new Bundle();
        bundle.putString("webpage", data);

        // set Fragmentclass Arguments

        //for (int i=0;arrayB[i]==1;i++) {
            fb1.setArguments(bundle);
            tw.setArguments(bundle);
            ins.setArguments(bundle);




    }

    private void setupTabIcons() {
        temp1=0;
        if(arrayB[0]==1) {
            tabLayout.getTabAt(temp1).setIcon(R.drawable.fb);
            temp1++;
        }

        if(arrayB[1]==1) {
            tabLayout.getTabAt(temp1).setIcon(R.drawable.tw);
            temp1++;
        }

        if(arrayB[2]==1) {
            tabLayout.getTabAt(temp1).setIcon(R.drawable.ins);
            temp1++;
        }
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        temp=0;
        if(arrayB[0]==1) {
            adapter.addFrag(fb1, count[temp]);
            temp++;
        }

        if(arrayB[1]==1) {
            adapter.addFrag(tw, count[temp]);
            temp++;
        }

        if(arrayB[2]==1) {
            adapter.addFrag(ins, count[temp]);
            temp++;
        }
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }

    }


}
