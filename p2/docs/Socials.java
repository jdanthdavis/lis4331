package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Socials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socials);
        Button returnButton = (Button) findViewById(R.id.btnReturn);

        //make TextView clickable
        TextView myLILink = (TextView) findViewById(R.id.txtBitBucket);
        myLILink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView myLILinked = (TextView) findViewById(R.id.txtLinked);
        myLILinked.setMovementMethod(LinkMovementMethod.getInstance());

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( Socials.this, MainActivity.class));
            }
        });

        //create timer
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Socials.this, MainActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 90000);

    }
}