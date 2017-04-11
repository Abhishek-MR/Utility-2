package com.example.abhi.utility;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Prajit on 07-10-2016.
 */
public class Ninex9Activity extends AppCompatActivity {
    int clicked;
    int flag;
    public int count;
    int flagmode = 0;
    final int bombnumber = 10;
    public  int[] flagged = new int[82];
    public  int[] pressed = new int[82];
    MediaPlayer mp1;



    StringBuffer sb = new StringBuffer("");
    public ArrayList<Integer> bomb = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninex9);
        overridePendingTransition(R.animator.left_in, R.animator.left_out);

        mp1=MediaPlayer.create(Ninex9Activity.this,R.raw.buttonpress);
        count = 0;
        ImageView button1 = (ImageView) findViewById(R.id.imageView1);
        ImageView button2 = (ImageView) findViewById(R.id.imageView2);
        ImageView button3 = (ImageView) findViewById(R.id.imageView3);
        ImageView button4 = (ImageView) findViewById(R.id.imageView4);
        ImageView button5 = (ImageView) findViewById(R.id.imageView5);
        ImageView button6 = (ImageView) findViewById(R.id.imageView6);
        ImageView button7 = (ImageView) findViewById(R.id.imageView7);
        ImageView button8 = (ImageView) findViewById(R.id.imageView8);
        ImageView button9 = (ImageView) findViewById(R.id.imageView9);
        ImageView button10 = (ImageView) findViewById(R.id.imageView10);
        ImageView button11 = (ImageView) findViewById(R.id.imageView11);
        ImageView button12 = (ImageView) findViewById(R.id.imageView12);
        ImageView button13 = (ImageView) findViewById(R.id.imageView13);
        ImageView button14 = (ImageView) findViewById(R.id.imageView14);
        ImageView button15 = (ImageView) findViewById(R.id.imageView15);
        ImageView button16 = (ImageView) findViewById(R.id.imageView16);
        ImageView button17 = (ImageView) findViewById(R.id.imageView17);
        ImageView button18 = (ImageView) findViewById(R.id.imageView18);
        ImageView button19 = (ImageView) findViewById(R.id.imageView19);
        ImageView button20 = (ImageView) findViewById(R.id.imageView20);
        ImageView button21 = (ImageView) findViewById(R.id.imageView21);
        ImageView button22 = (ImageView) findViewById(R.id.imageView22);
        ImageView button23 = (ImageView) findViewById(R.id.imageView23);
        ImageView button24 = (ImageView) findViewById(R.id.imageView24);
        ImageView button25 = (ImageView) findViewById(R.id.imageView25);
        ImageView button26 = (ImageView) findViewById(R.id.imageView26);
        ImageView button27 = (ImageView) findViewById(R.id.imageView27);
        ImageView button28 = (ImageView) findViewById(R.id.imageView28);
        ImageView button29 = (ImageView) findViewById(R.id.imageView29);
        ImageView button30 = (ImageView) findViewById(R.id.imageView30);
        ImageView button31 = (ImageView) findViewById(R.id.imageView31);
        ImageView button32 = (ImageView) findViewById(R.id.imageView32);
        ImageView button33 = (ImageView) findViewById(R.id.imageView33);
        ImageView button34 = (ImageView) findViewById(R.id.imageView34);
        ImageView button35 = (ImageView) findViewById(R.id.imageView35);
        ImageView button36 = (ImageView) findViewById(R.id.imageView36);
        ImageView button37 = (ImageView) findViewById(R.id.imageView37);
        ImageView button38 = (ImageView) findViewById(R.id.imageView38);
        ImageView button39 = (ImageView) findViewById(R.id.imageView39);
        ImageView button40 = (ImageView) findViewById(R.id.imageView40);
        ImageView button41 = (ImageView) findViewById(R.id.imageView41);
        ImageView button42 = (ImageView) findViewById(R.id.imageView42);
        ImageView button43 = (ImageView) findViewById(R.id.imageView43);
        ImageView button44 = (ImageView) findViewById(R.id.imageView44);
        ImageView button45 = (ImageView) findViewById(R.id.imageView45);
        ImageView button46 = (ImageView) findViewById(R.id.imageView46);
        ImageView button47 = (ImageView) findViewById(R.id.imageView47);
        ImageView button48 = (ImageView) findViewById(R.id.imageView48);
        ImageView button49 = (ImageView) findViewById(R.id.imageView49);
        ImageView button50 = (ImageView) findViewById(R.id.imageView50);
        ImageView button51 = (ImageView) findViewById(R.id.imageView51);
        ImageView button52 = (ImageView) findViewById(R.id.imageView52);
        ImageView button53 = (ImageView) findViewById(R.id.imageView53);
        ImageView button54 = (ImageView) findViewById(R.id.imageView54);
        ImageView button55 = (ImageView) findViewById(R.id.imageView55);
        ImageView button56 = (ImageView) findViewById(R.id.imageView56);
        ImageView button57 = (ImageView) findViewById(R.id.imageView57);
        ImageView button58 = (ImageView) findViewById(R.id.imageView58);
        ImageView button59 = (ImageView) findViewById(R.id.imageView59);
        ImageView button60 = (ImageView) findViewById(R.id.imageView60);
        ImageView button61 = (ImageView) findViewById(R.id.imageView61);
        ImageView button62 = (ImageView) findViewById(R.id.imageView62);
        ImageView button63 = (ImageView) findViewById(R.id.imageView63);
        ImageView button64 = (ImageView) findViewById(R.id.imageView64);
        ImageView button65 = (ImageView) findViewById(R.id.imageView65);
        ImageView button66 = (ImageView) findViewById(R.id.imageView66);
        ImageView button67 = (ImageView) findViewById(R.id.imageView67);
        ImageView button68 = (ImageView) findViewById(R.id.imageView68);
        ImageView button69 = (ImageView) findViewById(R.id.imageView69);
        ImageView button70 = (ImageView) findViewById(R.id.imageView70);
        ImageView button71 = (ImageView) findViewById(R.id.imageView71);
        ImageView button72 = (ImageView) findViewById(R.id.imageView72);
        ImageView button73 = (ImageView) findViewById(R.id.imageView73);
        ImageView button74 = (ImageView) findViewById(R.id.imageView74);
        ImageView button75 = (ImageView) findViewById(R.id.imageView75);
        ImageView button76 = (ImageView) findViewById(R.id.imageView76);
        ImageView button77 = (ImageView) findViewById(R.id.imageView77);
        ImageView button78 = (ImageView) findViewById(R.id.imageView78);
        ImageView button79 = (ImageView) findViewById(R.id.imageView79);
        ImageView button80 = (ImageView) findViewById(R.id.imageView80);
        ImageView button81 = (ImageView) findViewById(R.id.imageView81);

        button1.setImageResource(R.drawable.squarebutton);
        button2.setImageResource(R.drawable.squarebutton);
        button3.setImageResource(R.drawable.squarebutton);
        button4.setImageResource(R.drawable.squarebutton);
        button5.setImageResource(R.drawable.squarebutton);
        button6.setImageResource(R.drawable.squarebutton);
        button7.setImageResource(R.drawable.squarebutton);
        button8.setImageResource(R.drawable.squarebutton);
        button9.setImageResource(R.drawable.squarebutton);
        button10.setImageResource(R.drawable.squarebutton);
        button11.setImageResource(R.drawable.squarebutton);
        button12.setImageResource(R.drawable.squarebutton);
        button13.setImageResource(R.drawable.squarebutton);
        button14.setImageResource(R.drawable.squarebutton);
        button15.setImageResource(R.drawable.squarebutton);
        button16.setImageResource(R.drawable.squarebutton);
        button17.setImageResource(R.drawable.squarebutton);
        button18.setImageResource(R.drawable.squarebutton);
        button19.setImageResource(R.drawable.squarebutton);
        button20.setImageResource(R.drawable.squarebutton);
        button21.setImageResource(R.drawable.squarebutton);
        button22.setImageResource(R.drawable.squarebutton);
        button23.setImageResource(R.drawable.squarebutton);
        button24.setImageResource(R.drawable.squarebutton);
        button25.setImageResource(R.drawable.squarebutton);
        button26.setImageResource(R.drawable.squarebutton);
        button27.setImageResource(R.drawable.squarebutton);
        button28.setImageResource(R.drawable.squarebutton);
        button29.setImageResource(R.drawable.squarebutton);
        button30.setImageResource(R.drawable.squarebutton);
        button31.setImageResource(R.drawable.squarebutton);
        button32.setImageResource(R.drawable.squarebutton);
        button33.setImageResource(R.drawable.squarebutton);
        button34.setImageResource(R.drawable.squarebutton);
        button35.setImageResource(R.drawable.squarebutton);
        button36.setImageResource(R.drawable.squarebutton);
        button37.setImageResource(R.drawable.squarebutton);
        button38.setImageResource(R.drawable.squarebutton);
        button39.setImageResource(R.drawable.squarebutton);
        button40.setImageResource(R.drawable.squarebutton);
        button41.setImageResource(R.drawable.squarebutton);
        button42.setImageResource(R.drawable.squarebutton);
        button43.setImageResource(R.drawable.squarebutton);
        button44.setImageResource(R.drawable.squarebutton);
        button45.setImageResource(R.drawable.squarebutton);
        button46.setImageResource(R.drawable.squarebutton);
        button47.setImageResource(R.drawable.squarebutton);
        button48.setImageResource(R.drawable.squarebutton);
        button49.setImageResource(R.drawable.squarebutton);
        button50.setImageResource(R.drawable.squarebutton);
        button51.setImageResource(R.drawable.squarebutton);
        button52.setImageResource(R.drawable.squarebutton);
        button53.setImageResource(R.drawable.squarebutton);
        button54.setImageResource(R.drawable.squarebutton);
        button55.setImageResource(R.drawable.squarebutton);
        button56.setImageResource(R.drawable.squarebutton);
        button57.setImageResource(R.drawable.squarebutton);
        button58.setImageResource(R.drawable.squarebutton);
        button59.setImageResource(R.drawable.squarebutton);
        button60.setImageResource(R.drawable.squarebutton);
        button61.setImageResource(R.drawable.squarebutton);
        button62.setImageResource(R.drawable.squarebutton);
        button63.setImageResource(R.drawable.squarebutton);
        button64.setImageResource(R.drawable.squarebutton);
        button65.setImageResource(R.drawable.squarebutton);
        button66.setImageResource(R.drawable.squarebutton);
        button67.setImageResource(R.drawable.squarebutton);
        button68.setImageResource(R.drawable.squarebutton);
        button69.setImageResource(R.drawable.squarebutton);
        button70.setImageResource(R.drawable.squarebutton);
        button71.setImageResource(R.drawable.squarebutton);
        button72.setImageResource(R.drawable.squarebutton);
        button73.setImageResource(R.drawable.squarebutton);
        button74.setImageResource(R.drawable.squarebutton);
        button75.setImageResource(R.drawable.squarebutton);
        button76.setImageResource(R.drawable.squarebutton);
        button77.setImageResource(R.drawable.squarebutton);
        button78.setImageResource(R.drawable.squarebutton);
        button79.setImageResource(R.drawable.squarebutton);
        button80.setImageResource(R.drawable.squarebutton);
        button81.setImageResource(R.drawable.squarebutton);

        for (int j = 0; j <= 81; j++) {
            flagged[j] = 0;
            pressed[j] = 0;
        }
        Random random = new Random();
        int i = 0;
        while (i < 10) {
            int number = random.nextInt(81) + 1;
            flag = Traverse(number);
            if (flag != 0) {
                bomb.add(number);
                i++;
            }
        }

    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.animator.right_in, R.animator.right_out);

        finish();
    }

    public void onToggleClicked(View view) {
        boolean checked = ((ToggleButton) view).isChecked();

        if (checked) {
            flagmode = 1;

        } else {
            flagmode = 0;
        }

    }

    public int Traverse(Integer element) {
        for (Object object : bomb) {
            if (element == object)
                return 0;
        }
        return 1;
    }

    public int bombcheck(int num, ImageView button) {
        int flag1 = Traverse(num);

        if (flag1 == 0) {
            MediaPlayer mp=MediaPlayer.create(Ninex9Activity.this,R.raw.explode);
            mp.start();
            Toast.makeText(this, "Bomb activated. You lose", Toast.LENGTH_SHORT).show();
            button.setImageResource(R.drawable.logo);
            new CountDownTimer(2000, 1000) {

                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {
                    int proxbombs1;
                    int flag3;
                    ImageView[] button= new ImageView[82];
                    button[1] = (ImageView) findViewById(R.id.imageView1);
                    button[2] = (ImageView) findViewById(R.id.imageView2);
                    button[3] = (ImageView) findViewById(R.id.imageView3);
                    button[4] = (ImageView) findViewById(R.id.imageView4);
                    button[5] = (ImageView) findViewById(R.id.imageView5);
                    button[6] = (ImageView) findViewById(R.id.imageView6);
                    button[7] = (ImageView) findViewById(R.id.imageView7);
                    button[8] = (ImageView) findViewById(R.id.imageView8);
                    button[9] = (ImageView) findViewById(R.id.imageView9);
                    button[10] = (ImageView) findViewById(R.id.imageView10);
                    button[11] = (ImageView) findViewById(R.id.imageView11);
                    button[12] = (ImageView) findViewById(R.id.imageView12);
                    button[13] = (ImageView) findViewById(R.id.imageView13);
                    button[14] = (ImageView) findViewById(R.id.imageView14);
                    button[15] = (ImageView) findViewById(R.id.imageView15);
                    button[16] = (ImageView) findViewById(R.id.imageView16);
                    button[17] = (ImageView) findViewById(R.id.imageView17);
                    button[18] = (ImageView) findViewById(R.id.imageView18);
                    button[19] = (ImageView) findViewById(R.id.imageView19);
                    button[20] = (ImageView) findViewById(R.id.imageView20);
                    button[21] = (ImageView) findViewById(R.id.imageView21);
                    button[22] = (ImageView) findViewById(R.id.imageView22);
                    button[23] = (ImageView) findViewById(R.id.imageView23);
                    button[24] = (ImageView) findViewById(R.id.imageView24);
                    button[25] = (ImageView) findViewById(R.id.imageView25);
                    button[26] = (ImageView) findViewById(R.id.imageView26);
                    button[27] = (ImageView) findViewById(R.id.imageView27);
                    button[28] = (ImageView) findViewById(R.id.imageView28);
                    button[29] = (ImageView) findViewById(R.id.imageView29);
                    button[30] = (ImageView) findViewById(R.id.imageView30);
                    button[31] = (ImageView) findViewById(R.id.imageView31);
                    button[32] = (ImageView) findViewById(R.id.imageView32);
                    button[33] = (ImageView) findViewById(R.id.imageView33);
                    button[34] = (ImageView) findViewById(R.id.imageView34);
                    button[35] = (ImageView) findViewById(R.id.imageView35);
                    button[36] = (ImageView) findViewById(R.id.imageView36);
                    button[37] = (ImageView) findViewById(R.id.imageView37);
                    button[38]= (ImageView) findViewById(R.id.imageView38);
                    button[39] = (ImageView) findViewById(R.id.imageView39);
                    button[40] = (ImageView) findViewById(R.id.imageView40);
                    button[41] = (ImageView) findViewById(R.id.imageView41);
                    button[42] = (ImageView) findViewById(R.id.imageView42);
                    button[43] = (ImageView) findViewById(R.id.imageView43);
                    button[44] = (ImageView) findViewById(R.id.imageView44);
                    button[45] = (ImageView) findViewById(R.id.imageView45);
                    button[46] = (ImageView) findViewById(R.id.imageView46);
                    button[47] = (ImageView) findViewById(R.id.imageView47);
                    button[48] = (ImageView) findViewById(R.id.imageView48);
                    button[49] = (ImageView) findViewById(R.id.imageView49);
                    button[50] = (ImageView) findViewById(R.id.imageView50);
                    button[51] = (ImageView) findViewById(R.id.imageView51);
                    button[52] = (ImageView) findViewById(R.id.imageView52);
                    button[53] = (ImageView) findViewById(R.id.imageView53);
                    button[54]= (ImageView) findViewById(R.id.imageView54);
                    button[56] = (ImageView) findViewById(R.id.imageView56);
                    button[57] = (ImageView) findViewById(R.id.imageView57);
                    button[58] = (ImageView) findViewById(R.id.imageView58);
                    button[59]= (ImageView) findViewById(R.id.imageView59);
                    button[60] = (ImageView) findViewById(R.id.imageView60);
                    button[61] = (ImageView) findViewById(R.id.imageView61);
                    button[62] = (ImageView) findViewById(R.id.imageView62);
                    button[63] = (ImageView) findViewById(R.id.imageView63);
                    button[64] = (ImageView) findViewById(R.id.imageView64);
                    button[65] = (ImageView) findViewById(R.id.imageView65);
                    button[66] = (ImageView) findViewById(R.id.imageView66);
                    button[67] = (ImageView) findViewById(R.id.imageView67);
                    button[68] = (ImageView) findViewById(R.id.imageView68);
                    button[69] = (ImageView) findViewById(R.id.imageView69);
                    button[70] = (ImageView) findViewById(R.id.imageView70);
                    button[71] = (ImageView) findViewById(R.id.imageView71);
                    button[72] = (ImageView) findViewById(R.id.imageView72);
                    button[73] = (ImageView) findViewById(R.id.imageView73);
                    button[74]= (ImageView) findViewById(R.id.imageView74);
                    button[75] = (ImageView) findViewById(R.id.imageView75);
                    button[76] = (ImageView) findViewById(R.id.imageView76);
                    button[77] = (ImageView) findViewById(R.id.imageView77);
                    button[78] = (ImageView) findViewById(R.id.imageView78);
                    button[79] = (ImageView) findViewById(R.id.imageView79);
                    button[80] = (ImageView) findViewById(R.id.imageView80);
                    button[81] = (ImageView) findViewById(R.id.imageView81);

                    for (int k = 1; k <= 81; k++) {
                        // flagged[k]=0;
                        flag3 = Traverse(k);
                        if(flag3==0)
                            button[k].setImageResource(R.drawable.logo);

                    }
                }
            }.start();

            new CountDownTimer(4000, 1000) {

                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {
                    setContentView(R.layout.gameover_layout);
                }
            }.start();

            new CountDownTimer(6000, 1000) {

                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {
                    Intent i = new Intent(Ninex9Activity.this, Ninex9Activity.class);
                    startActivity(i);
                }
            }.start();

        }
        return flag1;
    }

    public int getprox(int num) {
        int proxbombs = 0;
        int flag2;
        if (num == 1) {
            flag2 = Traverse(num + 9);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num + 10);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num + 1);
            if (flag2 == 0)
                proxbombs++;


        } else if (num == 9) {
            flag2 = Traverse(num + 9);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num + 8);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num - 1);
            if (flag2 == 0)
                proxbombs++;


        } else if (num == 73) {
            flag2 = Traverse(num - 9);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num - 8);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num + 1);
            if (flag2 == 0)
                proxbombs++;


        } else if (num == 81) {
            flag2 = Traverse(num - 9);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num - 10);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num - 1);
            if (flag2 == 0)
                proxbombs++;


        } else if (num % 9 == 1) {
            flag2 = Traverse(num + 9);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num - 9);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num + 1);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num - 8);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num + 10);
            if (flag2 == 0)
                proxbombs++;
        } else if (num % 9 == 0) {
            flag2 = Traverse(num + 9);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num - 9);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num - 1);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num + 8);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num - 10);
            if (flag2 == 0)
                proxbombs++;
        } else if (num > 1 && num < 9) {
            flag2 = Traverse(num + 9);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num + 1);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num - 1);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num + 8);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num + 10);
            if (flag2 == 0)
                proxbombs++;
        } else if (num > 73 && num < 81) {
            flag2 = Traverse(num - 9);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num + 1);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num - 1);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num - 8);
            if (flag2 == 0)
                proxbombs++;


            flag2 = Traverse(num - 10);
            if (flag2 == 0)
                proxbombs++;
        } else {
            flag2 = Traverse(num + 9);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num - 9);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num - 1);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num + 1);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num + 8);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num - 8);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num - 10);
            if (flag2 == 0)
                proxbombs++;

            flag2 = Traverse(num + 10);
            if (flag2 == 0)
                proxbombs++;
        }


        return proxbombs;
    }

    public void wincheck() {
        MediaPlayer mp2=MediaPlayer.create(Ninex9Activity.this,R.raw.winsound);
        mp2.start();

        Toast.makeText(this, "You win!", Toast.LENGTH_SHORT).show();
        new CountDownTimer(1500, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                setContentView(R.layout.win_layout);
            }
        }.start();
        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                Intent i = new Intent(Ninex9Activity.this, Ninex9Activity.class);
                startActivity(i);
            }
        }.start();


    }

    public void setNumberImage(ImageView button1, int proxbombs1) {
        switch (proxbombs1) {
            case 0:
                button1.setImageResource(R.drawable.zero);
                break;

            case 1:
                button1.setImageResource(R.drawable.one);
                break;

            case 2:
                button1.setImageResource(R.drawable.two);
                break;

            case 3:
                button1.setImageResource(R.drawable.three);
                break;

            case 4:
                button1.setImageResource(R.drawable.four);
                break;

            case 5:
                button1.setImageResource(R.drawable.five);
                break;

            case 6:
                button1.setImageResource(R.drawable.six);
                break;

            case 7:
                button1.setImageResource(R.drawable.seven);
                break;

            case 8:
                button1.setImageResource(R.drawable.eight);
                break;
        }

    }
    public void updateBombCount()
    {
        TextView tv=(TextView)findViewById(R.id.textView2);
        int number=0,bombs;
        for(int i=1; i<=81;i++) {
            if (flagged[i] == 1)
                number++;
        }
        bombs=bombnumber-number;
        if(bombs<0)
            bombs=0;
        String tvs=Integer.toString(bombs);
        tv.setText(tvs);


    }
    public void Ninex9(View view)
    {
        Intent i = new Intent(this, MinesweeperAct.class);
        startActivity(i);
    }
    public void Reset(View view)
    {
        //Intent i = new Intent(this, Ninex9Activity.class);
        //startActivity(i);
        resetLayout();
        count=0;
        bomb.removeAll(bomb);


        for(int j=1; j<=81;j++)
            flagged[j]=0;
        Random random = new Random();
        int  i=0;
        while(i<10) {
            int number = random.nextInt(81) + 1;
            flag = Traverse(number);
            if (flag != 0) {
                bomb.add(number);
                i++;
            }
        }
      /*  for (Object object : bomb) {
            sb.append(object.toString());
            sb.append(",");
        }
        TextView tv=(TextView)findViewById(R.id.textView3);
        tv.setText(sb);*/
        TextView tvs=(TextView)findViewById(R.id.textView2);
        tvs.setText("10");
    }

    public void resetLayout()
    {
        ImageView button1 = (ImageView) findViewById(R.id.imageView1);
        ImageView button2 = (ImageView) findViewById(R.id.imageView2);
        ImageView button3 = (ImageView) findViewById(R.id.imageView3);
        ImageView button4 = (ImageView) findViewById(R.id.imageView4);
        ImageView button5 = (ImageView) findViewById(R.id.imageView5);
        ImageView button6 = (ImageView) findViewById(R.id.imageView6);
        ImageView button7 = (ImageView) findViewById(R.id.imageView7);
        ImageView button8 = (ImageView) findViewById(R.id.imageView8);
        ImageView button9 = (ImageView) findViewById(R.id.imageView9);
        ImageView button10 = (ImageView) findViewById(R.id.imageView10);
        ImageView button11 = (ImageView) findViewById(R.id.imageView11);
        ImageView button12 = (ImageView) findViewById(R.id.imageView12);
        ImageView button13 = (ImageView) findViewById(R.id.imageView13);
        ImageView button14 = (ImageView) findViewById(R.id.imageView14);
        ImageView button15 = (ImageView) findViewById(R.id.imageView15);
        ImageView button16 = (ImageView) findViewById(R.id.imageView16);
        ImageView button17 = (ImageView) findViewById(R.id.imageView17);
        ImageView button18 = (ImageView) findViewById(R.id.imageView18);
        ImageView button19 = (ImageView) findViewById(R.id.imageView19);
        ImageView button20 = (ImageView) findViewById(R.id.imageView20);
        ImageView button21 = (ImageView) findViewById(R.id.imageView21);
        ImageView button22 = (ImageView) findViewById(R.id.imageView22);
        ImageView button23 = (ImageView) findViewById(R.id.imageView23);
        ImageView button24 = (ImageView) findViewById(R.id.imageView24);
        ImageView button25 = (ImageView) findViewById(R.id.imageView25);
        ImageView button26 = (ImageView) findViewById(R.id.imageView26);
        ImageView button27 = (ImageView) findViewById(R.id.imageView27);
        ImageView button28 = (ImageView) findViewById(R.id.imageView28);
        ImageView button29 = (ImageView) findViewById(R.id.imageView29);
        ImageView button30 = (ImageView) findViewById(R.id.imageView30);
        ImageView button31 = (ImageView) findViewById(R.id.imageView31);
        ImageView button32 = (ImageView) findViewById(R.id.imageView32);
        ImageView button33 = (ImageView) findViewById(R.id.imageView33);
        ImageView button34 = (ImageView) findViewById(R.id.imageView34);
        ImageView button35 = (ImageView) findViewById(R.id.imageView35);
        ImageView button36 = (ImageView) findViewById(R.id.imageView36);
        ImageView button37 = (ImageView) findViewById(R.id.imageView37);
        ImageView button38 = (ImageView) findViewById(R.id.imageView38);
        ImageView button39 = (ImageView) findViewById(R.id.imageView39);
        ImageView button40 = (ImageView) findViewById(R.id.imageView40);
        ImageView button41 = (ImageView) findViewById(R.id.imageView41);
        ImageView button42 = (ImageView) findViewById(R.id.imageView42);
        ImageView button43 = (ImageView) findViewById(R.id.imageView43);
        ImageView button44 = (ImageView) findViewById(R.id.imageView44);
        ImageView button45 = (ImageView) findViewById(R.id.imageView45);
        ImageView button46 = (ImageView) findViewById(R.id.imageView46);
        ImageView button47 = (ImageView) findViewById(R.id.imageView47);
        ImageView button48 = (ImageView) findViewById(R.id.imageView48);
        ImageView button49 = (ImageView) findViewById(R.id.imageView49);
        ImageView button50 = (ImageView) findViewById(R.id.imageView50);
        ImageView button51 = (ImageView) findViewById(R.id.imageView51);
        ImageView button52 = (ImageView) findViewById(R.id.imageView52);
        ImageView button53 = (ImageView) findViewById(R.id.imageView53);
        ImageView button54 = (ImageView) findViewById(R.id.imageView54);
        ImageView button55 = (ImageView) findViewById(R.id.imageView55);
        ImageView button56 = (ImageView) findViewById(R.id.imageView56);
        ImageView button57 = (ImageView) findViewById(R.id.imageView57);
        ImageView button58 = (ImageView) findViewById(R.id.imageView58);
        ImageView button59 = (ImageView) findViewById(R.id.imageView59);
        ImageView button60 = (ImageView) findViewById(R.id.imageView60);
        ImageView button61 = (ImageView) findViewById(R.id.imageView61);
        ImageView button62 = (ImageView) findViewById(R.id.imageView62);
        ImageView button63 = (ImageView) findViewById(R.id.imageView63);
        ImageView button64 = (ImageView) findViewById(R.id.imageView64);
        ImageView button65 = (ImageView) findViewById(R.id.imageView65);
        ImageView button66 = (ImageView) findViewById(R.id.imageView66);
        ImageView button67 = (ImageView) findViewById(R.id.imageView67);
        ImageView button68 = (ImageView) findViewById(R.id.imageView68);
        ImageView button69 = (ImageView) findViewById(R.id.imageView69);
        ImageView button70 = (ImageView) findViewById(R.id.imageView70);
        ImageView button71 = (ImageView) findViewById(R.id.imageView71);
        ImageView button72 = (ImageView) findViewById(R.id.imageView72);
        ImageView button73 = (ImageView) findViewById(R.id.imageView73);
        ImageView button74 = (ImageView) findViewById(R.id.imageView74);
        ImageView button75 = (ImageView) findViewById(R.id.imageView75);
        ImageView button76 = (ImageView) findViewById(R.id.imageView76);
        ImageView button77 = (ImageView) findViewById(R.id.imageView77);
        ImageView button78 = (ImageView) findViewById(R.id.imageView78);
        ImageView button79 = (ImageView) findViewById(R.id.imageView79);
        ImageView button80 = (ImageView) findViewById(R.id.imageView80);
        ImageView button81 = (ImageView) findViewById(R.id.imageView81);

        button1.setImageResource(R.drawable.squarebutton);
        button2.setImageResource(R.drawable.squarebutton);
        button3.setImageResource(R.drawable.squarebutton);
        button4.setImageResource(R.drawable.squarebutton);
        button5.setImageResource(R.drawable.squarebutton);
        button6.setImageResource(R.drawable.squarebutton);
        button7.setImageResource(R.drawable.squarebutton);
        button8.setImageResource(R.drawable.squarebutton);
        button9.setImageResource(R.drawable.squarebutton);
        button10.setImageResource(R.drawable.squarebutton);
        button11.setImageResource(R.drawable.squarebutton);
        button12.setImageResource(R.drawable.squarebutton);
        button13.setImageResource(R.drawable.squarebutton);
        button14.setImageResource(R.drawable.squarebutton);
        button15.setImageResource(R.drawable.squarebutton);
        button16.setImageResource(R.drawable.squarebutton);
        button17.setImageResource(R.drawable.squarebutton);
        button18.setImageResource(R.drawable.squarebutton);
        button19.setImageResource(R.drawable.squarebutton);
        button20.setImageResource(R.drawable.squarebutton);
        button21.setImageResource(R.drawable.squarebutton);
        button22.setImageResource(R.drawable.squarebutton);
        button23.setImageResource(R.drawable.squarebutton);
        button24.setImageResource(R.drawable.squarebutton);
        button25.setImageResource(R.drawable.squarebutton);
        button26.setImageResource(R.drawable.squarebutton);
        button27.setImageResource(R.drawable.squarebutton);
        button28.setImageResource(R.drawable.squarebutton);
        button29.setImageResource(R.drawable.squarebutton);
        button30.setImageResource(R.drawable.squarebutton);
        button31.setImageResource(R.drawable.squarebutton);
        button32.setImageResource(R.drawable.squarebutton);
        button33.setImageResource(R.drawable.squarebutton);
        button34.setImageResource(R.drawable.squarebutton);
        button35.setImageResource(R.drawable.squarebutton);
        button36.setImageResource(R.drawable.squarebutton);
        button37.setImageResource(R.drawable.squarebutton);
        button38.setImageResource(R.drawable.squarebutton);
        button39.setImageResource(R.drawable.squarebutton);
        button40.setImageResource(R.drawable.squarebutton);
        button41.setImageResource(R.drawable.squarebutton);
        button42.setImageResource(R.drawable.squarebutton);
        button43.setImageResource(R.drawable.squarebutton);
        button44.setImageResource(R.drawable.squarebutton);
        button45.setImageResource(R.drawable.squarebutton);
        button46.setImageResource(R.drawable.squarebutton);
        button47.setImageResource(R.drawable.squarebutton);
        button48.setImageResource(R.drawable.squarebutton);
        button49.setImageResource(R.drawable.squarebutton);
        button50.setImageResource(R.drawable.squarebutton);
        button51.setImageResource(R.drawable.squarebutton);
        button52.setImageResource(R.drawable.squarebutton);
        button53.setImageResource(R.drawable.squarebutton);
        button54.setImageResource(R.drawable.squarebutton);
        button55.setImageResource(R.drawable.squarebutton);
        button56.setImageResource(R.drawable.squarebutton);
        button57.setImageResource(R.drawable.squarebutton);
        button58.setImageResource(R.drawable.squarebutton);
        button59.setImageResource(R.drawable.squarebutton);
        button60.setImageResource(R.drawable.squarebutton);
        button61.setImageResource(R.drawable.squarebutton);
        button62.setImageResource(R.drawable.squarebutton);
        button63.setImageResource(R.drawable.squarebutton);
        button64.setImageResource(R.drawable.squarebutton);
        button65.setImageResource(R.drawable.squarebutton);
        button66.setImageResource(R.drawable.squarebutton);
        button67.setImageResource(R.drawable.squarebutton);
        button68.setImageResource(R.drawable.squarebutton);
        button69.setImageResource(R.drawable.squarebutton);
        button70.setImageResource(R.drawable.squarebutton);
        button71.setImageResource(R.drawable.squarebutton);
        button72.setImageResource(R.drawable.squarebutton);
        button73.setImageResource(R.drawable.squarebutton);
        button74.setImageResource(R.drawable.squarebutton);
        button75.setImageResource(R.drawable.squarebutton);
        button76.setImageResource(R.drawable.squarebutton);
        button77.setImageResource(R.drawable.squarebutton);
        button78.setImageResource(R.drawable.squarebutton);
        button79.setImageResource(R.drawable.squarebutton);
        button80.setImageResource(R.drawable.squarebutton);
        button81.setImageResource(R.drawable.squarebutton);
    }

    public void click1(View v) {
        clicked = 1;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView1);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click2(View v) {
        clicked = 2;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView2);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click3(View v) {
        clicked = 3;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView3);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click4(View v) {
        clicked = 4;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView4);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click5(View v) {
        clicked = 5;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView5);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click6(View v) {
        clicked = 6;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView6);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click7(View v) {
        clicked = 7;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView7);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click8(View v) {
        clicked = 8;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView8);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click9(View v) {
        clicked = 9;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView9);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click10(View v) {
        clicked = 10;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView10);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click11(View v) {
        clicked = 11;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView11);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click12(View v) {
        clicked = 12;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView12);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click13(View v) {
        clicked = 13;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView13);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click14(View v) {
        clicked = 14;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView14);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click15(View v) {
        clicked = 15;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView15);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click16(View v) {
        clicked = 16;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView16);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click17(View v) {
        clicked = 17;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView17);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click18(View v) {
        clicked = 18;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView18);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click19(View v) {
        clicked = 19;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView19);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click20(View v) {
        clicked = 20;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView20);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click21(View v) {
        clicked = 21;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView21);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click22(View v) {
        clicked = 22;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView22);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click23(View v) {
        clicked = 23;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView23);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click24(View v) {
        clicked = 24;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView24);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click25(View v) {
        clicked = 25;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView25);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click26(View v) {
        clicked = 26;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView26);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click27(View v) {
        clicked = 27;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView27);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click28(View v) {
        clicked = 28;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView28);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click29(View v) {
        clicked = 29;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView29);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click30(View v) {
        clicked = 30;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView30);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click31(View v) {
        clicked = 31;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView31);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click32(View v) {
        clicked = 32;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView32);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click33(View v) {
        clicked = 33;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView33);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click34(View v) {
        clicked = 34;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView34);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click35(View v) {
        clicked = 35;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView35);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click36(View v) {
        clicked = 36;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView36);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click37(View v) {
        clicked = 37;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView37);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click38(View v) {
        clicked = 38;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView38);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click39(View v) {
        clicked = 39;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView39);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click40(View v) {
        clicked = 40;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView40);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click41(View v) {
        clicked = 41;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView41);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click42(View v) {
        clicked = 42;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView42);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click43(View v) {
        clicked = 43;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView43);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click44(View v) {
        clicked = 44;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView44);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click45(View v) {
        clicked = 45;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView45);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click46(View v) {
        clicked = 46;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView46);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click47(View v) {
        clicked = 47;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView47);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click48(View v) {
        clicked = 48;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView48);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click49(View v) {
        clicked = 49;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView49);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click50(View v) {
        clicked = 50;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView50);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click51(View v) {
        clicked = 51;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView51);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click52(View v) {
        clicked = 52;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView52);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click53(View v) {
        clicked = 53;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView53);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click54(View v) {
        clicked = 54;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView54);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click55(View v) {
        clicked = 55;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView55);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click56(View v) {
        clicked = 56;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView56);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click57(View v) {
        clicked = 57;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView57);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click58(View v) {
        clicked = 58;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView58);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click59(View v) {
        clicked = 59;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView59);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click60(View v) {
        clicked = 60;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView60);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click61(View v) {
        clicked = 61;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView61);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click62(View v) {
        clicked = 62;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView62);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click63(View v) {
        clicked = 63;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView63);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click64(View v) {
        clicked = 64;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView64);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click65(View v) {
        clicked = 65;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView65);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click66(View v) {
        clicked = 66;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView66);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click67(View v) {
        clicked = 67;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView67);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click68(View v) {
        clicked = 68;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView68);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click69(View v) {
        clicked = 69;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView69);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click70(View v) {
        clicked = 70;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView70);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click71(View v) {
        clicked = 71;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView71);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click72(View v) {
        clicked = 72;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView72);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click73(View v) {
        clicked = 73;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView73);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click74(View v) {
        clicked = 74;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView74);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click75(View v) {
        clicked = 75;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView75);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click76(View v) {
        clicked = 76;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView76);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click77(View v) {
        clicked = 77;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView77);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click78(View v) {
        clicked = 78;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView78);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click79(View v) {
        clicked = 79;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView79);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click80(View v) {
        clicked = 80;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView80);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void click81(View v) {
        clicked = 81;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView81);
        if(flagmode==1 && flagged[clicked]==0)
        {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked]=1;
            updateBombCount();
            pressed[clicked]=0;
        }
        else {
            pressed[clicked]=1;
            flagged[clicked]=0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);

            int proxbombs1;
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 71) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public int updatePressedCount()
    {
        int number=0;
        for(int i=1; i<=81;i++) {
            if (pressed[i] == 1)
                number++;
        }

        return number;

    }
}
