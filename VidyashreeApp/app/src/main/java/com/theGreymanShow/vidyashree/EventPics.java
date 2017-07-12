package com.theGreymanShow.vidyashree;

import android.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;


public class EventPics extends Fragment implements AdapterView.OnClickListener {

    ViewPager viewpager;

    public EventPics() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        FrameLayout rootview = (FrameLayout) inflater.inflate(R.layout.fragment_event_pics, container, false);

        viewpager = (ViewPager) rootview.findViewById(R.id.viewpager4);
        CustomSwipeAdapter4 adapter = new CustomSwipeAdapter4(getContext());
        viewpager.setAdapter(adapter);
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false);

        return rootview;
    }

    @Override
    public void onClick(View v) {

    }
}
