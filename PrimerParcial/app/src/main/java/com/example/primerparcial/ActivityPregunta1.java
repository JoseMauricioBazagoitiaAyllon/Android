package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityPregunta1 extends AppCompatActivity {
    EditText edt;
    Button botonCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);

        edt =findViewById(R.id.txt_show);
        botonCalcular = findViewById(R.id.buttonCalcularPi);
        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(String.valueOf(14.1416));
            }
        });
    }
}