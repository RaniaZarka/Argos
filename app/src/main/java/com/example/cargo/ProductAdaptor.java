package com.example.cargo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cargo.classes.ProductsModel;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class ProductAdaptor extends FirestoreRecyclerAdapter<ProductsModel, ProductAdaptor.ProductHolder> {

    public ProductAdaptor(@NonNull FirestoreRecyclerOptions<ProductsModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ProductHolder holder, int i, @NonNull ProductsModel product) {
        holder.productName.setText(product.getName());
        holder.productDetails.setText(product.getDetails());
        holder.productType.setImageDrawable(product.getImage());
        holder.productSmiley.setImageDrawable(product.getSmiley());
        holder.productType.setImageDrawable(product.getImage());

    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.products_recycler, parent,false);
       return new ProductHolder(v);

    }

    class ProductHolder extends RecyclerView.ViewHolder{
        TextView productName, productDetails;
        ImageView productType, productSmiley, productImage;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.product_name);
            productDetails=itemView.findViewById(R.id.product_detail);
            productType=itemView.findViewById(R.id.product_type);
            productSmiley=itemView.findViewById(R.id.product_smiley);
            productImage=itemView.findViewById(R.id.product_image);

        }
    }

}
