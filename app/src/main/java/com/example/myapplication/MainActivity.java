package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button buttonone;
MediaPlayer mpone;
int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonone =(Button)findViewById(R.id.button);


        mpone = new MediaPlayer();


        mpone = MediaPlayer.create(this,R.raw.track1);

        playing = 0;

        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing) {
                    case 0:
                        mpone.start();
                        playing = 1;
                        buttonone.setText("pause first song");
                        break;
                    case 1:
                        mpone.pause();
                        playing = 0;
                        buttonone.setText("start first song");
                        break;
                }

            }
        });

    }
}