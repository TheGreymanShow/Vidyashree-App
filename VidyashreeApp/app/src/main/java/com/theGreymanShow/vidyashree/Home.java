package com.theGreymanShow.vidyashree;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;

public class Home extends Fragment implements AdapterView.OnItemClickListener{

    ViewPager viewpager;

    public Home() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        FrameLayout rootview = (FrameLayout) inflater.inflate(R.layout.fragment_home, container, false);

        viewpager = (ViewPager) rootview.findViewById(R.id.viewpager);
        CustomSwipeAdapter adapter = new CustomSwipeAdapter(getContext());
        viewpager.setAdapter(adapter);
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false);

        return rootview;
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    public static android.support.v4.app.Fragment newInstance() {
        return null;
    }
}
