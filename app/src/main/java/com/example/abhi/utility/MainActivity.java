package com.example.abhi.utility;

import android.Manifest;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.abhi.utility.Main_fragments.GamesFrag;
import com.example.abhi.utility.Main_fragments.ToolsFrag;
import com.example.abhi.utility.Main_fragments.MyFragPagerAdapter;
import com.example.abhi.utility.Main_fragments.OthersFrag;
import com.example.abhi.utility.Main_fragments.SocialFrag;
import com.example.abhi.utility.calactivities.CalculatorMainAct;

import java.util.ArrayList;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fab;
    private final int REQ_CODE_SPEECH_INPUT = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestUserPermission requestUserPermission = new RequestUserPermission(this);
        requestUserPermission.verifyStoragePermissions();

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);


        //Viewpager
        ViewPager vp = (ViewPager) findViewById(R.id.mViewpager);
        this.addPages(vp);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.mTab);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(listener(vp));
        TabLayout.Tab tab = tabLayout.getTabAt(1);
        tab.select();


        //Toolbar

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initCollapsingToolbar();

        fab = (FloatingActionButton) findViewById(R.id.fab);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                promptSpeechInput();
            }
        });


    }//end of onCreate

    /**
     * Showing google speech input dialog
     * */
    private void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                getString(R.string.speech_prompt));
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    getString(R.string.speech_not_supported),
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Receiving speech input
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String command="";
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    command=result.get(0);
                    int flag = 1;
                    Intent i = new Intent();
                    switch (command) {
                        case "open calculator":
                            i = new Intent(this, CalculatorMainAct.class);
                            break;

                        case "b":
                            i = new Intent(this, Popup.class);
                            break;

                        case "open flashlight":
                            i = new Intent(this, Flashlight.class);
                            break;

                        case "open compass":
                            i = new Intent(this, Compass.class);
                            break;

                        case "open timer":
                            i = new Intent(this, Timer.class);
                            break;

                        case "open calendar":
                            i = new Intent(this, Calendar.class);
                            break;

                        case "open bmi":
                            i = new Intent(this, BMI.class);
                            break;

                        case "open notes":
                            i = new Intent(this, Notes.class);
                            break;
                        case "open ruler":
                            i = new Intent(this, RulerActivity.class);
                            break;

                        case "open minesweeper":
                            i = new Intent(this, MinesweeperAct.class);
                            break;

                        case "open facebook":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "fb");
                            break;
                        case "open google":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "go");
                            break;
                        case "open twitter":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "tw");
                            break;
                        case "open instagram":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "in");
                            break;
                        case "open linkedin":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "ln");
                            break;
                        case "open quora":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "qu");
                            break;
                        case "open news":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "ne");
                            break;
                        case "open doctors":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "do");
                            break;
                        case "open uber":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "ub");
                            break;
                        case "open hotels":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "ho");
                            break;

                        case "open piano":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "pi");
                            break;

                        case "open flappy bird":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "flp");
                            break;

                        case "open stack tower":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "st");
                            break;

                        case "play a game":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "lp");
                            break;

                        case "open 2048":
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "20");
                            break;

                        default:
                            Toast.makeText(this,"Wrong command",Toast.LENGTH_LONG).show();
                            flag=0;
                            break;


                    }
                    if (flag==1)
                    startActivity(i);

                }
                break;
            }

        }
    }



    //requesting permission
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                } else {
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }
            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

    //adding tabs
    private void addPages(ViewPager pager)
    {
        MyFragPagerAdapter adapter = new MyFragPagerAdapter(getSupportFragmentManager());

        adapter.addPage(new SocialFrag());
        adapter.addPage(new ToolsFrag());
        adapter.addPage(new GamesFrag());
        adapter.addPage(new OthersFrag());


        pager.setAdapter(adapter);
    }


    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("One app for all your needs.");
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.CollapsingToolbarLayoutExpandedTextStylefirst);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    collapsingToolbar.setExpandedTitleTextAppearance(R.style.CollapsingToolbarLayoutExpandedTextStyle);
                    isShow = false;
                }
            }
        });
    }

    public class RequestUserPermission {

        private Activity activity;
        // Storage Permissions
        private static final int REQUEST_EXTERNAL_STORAGE = 1;
        private  String[] PERMISSIONS_STORAGE = {
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA
        };

        public RequestUserPermission(Activity activity) {
            this.activity = activity;
        }


        public  void verifyStoragePermissions() {
            // Check if we have write permission
            int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);

            if (permission != PackageManager.PERMISSION_GRANTED) {
                // We don't have permission so prompt the user
                ActivityCompat.requestPermissions(
                        activity,
                        PERMISSIONS_STORAGE,
                        REQUEST_EXTERNAL_STORAGE
                );
            }
        }
    }



    //Speech to text






    private TabLayout.OnTabSelectedListener listener(final ViewPager pager)
    {
        return new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };
    }

}