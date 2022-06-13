package com.example.primerparcial;


import com.example.primerparcial.json.Datos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface webServiceAPI {
    @GET("albums")
    Call<List<Datos>> getDatos();

}
