package com.example.cargo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cargo.classes.ProductsModel;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/*public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
 private Context context;
 private List<ProductsModel> productsModelList;
    private FirebaseStorage storage = FirebaseStorage.getInstance();
    private StorageReference storageRef= storage.getReference();

 public RecyclerViewAdapter(Context context, List<ProductsModel> productsModelList){
     this.context = context;
     this.productsModelList= productsModelList;
 }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.products_recycler, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

     ProductsModel productsModel= productsModelList.get(position);
        holder.productName.setText(productsModel.getName());
        holder.productDetails.setText(productsModel.getDetails());

        /*StorageReference storageRef = storage.getReferenceFromUrl(FIREBASE_STORAGE_MAIN_LINK + "/"+ data.get(position).getImageName());

        Glide.with(context)
                .load(storageRef)
                .apply(new RequestOptions()
                        .placeholder(R.drawable.image_not_found)
                        .fitCenter())
                .into(holder.im);
    }*/
     /*   StorageReference storageRefImage = storage.getReferenceFromUrl("gs://argo-9e2c7.appspot.com/image/"+ holder.productImage );
        StorageReference storageRefType = storage.getReferenceFromUrl("gs://argo-9e2c7.appspot.com/image/" + holder.productType );
        StorageReference storageRefSmiley = storage.getReferenceFromUrl("gs://argo-9e2c7.appspot.com/image/" + holder.productSmiley );

        Picasso.get().load(String.valueOf(storageRefImage)).fit().into(holder.productImage);
        Picasso.get().load(String.valueOf(storageRefSmiley)).fit().into(holder.productSmiley);
        Picasso.get().load(String.valueOf(storageRefType)).fit().into(holder.productType);

    }

    @Override
    public int getItemCount() {
        return productsModelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView productName, productDetails;
        ImageView productType, productSmiley, productImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            productName = itemView.findViewById(R.id.product_name);
            productDetails=itemView.findViewById(R.id.product_detail);
            productType=itemView.findViewById(R.id.product_type);
            productSmiley=itemView.findViewById(R.id.product_smiley);
            productImage=itemView.findViewById(R.id.product_image);

        }
    }
}

/*public class RecyclerViewAdapter extends RecyclerView<RecyclerViewAdapter.ProductAdaptor> {

   Context context;
   List<ProductsModel> productList;

    public RecyclerViewAdapter(Context context, ArrayList<ProductsModel> productList) {

        this.context = context;
        this.productList = productList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.products_recycler, parent, false);

        return new ProductAdaptor(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, @NonNull Object o) {


       ProductsModel product= productList.get(position);

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
