package com.example.cargo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class Argos extends Fragment {


    public Argos() {
        // Required empty public constructor
        //this.type1Button = type1Button;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_argos, container, false);

        ImageButton type1Button = view.findViewById(R.id.type1);
        ImageButton type2Button = view.findViewById(R.id.type2);
        ImageButton type3Button = view.findViewById(R.id.type3);
        ImageButton type4Button = view.findViewById(R.id.type4);
        ImageButton type5Button = view.findViewById(R.id.type5);
        ImageButton type6Button = view.findViewById(R.id.type6);
        ImageButton type7Button = view.findViewById(R.id.type7);
        Button guide = view.findViewById(R.id.guide);

        type1Button.setOnClickListener(onClick);
        type2Button.setOnClickListener(onClick);
        type3Button.setOnClickListener(onClick);
        type4Button.setOnClickListener(onClick);
        type5Button.setOnClickListener(onClick);
        type6Button.setOnClickListener(onClick);
        type7Button.setOnClickListener(onClick);

        guide.setOnClickListener(onClickToGuide);

            return view;
        }

     View.OnClickListener onClick= new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Navigation.findNavController(requireView()).navigate(R.id.fragment_plasticTypes);
         }
     };

    View.OnClickListener onClickToGuide= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Navigation.findNavController(requireView()).navigate(R.id.fragment_refundType);
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

}

}