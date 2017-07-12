package com.theGreymanShow.vidyashree;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Engineering_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_main);

        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager6);
        CustomSwipeAdapter6  adapter = new CustomSwipeAdapter6(getApplicationContext());
        viewpager.setAdapter(adapter);

    }


}
