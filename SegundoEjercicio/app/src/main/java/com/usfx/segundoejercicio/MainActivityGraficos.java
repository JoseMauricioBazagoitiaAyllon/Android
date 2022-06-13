package com.usfx.segundoejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityGraficos extends AppCompatActivity {

    Button triangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_graficos);

        setContentView(new EjemploGraficos(MainActivityGraficos.this));







    }
}