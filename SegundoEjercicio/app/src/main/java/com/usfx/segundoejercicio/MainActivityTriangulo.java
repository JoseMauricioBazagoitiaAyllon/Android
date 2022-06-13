package com.usfx.segundoejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivityTriangulo extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_triangulo);

        Intent intent = getIntent();


        int b = intent.getIntExtra("varb", 1000);

        int a = intent.getIntExtra("vara", 100);

        Toast.makeText(MainActivityTriangulo.this, "cadena"+b+" "+a,Toast.LENGTH_LONG).show();

        setContentView(new Triangulo(MainActivityTriangulo.this, a, b));

    }
}