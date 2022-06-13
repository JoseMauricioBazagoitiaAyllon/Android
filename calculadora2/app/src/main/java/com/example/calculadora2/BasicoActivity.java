package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BasicoActivity extends AppCompatActivity {

    TextView tvResultado;
    EditText etValora, etValorb;
    Button bSuma;
    Button bResta;
    Button bMultilpliacion;
    Button bDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basico);

        tvResultado = findViewById(R.id.tvResultado);
        etValora = findViewById(R.id.etValora);
        etValorb = findViewById(R.id.etValorb);
        bSuma = findViewById(R.id.bSuma);
        bResta = findViewById(R.id.bResta);
        bMultilpliacion = findViewById(R.id.bMultiplicacion);
        bDivision = findViewById(R.id.bDivision);

        bSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones operaciones = new Operaciones(Double.parseDouble(etValora.getText().toString()),
                        Double.parseDouble(etValorb.getText().toString()));
                tvResultado.setText("La Suma es: "+ String.valueOf(operaciones.suma()));
            }
        });

        bResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones operaciones = new Operaciones(Double.parseDouble(etValora.getText().toString()),
                        Double.parseDouble(etValorb.getText().toString()));
                tvResultado.setText("La Resta es: "+String.valueOf(operaciones.resta()));
            }
        });

        bMultilpliacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones operaciones = new Operaciones(Double.parseDouble(etValora.getText().toString()),
                        Double.parseDouble(etValorb.getText().toString()));
                tvResultado.setText("La Mulplicacion es: "+ String.valueOf(operaciones.multiplicacion()));
            }
        });

        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones operaciones = new Operaciones(Double.parseDouble(etValora.getText().toString()),
                        Double.parseDouble(etValorb.getText().toString()));
                tvResultado.setText("La Division es: "+String.valueOf(operaciones.division()));
            }
        });
    }
}