package com.example.user.hangman;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void switcher(View view)
    {  final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
        mp.start();

        Intent intent=new Intent(MainActivity.this,Main4Activity.class);
        startActivity(intent);
    }
    public void dog(View view)
    {
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.snd);
        mp.start();
        //AlertDialog.Builder builder=new AlertDialog.Builder(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this,android.R.style.Theme_DeviceDefault_Dialog_NoActionBar_MinWidth);
        //AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
        builder.setTitle("Warning!!");
        builder.setMessage("Are you sure want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
                builder.setNegativeButton("No",null);

        builder.create();
        builder.show();

    }
}
