package com.example.a1erparcial;

import android.text.Editable;

public class CalculoPI {
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    private double limite;

    public CalculoPI(double limite) {
        this.limite = limite;
    }

    public CalculoPI() {
        this.limite = 0;
    }

    public double calculo1() {
        double pi = 0;
        for (double n = 0; n <= limite; n++){
            pi = pi + ((Math.pow(-1,n))/(2*n+1));
        }
        return pi*4;
    }

    public  double calculo2() {
        double pi = 0;
        for (double n = 1; n <= limite; n++){
            pi = pi + (1/(Math.pow(n,2)));
        }
        return Math.sqrt(6*pi);
    }


    public double fac(double number) {
        double aux = 1;

        for (double factor = 2; factor <= number; factor++) {
            aux *= factor;
        }

        return aux;
    }

    public double calculo4() {
        double pi = 0;
        for (int n = 0; n <= this.limite; n++) {
            pi = pi+ ((Math.pow(2,n)*Math.pow(this.fac(n),2))/(this.fac(2*n+1)));
        }
        return 2*pi;

    }
}
