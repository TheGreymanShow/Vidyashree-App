package com.theGreymanShow.vidyashree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by akshay dangare on 10/25/2016.
 */
public class splash_engg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.engg_splash);
        Thread myThread = new Thread(){
            public void run()
            {
                try{
                    sleep(2000);
                    Intent intent = new Intent(getApplicationContext(),Engineering_main.class);
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
