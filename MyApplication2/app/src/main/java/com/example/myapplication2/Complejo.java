package com.example.myapplication2;

public class Complejo {
    private float a,b,c,d;

    public Complejo(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getD() {
        return d;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void setD(float d) {
        this.d = d;
    }
    public String suma(){
        float pr = a+c;
        float pi = b+d;
        //return "(" + pr +")"+ "+" +"("+ pi +")"+ "i";
        if(pi >= 0){
            return pr +" + "+ pi +"i";
        }else{
            return pr +" "+ pi +"i";
        }
    }
    public String resta(){
        float pr = a-c;
        float pi = b-d;
        //return "(" + pr +")"+ "+" +"("+ pi +")"+ "i";
        if(pi >= 0){
            return pr +" + "+ pi +"i";
        }else{
            return pr +" "+ pi +"i";
        }
    }
    public String multiplicacion(){
        float pr = a*c-b*d;
        float pi = a*d+b*c;
        //return "(" + pr +")"+ "+" +"("+ pi +")"+ "i";
        if(pi >= 0){
            return pr +" + "+ pi +"i";
        }else{
            return pr +" "+ pi +"i";
        }
    }
    public String divicion(){
        float pr = ((a*c+b*d)/(c*c+d*d));
        float pi = ((b*c-a*d)/(c*c+d*d));
        //return "(" + pr +")"+ "+" +"("+ pi +")"+ "i";
        if(pi >= 0){
            return pr +" + "+ pi +"i";
        }else{
            return pr +" "+ pi +"i";
        }
    }
}
