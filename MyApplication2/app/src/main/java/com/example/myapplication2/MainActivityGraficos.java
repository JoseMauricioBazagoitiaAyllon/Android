package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivityGraficos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_graficos);
        setContentView(new EjemploGraficos(MainActivityGraficos.this,100,100));
    }
}