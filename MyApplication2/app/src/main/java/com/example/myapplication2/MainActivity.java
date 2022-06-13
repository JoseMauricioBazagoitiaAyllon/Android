package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication2.json.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Button botonCalculadora, botonComplejos, botonFormulario, botonGraficos,botonWebServices,botonMapa,botonSalir, botonTriangulo,botonCalTriangulo,botonFireBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonCalculadora = findViewById(R.id.buttonCalculadora);
        botonComplejos = findViewById(R.id.buttonComplejos);
        botonFormulario = findViewById(R.id.buttonFormulario);
        botonGraficos = findViewById(R.id.buttonGraficos);
        botonWebServices = findViewById(R.id.buttonWebServices);
        botonMapa = findViewById(R.id.buttonMapa);
        botonSalir = findViewById(R.id.buttonSalir);
        botonTriangulo = findViewById(R.id.buttonTriangulo);
        botonCalTriangulo = findViewById(R.id.buttonTrinaguloCal);
        botonFireBase = findViewById(R.id.buttonFireBase);

        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        botonComplejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityComplejo.class);
                Operaciones operaciones = new Operaciones(1,2);
                intent.putExtra("MiObjeto", operaciones);
                intent.putExtra("Cadena","SIS104");
                intent.putExtra("MiEntero",85);
                intent.putExtra("MiBooleano",true);
                startActivity(intent);
            }
        });
        botonCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityCalculadora.class);
                startActivity(intent);
            }
        });
        botonFormulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, MainActivityFormulario.class);
                startActivity(intent);
            }
        });
        botonGraficos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityGraficos.class);
                startActivity(intent);
            }
        });
        botonWebServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityWebServices.class);
                startActivity(intent);
            }
        });
        botonMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        botonTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityTriangulo.class);
                intent.putExtra("x",850000);
                intent.putExtra("y",850000);
                startActivity(intent);
            }
        });
        botonCalTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityCalTriangulo.class);
                startActivity(intent);
            }
        });
    //recovery();
    }
    public void recovery(){
        String URL = "https://jsonplaceholder.typicode.com/";
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        webServiceAPI serviceHubService = retrofit.create(webServiceAPI.class);
        final Call<List<User>> call = serviceHubService.getUsers();
        Toast.makeText(MainActivity.this,"aux",Toast.LENGTH_SHORT).show();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                Toast.makeText(MainActivity.this,"aux1",Toast.LENGTH_SHORT).show();
                if (response.isSuccessful()) {
                    Toast.makeText(MainActivity.this,"aux2",Toast.LENGTH_SHORT).show();
                    List<User> list = response.body();
                    String aux = "";
                    for (User obj : list) {
                        aux += obj.getEmail();
                    }
                    Toast.makeText(MainActivity.this, aux, Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "aux", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity.this,"aux3",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
        botonFireBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityFireBase.class);
                startActivity(intent);
            }
        });

    }

}