package com.theGreymanShow.vidyashree;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by akshay dangare on 9/4/2016.
 */
public class Gate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gate);

        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager7);
        CustomSwipeAdapter7 adapter = new CustomSwipeAdapter7(getApplicationContext());
        viewpager.setAdapter(adapter);

    }



}
