package com.example.myapplication2;

public class CalTriangulo {
    float a;
    float b;
    float c;
    float aA;
    float aB;
    float aC;

    public CalTriangulo(float a, float b, float c, float aA, float aB, float aC) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.aA = aA;
        this.aB = aB;
        this.aC = aC;
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

    public float getaA() {
        return aA;
    }

    public void setaA(float aA) {
        this.aA = aA;
    }

    public float getaB() {
        return aB;
    }

    public void setaB(float aB) {
        this.aB = aB;
    }

    public float getaC() {
        return aC;
    }

    public void setaC(float aC) {
        this.aC = aC;
    }
    public float SumaAngulos(float a,float b,float c){
        float x = a+b+c-180;
        return x;
    }
    public  float SenoL(float b, float aB,float aA){
        float x = (float)((b*Math.sin(aA))/Math.sin(aB));
        return x;
    }
    public  float SenoA(float a, float aB,float b){
        float x = (float)(Math.asin((a*Math.sin(aB)/b)));
        return x;
    }
    public float Cos(float b,float c, float aA){
        float x =(float)(Math.sqrt(Math.pow(b,2)+Math.pow(c,2)-2*b*c*Math.cos(aA)));
        return x;
    }
    public float[] calcular(float a, float b, float c, float aA, float aB, float aC){
        while (true){
            if(a != 0){
                if (b!=0.0){
                    if (aA == 0.0 && aB != 0.0){
                        aA = this.SenoA(a,aB,b);
                    }else if (aA != 0){
                        aB = this.SenoA(a,aA,b);
                    }
                    if(aC!=0.0){
                        c=Cos(a,b,aC);
                    }
                }else if (aA != 0.0 && aB!=0){
                    b =(float) (a*Math.sin(aA)/Math.sin(aB));
                }if (c != 0.0){
                    if (aA == 0.0 && aC != 0.0){
                        aA = (float) (Math.asin(a*Math.sin(aC)));
                    }else if (aA != 0.0){
                        aC = this.SenoA(c,aA,a);
                    }if (aB!=0.0){
                        b = Cos(a,c,aB);
                    }
                }else if (aA != 0.0 && aC != 0){
                    c =(float) (a*Math.sin(aA)/Math.sin(aC));
                }
            }else if (aA != 0.0 && aB != 0.0 && b!=0.0){
                a= this.SenoL(b,aB,aA);
            }else if (aA != 0.0 && aC != 0.0 && c!=0.0){
                a = this.SenoL(c,aC,aA);
            }
            if(b!= 0){
                if (a!=0.0){
                    if (aA == 0.0 && aB != 0.0){
                        aB = this.SenoA(b,aA,a);
                    }else if (aB != 0){
                        aA = this.SenoA(b,aB,a);
                    }
                    if(aC!=0.0){
                        c=Cos(b,a,aC);
                    }
                }else if (aB != 0.0 && aA!=0){
                    a =(float) (b*Math.sin(aB)/Math.sin(aA));
                }if (c != 0.0){
                    if (aB == 0.0 && aC != 0.0){
                        aB = (float) (Math.asin(b*Math.sin(aC)));
                    }else if (aB != 0.0){
                        aB = this.SenoA(c,aB,b);
                    }if (aA!=0.0){
                        a = Cos(b,c,aA);
                    }
                }else if (aB != 0.0 && aC != 0){
                    c =(float) (b*Math.sin(aB)/Math.sin(aC));
                }
            }else if (aA != 0.0 && aB != 0.0 && b!=0.0){
                b= this.SenoL(a,aA,aB);
            }else if (aB != 0.0 && aC != 0.0 && c!=0.0){
                b = this.SenoL(c,aC,aB);
            }
            if(c != 0){
                if (b!=0.0){
                    if (aC == 0.0 && aB != 0.0){
                        aC = this.SenoA(c,aB,b);
                    }else if (aC != 0){
                        aB = this.SenoA(c,aC,b);
                    }
                    if(aA!=0.0){
                        a=Cos(c,b,aA);
                    }
                }else if (aC != 0.0 && aB!=0){
                    b =(float) (c*Math.sin(aC)/Math.sin(aB));
                }if (a != 0.0){
                    if (aC == 0.0 && aC != 0.0){
                        aC = (float) (Math.asin(c*Math.sin(aA)));
                    }else if (aC != 0.0){
                        aA = this.SenoA(a,aC,c);
                    }if (aB!=0.0){
                        b = Cos(c,a,aC);
                    }
                }else if (aC != 0.0 && aA != 0){
                    a =(float) (c*Math.sin(aC)/Math.sin(aA));
                }
            }else if (aC != 0.0 && aB != 0.0 && b!=0.0){
                c= this.SenoL(b,aB,aC);
            }else if (aA != 0.0 && aC != 0.0 && a!=0.0){
                c = this.SenoL(a,aA,aC);
            }if (aA != 0.0 && aB != 0.0){
                aC=180-aA-aB;
            }
            if (aC != 0.0 && aB != 0.0){
                aA=180-aC-aB;
            }
            if (aC != 0.0 && aB != 0.0){
                aB=180-aA-aC;
            }

            if (a!=0 && b!=0 && c !=0 && aA!=0 && aB!=0 && aC!=0){
                float [] x = {a,b,c,aA,aB,aC};
                return x;
            }
        }
    }


}
