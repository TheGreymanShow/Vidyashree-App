package com.theGreymanShow.vidyashree;

import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, OnMapReadyCallback {

    Toolbar toolbar;
    DrawerLayout mydrawer;
    ActionBarDrawerToggle drawerlistner;
    FragmentTransaction transaction;
    NavigationView navigation;
    SupportMapFragment sMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setting the 3 variables
        mydrawer = (DrawerLayout) findViewById(R.id.drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        drawerlistner = new ActionBarDrawerToggle(this, mydrawer,toolbar, R.string.drawer_opened, R.string.drawer_closed);
        mydrawer.setDrawerListener(drawerlistner);

        sMapFragment = SupportMapFragment.newInstance();


        transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.main_frame, new Home());
        transaction.addToBackStack("home");
        transaction.commit();

        sMapFragment.getMapAsync(this);

        navigation = (NavigationView) findViewById(R.id.navigation_drawer);
        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                android.support.v4.app.FragmentManager sfm = getSupportFragmentManager();
                int id = item.getItemId();

                if(sMapFragment.isAdded())
                    sfm.beginTransaction().hide(sMapFragment).commit();

                switch(item.getItemId()) {

                    case R.id.map_us:

                        if(!(sMapFragment.isAdded()))
                            sfm.beginTransaction().replace(R.id.map,sMapFragment).addToBackStack("map").commit();
                        else
                            sfm.beginTransaction().show(sMapFragment).commit();


                        item.setChecked(true);
                        mydrawer.closeDrawers();
                        break;


                    case R.id.home:
                        transaction = getFragmentManager().beginTransaction();
                        transaction.replace(R.id.main_frame, new Home());
                        transaction.addToBackStack("home");
                        transaction.commit();

                        item.setChecked(true);
                        mydrawer.closeDrawers();
                        /*Intent intent = new Intent(getApplicationContext(), splash_science.class);
                        startActivity(intent);*/
                        break;

                    case R.id.about_us:
                        transaction = getFragmentManager().beginTransaction();
                        transaction.replace(R.id.main_frame, new Splashaboutus());
                        transaction.addToBackStack("aboutus");
                        transaction.commit();

                        item.setChecked(true);
                        mydrawer.closeDrawers();
                        /*Intent intent1 = new Intent(getApplicationContext(), splash_science.class);
                        startActivity(intent1);*/
                        break;

                    case R.id.faculty:
                        transaction = getFragmentManager().beginTransaction();
                        transaction.replace(R.id.main_frame, new Splashfaculty());
                        transaction.addToBackStack("faculty");
                        transaction.commit();

                        item.setChecked(true);
                        mydrawer.closeDrawers();
                        /*Intent intent2 = new Intent(getApplicationContext(), splash_science.class);
                        startActivity(intent2);*/
                        break;

                    case R.id.gallery:
                        transaction = getFragmentManager().beginTransaction();
                        transaction.replace(R.id.main_frame, new Splashgallery());
                        transaction.addToBackStack("gallery");
                        transaction.commit();
                        getSupportActionBar().setTitle("Gallery");
                        item.setChecked(true);
                        mydrawer.closeDrawers();
                        /*Intent intent3 = new Intent(getApplicationContext(), splash_science.class);
                        startActivity(intent3);*/
                        break;

                    case R.id.toppers:
                        transaction = getFragmentManager().beginTransaction();
                        transaction.replace(R.id.main_frame, new Splashtoppers());
                        transaction.addToBackStack("toppers");
                        transaction.commit();

                        item.setChecked(true);
                        mydrawer.closeDrawers();
                        /*Intent intent4 = new Intent(getApplicationContext(), splash_science.class);
                        startActivity(intent4);*/
                        break;


                    case R.id.contact_us:
                        transaction = getFragmentManager().beginTransaction();
                        transaction.replace(R.id.main_frame, new Splashcontactus());
                        transaction.addToBackStack("contactus");
                        transaction.commit();

                        item.setChecked(true);
                        mydrawer.closeDrawers();
                        /*Intent intent5 = new Intent(getApplicationContext(), splash_science.class);
                        startActivity(intent5);*/
                        break;

                    case R.id.website:
                        Intent website = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.vidyashreeclasses.com"));
                        startActivity(website);
                        break;

                    case R.id.fb:
                        Intent facebook = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com/Vidyashree.Class"));
                        startActivity(facebook);
                        break;

                }
                return true;
            }
        });

    }

    public void onClick(View v) {

        if(v.getId() ==  R.id.imageButton)
        {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame2,new VidyaPics());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if(v.getId() ==  R.id.imageButton2)
        {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame2,new EventPics());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if(v.getId() ==  R.id.imageButton3)
        {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame2,new Toppers());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if(v.getId() ==  R.id.imageButton4)
        {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame2,new Toppers2());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if (v.getId() == R.id.enter1) {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame,new AboutUsFrag());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if (v.getId() == R.id.enter2) {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame,new Faculty());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if (v.getId() == R.id.enter3) {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame,new Gallery());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if (v.getId() == R.id.enter4) {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame,new toppers_home());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if (v.getId() == R.id.enter5) {
            transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame,new ContactUs());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if (v.getId() == R.id.imageButton4a) {
            Intent intent = new Intent(getApplicationContext(), splash_engg.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imageButton5) {
            Intent intent = new Intent(getApplicationContext(), splash_science.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imageButton6) {
            Intent intent = new Intent(getApplicationContext(), splash_diploma.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imageButton7) {
            Intent intent = new Intent(getApplicationContext(), splash_bscit.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imageButton8) {
            Intent intent = new Intent(getApplicationContext(), splash_gate.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.button)
        {
            Intent callintent = new Intent(Intent.ACTION_CALL);
            callintent.setData(Uri.parse("tel:02265646441"));
            startActivity(callintent);
        }
        else if(v.getId() == R.id.button2)
        {
            Intent callintent = new Intent(Intent.ACTION_CALL);
            callintent.setData(Uri.parse("tel:9158564444"));
            startActivity(callintent);
        }
        else if(v.getId() == R.id.button3)
        {
            Intent callintent = new Intent(Intent.ACTION_CALL);
            callintent.setData(Uri.parse("tel:9702804229"));
            startActivity(callintent);
        }

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerlistner.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerlistner.onConfigurationChanged(newConfig);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng marker = new LatLng(19.034623,73.019883);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker, 13));

        googleMap.addMarker(new MarkerOptions().title("VidyaShree Classes").position(marker));

    }

    @Override
    public void onBackPressed() {

        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0 || count == 1) {
            Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.title);
            builder.setMessage(R.string.message);
            builder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setNegativeButton(android.R.string.no, null);
            builder.show();
        }
        else {
            getFragmentManager().popBackStack();
        }

    }
}
