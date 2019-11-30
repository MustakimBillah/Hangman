package com.example.user.hangman;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main6Activity extends AppCompatActivity {


    //    Intent intent = getIntent();
    String s2, s3, s4;
    //String s5 = getIntent().getStringExtra("key");
    int [] array= new int[26];



    String [] country={"APPLE","MANGO","ORANGE","BANANA","JACKFRUIT","PINEAPPLE"};
    Random rand=new Random();
    int a=rand.nextInt(6);

    String s1 = country[a];

    int l = s1.length();
    TextView t1;
    int chance = 6;
    int mnt = 0;
    char[] ch = s1.toCharArray();
    char[] s = new char[2 * l];
    Button b1;
    private GoogleApiClient client;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        for (int i = 0; i < 2 * l; i++) {
            if (i % 2 == 0) s[i] = '_';
            else s[i] = ' ';

        }
        for (int i=0;i<25;i++ ) array[i]=0;
        s2 = new String(s);

        t1 = (TextView) findViewById(R.id.textView2);
        //t2 = (TextView) findViewById(R.id.textView3);


        t1.setText(s2);
        s3 = "Moves left : ";
        s4 = String.valueOf(chance);
        s3 = s3 + s4;
        //t2.setText(s3);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void lose() {
       // AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this,android.R.style.Theme_DeviceDefault_Dialog_NoActionBar_MinWidth);
        builder.setTitle("   ...Game Over...");
        builder.setMessage("Correct answer : "+s1);
        builder.setPositiveButton("Next", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                startActivity(getIntent());
            }
        });
        builder.setNegativeButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               finish();
            }
        });
        builder.setCancelable(false);
        builder.create();
        builder.show();


    }

    public void win() {
        //AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this,android.R.style.Theme_DeviceDefault_Dialog_NoActionBar_MinWidth);
        builder.setTitle("   ...Congratulations...");
        builder.setMessage("You Won!!");
        builder.setPositiveButton("Next", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                startActivity(getIntent());
            }
        });
        builder.setNegativeButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setCancelable(false);
        builder.create();
        builder.show();




    }

    public void func(View view) {

        if (view.getId() == R.id.button33) {
            b1 = (Button) findViewById(R.id.button33);
            int cnt = 0;

            if(array[0]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[0]++;

                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'A') {
                        s[2 * i] = 'A';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();

                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                //b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button24) {
            b1 = (Button) findViewById(R.id.button24);
            int cnt = 0;

            if(array[1]>0)  ;
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[1]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'B') {
                        s[2 * i] = 'B';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button30) {
            b1 = (Button) findViewById(R.id.button30);
            int cnt = 0;
            if(array[2]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[2]++;

                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'C') {
                        s[2 * i] = 'C';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();

                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                //b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button29) {
            b1 = (Button) findViewById(R.id.button29);
            int cnt = 0;
            if(array[3]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[3]++;

                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'D') {
                        s[2 * i] = 'D';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //  t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();

                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                //b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button26) {
            b1 = (Button) findViewById(R.id.button26);
            int cnt = 0;

            if(array[4]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[4]++;

                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'E') {
                        s[2 * i] = 'E';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                //  b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button28) {
            b1 = (Button) findViewById(R.id.button28);
            int cnt = 0;
            if(array[5]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[5]++;

                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'F') {
                        s[2 * i] = 'F';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button27) {
            b1 = (Button) findViewById(R.id.button27);
            int cnt = 0;

            if(array[6]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[6]++;

                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'G') {
                        s[2 * i] = 'G';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //  t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                //b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button25) {
            b1 = (Button) findViewById(R.id.button25);
            int cnt = 0;
            if(array[7]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[7]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'H') {
                        s[2 * i] = 'H';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //  t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();

                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button23) {
            b1 = (Button) findViewById(R.id.button23);
            int cnt = 0;
            if(array[8]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[8]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'I') {
                        s[2 * i] = 'I';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                //b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button40) {
            b1 = (Button) findViewById(R.id.button40);
            int cnt = 0;
            if(array[9]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[9]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'J') {
                        s[2 * i] = 'J';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                //b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button39) {
            b1 = (Button) findViewById(R.id.button39);
            int cnt = 0;
            if(array[10]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[10]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'K') {
                        s[2 * i] = 'K';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);

                }
                //b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button38) {
            b1 = (Button) findViewById(R.id.button38);
            int cnt = 0;
            if(array[11]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[11]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'L') {
                        s[2 * i] = 'L';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button37) {
            b1 = (Button) findViewById(R.id.button37);
            int cnt = 0;
            if(array[12]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[12]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'M') {
                        s[2 * i] = 'M';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button36) {
            b1 = (Button) findViewById(R.id.button36);
            int cnt = 0;
            if(array[13]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[13]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'N') {
                        s[2 * i] = 'N';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();

                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button35) {
            b1 = (Button) findViewById(R.id.button35);
            int cnt = 0;
            if(array[14]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[14]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'O') {
                        s[2 * i] = 'O';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                //b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button34)

        {
            b1 = (Button) findViewById(R.id.button34);
            int cnt = 0;
            if(array[15]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[15]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'P') {
                        s[2 * i] = 'P';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button32) {
            b1 = (Button) findViewById(R.id.button32);
            int cnt = 0;
            if(array[16]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[16]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'Q') {
                        s[2 * i] = 'Q';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();

                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button31) {
            b1 = (Button) findViewById(R.id.button31);
            int cnt = 0;
            if(array[17]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[17]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'R') {
                        s[2 * i] = 'R';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button49) {
            b1 = (Button) findViewById(R.id.button49);
            int cnt = 0;
            if(array[18]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[18]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'S') {
                        s[2 * i] = 'S';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button48) {
            b1 = (Button) findViewById(R.id.button48);
            int cnt = 0;
            if(array[19]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[19]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'T') {
                        s[2 * i] = 'T';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();

                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button47) {
            b1 = (Button) findViewById(R.id.button47);
            int cnt = 0;
            if(array[20]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[20]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'U') {
                        s[2 * i] = 'U';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();

                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button46) {
            b1 = (Button) findViewById(R.id.button46);
            int cnt = 0;
            if(array[21]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[21]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'V') {
                        s[2 * i] = 'V';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button45) {
            b1 = (Button) findViewById(R.id.button45);
            int cnt = 0;
            if(array[22]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[22]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'W') {
                        s[2 * i] = 'W';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button44) {
            b1 = (Button) findViewById(R.id.button44);
            int cnt = 0;
            if(array[23]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[23]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'X') {
                        s[2 * i] = 'X';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();
                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button43) {
            b1 = (Button) findViewById(R.id.button43);
            int cnt = 0;
            if(array[24]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[24]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'Y') {
                        s[2 * i] = 'Y';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    //t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();

                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }
        if (view.getId() == R.id.button42) {
            b1 = (Button) findViewById(R.id.button42);
            int cnt = 0;
            if(array[25]>0);
            else {
                final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
                mp.start();
                array[25]++;
                for (int i = 0; i < l; i++) {
                    if (ch[i] == 'Z') {
                        s[2 * i] = 'Z';
                        cnt++;
                        mnt++;
                        if (mnt == l) win();
                    }


                }
                if (cnt == 0) {
                    chance--;
                    if(chance==5)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo0);
                    }
                    if(chance==4)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo2);
                    }
                    if(chance==3)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo3);
                    }
                    if(chance==2)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo4);
                    }
                    if(chance==1)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo5);
                    }
                    s3 = "Moves left : ";
                    s4 = String.valueOf(chance);
                    s3 = s3 + s4;
                    // t2.setText(s3);
                    if (chance == 0)
                    {
                        ImageView image=(ImageView) findViewById(R.id.imageView3);
                        image.setImageResource(R.drawable.ppo6);

                    }
                    if (chance==0) lose();

                } else {
                    s2 = new String(s);
                    t1.setText(s2);
                }
                // b1.setText("");
                b1.setBackgroundColor(Color.TRANSPARENT);
            }
        }


    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main3 Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
