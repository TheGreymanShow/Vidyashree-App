package com.theGreymanShow.vidyashree;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Gallery extends Fragment implements AdapterView.OnClickListener{

    FragmentTransaction transaction;

    public Gallery() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() ==  R.id.imageButton)
        {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame2,new VidyaPics());
            transaction.commit();
        }
        else if(v.getId() ==  R.id.imageButton2)
        {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame2,new EventPics());
            transaction.commit();
        }
    }
}
