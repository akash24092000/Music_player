package com.allabouttechy.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mplayer;
    TextView status;


    public void play(View view){
        mplayer.start();
        status.setText(getResources().getString(R.string.onplay));
    }

    public void pause(View view){
        mplayer.pause();
        status.setText(getResources().getString(R.string.onpause));
    }

    public void stop(View view){
        mplayer.stop();
        status.setText(getResources().getString(R.string.onstop));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        status=  findViewById(R.id.status);
        mplayer = MediaPlayer.create(this, R.raw.downtown);
    }
}
