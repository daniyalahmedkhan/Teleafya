package com.example.ast.teleafya.Ui.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ast.teleafya.R;

public class User_Selection_Screen extends AppCompatActivity {

    public LinearLayout doctor_container;
    public LinearLayout nurse_container;
    public LinearLayout patient_container;
    public LinearLayout diagnostic_container;
    public LinearLayout home_aid_midwive;
    public LinearLayout dentist_container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_selection_screen);

        doctor_container = (LinearLayout) findViewById(R.id.doctor_container);
        nurse_container = (LinearLayout) findViewById(R.id.nurse_container);
        patient_container = (LinearLayout) findViewById(R.id.patient_container);
        diagnostic_container = (LinearLayout) findViewById(R.id.diagnostic_container);
        dentist_container = (LinearLayout) findViewById(R.id.dentist_container);
        home_aid_midwive = (LinearLayout) findViewById(R.id.home_aid_midwive);

        doctor_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User_Selection_Screen.this,Doctor_Activity.class);
                startActivity(intent);
            }
        });

        patient_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User_Selection_Screen.this,Patient_Activity.class);
                startActivity(intent);
            }
        });





    }
}
