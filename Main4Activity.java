package com.example.user.hangman;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }


    public void punc(View view)
    {
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
        mp.start();
        Intent intent=new Intent(Main4Activity.this,Main3Activity.class);
        startActivity(intent);
    }
    public void junc(View view)
    {
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
        mp.start();
        Intent intent=new Intent(Main4Activity.this,Main5Activity.class);
        startActivity(intent);
    }
    public void munc(View view)
    {
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
        mp.start();
        Intent intent=new Intent(Main4Activity.this,Main6Activity.class);
        startActivity(intent);
    }
    public void tunc(View view)
    {
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
        mp.start();
        Intent intent=new Intent(Main4Activity.this,Main7Activity.class);
        startActivity(intent);
    }
    public void runc(View view)
    {
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
        mp.start();
        Intent intent=new Intent(Main4Activity.this,Main8Activity.class);
        startActivity(intent);
    }
}
