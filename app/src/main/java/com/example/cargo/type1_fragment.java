package com.example.cargo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.cargo.classes.PlasticType;
import com.example.cargo.classes.PlasticTypeList;

public class type1_fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_type1, container, false);

        ImageButton button = view.findViewById(R.id.ImageButtonBackArrow);
        TextView textField1 = view.findViewById(R.id.TextField1);
        TextView textField2 = view.findViewById(R.id.TextFieldTwo);
        TextView textField3 = view.findViewById(R.id.textFieldWebsite);

        textField1.setText("Recycable: Yes \n" + "Reusable: Yes \n" + "Tolerate heat: No \n" + "Tips to avoid: Glass and steel containers, Cans or glass bottles, natural textiles..");
        textField2.setText("Found in: Water and soda bottles, packaging, clothes, wipes..");
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