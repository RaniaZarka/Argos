package com.example.cargo;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cargo.classes.ProductsModel;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//public class ProductAdaptor extends FirestoreRecyclerAdapter<ProductsModel, ProductAdaptor.ProductHolder> {

public class ProductAdaptor extends RecyclerView.Adapter<ProductAdaptor.ProductHolder>{
private Context context;
private List<ProductsModel> productList;

public ProductAdaptor(Context context, List<ProductsModel>productList){
    this.context=context;
    this.productList=productList;
}

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.products_recycler, parent, false);
        return new ProductHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
         ProductsModel currentProduct= productList.get(position);

         holder.productName.setText(currentProduct.getName());
         Picasso.get()
                 .load(currentProduct.getImage())
                 .fit()
                 .centerInside()
                 .into(holder.productImage);
         Picasso.get()
                 .load(currentProduct.getType())
                 .fit()
                 .centerInside()
                 .into(holder.productType);
        Picasso.get()
                .load(currentProduct.getSmiley())
                .fit()
                .centerInside()
                .into(holder.productSmiley);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public void filterList(ArrayList<ProductsModel> filteredList){
         productList= filteredList;
         notifyDataSetChanged();
    }

    class ProductHolder extends RecyclerView.ViewHolder{
        TextView productName;
        ImageView productType, productSmiley, productImage;

        // Constructor
        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.product_name);
            productType=itemView.findViewById(R.id.product_type);
            productSmiley=itemView.findViewById(R.id.product_smiley);
            productImage=itemView.findViewById(R.id.product_image);

        }


    }

}









































