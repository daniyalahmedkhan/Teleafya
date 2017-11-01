package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;

import com.example.ast.teleafya.R;

import java.util.ArrayList;

public class AccountInfo extends AppCompatActivity {

    String[] titles = {"Arvind patel" , "84758693125" , "458793" , "Arvind Patel" , "CHE452361" , "Chakala Andheri" , "976918807" , "Business"};
    ArrayList<String[]> arr;

    ListView l1;
    Button AddNewAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_account_info);

        arr = new ArrayList<>();
        arr.add(titles);
        l1 = (ListView) findViewById(R.id.listAccount);
        Custom_AccountAdapter adapter = new Custom_AccountAdapter(AccountInfo.this,  arr );
        l1.setAdapter(adapter);

        View footerView = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.account_info_footer, null, false);
        l1.addFooterView(footerView);

        AddNewAcc  = (Button) findViewById(R.id.AddNewMethod);

        AddNewAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccountInfo.this , AddNewMethod.class);
                startActivity(intent);
            }
        });

    }
}
