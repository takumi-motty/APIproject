package com.example.motty.apiproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.motty.apiproject.model.shop;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://54.238.225.122/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);
        Call<List<shop>> call2 = service.getShop();
        call2.enqueue(new Callback<List<shop>>() {
            @Override
            public void onResponse(Call<List<shop>> call, Response<List<shop>> response) {
                Log.d("MainActivity", response.body().toString());
            }

            @Override
            public void onFailure(Call<List<shop>> call, Throwable t) {
                Log.d("MainActivity", t.getMessage());

            }
        });

    }


}
