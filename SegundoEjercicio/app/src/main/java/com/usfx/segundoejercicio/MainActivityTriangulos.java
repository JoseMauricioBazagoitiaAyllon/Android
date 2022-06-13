package com.usfx.segundoejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityTriangulos extends AppCompatActivity {

    Button calcular;
    EditText ladoA, ladoB, ladoC, anguloA, anguloB, anguloC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_triangulos);

        calcular = findViewById(R.id.buttonCalcular);
        ladoA = findViewById(R.id.editTextLadoA);
        ladoB = findViewById(R.id.editTextLadoB);
        ladoC = findViewById(R.id.editTextLadoC);
        anguloA = findViewById(R.id.editTextVariableAlpha);
        anguloB = findViewById(R.id.editTextVariableBetha);
        anguloC = findViewById(R.id.editTextVariableDeltha);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double a = Integer.parseInt(ladoA.getText().toString());
                double b = Integer.parseInt(ladoB.getText().toString());
                double c = Integer.parseInt(ladoC.getText().toString());

                double aA = Integer.parseInt(anguloA.getText().toString());
                double aB = Integer.parseInt(anguloB.getText().toString());
                double aC = Integer.parseInt(anguloC.getText().toString());

                if(aA > 180 || aB > 180 || aC > 180){

                    Toast.makeText(MainActivityTriangulos.this, "Solo de 20 hasta menos de 180",Toast.LENGTH_LONG).show();
                }

                setContentView(new Triangulos(MainActivityTriangulos.this, a, b, c, aA, aB, aC));
            }
        });





    }
}