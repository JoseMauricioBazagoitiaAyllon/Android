package com.example.myfirtsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    Button mybutton,mybutton2,mybutton3,mybutton4;
    TextView labelResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.txt_variable1);
        ed2 = (EditText) findViewById(R.id.txt_variable2);
        mybutton = findViewById(R.id.buttonSumar);
        labelResultado =findViewById(R.id.textViewResultado);
        mybutton2 = findViewById(R.id.buttonResta);
        mybutton3= findViewById(R.id.buttonMultiplicacion);
        mybutton4 = findViewById(R.id.buttonDivicion);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(ed1.getText().toString()) ;
                int y = Integer.parseInt(ed2.getText().toString()) ;
                Sumar sumar = new Sumar(x,y);
                labelResultado.setText(String.valueOf(sumar.suma()));
            }
        });
        mybutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(ed1.getText().toString()) ;
                int y = Integer.parseInt(ed2.getText().toString()) ;
                Sumar sumar = new Sumar(x,y);
                labelResultado.setText(String.valueOf(sumar.resta()));
            }
        });
        mybutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(ed1.getText().toString()) ;
                int y = Integer.parseInt(ed2.getText().toString()) ;
                Sumar sumar = new Sumar(x,y);
                labelResultado.setText(String.valueOf(sumar.multiplicacion()));
            }
        });
        mybutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x = Integer.parseInt(ed1.getText().toString()) ;
                int y = Integer.parseInt(ed2.getText().toString()) ;
                Sumar sumar = new Sumar(x,y);
                labelResultado.setText(String.valueOf(sumar.divicion()));
            }
        });
    }
}