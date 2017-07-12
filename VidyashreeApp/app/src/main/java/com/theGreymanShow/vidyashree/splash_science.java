package com.theGreymanShow.vidyashree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by akshay dangare on 10/25/2016.
 */
public class splash_science extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science_splash);
        Thread myThread = new Thread(){
            public void run()
            {
                try{
                    sleep(2000);
                    Intent intent = new Intent(getApplicationContext(),Science_main.class);
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
