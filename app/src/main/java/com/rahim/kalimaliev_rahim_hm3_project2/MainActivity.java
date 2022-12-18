package com.rahim.kalimaliev_rahim_hm3_project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView products;
    private ArrayList<String> productList = new ArrayList<>();
    private productAdapter adapter = new productAdapter(productList);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        products = findViewById(R.id.product);
        loadData();
        products.setAdapter(adapter);
    }

    private void loadData() {
        productList.add("Milk");
        productList.add("Meat");
        productList.add("Cheese");
        productList.add("Apples");
        productList.add("Fish");
        productList.add("Water");
        productList.add("Bread");
        productList.add("Sandwich");
        productList.add("Juice");
        productList.add("Tea");
    }
}