package com.example.abhi.utility;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Random;

public class MinesweeperAct extends AppCompatActivity {

    int exploded;
    int clicked;
    int flag;
    public int count;
    int flagmode=0;
    final int bombnumber=10;
    public int[] flagged = new int[37];
    MediaPlayer mp1;
    public int[] pressed=new int[37];


    StringBuffer sb = new StringBuffer("");
    public ArrayList<Integer> bomb = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minesweeper);
        overridePendingTransition(R.animator.left_in, R.animator.left_out);

        mp1=MediaPlayer.create(MinesweeperAct.this,R.raw.buttonpress);
        count=0;
        ImageView button1=(ImageView)findViewById(R.id.imageView1);
        ImageView button2=(ImageView)findViewById(R.id.imageView2);
        ImageView button3=(ImageView)findViewById(R.id.imageView3);
        ImageView button4=(ImageView)findViewById(R.id.imageView4);
        ImageView button5=(ImageView)findViewById(R.id.imageView5);
        ImageView button6=(ImageView)findViewById(R.id.imageView6);
        ImageView button7=(ImageView)findViewById(R.id.imageView7);
        ImageView button8=(ImageView)findViewById(R.id.imageView8);
        ImageView button9=(ImageView)findViewById(R.id.imageView9);
        ImageView button10=(ImageView)findViewById(R.id.imageView10);
        ImageView button11=(ImageView)findViewById(R.id.imageView11);
        ImageView button12=(ImageView)findViewById(R.id.imageView12);
        ImageView button13=(ImageView)findViewById(R.id.imageView13);
        ImageView button14=(ImageView)findViewById(R.id.imageView14);
        ImageView button15=(ImageView)findViewById(R.id.imageView15);
        ImageView button16=(ImageView)findViewById(R.id.imageView16);
        ImageView button17=(ImageView)findViewById(R.id.imageView17);
        ImageView button18=(ImageView)findViewById(R.id.imageView18);
        ImageView button19=(ImageView)findViewById(R.id.imageView19);
        ImageView button20=(ImageView)findViewById(R.id.imageView20);
        ImageView button21=(ImageView)findViewById(R.id.imageView21);
        ImageView button22=(ImageView)findViewById(R.id.imageView22);
        ImageView button23=(ImageView)findViewById(R.id.imageView23);
        ImageView button24=(ImageView)findViewById(R.id.imageView24);
        ImageView button25=(ImageView)findViewById(R.id.imageView25);
        ImageView button26=(ImageView)findViewById(R.id.imageView26);
        ImageView button27=(ImageView)findViewById(R.id.imageView27);
        ImageView button28=(ImageView)findViewById(R.id.imageView28);
        ImageView button29=(ImageView)findViewById(R.id.imageView29);
        ImageView button30=(ImageView)findViewById(R.id.imageView30);
        ImageView button31=(ImageView)findViewById(R.id.imageView31);
        ImageView button32=(ImageView)findViewById(R.id.imageView32);
        ImageView button33=(ImageView)findViewById(R.id.imageView33);
        ImageView button34=(ImageView)findViewById(R.id.imageView34);
        ImageView button35=(ImageView)findViewById(R.id.imageView35);
        ImageView button36=(ImageView)findViewById(R.id.imageView36);

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

        for(int j=0; j<=36;j++)
        {flagged[j]=0;
            pressed[j]=0;}
        Random random = new Random();
        int i=0;
        while(i<10) {
            int number = random.nextInt(36) + 1;
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
    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.animator.right_in, R.animator.right_out);
        finish();

    }
    public void onToggleClicked(View view)
    {
        boolean checked = ((ToggleButton)view).isChecked();

        if (checked)
        {
            flagmode=1;

        }
        else
        {
            flagmode=0;
        }

    }

    public int Traverse(Integer element) {
        for (Object object : bomb) {
            if (element==object)
                return 0;
        }
        return 1;
    }
    /*public int bombcheck(int num,ImageView button) {
        int flag1 = Traverse(num);
        if (flag1 == 0) {
            Toast.makeText(this, "Bomb activated. You lose", Toast.LENGTH_SHORT).show();
            button.setImageResource(R.drawable.logo);
            new CountDownTimer(1500, 1000) {

                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {
                    setContentView(R.layout.gameover_layout);
                }
            }.start();
            new CountDownTimer(3000, 1000) {

                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {
                    Intent i = new Intent(MinesweeperAct.this, MinesweeperAct.class);
                    startActivity(i);
                }
            }.start();

        }
            return flag1;
        }*/
    public int bombcheck(int num, ImageView button) {
        int flag1 = Traverse(num);

        if (flag1 == 0) {
            exploded = 1;
            MediaPlayer mp=MediaPlayer.create(MinesweeperAct.this,R.raw.explode);
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
                    for (int k = 1; k <= 36; k++) {
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
                    Intent i = new Intent(MinesweeperAct.this, MinesweeperAct.class);
                    startActivity(i);

                }
            }.start();

        }
        return flag1;
    }


    public int getprox(int num)
    {   int proxbombs=0;
        int flag2;
        if(num==1 )
        {
            flag2=Traverse(num+6);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num+7);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num+1);
            if(flag2==0)
                proxbombs++;


        }
        else if(num==6 )
        {
            flag2=Traverse(num+6);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num+5);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num-1);
            if(flag2==0)
                proxbombs++;


        }
        else if(num==31 )
        {
            flag2=Traverse(num-6);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num-5);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num+1);
            if(flag2==0)
                proxbombs++;


        }
        else if(num==36 )
        {
            flag2=Traverse(num-6);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num-7);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num-1);
            if(flag2==0)
                proxbombs++;


        }
        else if(num%6==1 )
        {
            flag2=Traverse(num+6);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num-6);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num+1);
            if(flag2==0)
                proxbombs++;


            flag2 = Traverse(num - 5);
            if (flag2 == 0)
                proxbombs++;

            flag2=Traverse(num+7);
            if(flag2==0)
                proxbombs++;
        }
        else if(num%6==0)
        {
            flag2=Traverse(num+6);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num-6);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num-1);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num+5);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num-7);
            if(flag2==0)
                proxbombs++;
        }
        else if(num>1 && num<6)
        {
            flag2=Traverse(num+6);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num+1);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num-1);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num+5);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num+7);
            if(flag2==0)
                proxbombs++;
        }
        else if(num>31 && num<36)
        {
            flag2=Traverse(num-6);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num+1);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num-1);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num-5);
            if(flag2==0)
                proxbombs++;


            flag2=Traverse(num-7);
            if(flag2==0)
                proxbombs++;
        }
        else
        {
            flag2=Traverse(num+6);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num-6);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num-1);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num+1);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num+5);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num-5);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num-7);
            if(flag2==0)
                proxbombs++;

            flag2=Traverse(num+7);
            if(flag2==0)
                proxbombs++;
        }



        return proxbombs;
    }
    public void wincheck()
    {
        MediaPlayer mp2=MediaPlayer.create(MinesweeperAct.this,R.raw.winsound);
        mp2.start();
        Toast.makeText(this,"You win!",Toast.LENGTH_SHORT).show();
        new CountDownTimer(1500, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                setContentView(R.layout.win_layout);
            }}.start();
        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                Intent i = new Intent(MinesweeperAct.this, MinesweeperAct.class);
                startActivity(i);


            }}.start();



    }
    public void setNumberImage(ImageView button1,int proxbombs1)
    {
        switch (proxbombs1) {
            case 0: button1.setImageResource(R.drawable.zero);
                break;

            case 1:button1.setImageResource(R.drawable.one);
                break;

            case 2:button1.setImageResource(R.drawable.two);
                break;

            case 3:button1.setImageResource(R.drawable.three);
                break;

            case 4:button1.setImageResource(R.drawable.four);
                break;

            case 5:button1.setImageResource(R.drawable.five);
                break;

            case 6:button1.setImageResource(R.drawable.six);
                break;

            case 7:button1.setImageResource(R.drawable.seven);
                break;

            case 8:button1.setImageResource(R.drawable.eight);
                break;
        }
    }
    public void click1(View v)
    {   if (exploded==1)
    {}
    else {

        clicked = 1;
        mp1.start();
        ImageView button1 = (ImageView) findViewById(R.id.imageView1);
        if (flagmode == 1 && flagged[clicked] == 0) {
            button1.setImageResource(R.drawable.flag);
            flagged[clicked] = 1;
            updateBombCount();
            pressed[clicked] = 0;
        } else {
            pressed[clicked] = 1;
            flagged[clicked] = 0;
            updateBombCount();
            int flag1 = bombcheck(clicked, button1);
            int proxbombs1;

            if (flag1 == 1)
                count = updatePressedCount();
            if (count >= 26) {
                wincheck();

            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);
        /*switch (proxbombs1) {
            case 0: button1.setImageResource(R.drawable.zero);
                break;

            case 1:button1.setImageResource(R.drawable.one);
                    break;

            case 2:button1.setImageResource(R.drawable.two);
                   break;

            case 3:button1.setImageResource(R.drawable.three);
                break;

            case 4:button1.setImageResource(R.drawable.four);
                break;

            case 5:button1.setImageResource(R.drawable.five);
                break;

            case 6:button1.setImageResource(R.drawable.six);
                break;

            case 7:button1.setImageResource(R.drawable.seven);
                break;

            case 8:button1.setImageResource(R.drawable.eight);
                break;
        }*/
        }
    }
    }
    public void click2(View v) {
        if (exploded == 1) {
        } else {
            clicked = 2;
            mp1.start();
            ImageView button1 = (ImageView) findViewById(R.id.imageView2);
            if (flagmode == 1 && flagged[clicked] == 0) {
                button1.setImageResource(R.drawable.flag);
                flagged[clicked] = 1;
                updateBombCount();
                pressed[clicked] = 0;
            } else {
                pressed[clicked] = 1;
                flagged[clicked] = 0;
                updateBombCount();
                int flag1 = bombcheck(clicked, button1);

                int proxbombs1;
                if (flag1 == 1)
                    count = updatePressedCount();
                if (count >= 26) {
                    wincheck();
                }
                proxbombs1 = getprox(clicked);
                if (flag1 == 1)
                    setNumberImage(button1, proxbombs1);

            }
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
            if (count >= 26) {
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
            if(flag1==1)
                count=updatePressedCount();
            if (count >= 26) {
                wincheck();
            }

            int proxbombs1;
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
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
            if (count >= 26) {
                wincheck();
            }
            proxbombs1 = getprox(clicked);
            if (flag1 == 1)
                setNumberImage(button1, proxbombs1);

        }
    }
    public void Reset(View view)
    {
        //Intent i = new Intent(this, MinesweeperAct.class);
        //startActivity(i);
        resetLayout();
        count=0;
        bomb.removeAll(bomb);


        for(int j=0; j<=36;j++)
            flagged[j]=0;
        Random random = new Random();
        int  i=0;
        while(i<10) {
            int number = random.nextInt(36) + 1;
            flag = Traverse(number);
            if (flag != 0) {
                bomb.add(number);
                i++;
            }
        }
        /*for (Object object : bomb) {
            sb.append(object.toString());
            sb.append(",");
        }
       TextView tv=(TextView)findViewById(R.id.textView3);
        tv.setText(sb);*/
        TextView tvs=(TextView)findViewById(R.id.textView2);
        tvs.setText("10");
    }

    public void updateBombCount()
    {
        TextView tv=(TextView)findViewById(R.id.textView2);
        int number=0,bombs;
        for(int i=1; i<=36;i++) {
            if (flagged[i] == 1)
                number++;
        }
        bombs=bombnumber-number;
        if(bombs<0)
            bombs=0;
        String tvs=Integer.toString(bombs);
        tv.setText(tvs);


    }
    public int updatePressedCount()
    {
        int number=0;
        for(int i=1; i<=36;i++) {
            if (pressed[i] == 1)
                number++;
        }

        return number;

    }
    public void Ninex9(View view)
    {
        Intent i = new Intent(this, Ninex9Activity.class);
        startActivity(i);
    }
    public void resetLayout()
    {
        ImageView button1=(ImageView)findViewById(R.id.imageView1);
        ImageView button2=(ImageView)findViewById(R.id.imageView2);
        ImageView button3=(ImageView)findViewById(R.id.imageView3);
        ImageView button4=(ImageView)findViewById(R.id.imageView4);
        ImageView button5=(ImageView)findViewById(R.id.imageView5);
        ImageView button6=(ImageView)findViewById(R.id.imageView6);
        ImageView button7=(ImageView)findViewById(R.id.imageView7);
        ImageView button8=(ImageView)findViewById(R.id.imageView8);
        ImageView button9=(ImageView)findViewById(R.id.imageView9);
        ImageView button10=(ImageView)findViewById(R.id.imageView10);
        ImageView button11=(ImageView)findViewById(R.id.imageView11);
        ImageView button12=(ImageView)findViewById(R.id.imageView12);
        ImageView button13=(ImageView)findViewById(R.id.imageView13);
        ImageView button14=(ImageView)findViewById(R.id.imageView14);
        ImageView button15=(ImageView)findViewById(R.id.imageView15);
        ImageView button16=(ImageView)findViewById(R.id.imageView16);
        ImageView button17=(ImageView)findViewById(R.id.imageView17);
        ImageView button18=(ImageView)findViewById(R.id.imageView18);
        ImageView button19=(ImageView)findViewById(R.id.imageView19);
        ImageView button20=(ImageView)findViewById(R.id.imageView20);
        ImageView button21=(ImageView)findViewById(R.id.imageView21);
        ImageView button22=(ImageView)findViewById(R.id.imageView22);
        ImageView button23=(ImageView)findViewById(R.id.imageView23);
        ImageView button24=(ImageView)findViewById(R.id.imageView24);
        ImageView button25=(ImageView)findViewById(R.id.imageView25);
        ImageView button26=(ImageView)findViewById(R.id.imageView26);
        ImageView button27=(ImageView)findViewById(R.id.imageView27);
        ImageView button28=(ImageView)findViewById(R.id.imageView28);
        ImageView button29=(ImageView)findViewById(R.id.imageView29);
        ImageView button30=(ImageView)findViewById(R.id.imageView30);
        ImageView button31=(ImageView)findViewById(R.id.imageView31);
        ImageView button32=(ImageView)findViewById(R.id.imageView32);
        ImageView button33=(ImageView)findViewById(R.id.imageView33);
        ImageView button34=(ImageView)findViewById(R.id.imageView34);
        ImageView button35=(ImageView)findViewById(R.id.imageView35);
        ImageView button36=(ImageView)findViewById(R.id.imageView36);

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
    }

}
