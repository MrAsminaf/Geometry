package com.example.adam.novemberapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class two_d extends android.support.v4.app.Fragment {

    public void intentKwadrat(){
        Intent i = new Intent(two_d.this.getActivity(), option_kwadrat.class);
        startActivity(i);
    }

    public void intentProstokat(){
        Intent i = new Intent(two_d.this.getActivity(), option_prostokat.class);
        startActivity(i);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two_d, container, false);

        ConstraintLayout kwadrat=(ConstraintLayout) rootView.findViewById(R.id.menuOptionKwadratContainer);
        //TextView prostokat=(TextView) rootView.findViewById(R.id.optionProstokat);

        View.OnClickListener listenerKwadrat = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentKwadrat();
            }
        };
        kwadrat.setOnClickListener(listenerKwadrat);

        View.OnClickListener listenerProstokat = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                intentProstokat();
            }
        };
        //prostokat.setOnClickListener(listenerProstokat);

        return rootView;
    }
}

