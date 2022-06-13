package com.example.a1erparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    EditText etLimite;
    Button btnCal1;
    Button btnCal2;
    Button btnCal3;
    Button btnCal4;
    Button btnCal5;
    Button btnComparar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        btnCal1 = findViewById(R.id.btnCal1);
        btnCal2 = findViewById(R.id.btnCal2);
        btnCal3 = findViewById(R.id.btnCal3);
        btnCal4 = findViewById(R.id.btnCal4);
        btnCal5 = findViewById(R.id.btnCal5);
        btnComparar = findViewById(R.id.btnComparar);
        etLimite = findViewById(R.id.etLimite);

        btnCal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculoPI calculopi = new CalculoPI(Double.parseDouble(etLimite.getText().toString()));
                tvResultado.setText("El Calculo 1 es: " + String.valueOf(calculopi.calculo1()));
            }
        });

        btnCal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculoPI calculopi = new CalculoPI(Double.parseDouble(etLimite.getText().toString()));
                tvResultado.setText("El Calculo 2 es: " + String.valueOf(calculopi.calculo2()));
            }
        });

        btnCal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculoPI calculopi = new CalculoPI(Double.parseDouble(etLimite.getText().toString()));
                tvResultado.setText("El Calculo 2 es: " + String.valueOf(calculopi.calculo4()));
            }
        });
    }
}