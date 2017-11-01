package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ast.teleafya.R;

import java.util.ArrayList;

/**
 * Created by Kashif on 11/1/2017.
 */

public class NewMethod_Custom extends ArrayAdapter {

    String[] titleArray;
    ArrayList<String[]> arr;


    public NewMethod_Custom(Context context, ArrayList<String[]> arr) {
        super(context, R.layout.new_method_custom, arr);
        this.arr = arr;

    }

    @Override
    public int getPosition(@Nullable Object item) {
        return super.getPosition(item);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.new_method_custom, parent, false);



        TextView textView1 = (TextView) row.findViewById(R.id.AccHolderName);
        TextView textView2 = (TextView) row.findViewById(R.id.AccNumber2);
        TextView textView3 = (TextView) row.findViewById(R.id.BankName2);
        TextView textView4 = (TextView) row.findViewById(R.id.BranchName2);

        TextView textView5 = (TextView) row.findViewById(R.id.BeneAdd2);

        TextView textView6 = (TextView) row.findViewById(R.id.SwifCode);
        TextView textView7 = (TextView) row.findViewById(R.id.uniquecode);
        titleArray = arr.get(0);

        textView1.setText(titleArray[0]);
        textView2.setText(titleArray[1]);
        textView3.setText(titleArray[2]);
        textView4.setText(titleArray[3]);

        textView5.setText(titleArray[4]);

        textView6.setText(titleArray[5]);
        textView7.setText(titleArray[6]);









        return row;
    }
}
