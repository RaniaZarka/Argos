package com.example.cargo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class refundType extends Fragment {

    public refundType() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_refund_type, container, false);

        TextView text1 = view.findViewById(R.id.textField1);
        TextView text2 = view.findViewById(R.id.textField2);
        TextView text3 = view.findViewById(R.id.textField3);
        TextView text4 = view.findViewById(R.id.textField4);
        TextView text5 = view.findViewById(R.id.textField5);

        text1.setText("See the refund amounts for various types of bottles and cans.\n" + "The backbone of the Danish deposit and return system is the ABC deposit system, because different amounts are refunded for ‘Pant A’, ‘Pant B’ and ‘Pant C’. ");
        text2.setText("The amount refunded depends on the type of material used in the bottles and cans, the volume of each bottle or can and whether the bottle or can will be recycled or reused.");
        text3.setText("> Pant A =DKK 1.00 (glass bottles and aluminium cans less than 1 litre) \n" +
                "> Pant B = DKK 1.50 (plastic bottles less than 1 litre) \n" +
                "> Pant C = DKK 3.00 (all bottles and cans of 1–20 litres) ");
        text4.setText("Bottles without a deposit mark are refillable packaging that can be cleaned and refilled: for example, the green beer bottle. The deposit you pay on refillable packaging at the point of sale is refundable as follows: \n");
        text5.setText("> Glass bottles under 0.5 litres = DKK 1.00 \n" +
                "> Glass bottles over 0.5 litres = DKK 3.00 \n" +
                "> Plastic bottles under 1 litre = DKK 1.50 \n" +
                "> Plastic bottles over 1 litre = DKK 3.00 ");
        return view;
    }

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
}