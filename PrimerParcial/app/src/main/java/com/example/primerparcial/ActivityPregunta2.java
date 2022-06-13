package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityPregunta2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);
        Intent intent = getIntent();
        int H = intent.getIntExtra("h",0);
        int B = intent.getIntExtra("b",0);
        Toast.makeText(ActivityPregunta2.this,"Base : " + B + "Altura: "+H , Toast.LENGTH_SHORT).show();
        setContentView(new GraficarRectangulo(ActivityPregunta2.this,H,B));
    }
}