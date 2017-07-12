package com.theGreymanShow.vidyashree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by akshay dangare on 9/2/2016.
 */
public class splash_screen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_splash);
        Thread myThread = new Thread(){
            public void run()
            {
                try{
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }

            }
        };
        myThread.start();

    }
}
