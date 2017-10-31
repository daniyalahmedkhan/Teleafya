package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ast.teleafya.R;

/**
 * Created by AST on 10/25/2017.
 */

public class Book_Appointment extends android.support.v4.app.Fragment {

    public Button confirm_app;
    public Dialog filter_Regular_Service;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.book_appointment,null);
        View completeView = getActivity().getLayoutInflater().inflate(R.layout.successfuly_apointment, null);
        confirm_app = (Button)view.findViewById(R.id.confirm_app);
        filter_Regular_Service = new Dialog(getActivity());
        filter_Regular_Service.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        filter_Regular_Service.setContentView(completeView);

        confirm_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filter_Regular_Service.show();
            }
        });



        return view;
    }
}
