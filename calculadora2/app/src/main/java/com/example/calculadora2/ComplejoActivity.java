package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComplejoActivity extends AppCompatActivity {

    TextView tvResultados;
    EditText etA, etB, etC, etD;
    Button btnSuma;
    Button btnResta;
    Button btnProducto;
    Button btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complejo);

        tvResultados = findViewById(R.id.tvResultados);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnProducto = findViewById(R.id.btnProducto);
        btnDivision = findViewById(R.id.btnDivision);
        etA = findViewById(R.id.etA);
        etB = findViewById(R.id.etB);
        etC = findViewById(R.id.etC);
        etD = findViewById(R.id.etD);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Complejo complejo = new Complejo(Double.parseDouble(etA.getText().toString()),
                        Double.parseDouble(etB.getText().toString()),
                        Double.parseDouble(etC.getText().toString()),
                        Double.parseDouble(etD.getText().toString()));
                tvResultados.setText("La Suma es: " + String.valueOf(complejo.suma()));
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Complejo complejo = new Complejo(Double.parseDouble(etA.getText().toString()),
                        Double.parseDouble(etB.getText().toString()),
                        Double.parseDouble(etC.getText().toString()),
                        Double.parseDouble(etD.getText().toString()));
                tvResultados.setText("La Resta es: " + String.valueOf(complejo.resta()));
            }
        });

        btnProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Complejo complejo = new Complejo(Double.parseDouble(etA.getText().toString()),
                        Double.parseDouble(etB.getText().toString()),
                        Double.parseDouble(etC.getText().toString()),
                        Double.parseDouble(etD.getText().toString()));
                tvResultados.setText("El Multiplicacion es: " + String.valueOf(complejo.producto()));
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Complejo complejo = new Complejo(Double.parseDouble(etA.getText().toString()),
                        Double.parseDouble(etB.getText().toString()),
                        Double.parseDouble(etC.getText().toString()),
                        Double.parseDouble(etD.getText().toString()));
                tvResultados.setText("La Division es: " + String.valueOf(complejo.division()));
            }
        });
    }
}