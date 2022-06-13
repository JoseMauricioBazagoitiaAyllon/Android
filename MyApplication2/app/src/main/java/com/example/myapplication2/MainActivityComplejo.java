package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityComplejo extends AppCompatActivity {
    EditText eda,edb,edc,edd;
    Button Bsuma,Bresta,Bmultiplicacion,Bdivicion;
    TextView labelResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_complejo);

        Intent intent = getIntent();
        String aux = intent.getStringExtra("Cadena");
        int d = intent.getIntExtra("MiEntero", 0);
        boolean db = intent.getBooleanExtra("MiBooleano", false);

        //Toast.makeText(MainActivityComplejo.this,"Recuperado "+ aux + "  Entero "+ d +"  Booleano: "+db,Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivityComplejo.this,"Recuperado "+ d,Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivityComplejo.this,"Recuperado "+ db,Toast.LENGTH_SHORT).show();
        Operaciones ope2 =(Operaciones)intent.getSerializableExtra("MiObjeto");
        //Toast.makeText(MainActivityComplejo.this,"Recuperado "+ aux + "  Entero "+ d +"  Booleano: "+db,Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivityComplejo.this,"Recuperado "+ ope2.suma(),Toast.LENGTH_SHORT).show();
        eda =(EditText) findViewById(R.id.txt_a);
        edb =findViewById(R.id.txt_b);
        edc =findViewById(R.id.txt_c);
        edd =findViewById(R.id.txt_d);
        Bsuma = findViewById(R.id.buttonSuma);
        Bresta = findViewById(R.id.buttonRestar);
        Bmultiplicacion = findViewById(R.id.buttonMultiplicacion);
        Bdivicion = findViewById(R.id.buttonDivicion);
        labelResultado = findViewById(R.id.textViewResultado);
        Bsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(eda.getText().toString());
                float b = Float.parseFloat(edb.getText().toString());
                float c = Float.parseFloat(edc.getText().toString());
                float d = Float.parseFloat(edd.getText().toString());
                Complejo sumar =new Complejo(a,b,c,d);
                labelResultado.setText(String.valueOf(sumar.suma()));
            }
        });
        Bresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(eda.getText().toString());
                float b = Float.parseFloat(edb.getText().toString());
                float c = Float.parseFloat(edc.getText().toString());
                float d = Float.parseFloat(edd.getText().toString());
                Complejo resta =new Complejo(a,b,c,d);
                labelResultado.setText(String.valueOf(resta.resta()));
            }
        });
        Bmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(eda.getText().toString());
                float b = Float.parseFloat(edb.getText().toString());
                float c = Float.parseFloat(edc.getText().toString());
                float d = Float.parseFloat(edd.getText().toString());
                Complejo multiplicacion =new Complejo(a,b,c,d);
                labelResultado.setText(String.valueOf(multiplicacion.multiplicacion()));
            }
        });
        Bdivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(eda.getText().toString());
                float b = Float.parseFloat(edb.getText().toString());
                float c = Float.parseFloat(edc.getText().toString());
                float d = Float.parseFloat(edd.getText().toString());
                Complejo divicion =new Complejo(a,b,c,d);
                labelResultado.setText(String.valueOf(divicion.divicion()));
            }
        });

    }
}