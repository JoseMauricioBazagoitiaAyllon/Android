package com.usfx.segundoejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityComplejo extends AppCompatActivity {
    EditText varA, varB, varC, varD;
    Button sumar, restar, multiplicar, dividir;
    TextView labelResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_complejo);

        Intent intent = getIntent();

        String cadena = intent.getStringExtra("cadena");
        int n = intent.getIntExtra("entero", 0);
        boolean bool = intent.getBooleanExtra("miBoolean", false);

        Complejo complejo2 = (Complejo) intent.getSerializableExtra("miObjeto");

        Toast.makeText(MainActivityComplejo.this, "cadena "+n+" "+ bool+" "+cadena,Toast.LENGTH_LONG).show();

        varA = findViewById(R.id.editTextVariableA);
        varB = findViewById(R.id.editTextVariableB);
        varC = findViewById(R.id.editTextVariableC);
        varD = findViewById(R.id.editTextVariableD);
        sumar = findViewById(R.id.buttonSuma);
        restar = findViewById(R.id.buttonResta);
        multiplicar = findViewById(R.id.buttonMultiplicaion);
        dividir = findViewById(R.id.buttonDivision);
        labelResultado = findViewById(R.id.textViewResultado);


        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Integer.parseInt(varA.getText().toString());
                float b = Integer.parseInt(varB.getText().toString());
                float c = Integer.parseInt(varC.getText().toString());
                float d = Integer.parseInt(varD.getText().toString());

                Complejo complejo = new Complejo(a,b,c,d);



                labelResultado.setText(String.valueOf(complejo.Sumar()));
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Integer.parseInt(varA.getText().toString());
                float b = Integer.parseInt(varB.getText().toString());
                float c = Integer.parseInt(varC.getText().toString());
                float d = Integer.parseInt(varD.getText().toString());

                Complejo complejo = new Complejo(a,b,c,d);



                labelResultado.setText(String.valueOf(complejo.Restar()));
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Integer.parseInt(varA.getText().toString());
                float b = Integer.parseInt(varB.getText().toString());
                float c = Integer.parseInt(varC.getText().toString());
                float d = Integer.parseInt(varD.getText().toString());

                Complejo complejo = new Complejo(a,b,c,d);



                labelResultado.setText(String.valueOf(complejo.Multiplicar()));
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Integer.parseInt(varA.getText().toString());
                float b = Integer.parseInt(varB.getText().toString());
                float c = Integer.parseInt(varC.getText().toString());
                float d = Integer.parseInt(varD.getText().toString());

                Complejo complejo = new Complejo(a,b,c,d);




                labelResultado.setText(String.valueOf(complejo.Dividir()));
            }
        });


    }
}