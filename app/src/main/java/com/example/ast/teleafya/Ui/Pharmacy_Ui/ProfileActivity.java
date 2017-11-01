package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.ast.teleafya.R;


@SuppressWarnings("deprecation")
public class ProfileActivity extends TabActivity {

    TabHost tabHost;
    private float lastX;
    private GestureDetectorCompat gDetector;

//    final TabHost

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);

        tabHost = getTabHost();
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
        for (int i = 0; i < tabhost.getTabWidget().getChildCount(); i++) {
            TextView tv = (TextView) tabhost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(getResources().getColor(R.color.colorPrimary));
        }


//        gDetector = new GestureDetectorCompat(getApplicationContext(), new GestureDetector.OnGestureListener() {
//
//            @Override
//            public boolean onDown(MotionEvent e) {
//                return true;
//            }
//
//            @Override
//            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
//                                   float velocityY) {
//                Log.i("motion", "onFling has been called!");
//                final int SWIPE_MIN_DISTANCE = 120;
//                final int SWIPE_MAX_OFF_PATH = 250;
//                final int SWIPE_THRESHOLD_VELOCITY = 200;
//                try {
//                    if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
//                        return false;
//                    if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE
//                            && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
//                        Log.i("motion", "Right to Left");
//                        switchTabs(false);
//                    } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE
//                            && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
//
//                        Log.i("motion", "Left to Right");
//                        switchTabs(true);
//
//                    }
//                } catch (Exception e) {
//                    // nothing
//                }
//                return false;
//            }
//
//            @Override
//            public void onLongPress(MotionEvent e) {
//
//            }
//
//            @Override
//            public boolean onScroll(MotionEvent e1, MotionEvent e2,
//                                    float distanceX, float distanceY) {
//                return false;
//            }
//
//            @Override
//            public void onShowPress(MotionEvent e) {
//
//            }
//
//            @Override
//            public boolean onSingleTapUp(MotionEvent e) {
//                return false;
//            }
//        });
//
//        tabhost.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return gDetector.onTouchEvent(event);
//            }
//        });
//
//
//
//    }
//
//
//    public void switchTabs(boolean direction) {
//
//        Log.w("switch Tabs", "idemo direction");
//        if (direction) // true = move left
//        {
//            if (tabHost.getCurrentTab() != 0)
//                tabHost.setCurrentTab(tabHost.getCurrentTab() - 1);
//        } else
//        // move right
//        {
//            if (tabHost.getCurrentTab() != (tabHost.getTabWidget()
//                    .getTabCount() - 1))
//                tabHost.setCurrentTab(tabHost.getCurrentTab() + 1);
//
//        }
//
//
//    }


    }

}


