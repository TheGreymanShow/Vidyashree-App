package com.theGreymanShow.vidyashree;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Splashfaculty extends Fragment {


    public Splashfaculty() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RelativeLayout rootview = ( RelativeLayout) inflater.inflate(R.layout.fragment_splashfaculty, container, false);

        return rootview;
    }


    public static android.support.v4.app.Fragment newInstance() {
        return null;
    }
}
