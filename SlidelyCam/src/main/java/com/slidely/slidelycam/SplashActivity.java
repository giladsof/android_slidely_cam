package com.slidely.slidelycam;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.media.MediaPlayer;

public class SplashActivity extends Activity {

    MediaPlayer ourSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //music
        ourSong = MediaPlayer.create(SplashActivity.this,R.raw.song);
        ourSong.start();

        //open next Activity after 5 seconds
        Thread timer = new Thread(){
          public void run(){
              try {
                sleep(3000);
              } catch (InterruptedException e){
                e.printStackTrace();
              }

              Intent openMain = new Intent("com.slidely.slidelycam.SLICE_ACTIVITY");
              startActivity(openMain);

          }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }

}
