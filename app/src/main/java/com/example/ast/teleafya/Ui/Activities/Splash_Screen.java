package com.example.ast.teleafya.Ui.Activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.MyViewPagerAdapterfortour;

public class Splash_Screen extends AppCompatActivity {

    public ViewPager splash_tour;
    private MyViewPagerAdapterfortour myViewPagerAdapterfortour;

//    public int layouts[] = new int[]{
//        R.layout.first_tour_page,
//                R.layout.second_tour_page,
//                R.layout.third_tour_page,
//                R.layout.fourth_tour_page};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen2);

        splash_tour = (ViewPager)findViewById(R.id.splash_tour);
     //   myViewPagerAdapterfortour = new MyViewPagerAdapterfortour(Splash_Screen.this,layouts);
        splash_tour.setAdapter(myViewPagerAdapterfortour);



        ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        };

        splash_tour.addOnPageChangeListener(viewPagerPageChangeListener);
    }
}
