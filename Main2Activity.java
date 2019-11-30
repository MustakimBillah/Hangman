package com.example.user.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {



    EditText e1;
    Button dButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        e1 = (EditText) findViewById(R.id.editText);
        dButton= (Button) findViewById(R.id.doneButton);

        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString=e1.getText().toString();
                Intent p=new Intent(Main2Activity.this,Main3Activity.class);
                p.putExtra("key",tempString);
                startActivity(p);

            }
        });

    }


//
//    public void abc(View v)
//    {
//
//        Intent p=new Intent(Main2Activity.this,Main3Activity.class);
//       // p.putExtra("key",e1.getText().toString());
//        startActivity(p);
//    }
}
