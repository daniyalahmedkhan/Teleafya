package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_Add_People_Adapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/26/2017.
 */

public class Add_People_Post extends android.support.v4.app.Fragment {

    public ListView people_list;
    public Patient_Add_People_Adapter patient_add_people_adapter;
    public ArrayList<String> arrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.add_people_post,null);
        arrayList = new ArrayList<>();
        people_list = (ListView)view.findViewById(R.id.people_list);


        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");


        patient_add_people_adapter = new Patient_Add_People_Adapter(arrayList,getActivity());
        people_list.setAdapter(patient_add_people_adapter);

        people_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.post_container, new Tag_User_Profile())
                        .addToBackStack(null)
                        .commit();
            }
        });



        return view;
    }
}
