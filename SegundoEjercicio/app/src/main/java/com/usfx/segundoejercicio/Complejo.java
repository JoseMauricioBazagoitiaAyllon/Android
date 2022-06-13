package com.usfx.segundoejercicio;

import java.io.Serializable;

public class Complejo implements Serializable {

    private float a, b, c, d;

    public Complejo(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public String Sumar(){

        float pr = this.a + this.b;
        float pi = this.c + this.d;

        return pr+"+"+pi+"i";
    }

    public String Restar(){

        float pr = this.a - this.b;
        float pi = this.c - this.d;

        return pr+"+"+pi+"i";
    }

    public String Multiplicar(){

        float pi = this.a * this.b;
        float pi2 = this.c * this.d;
        float pd = this.a * this.d;
        float pd2 = this.b * this.c;
        float re1 = pi - pi2;
        float r2 = pd + pd2;
        return re1+"+"+r2+"i";
    }

    public String Dividir(){

        float dn = this.d * (-1);
        float divdr = this.a * this.b;
        float divdr2 = this.c * dn;
        float divdi = this.b * this.c;
        float divdi2 = this.a * dn;

        float dividendor = divdr - divdr2;
        float dividendoi = divdi + divdi2;

        float divsr = this.b * this.b;
        float divsr2 = this.d * dn;

        float divisorr = divsr - divsr2;


        float resr = dividendor / divisorr;
        float resi = dividendoi / divisorr;

        return  resr+"+"+resi+"i";
    }
}
