package com.example.calculadora2;

public class Complejo {
    private double realA;
    private double complejoB;
    private double realC;
    private double complejoD;

    public Complejo() {
        this.realA = 0;
        this.complejoB = 0;
        this.realC = 0;
        this.complejoD = 0;
    }

    public double getRealA() {
        return realA;
    }

    public void setRealA(double realA) {
        this.realA = realA;
    }

    public double getComplejoB() {
        return complejoB;
    }

    public void setComplejoB(double complejoB) {
        this.complejoB = complejoB;
    }

    public double getRealC() {
        return realC;
    }

    public void setRealC(double realC) {
        this.realC = realC;
    }

    public double getComplejoD() {
        return complejoD;
    }

    public void setComplejoD(double complejoD) {
        this.complejoD = complejoD;
    }

    public Complejo(double realA, double complejoB, double realC, double complejoD) {
        this.realA = realA;
        this.complejoB = complejoB;
        this.realC = realC;
        this.complejoD = complejoD;
    }

    public String suma() {
        double pr = this.realA + this.realC;
        double pi = this.complejoB + this.complejoD;
        return String.valueOf(pr) + " + " + String.valueOf(pi) + " i";
    }

    public String resta() {
        double pr = this.realA - this.realC;
        double pi = this.complejoB - this.complejoD;
        if (pi < 0) {
            double pii = pi * (-1);
            return String.valueOf(pr) + " - " + String.valueOf(pii) + " i";
        }
        else {
            return String.valueOf(pr) + " + " + String.valueOf(pi) + " i";
        }
    }

    public String producto() {
        double pr = (this.realA * this.realC) - (this.complejoB * this.complejoD);
        double pi = (this.realA * this.complejoD) - (this.complejoB * this.realC);
        return String.valueOf(pr) + " + " + String.valueOf(pi) + " i";
    }

    public String division() {
        double d = (this.realC * this.realC) + (this.complejoD * this.complejoD);
        double pr = ((this.realA * this.realC) + (this.complejoB * this.complejoD))/d;
        double pi = ((this.complejoB * this.realC) - (this.realA * this.complejoD))/d;
        if (pi < 0) {
            double pii = pi * (-1);
            return String.valueOf(pr) + " - " + String.valueOf(pii) + " i";
        }
        else {
            return String.valueOf(pr) + " + " + String.valueOf(pi) + " i";
        }
    }

}
