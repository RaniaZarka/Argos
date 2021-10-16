package com.example.cargo;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cargo.classes.ProductsModel;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;


public class search_fragment extends Fragment {

    private static final String TAG = "getall";
    //private FirebaseFirestore db= FirebaseFirestore.getInstance();
    //FirestoreRecyclerAdapter<ProductsModel, ProductAdaptor.ProductHolder> pAdapter;
    //private  CollectionReference productRef;
    //= db.collection("Products");
    RecyclerView recyclerView;
    private ProductAdaptor adapter;
    FirebaseDatabase database;
    DatabaseReference dbRef;
    private List<ProductsModel>productsList;
    EditText searchText;

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
        ImageButton button = v.findViewById(R.id.back_arrow_search_fragment);
        button.setOnClickListener(OnBackClick);
        recyclerView= v.findViewById(R.id.productRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(requireContext()));

        productsList= new ArrayList<>();
        searchText= v.findViewById(R.id.inputSearch);
        //because of location of database was different than my own location, I had to insert the link fo the database inside getInstance
        // otherwise it could have been empty
        dbRef= FirebaseDatabase.getInstance("https://argo-9e2c7-default-rtdb.europe-west1.firebasedatabase.app/").getReference("Products");


        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot: snapshot.getChildren() ){
                    ProductsModel productsModel = dataSnapshot.getValue(ProductsModel.class);
                    productsList.add(productsModel);
                }
                adapter= new ProductAdaptor(getContext(),productsList);

                recyclerView.setAdapter(adapter);
                Log.d(TAG, "the whole list " + productsList);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), databaseError.getMessage(),Toast.LENGTH_SHORT ).show();
            }
        });

        return v;
    }

    View.OnClickListener OnBackClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Navigation.findNavController(requireView()).navigate(R.id.fragment_argos);
        }
    };

}
