package com.example.ast.teleafya.Ui.Pharmacy_Ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ast.teleafya.R;

/**
 * Created by Kashif on 10/30/2017.
 */

public class Custom_CompanyAdapter extends ArrayAdapter {

    int[] imagesArray;
    String[] titleArray;

    public Custom_CompanyAdapter(Context context, int[] imagesArray , String[] titleArray) {
        super(context, R.layout.company_info_custom, R.id.Title1 , titleArray);
        this.imagesArray = imagesArray;
        this.titleArray = titleArray;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.company_info_custom , parent , false);


        ImageView imageView = (ImageView) row.findViewById(R.id.ImageComp);
        TextView textView = (TextView) row.findViewById(R.id.Title1);

        imageView.setImageResource(imagesArray[position]);
        textView.setText(titleArray[position]);


        return row;
    }

}
