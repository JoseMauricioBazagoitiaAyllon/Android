package com.usfx.segundoejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botonSalir, botonComplejos, botonCalculadora, botonFormulario, botonGraficos, botonMapa,
    botonWebService, botonTriangulo, botonTriangulos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonCalculadora = findViewById(R.id.buttonCalculadora);
        botonComplejos = findViewById(R.id.buttonComplejos);
        botonFormulario = findViewById(R.id.buttonFormulario);
        botonGraficos = findViewById(R.id.buttonGraficos);
        botonTriangulo = findViewById(R.id.buttonTriganulo);
        botonTriangulos = findViewById(R.id.buttonTriganulos);
        botonMapa = findViewById(R.id.buttonMapa);
        botonWebService = findViewById(R.id.buttonWebServices);
        botonSalir = findViewById(R.id.buttonSalir);

        //.class es un binario

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
                Complejo complejo = new Complejo(5, 6, 2, 3);
                intent.putExtra("cadena", "SIS104");
                intent.putExtra("entero", 8);
                intent.putExtra("miBoolean", true);
                intent.putExtra("miObjeto", complejo);

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
                Intent intent = new Intent(MainActivity.this, MainActivityFormulario.class);
                startActivity(intent);
            }
        });

        botonWebService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityWebServices.class);
                startActivity(intent);
            }
        });

        botonMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityMapa.class);
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

        botonTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityTriangulo.class);

                intent.putExtra("vara", 5000);
                intent.putExtra("varb", 8000);

                startActivity(intent);

            }
        });

        botonTriangulos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityTriangulos.class);

                startActivity(intent);

            }
        });


    }
}