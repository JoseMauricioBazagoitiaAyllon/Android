package com.example.ejemploarquitectura;

public class Factorial {
    //int numero;


    public long Fac(int numero){
        if (numero <=1){
            return 1;
        }
        else{
            return  numero * Fac(numero-1);
        }
    }
}
