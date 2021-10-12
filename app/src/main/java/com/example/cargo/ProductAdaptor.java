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
import com.google.firebase.database.core.Context;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

public class ProductAdaptor extends FirestoreRecyclerAdapter<ProductsModel, ProductAdaptor.ProductHolder> {

    FirebaseStorage storage = FirebaseStorage.getInstance();
    public ProductAdaptor(@NonNull FirestoreRecyclerOptions<ProductsModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ProductHolder holder, int i, @NonNull ProductsModel product) {
        holder.productName.setText(product.getName());
        holder.productDetails.setText(product.getDetails());
     /*   StorageReference storageRefImage = storage.getReferenceFromUrl("gs://argo-9e2c7.appspot.com/image/"+ holder.productImage );
        StorageReference storageRefType = storage.getReferenceFromUrl("gs://argo-9e2c7.appspot.com/image/" + holder.productType );
        StorageReference storageRefSmiley = storage.getReferenceFromUrl("gs://argo-9e2c7.appspot.com/image/" + holder.productSmiley );

        Picasso.get().load(String.valueOf(storageRefImage)).fit().into((Target) holder.productImage);
        Picasso.get().load(String.valueOf(storageRefSmiley)).fit().into((Target) holder.productSmiley);
        Picasso.get().load(String.valueOf(storageRefType)).fit().into((Target) holder.productType);*/


    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.products_recycler, parent,false);
        return new ProductHolder(v);

    }

    class ProductHolder extends RecyclerView.ViewHolder{
        TextView productName, productDetails, productType, productSmiley, productImage;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.product_name);
            productDetails=itemView.findViewById(R.id.product_detail);
           /* productType=itemView.findViewById(R.id.product_type);
            productSmiley=itemView.findViewById(R.id.product_smiley);
            productImage=itemView.findViewById(R.id.product_image);*/

        }
    }

}









































