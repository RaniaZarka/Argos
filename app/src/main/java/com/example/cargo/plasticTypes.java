package com.example.cargo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cargo.classes.PlasticType;
import com.example.cargo.classes.PlasticTypeList;

public class plasticTypes extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_plastic_types, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int plasticTypeNumber = plasticTypesArgs.fromBundle(getArguments()).getPlasticType();
        PlasticType plasticType = null;
        try {
            plasticType = new PlasticTypeList().GetPlasticType(plasticTypeNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }

        TextView descriptionTW = (TextView) view.findViewById(R.id.plasticDescriptionTextView);
        TextView foundInTW = (TextView) view.findViewById(R.id.foundInTextView);
        TextView tipsToAvoidTW = (TextView) view.findViewById(R.id.tipsToAvoidTextView);
        TextView ratingTW = (TextView) view.findViewById(R.id.ratingTextView);

        descriptionTW.setText(plasticType.getDescription());
        foundInTW.setText(plasticType.getFoundIn());
        tipsToAvoidTW.setText(plasticType.getTipsToAvoid());
        ratingTW.setText(plasticType.getRating());
    }
}