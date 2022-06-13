package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication2.json.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivityWebServices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_web_services);
        recovery();
    }
    public void recovery(){
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
                    String aux = "";
                    for(User obj:list){
                        aux += obj.getEmail();
                    }
                    Toast.makeText(MainActivityWebServices.this,aux,Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });

    }
}