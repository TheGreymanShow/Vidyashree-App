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
public class Splashaboutus extends Fragment {


    public Splashaboutus() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RelativeLayout rootview = (RelativeLayout) inflater.inflate(R.layout.fragment_splashaboutus, container, false);
        /*final FragmentTransaction transaction = getFragmentManager().beginTransaction();
        Thread myThread = new Thread(){
            public void run()
            {
                try{
                    sleep(3000);
                    //transaction = beginTransaction();
                    transaction.replace(R.id.main_frame, new AboutUsFrag());
                    transaction.addToBackStack("splash");
                    transaction.commit();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }

            }
        };
        myThread.start();*/


        return rootview;
    }

}
