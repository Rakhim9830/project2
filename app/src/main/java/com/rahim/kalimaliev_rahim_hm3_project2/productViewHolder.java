package com.rahim.kalimaliev_rahim_hm3_project2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class productViewHolder extends RecyclerView.ViewHolder {

    private TextView productList;

    public productViewHolder(@NonNull View itemView) {
        super(itemView);
        productList = itemView.findViewById(R.id.product_txt);
    }

    public void bind(String products){
        productList.setText(products);
    }
}
