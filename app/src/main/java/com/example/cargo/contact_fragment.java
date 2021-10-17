package com.example.cargo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class contact_fragment extends Fragment {

    public contact_fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =  inflater.inflate(R.layout.fragment_contact_fragment, container, false);


        ImageButton button = view.findViewById(R.id.contact_back_arrow);
        TextView textField1 = view.findViewById(R.id.contact_fragment_text_1);
        TextView textField2 = view.findViewById(R.id.contact_fragment_text_2);
        TextView textField3 = view.findViewById(R.id.contact_fragment_text_3);
        TextView textField4 = view.findViewById(R.id.contact_fragment_text_4);
        TextView textField5 = view.findViewById(R.id.contact_fragment_text_5);
        TextView textField6 = view.findViewById(R.id.contact_fragment_text_6);
        TextView textField7= view.findViewById(R.id.contact_textFieldWebsite);

        textField1.setText("Address");
        textField2.setText("Argo\n" + "Håndværkevej 70\n" + "4000 Roskilde");
        textField3.setText("Tlf: +45 46 34 75 00\n"+"Fax: +45 46 34 75 10\n"+"Mail: info@argo.dk");
        textField4.setText("Administration\n"+"opening hours");
        textField5.setText("Monday-thursday 8.00 - 15.30\n"+"Friday 8.00 - 14.00");
        textField6.setText("Find us on");
        textField7.setText("For more information visit us on www.website.com");
        button.setOnClickListener(OnBackClick);
        return view;

    }

    View.OnClickListener OnBackClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Navigation.findNavController(requireView()).navigate(R.id.fragment_argos);
        }
    };
}