package com.example.cargo;

import org.junit.Test;

import static org.junit.Assert.*;

import androidx.annotation.NonNull;

import com.example.cargo.classes.ProductsModel;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }



    @Test
    public void numberOfItemsInDatabase() {


       // assertEquals(10, ProductAdaptor.getItemCount());
    }
}

