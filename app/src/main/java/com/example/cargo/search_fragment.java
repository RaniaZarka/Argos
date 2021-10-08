package com.example.cargo;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cargo.classes.ProductsModel;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class search_fragment extends Fragment {

    private static final String TAG = "getall";
    private FirebaseFirestore db= FirebaseFirestore.getInstance();
    private  CollectionReference productRef = db.collection("Products");
    private ProductAdaptor adapter;
    RecyclerView recyclerView;

    public search_fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_search_fragment, container, false);
        recyclerView= v.findViewById(R.id.productRecyclerView);
        setUpRecyclerView();
        GetAllProducts();
        return v;
    }


    private void setUpRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        Query query = productRef.orderBy("name", Query.Direction.ASCENDING);
        FirestoreRecyclerOptions<ProductsModel> options = new FirestoreRecyclerOptions.Builder<ProductsModel>()
                .setQuery(query, ProductsModel.class)
                .build();

        adapter = new ProductAdaptor(options);
        //recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onStart() {

        super.onStart();
       adapter.startListening();
    }

    @Override
    public void onStop() {

        super.onStop();
        adapter.stopListening();
    }

    private void GetAllProducts() {

        productRef.
        orderBy("name", Query.Direction.ASCENDING)
        .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                            }
                        } else {
                            Log.d(TAG, "Error getting documents: ", task.getException());
                        }
                    }
                });
    }


}
