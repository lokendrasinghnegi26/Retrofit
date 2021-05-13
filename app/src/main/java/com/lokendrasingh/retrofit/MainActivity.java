package com.lokendrasingh.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView r;
    CustomAdaptor cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = findViewById(R.id.recyclerview);

        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<RetroPhoto>> call = service.getAllPhotos();

        call.enqueue(new Callback<List<RetroPhoto>>() {
            @Override
            public void onResponse(Call<List<RetroPhoto>> call, Response<List<RetroPhoto>> response) {

                getdatalist(response.body());
            }

            @Override
            public void onFailure(Call<List<RetroPhoto>> call, Throwable t) {

            }
        });
    }

    public void getdatalist(List<RetroPhoto> listofphoto) {

        cd = new CustomAdaptor(this, listofphoto);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        r.setLayoutManager(layoutManager);
        r.setAdapter(cd);
    }
}