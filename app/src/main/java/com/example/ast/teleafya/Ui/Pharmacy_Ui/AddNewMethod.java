package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ast.teleafya.R;

import java.util.ArrayList;

public class AddNewMethod extends AppCompatActivity {



    String[] titles = {"Arvind patel" , "84758693125" , "458793" , "Arvind Patel" , "CHE452361" , "Chakala Andheri" , "976918807" , "Business"};
    ArrayList<String[]> arr;

    ListView l1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_method);

        arr = new ArrayList<>();
        arr.add(titles);
        l1 = (ListView) findViewById(R.id.listNewMethod);
        NewMethod_Custom adapter = new NewMethod_Custom(AddNewMethod.this,  arr );
        l1.setAdapter(adapter);



    }
}
