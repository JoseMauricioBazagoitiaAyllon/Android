package com.example.myapplication2;

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
        int x = intent.getIntExtra("x",0);
        int y = intent.getIntExtra("y",0);
        Toast.makeText(MainActivityTriangulo.this,"a "+x +" B " +y, Toast.LENGTH_SHORT).show();
        setContentView(new EjemploGraficos(MainActivityTriangulo.this,x,y));



    }
}