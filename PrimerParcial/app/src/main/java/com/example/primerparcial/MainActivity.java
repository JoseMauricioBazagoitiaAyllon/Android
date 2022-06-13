package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button botonP1,botonP2,botonP3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        botonP1 =findViewById(R.id.buttonP1);
        botonP2 =findViewById(R.id.buttonP2);
        botonP3 =findViewById(R.id.buttonP3);


        botonP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityPregunta1.class);
                startActivity(intent);
            }
        });
        botonP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityPregunta2.class);
                intent.putExtra("b",10000);
                intent.putExtra("h",60);
                startActivity(intent);
            }
        });
        botonP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityPregunta3.class);
                startActivity(intent);
            }
        });
    }
}