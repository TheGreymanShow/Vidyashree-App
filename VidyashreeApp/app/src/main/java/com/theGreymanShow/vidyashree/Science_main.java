package com.theGreymanShow.vidyashree;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Science_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_main);

        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager5);
        CustomSwipteAdapter5 adapter = new CustomSwipteAdapter5(getApplicationContext());
        viewpager.setAdapter(adapter);

    }


}
