package com.theGreymanShow.vidyashree;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Toppers2 extends Fragment {


    public Toppers2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FrameLayout rootview = (FrameLayout) inflater.inflate(R.layout.fragment_toppers2, container, false);

        ViewPager pager = (ViewPager) rootview.findViewById(R.id.viewpager8);
        CustomSwipeAdapter8 adapter = new CustomSwipeAdapter8(getContext());
        pager.setAdapter(adapter);

        return rootview;
    }


}
