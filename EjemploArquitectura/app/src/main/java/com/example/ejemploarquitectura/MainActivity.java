package com.example.ejemploarquitectura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button calcular;
    TextView resultado,n,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcular = findViewById(R.id.Calcular);
        resultado = findViewById(R.id.Resultado);
        n = findViewById(R.id.editTextNumberN);
        p = findViewById(R.id.editTextNumberP);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Factorial factorial = new Factorial();
                //String text = ;
                int b1 =Integer.parseInt(n.getText().toString());
                int b2 = Integer.parseInt(p.getText().toString());
                int resta = b1-b2;
                float respuesta = factorial.Fac(b1)/(factorial.Fac(b2)*factorial.Fac(resta));
                //resultado.setText((int) respuesta);
                resultado.setText(String.valueOf(respuesta));
            }
        });
    }
}