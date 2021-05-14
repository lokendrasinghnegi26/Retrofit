package com.lokendrasingh.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.CustomHolder> {

    private List<RetroPhoto> datalist;
    private Context context;

    public CustomAdaptor(Context context, List<RetroPhoto> datalist) {
        this.context = context;
        this.datalist = datalist;

    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view= layoutInflater.inflate(R.layout.adaptor,parent,false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
        holder.textView.setText(datalist.get(position).getTitle());

        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(datalist.get(position).getThumbnailUrl())
                .placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(holder.img);

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView img;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.textView);
            img= itemView.findViewById(R.id.imageView);
        }
    }
}
