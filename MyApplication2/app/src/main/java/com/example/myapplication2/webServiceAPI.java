package com.example.myapplication2;

import com.example.myapplication2.json.Address;
import com.example.myapplication2.json.Geo;
import com.example.myapplication2.json.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface webServiceAPI {
    @GET("users")
    Call<List<User>> getUsers();
    @GET("users")
    Call<List<Address>> getGeo();
    Call<List<Geo>> getLng();
}
