package com.example.abhi.utility;

import android.Manifest;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.abhi.utility.Main_fragments.GamesFrag;
import com.example.abhi.utility.Main_fragments.ToolsFrag;
import com.example.abhi.utility.Main_fragments.MyFragPagerAdapter;
import com.example.abhi.utility.Main_fragments.OthersFrag;
import com.example.abhi.utility.Main_fragments.SocialFrag;
import com.example.abhi.utility.calactivities.CalculatorMainAct;
import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ActionViewTarget;
import com.github.amlcurran.showcaseview.targets.Target;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fab;
    private final int REQ_CODE_SPEECH_INPUT = 100;
    TabLayout tabLayout;
    private TextToSpeech tts;
    String call;
    int first;
    FrameLayout frameLayout;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private static final String PREFS = "prefs";
    private static final String NAME = "name";
    ShowcaseView sv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(PREFS,0);
        editor = preferences.edit();


        RequestUserPermission requestUserPermission = new RequestUserPermission(this);
        requestUserPermission.verifyStoragePermissions();




        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);


        //Viewpager
        ViewPager vp = (ViewPager) findViewById(R.id.mViewpager);
        this.addPages(vp);

        tabLayout = (TabLayout) findViewById(R.id.mTab);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(listener(vp));
        TabLayout.Tab tab = tabLayout.getTabAt(1);
        tab.select();

        editor.putString(NAME, "user").apply();



        //Toolbar

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initCollapsingToolbar();

        fab = (FloatingActionButton) findViewById(R.id.fab);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fabclick();

        SharedPreferences sharedPreferences = getSharedPreferences("lol",0);
        int appCurrentBuildVersion = BuildConfig.VERSION_CODE;
        int appLastBuildVersion = sharedPreferences.getInt("app first",0);
        if (appLastBuildVersion == appCurrentBuildVersion)
        {
            //not a first run
        }
        else
        {
            sharedPreferences.edit().putInt("app first",appCurrentBuildVersion).apply();
            if (appLastBuildVersion ==0){
                //first run
                showcase();
                tts("Hello. I am your personal assistant. I will assist you with the functionalities of the app. Lets get started. What is your name?");
                fab.callOnClick();
            }
            else {
                //updated
                tts("Hello. I am your personal assistant. I will assist you with the functionalities of the app. Lets get started. What is your name?");
            }
        }







    }//end of onCreate

    public void showcase()
    {

        //showcase

        Target target = new ViewTarget(R.id.fab,this);

        sv = new ShowcaseView.Builder(this)
                .setTarget(target)
                .setContentTitle("Utility Assistant")
                .setContentText("Hello. I am your personal assistant. I will assist you with the functionalities of the app. Lets get started. What is your name?")
                .hideOnTouchOutside()
                .withMaterialShowcase()
                .setStyle(R.style.CustomShowcaseTheme2)
                .build();
        sv.hideButton();

    }

    public void fabclick()
    {
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (first==0){
                    tts("How can I help you");
                    first++;
                }
                promptSpeechInput();
            }
        });

    }

    public void onsimclick(View view)
    {
        fabclick();
    }

    public void tts(final String text)
    {
        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = tts.setLanguage(Locale.US);
                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "This Language is not supported");
                    }
                    speak(text);

                } else {
                    Log.e("TTS", "Initilization Failed!");
                }
            }
        });

    }

    private void speak(String text){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
        }else{
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        }
    }

    @Override
    public void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    public void onBackPressed ()
    {
        if(tabLayout.getSelectedTabPosition()== 0||tabLayout.getSelectedTabPosition()== 2||tabLayout.getSelectedTabPosition()== 3)
        {
            TabLayout.Tab tab = tabLayout.getTabAt(1);
            tab.select();
        }
        else
        {
            super.onBackPressed();
            finish();
        }
    }


    //Showing google speech input dialog

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


    //  Receiving speech input

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String command;
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    command = result.get(0);
                    Intent i;
                    //Toast.makeText(this, command, Toast.LENGTH_SHORT).show();


                    if(command.contains("my name is")) {
                        String[] speech = command.split(" ");
                        String name = speech[speech.length - 1];
                        editor.putString(NAME, name).apply();
                        speak("Your name is "+preferences.getString(NAME,null));
                    }

                    if((command.contains("what")||command.contains("tell"))&&command.contains("my")&&command.contains("name")) {
                        if(preferences.getString(NAME,null).equals("user"))
                            speak("I dont know your name yet");
                        else
                        speak("Your name is "+preferences.getString(NAME,null));
                    }

                    if((command.contains("what")||command.contains("tell"))&&command.contains("you")&&command.contains("name")) {
                            speak("That's a secret");
                    }

                    if((command.contains("can")||command.contains("will"))&&command.contains("you")) {
                        speak("Maybe, maybe not");
                    }

                    if((command.contains("God"))) {
                        speak("You mean Abhishek?");
                    }

                    if((command.contains("fuck")||command.contains("f***"))) {
                        speak("Fuck yourself");
                    }

                    if(command.contains("what")&&(command.contains("time"))){
                    SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm");//dd/MM/yyyy
                    Date now = new Date();
                    String[] strDate = sdfDate.format(now).split(":");
                    if(strDate[1].contains("00"))strDate[1] = "o'clock";
                    speak("The time is " + sdfDate.format(now));
                    }

                    if(command.contains("what")&&(command.contains("date"))){
                        SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");//dd/MM/yyyy
                        Date now = new Date();
                        String[] strDate = sdfDate.format(now).split("/");
                        speak("The date is " + sdfDate.format(now));
                    }

                    if (command.contains("call")) {
                        call = command.substring(command.length()-12,command.length());
                       // Toast.makeText(this,call,Toast.LENGTH_LONG).show();
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:"+call));
                        if (ActivityCompat.checkSelfPermission(MainActivity.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(callIntent);
                    }



                    if (command.contains("open") || command.contains("Run") || command.contains("start") || command.contains("find") || command.contains("show") || command.contains("play") ||command.contains("book")
                            ||command.contains("want")||command.contains("use")) {

                        if (command.contains("calculator")||command.contains("calculate")){
                            i = new Intent(this, CalculatorMainAct.class);
                            tts("opening calculator");
                            startActivity(i);}

                        else if (command.contains("pop up")){
                            i = new Intent(this, Popup.class);
                            startActivity(i);}

                        else if (command.contains("flashlight"))
                        {
                            i = new Intent(this, Flashlight.class);
                            tts("opening flashlight");
                            startActivity(i);}

                        else if (command.contains("compass"))
                        {i = new Intent(this, Compass.class);
                            tts("opening compass");

                            startActivity(i);}

                        else if (command.contains("timer")){
                            i = new Intent(this, Timer.class);
                            tts("opening timer");

                            startActivity(i);}

                        else if (command.contains("calendar")){
                            i = new Intent(this, Calendar.class);
                            tts("opening calendar");

                            startActivity(i);}

                        else if (command.contains("bmi")){
                            i = new Intent(this, BMI.class);
                            tts("opening bmi");

                            startActivity(i);}

                        else if (command.contains("notes")){
                            i = new Intent(this, Notes.class);
                            tts("opening notes");

                            startActivity(i);}

                        else if (command.contains("ruler")||command.contains("scale")){
                            i = new Intent(this, RulerActivity.class);
                            tts("opening ruler");

                            startActivity(i);}


                        else if (command.contains("minesweeper")){
                            i = new Intent(this, MinesweeperAct.class);
                            tts("opening minesweeper");
                            startActivity(i);}


                        else if (command.contains("QR scanner")||command.contains("QR code")||command.contains("scanner")){
                            tts("opening QR code scanner");
                            i = new Intent(this, QRScannerAct.class);
                            startActivity(i);}


                        else if (command.contains("mirror")){
                            i = new Intent(this, MirrorAct.class);
                            tts("opening mirror");
                            startActivity(i);}


                            //social
                        else if (command.contains("Facebook")||command.contains("FB")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening facebook");
                            i.putExtra("website", "fb");
                            startActivity(i);
                        } else if (command.contains("Twitter")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening twitter");
                            i.putExtra("website", "tw");
                            startActivity(i);
                        } else if (command.contains("Instagram")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening instagram");
                            i.putExtra("website", "in");
                            startActivity(i);
                        } else if (command.contains("Linkedin")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening linkden");
                            i.putExtra("website", "ln");
                            startActivity(i);
                        } else if (command.contains("Quora")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening quora");
                            i.putExtra("website", "qu");
                            startActivity(i);
                        } else if (command.contains("Google plus")||command.contains("G plus")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening google plus");
                            i.putExtra("website", "gp");
                            startActivity(i);
                        } else if (command.contains("my space")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening my space");
                            i.putExtra("website", "my");
                            startActivity(i);
                        } else if (command.contains("telegram")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening telegram");
                            i.putExtra("website", "te");
                            startActivity(i);
                        }


                        //others
                        else if (command.contains("news")) {
                            i = new Intent(this, Popup.class);
                            i.putExtra("website", "ne");
                            startActivity(i);
                        } else if (command.contains("toi") || (command.contains("Times of India"))) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening Times of India");
                            i.putExtra("website", "toi");
                            startActivity(i);
                        } else if (command.contains("the hindu")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening the hindu");
                            i.putExtra("website", "hi");
                            startActivity(i);
                        } else if (command.contains("doctors")||command.contains("doctor")||command.contains("Practo")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening Practo");
                            i.putExtra("website", "do");
                            startActivity(i);
                        } else if (command.contains("cab")||command.contains("Cabs")) {
                            i = new Intent(this, Popup.class);
                            i.putExtra("website", "cb");
                            startActivity(i);
                        } else if (command.contains("uber")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening uber");

                            i.putExtra("website", "ub");
                            startActivity(i);
                        } else if (command.contains("ola")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening ola");

                            i.putExtra("website", "ol");
                            startActivity(i);
                        } else if (command.contains("hotel")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening oyo rooms");

                            i.putExtra("website", "ho");
                            startActivity(i);
                        } else if (command.contains("piano")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening piano tiles");

                            i.putExtra("website", "pi");
                            startActivity(i);
                        } else if (command.contains("flappy Bird")||command.contains("flappy bird")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening flappy bird");

                            i.putExtra("website", "flp");
                            startActivity(i);
                        } else if (command.contains("stack Tower")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening stack tower");

                            i.putExtra("website", "st");
                            startActivity(i);
                        } else if ((command.contains("any") || command.contains("some") || command.contains("random")) && (command.contains("game"))) {
                            i = new Intent(this, WebActivity.class);
                            i.putExtra("website", "lp");
                            startActivity(i);
                        } else if (command.contains("2 0 4 8")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening 2 0 4 8");

                            i.putExtra("website", "20");
                            startActivity(i);
                        } else if (command.contains("Cut the Rope")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening cut the rope");

                            i.putExtra("website", "cu");
                            startActivity(i);
                        } else if (command.contains("Fruit Ninja")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening fruit ninja");

                            i.putExtra("website", "fn");
                            startActivity(i);
                        } else if (command.contains("bus service") || command.contains("buses")|| command.contains("bus")) {
                            i = new Intent(this, Popup.class);
                            i.putExtra("website", "bu");
                            startActivity(i);
                        } else if (command.contains("redBus")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening redBus");

                            i.putExtra("website", "rb");
                            startActivity(i);
                        } else if (command.contains("abhi bus")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening abhibus");

                            i.putExtra("website", "ab");
                            startActivity(i);
                        } else if (command.contains("music")) {
                            i = new Intent(this, Popup.class);
                            i.putExtra("website", "mu");
                            startActivity(i);
                        } else if (command.contains("gaana")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening gaana");

                            i.putExtra("website", "ga");
                            startActivity(i);
                        } else if (command.contains(" wynk")) {
                            i = new Intent(this, WebActivity.class);
                            tts("opening wynk");

                            i.putExtra("website", "wy");
                            startActivity(i);
                        } else
                            tts("Sorry, I think you gave an invalid command");


                    }

                }
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
                Manifest.permission.CAMERA,
                Manifest.permission.CALL_PHONE,
                Manifest.permission.CALL_PRIVILEGED,
                Manifest.permission.INSTALL_LOCATION_PROVIDER,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.READ_CONTACTS
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