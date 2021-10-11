package com.example.cargo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link type2_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class type2_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_type2_fragment, container, false);

        ImageButton button = view.findViewById(R.id.ImageButtonBackArrow2);
        TextView textField1 = view.findViewById(R.id.TextField1);
        TextView textField2 = view.findViewById(R.id.TextFieldTwo);
        TextView textField3 = view.findViewById(R.id.textFieldWebsite);

        textField1.setText("Recycable: Yes \n" + "Reusable: Yes \n" + "Tolerate heat: Yes \n" + "Tips to avoid: Wooden furniture, Carton or glass containers");
        textField2.setText("Found in: Milk jars, detergeant bottles, soap bottles, recycling bins, playground equipment, agriculture pipes, plastic furnitures..");
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