package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;
    MediaPlayer mpRush, mpLofi, mpMac;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btnRush);
        button2 = (Button) findViewById(R.id.btnLofi);
        button3 = (Button) findViewById(R.id.btnMac);
        button1.setOnClickListener(btnRush);
        button2.setOnClickListener(btnLofi);
        button3.setOnClickListener(btnMac);
        mpRush = new MediaPlayer();
        mpRush = MediaPlayer.create(this, R.raw.rush);
        mpLofi = new MediaPlayer();
        mpLofi = MediaPlayer.create(this, R.raw.lofi);
        mpMac = new MediaPlayer();
        mpMac = MediaPlayer.create(this, R.raw.woods);
        playing = 0;
    }

    Button.OnClickListener btnRush = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            switch(playing){
                case 0:
                    mpRush.start();
                    playing = 1;
                    button1.setText("Pause Rush");
                    break;
                case 1:
                    mpRush.pause();
                    playing = 0;
                    button1.setText("Play Rush");
                    break;
            }

        }
    };

    Button.OnClickListener btnLofi = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            switch(playing){
                case 0:
                    mpLofi.start();
                    playing = 1;
                    button2.setText("Pause Lofi");
                    break;
                case 1:
                    mpLofi.pause();
                    playing = 0;
                    button2.setText("Play Lofi");
                    break;
            }

        }
    };

    Button.OnClickListener btnMac = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            switch(playing){
                case 0:
                    mpMac.start();
                    playing = 1;
                    button3.setText("Pause Mac Miller");
                    break;
                case 1:
                    mpMac.pause();
                    playing = 0;
                    button3.setText("Play Mac Miller");
                    break;
            }

        }
    };
}