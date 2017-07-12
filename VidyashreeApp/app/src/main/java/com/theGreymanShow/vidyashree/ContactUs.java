package com.theGreymanShow.vidyashree;


import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;



public class ContactUs extends Fragment {


    public ContactUs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Builder builder = new Builder(getActivity());
        builder.setCancelable(false);
        builder.setTitle("Alert");
        builder.setMessage("Please allow this app to directly access the call feature by going to Settings->Apps->Vidyashree->Permissions");
        builder.setNegativeButton("okay",null);
        builder.show();

        return inflater.inflate(R.layout.fragment_contact_us, container, false);
    }


}
