package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.ast.teleafya.R;

public class CompanyInfo extends AppCompatActivity {

    String[] titles = {"Company Name" , "Establishment" , "India" , "company@gmail.com" , "97658925" , "*********" , "Pincode*" ,"City*", "State" , "Flat / HouseNo. / Building" , "Locality / Colony / Street" , "Documents (Required)" };
    int[] images = {R.mipmap.company_name , R.mipmap.establishment , R.mipmap.code , R.mipmap.email , R.drawable.phone , R.mipmap.password , R.mipmap.code , R.mipmap.city , R.mipmap.state ,   R.mipmap.flat , R.mipmap.loca , R.mipmap.documents };

    ListView l1;
    ImageView selectdata , selectedData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_info);
        l1 = (ListView) findViewById(R.id.listCompany);
        Custom_CompanyAdapter adapter = new Custom_CompanyAdapter(CompanyInfo.this, images ,titles );
        l1.setAdapter(adapter);


        final View footerView = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.profile_footer, null, false);


        l1.addFooterView(footerView);


        selectdata = (ImageView) findViewById(R.id.imag1);


        selectdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                footerView.setVisibility(View.GONE);
                final View footerView2 = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.profile_footer_uploaded, null, false);

                l1.addFooterView(footerView2);
                selectedData = (ImageView) findViewById(R.id.imag2);

                selectedData.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        footerView2.setVisibility(View.GONE);
                    }
                });


            }


        });








    }
}
