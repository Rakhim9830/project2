package com.rahim.kalimaliev_rahim_hm3_project2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class productAdapter extends RecyclerView.Adapter<productViewHolder> {


    private ArrayList<String> productList;

    public productAdapter(ArrayList<String> productList){
        this.productList = productList;
    }




    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new productViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int position) {
     holder.bind(productList.get(position));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
