package com.usfx.segundoejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityCalculadora extends AppCompatActivity {


    Button sumar, restar, multiplicar, dividir, igual, limpiar;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    TextView labelResultado;
    String operacion = "";
    int num1, num2;
    Calculadora calculadora = new Calculadora(num1, num2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_caclculadora);



        sumar = findViewById(R.id.buttonSumar);
        restar = findViewById(R.id.buttonRestar);
        multiplicar = findViewById(R.id.buttonMultiplicar);
        dividir = findViewById(R.id.buttonDividir);
        igual = findViewById(R.id.buttonIgual);
        limpiar = findViewById(R.id.buttonLimpiar);
        labelResultado = findViewById(R.id.textViewPantalla);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn0 = findViewById(R.id.button0);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(labelResultado.getText().toString());

                if(a == 0){

                    labelResultado.setText("1");
                }
                else{

                    labelResultado.setText(labelResultado.getText()+"1");
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(labelResultado.getText().toString());

                if(a == 0){

                    labelResultado.setText("2");
                }
                else{

                    labelResultado.setText(labelResultado.getText()+"2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(labelResultado.getText().toString());

                if(a == 0){

                    labelResultado.setText("3");
                }
                else{

                    labelResultado.setText(labelResultado.getText()+"3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(labelResultado.getText().toString());

                if(a == 0){

                    labelResultado.setText("4");
                }
                else{

                    labelResultado.setText(labelResultado.getText()+"4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(labelResultado.getText().toString());

                if(a == 0){

                    labelResultado.setText("5");
                }
                else{

                    labelResultado.setText(labelResultado.getText()+"5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(labelResultado.getText().toString());

                if(a == 0){

                    labelResultado.setText("6");
                }
                else{

                    labelResultado.setText(labelResultado.getText()+"6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(labelResultado.getText().toString());

                if(a == 0){

                    labelResultado.setText("7");
                }
                else{

                    labelResultado.setText(labelResultado.getText()+"7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(labelResultado.getText().toString());

                if(a == 0){

                    labelResultado.setText("8");
                }
                else{

                    labelResultado.setText(labelResultado.getText()+"8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(labelResultado.getText().toString());

                if(a == 0){

                    labelResultado.setText("9");
                }
                else{

                    labelResultado.setText(labelResultado.getText()+"9");
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(labelResultado.getText().toString());

                if(a == 0){

                    labelResultado.setText("0");
                }
                else{

                    labelResultado.setText(labelResultado.getText()+"0");
                }
            }
        });

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(labelResultado.getText().toString());

                calculadora.setVar1(num1);


                operacion = "+";

                labelResultado.setText("0");
            }


        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(labelResultado.getText().toString());

                calculadora.setVar1(num1);

                operacion = "-";

                labelResultado.setText("0");
            }


        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(labelResultado.getText().toString());

                calculadora.setVar1(num1);

                operacion = "*";

                labelResultado.setText("0");
            }


        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(labelResultado.getText().toString());

                calculadora.setVar1(num1);

                operacion = "/";

                labelResultado.setText("0");
            }


        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                num2 = Integer.parseInt(labelResultado.getText().toString());
                calculadora.setVar2(num2);

                switch (operacion){

                    case "+":
                        labelResultado.setText(calculadora.Suma());
                        break;
                    case "-":
                        labelResultado.setText(calculadora.Resta());
                        break;
                    case "*":
                        labelResultado.setText(calculadora.Multiplicar());
                        break;
                    case "/":
                        labelResultado.setText(calculadora.Dividir());
                        break;
                    default:
                        System.out.println("Error");
                        break;

                }


            }


        });

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labelResultado.setText("0");
                num1 = 0;
                num2 = 0;
                operacion = "";
            }
        });



    }
}