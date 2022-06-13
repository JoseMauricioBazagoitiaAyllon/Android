package com.example.myapplication2;

import android.widget.EditText;

import java.io.Serializable;

public class Operaciones implements Serializable {
    float a;
    float b;
    EditText edt;

    public Operaciones(float a, float b) {
        this.a = a;
        this.b = b;

    }
    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public float suma(){
        return  this.a + this.b;
    }
    public float resta(){
        return  a - b;
    }
    public float multiplicacion(){
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