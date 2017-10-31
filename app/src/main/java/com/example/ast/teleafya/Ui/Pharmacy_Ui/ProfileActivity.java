package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.ast.teleafya.R;


@SuppressWarnings("deprecation")
public class ProfileActivity extends TabActivity {

    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        final TabHost tabHost = getTabHost();
        tabHost.setup();

        TabHost.TabSpec photospec = tabHost.newTabSpec("Photos");
        // setting Title and Icon for the Tab
        photospec.setIndicator("Company Info", null);
        Intent photosIntent = new Intent(this, CompanyInfo.class);
        photospec.setContent(photosIntent);

        // Tab for Songs
        TabHost.TabSpec songspec = tabHost.newTabSpec("Songs");
        songspec.setIndicator("Account Info", null);
        Intent songsIntent = new Intent(this, AccountInfo.class);
        songspec.setContent(songsIntent);



        tabHost.addTab(photospec); // Adding photos tab
       tabHost.addTab(songspec); // Adding songs tab


//        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).getBackground().setColorFilter(0, PorterDuff.Mode.MULTIPLY);
//
//
//        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
//            @Override
//            public void onTabChanged(String s) {
//
//
//                tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).getBackground().setColorFilter(0, PorterDuff.Mode.MULTIPLY);
//            }
//        });



        TabHost tabhost = getTabHost();
        for(int i=0;i<tabhost.getTabWidget().getChildCount();i++)
        {
            TextView tv = (TextView) tabhost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(getResources().getColor(R.color.colorPrimary));
        }

    }
}
