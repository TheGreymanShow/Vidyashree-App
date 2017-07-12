package com.theGreymanShow.vidyashree;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by akshay dangare on 9/2/2016.
 */
public class Diploma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diploma);

        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager9);
        CustomSwipeAdapter9  adapter = new CustomSwipeAdapter9(getApplicationContext());
        viewpager.setAdapter(adapter);

    }


}
