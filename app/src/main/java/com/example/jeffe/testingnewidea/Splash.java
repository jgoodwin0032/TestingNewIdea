package com.example.jeffe.testingnewidea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by jeffe on 2/22/2016.
 */
public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splash.this,MainActivity .class);
                    startActivity(intent);

                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        //TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
