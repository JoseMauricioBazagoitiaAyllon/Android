package com.example.calculadora2;

public class Operaciones {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Operaciones(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Operaciones() {
        this.a = 0;
        this.b = 0;
    }

    public double suma() {
        return this.a + this.b;
    }

    public double resta() {
        return this.a - this.b;
    }

    public double multiplicacion() {
        return this.a * this.b;
    }

    public double division() {
        return this.a / this.b;
    }
}
