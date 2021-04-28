package com.lokendrasingh.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView r;
CustomAdaptor cd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r= findViewById(R.id.recyclerview);
    cd= new CustomAdaptor(this,);
    r.setAdapter(cd);
    }
}