package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityCalTriangulo extends AppCompatActivity {
    EditText a,b,c,A,B,C;
    String a1;
    Button botonCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cal_triangulo);
        a = findViewById(R.id.editTextaa);
        b = findViewById(R.id.editTextab);
        c = findViewById(R.id.editTextac);
        A = findViewById(R.id.editTextaA);
        B = findViewById(R.id.editTextaB);
        C = findViewById(R.id.editTextaC);
        botonCal = findViewById(R.id.buttonCalcular);
        a1 = a.getText().toString();
        float a0;
        a0 = Float.valueOf(a.getText().toString()) ;
        CalTriangulo a2 = new CalTriangulo(a0,1,1,1,1,1);


        Toast.makeText(MainActivityCalTriangulo.this, "a:"+a0, Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivityCalTriangulo.this, "b:"+b, Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivityCalTriangulo.this, "c:"+c, Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivityCalTriangulo.this, "A:"+A, Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivityCalTriangulo.this, "B:"+B, Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivityCalTriangulo.this, "C:"+C, Toast.LENGTH_SHORT).show();
        botonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ac = Float.valueOf(a.getText().toString());
                float bc = Float.valueOf(b.getText().toString());
                float cc = Float.valueOf(c.getText().toString());
                float Ac = Float.valueOf(A.getText().toString());
                float Bc = Float.valueOf(B.getText().toString());
                float Cc = Float.valueOf(C.getText().toString());
                CalTriangulo ct = new CalTriangulo(ac,bc,cc,Ac,Bc,Cc);
                float[] calculo = ct.calcular(ac,bc,cc,Ac,Bc,Cc);
                String  calculoa = Float.toString(calculo[0]) ;
                String  calculob = Float.toString(calculo[1]) ;
                String  calculoc = Float.toString(calculo[2]) ;
                String  calculoA = Float.toString(calculo[3]) ;
                String  calculoB = Float.toString(calculo[4]) ;
                String  calculoC = Float.toString(calculo[5]) ;
                a.setText(calculoa);
                b.setText(calculob);
                c.setText(calculoc);
                A.setText(calculoA);
                B.setText(calculoB);
                C.setText(calculoC);

            }
        });
    }
}