package com.example.cargo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class refundType extends Fragment {

    public refundType() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_refund_type, container, false);

        ImageButton button1 = view.findViewById(R.id.imagebuttonrefundable);
        TextView text7 = view.findViewById(R.id.buttonField1);
        TextView text1 = view.findViewById(R.id.textField1);
        TextView text2 = view.findViewById(R.id.textField2);
        TextView text3 = view.findViewById(R.id.textField3);
        TextView text4 = view.findViewById(R.id.textField4);
        TextView text5 = view.findViewById(R.id.textField5);
        TextView text6 = view.findViewById(R.id.textField6);


        button1.setOnClickListener(OnClickBack);
        text7.setText("See the refund amount for variuos types of bottles and cans");
        text1.setText("The backbone of the Danish deposit and return system is the ABC deposit system, because different amounts are refunded for Pant A, Pant B and Pant C.");
        text2.setText("DKK 1 \n" + "Glass bottles and aliuminium cans less than 1 litre");
        text3.setText("DKK 1.50 \n" + "Plastic bottles less than 1 litre");
        text4.setText("DKK 3.00 \n" + "All bottles and cans of 1-2 litres");
        text5.setText("The amount refunded depends on the type of material used in the bottles and cans, the volume of each bottle or can and whether the bottle or can will be recycled or reused");
        text6.setText("For more information visit us on www.website.com");
        return view;
    }

    View.OnClickListener OnClickBack = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Navigation.findNavController(requireView()).navigate(R.id.fragment_argos);
        }
    };

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
}