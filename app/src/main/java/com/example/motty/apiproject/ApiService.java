package com.example.motty.apiproject;

import com.example.motty.apiproject.model.shop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by motty on 2017/09/27.
 */

public interface ApiService {
    @GET("shops/{id}.json")
    Call<shop> getShop(@Path("id") int shopId);

    @GET("/shops.json")
    Call<List<shop>>getShop();
}
