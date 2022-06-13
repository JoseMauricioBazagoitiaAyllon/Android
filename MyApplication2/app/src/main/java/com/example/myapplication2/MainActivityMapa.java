package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication2.json.Address;
import com.example.myapplication2.json.Geo;
import com.example.myapplication2.json.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivityMapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mapa);
        recovery1();
        //float [] lat = aux;
    }
    public void recovery1(){
        String URL = "https://jsonplaceholder.typicode.com/";
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        webServiceAPI serviceHubService = retrofit.create(webServiceAPI.class);
        final Call<List<User>> call = serviceHubService.getUsers();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if(response.isSuccessful()){
                    List<User> list = response.body();
                    float[] aux={};
                    float[] aux1={};
                    for(User obj:list){
                        int i = 0;
                        String lat = obj.getAddress().getGeo().getLat();
                        String lng = obj.getAddress().getGeo().getLng();
                        aux[i]= Float.valueOf(lat) ;
                        aux1[i]= Float.valueOf(lng) ;
                    }

                }

            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }

        });

    }
}