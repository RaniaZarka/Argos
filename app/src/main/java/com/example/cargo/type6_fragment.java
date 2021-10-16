package com.example.cargo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


public class type6_fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_type6_fragment, container, false);

        TextView textfield1 = view.findViewById(R.id.TextField16);
        TextView textfield2 = view.findViewById(R.id.TextFieldTwo6);
        TextView textfield3 = view.findViewById(R.id.textFieldWebsite6);
        ImageButton button = view.findViewById(R.id.ImageButtonBackArrow6);

        button.setOnClickListener(ClickOnBack);

        textfield1.setText("Recycable: Yes but least recycled plastic \n" + "Reusable: No \n" + "Tolerate heat: No \n" + "Tips to avoid: Reusable coffe cups, Composable or reusable picnic cultery, stainless steel take away container");
        textfield2.setText("Found in: Foam drinking cups, take-out food containers, plastic picnic cultery, egg cartons..");
        textfield3.setText("For more information visit us on www.website.com");


        return view;
    }

    View.OnClickListener ClickOnBack = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Navigation.findNavController(requireView()).navigate(R.id.fragment_argos);
        }
    };

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState); }
}
