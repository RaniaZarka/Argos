package com.example.cargo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cargo.classes.ProductsModel;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;

import java.util.ArrayList;

/*public class RecyclerViewAdapter extends FirestoreRecyclerAdapter<ProductAdaptor> {

   Context context;


    public RecyclerViewAdapter(Context context, ArrayList<ProductsModel> productList) {
        this.context = context;
        this.productList = productList;
    }

    ArrayList<ProductsModel> productList;


    @NonNull
    @Override
    public ProductAdaptor onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.products_recycler, parent, false);

        return new ProductAdaptor(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int i, @NonNull Object o) {


       //ProductsModel product= productList.get(position);
       holder.productName.setText(product.getName());
       holder.productDetails.setText(product.getDetails());
       holder.productType.setImageDrawable(product.getImage());
       holder.productSmiley.setImageDrawable(product.getSmiley());
       holder.productType.setImageDrawable(product.getImage());


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }


}*/
