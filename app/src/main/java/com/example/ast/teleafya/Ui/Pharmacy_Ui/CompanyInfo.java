package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ast.teleafya.R;

public class CompanyInfo extends AppCompatActivity {

    String[] titles = {"Company Name" , "Establishment" , "India" , "company@gmail.com" , "97658925" , "*********" , "Pincode*" ,"City*", "State" , "Flat / HouseNo. / Building" , "Locality / Colony / Street" , "Documents" };
    int[] images = {R.mipmap.company_name , R.mipmap.establishment , R.mipmap.code , R.mipmap.email , R.drawable.phone , R.mipmap.password , R.mipmap.code , R.mipmap.city , R.mipmap.state ,   R.mipmap.flat , R.mipmap.loca , R.mipmap.documents };

    ListView l1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_info);
        l1 = (ListView) findViewById(R.id.listCompany);
        Custom_CompanyAdapter adapter = new Custom_CompanyAdapter(CompanyInfo.this, images ,titles );
        l1.setAdapter(adapter);

    }
}
