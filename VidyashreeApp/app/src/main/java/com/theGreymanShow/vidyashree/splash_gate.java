package com.theGreymanShow.vidyashree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by akshay dangare on 10/25/2016.
 */
public class splash_gate extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gate_splash);
        Thread myThread = new Thread(){
            public void run()
            {
                try{
                    sleep(2000);
                    Intent intent = new Intent(getApplicationContext(),Gate.class);
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
