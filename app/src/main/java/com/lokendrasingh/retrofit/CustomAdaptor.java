package com.lokendrasingh.retrofit;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.CustomHolder> {

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        public CustomHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
