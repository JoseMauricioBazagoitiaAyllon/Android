package com.example.myfirtsapp;

import java.io.Serializable;

public class Sumar implements Serializable {
    int a;
    int b;

    public Sumar(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int suma(){
        return  this.a + this.b;
    }
    public int resta(){
        return  a - b;
    }
    public int multiplicacion(){
        return  a * b;
    }
    public String divicion(){
        if(b == 0){
            return "No se puede dividir entre 0";
        }
        else{
            float i = (a/b);
            String i1 = Float.toString(i);
            return i1;
        }
    }
}
