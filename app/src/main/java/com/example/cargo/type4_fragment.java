package com.example.cargo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class type4_fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_type4_fragment, container, false);

        TextView textfield1 = view.findViewById(R.id.TextField14);
        TextView textfield2 = view.findViewById(R.id.TextFieldTwo4);
        TextView textfield3 = view.findViewById(R.id.textFieldWebsite4);
        ImageButton button = view.findViewById(R.id.ImageButtonBackArrow4);

        button.setOnClickListener(ClickOnBack);

        textfield1.setText("Recycable: No \n" + "Reusable: Yes \n" + "Tolerate heat: No \n" + "Tips to avoid: Glass or steal containers, Cloth or paper grocery bags, Silicone bags");
        textfield2.setText("Found in: Plastic wraps, plastic bread bags, grocery bags, containers, squeezable containers, beverage cups..");
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
