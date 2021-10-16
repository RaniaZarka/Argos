package com.example.cargo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class type7_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_type7_fragment, container, false);

        ImageButton button = view.findViewById(R.id.ImageButtonBackArrow7);
        TextView textField1 = view.findViewById(R.id.TextField7);
        TextView textField2 = view.findViewById(R.id.TextFieldTwo7);
        TextView textField3 = view.findViewById(R.id.textFieldWebsite7);

        textField1.setText("Recycable: No \n" + "Reusable: No \n" + "Tolerate heat: No \n" + "Tips to avoid: Stainless steel products, Platinium silicone products");
        textField2.setText("Found in: Baby bottles, sippy cups, water cooler, sports bottle, eye glasses, some car parts...");
        textField3.setText("For more information visit us on www.website.com");

        button.setOnClickListener(OnBackClick);

        return view;
    }

    View.OnClickListener OnBackClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Navigation.findNavController(requireView()).navigate(R.id.fragment_argos);
        }
    };

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState); }
}