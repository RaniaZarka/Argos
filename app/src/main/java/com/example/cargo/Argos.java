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
        Button search = view.findViewById(R.id.search);

        type1Button.setOnClickListener(onClickType1);
        type2Button.setOnClickListener(onClickType2);
        type3Button.setOnClickListener(onClickType3);
        type4Button.setOnClickListener(onClickType4);
        type5Button.setOnClickListener(onClickType5);
        type6Button.setOnClickListener(onClickType6);
        type7Button.setOnClickListener(onClickType7);

        guide.setOnClickListener(onClickToGuide);
        search.setOnClickListener(onClickToSearch);

            return view;
        }

     View.OnClickListener onClickType1 = new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             ArgosDirections.ActionArgosToPlasticTypes action = ArgosDirections.actionArgosToPlasticTypes(1);
             Navigation.findNavController(requireView()).navigate(action);
         }
     };
    View.OnClickListener onClickType2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //ArgosDirections.ActionArgosToPlasticTypes action = ArgosDirections.actionArgosToPlasticTypes(2);
            Navigation.findNavController(requireView()).navigate(R.id.type2_fragment);
        }
    };
    View.OnClickListener onClickType3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //ArgosDirections.ActionArgosToPlasticTypes action = ArgosDirections.actionArgosToPlasticTypes(3);
            Navigation.findNavController(requireView()).navigate(R.id.type3_fragment);
        }
    };
    View.OnClickListener onClickType4 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //ArgosDirections.ActionArgosToPlasticTypes action = ArgosDirections.actionArgosToPlasticTypes(4);
            Navigation.findNavController(requireView()).navigate(R.id.type4_fragment);
        }
    };
    View.OnClickListener onClickType5 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //ArgosDirections.ActionArgosToPlasticTypes action = ArgosDirections.actionArgosToPlasticTypes(5);
            Navigation.findNavController(requireView()).navigate(R.id.type5_fragment);
        }
    };
    View.OnClickListener onClickType6 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //ArgosDirections.ActionArgosToPlasticTypes action = ArgosDirections.actionArgosToPlasticTypes(6);
            Navigation.findNavController(requireView()).navigate(R.id.type6_fragment);
        }
    };
    View.OnClickListener onClickType7 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //ArgosDirections.ActionArgosToPlasticTypes action = ArgosDirections.actionArgosToPlasticTypes(7);
            Navigation.findNavController(requireView()).navigate(R.id.type7_fragment);
        }
    };

    View.OnClickListener onClickToGuide= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Navigation.findNavController(requireView()).navigate(R.id.fragment_refundType);
        }
    };

    View.OnClickListener onClickToSearch= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Navigation.findNavController(requireView()).navigate(R.id.search_fragment);
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

}


}