package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.primerparcial.json.Datos;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ActivityPregunta3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
        recovery();

    }

    public void recovery(){
        String URL = "https://jsonplaceholder.typicode.com/";
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        webServiceAPI serviceHubService = retrofit.create(webServiceAPI.class);
        final Call<List<Datos>> call = serviceHubService.getDatos();
        //Toast.makeText(ActivityPregunta3.this,"aux",Toast.LENGTH_SHORT).show();
        call.enqueue(new Callback<List<Datos>>() {
            @Override
            public void onResponse(Call<List<Datos>> call, Response<List<Datos>> response) {
                //Toast.makeText(ActivityPregunta3.this,"aux1",Toast.LENGTH_SHORT).show();
                if (response.isSuccessful()) {
                    //Toast.makeText(ActivityPregunta3.this,"aux2",Toast.LENGTH_SHORT).show();
                    List<Datos> list = response.body();
                    String aux = "";
                    int i =0;
                    for (Datos obj : list) {
                        if(i<3){
                            aux += "{userId:"+obj.getUserId()+"\n" +
                                    "id:"+obj.getId()+"\n" +
                                    "title:"+obj.getTitle()+
                            "}\n";
                        }
                        i++;
                    }
                    Toast.makeText(ActivityPregunta3.this, aux, Toast.LENGTH_SHORT).show();
                    Toast.makeText(ActivityPregunta3.this, "au", Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(ActivityPregunta3.this,"aux3",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<Datos>> call, Throwable t) {

            }
        });

    }
}