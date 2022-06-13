package com.usfx.segundoejercicio;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Triangulos extends View {

    private double a;
    private double b;
    private double c;
    private double alphha;
    private double beta;
    private double deltha;

    public static final String TAG = "MISDATOS";

    public Triangulos(Context context, double a, double b, double c, double alpha, double beta, double deltha) {
        super(context);
        this.a = a;
        this.b = b;
        this.c = c;
        this.alphha = alpha;
        this.beta = beta;
        this.deltha = deltha;
    }

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double getAlphha() {
        return alphha;
    }

    public void setAlphha(double alpha) {
        this.alphha = alpha;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getDeltha() {
        return deltha;
    }

    public void setDeltha(double deltha) {
        this.deltha = deltha;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        //limite en x = de -20 a +20: y = -20 a +20
        int ancho = getWidth();
        int alto = getHeight();

        //limite supuperior de x
        float limsupx = 20;
        //limite inferior de x;
        float liminfx = -20;
        //limite superior de y
        float limsupy = 20;
        //limite inferiror de y
        float liminfy = -20;

        paint.setColor(Color.RED);
        canvas.drawLine(ancho/2, 0, ancho/2, alto*1, paint);
        canvas.drawLine(0, alto/2,ancho*1, alto/2, paint);

        double aux[] = Proyecciones();

        double a = this.a;
        double b = this.b;
        double c = this.c;

        double A = getAlphha();
        double B = getBeta();
        double C = getDeltha();

        if(a == 0 || b ==0 || c ==0){

            double ladox[] = Lado();

            a = ladox[0];
            b = ladox[1];
            c = ladox[2];
        }

        if(A == 0){

            A = CosenoA();
        }

        if(B == 0){

            B = CosenoB();
        }
        if(C == 0){

            C = CosenoC();
        }



        float bx = (float)((b-liminfx) * ancho) / (limsupx - liminfx);

        //puntos de la izquierda
        float tx = ((-20-liminfx) * ancho) / (limsupx - liminfx);
        float ty = alto - ((-20-liminfy) * alto) / (limsupy - liminfy);

        double p = Math.sqrt(3*3 - (3/2*3/2));

        Log.i(TAG, " a: "+a+" b: "+b+" c: "+a+" Ancho: "+bx+" A: "+A+" B : "+B+" C: "+C+" P: "+p);

        //float tx = ((x-liminfx) * ancho) / (limsupx - liminfx);
        //float ty = alto - ((y-liminfy) * alto) / (limsupy - liminfy);
        //Java Enterprise Edition

        if(a == c && a != b) {

            double h = aux[0];
            double m = aux[1];
            double n = aux[2];

            float hy = (float)((float) h - ((Altura()-liminfy) * alto) / (limsupy - liminfy));
            float mx = (float) (((m-liminfx) * ancho) / (limsupx - liminfx));
            float nx = (float) (((n-liminfx) * ancho) / (limsupx - liminfx));

            //float tx = ((x-liminfx) * ancho) / (limsupx - liminfx);
            //float ty = alto - ((y-liminfy) * alto) / (limsupy - liminfy);

            paint.setColor(Color.RED);
            canvas.drawLine(tx + (bx/2), ty+hy, tx + tx*1, ty*1, paint);
            canvas.drawLine(tx*1, ty*1,tx + bx, ty*1, paint);
            canvas.drawLine(tx+bx, ty*1,tx + (bx/2), ty+hy, paint);




        }
        if(a==b && b==c){

            double h = aux[0];
            double m = aux[1];
            double n = aux[2];

            float hy = (float)((float) h - ((Altura()-liminfy) * alto) / (limsupy - liminfy));
            float mx = (float) (((m-liminfx) * ancho) / (limsupx - liminfx));
            float nx = (float) (((n-liminfx) * ancho) / (limsupx - liminfx));
            paint.setColor(Color.RED);

            canvas.drawLine(tx + (bx/2), ty+hy, tx + tx*1, ty*1, paint);
            canvas.drawLine(tx*1, ty*1,tx + bx, ty*1, paint);
            canvas.drawLine(tx+bx, ty*1,tx + (bx/2), ty+hy, paint);

        }
        if(a != c && c != b && b != a){
            double h = aux[0];
            double m = aux[1];
            double n = aux[2];

            float hy = (float)((float) h - ((Altura()-liminfy) * alto) / (limsupy - liminfy));
            float mx = (float) (((m-liminfx) * ancho) / (limsupx - liminfx));
            float nx = (float) (((n-liminfx) * ancho) / (limsupx - liminfx));

            paint.setColor(Color.RED);
            canvas.drawLine(tx + mx, ty+hy, tx + tx*1, ty*1, paint);
            canvas.drawLine(tx*1, ty*1,tx + mx+nx, ty*1, paint);
            canvas.drawLine(tx+mx+nx, ty*1,tx + mx, ty+hy, paint);

        }
    }

    public double[] Proyecciones(){
        double[] aux = new double[3];

        double a = this.a;
        double b = this.b;
        double c = this.c;

        double h = (a*c)/b;
        double m = a*a/b;
        double n = c*c/b;

        aux[0] = h;
        aux[1] = m;
        aux[2] = n;

        return aux;
    }

    public double Altura(){
        double altura = 0;

        double a = this.a;
        double b = this.b;

        double base = b/2;

        altura = Math.sqrt((a*a) - (base*base));


        return altura;

    }

    public double CosenoA(){

        // a2 = b2 + c2 - 2bc * cosA;
        // b2 = a2 + c2 - 2ac * cosB;
        // c2 = a2 + b2 - 2ab * cosC;

        double a = this.a;
        double b = this.b;
        double c = this.c;

        double A = getAlphha();
        double B = getBeta();
        double C = getDeltha();
        double aux1 = 0;

        aux1 = Math.acos((b*b + c*c) / (-2*b*c));
        setAlphha(aux1);

        return aux1;

    }

    public double CosenoB(){
        double a = this.a;
        double b = this.b;
        double c = this.c;

        double aux1 = 0;

        aux1 = Math.acos((b*b + (- a*a - c*c)) / (-2*a*c));

        return aux1;
    }

    public double CosenoC(){

        double a = this.a;
        double b = this.b;
        double c = this.c;

        double aux1 = 0;

        aux1 = Math.acos((c*c - a*a - b*b) / (-2*a*b));

        return aux1;
    }

    public double[] Lado(){

        double a = this.a;
        double b = this.b;
        double c = this.c;

        double A = getAlphha();
        double B = getBeta();
        double C = getDeltha();
        double aux1[] = new double[3];

        //Lados
        if (a == 0){
            aux1[0] = Math.sqrt(b*b+c*c-(2*b*c*Math.cos(A)));


        }
        else{
            aux1[0] = a;
        }
        if(b == 0){
            aux1[1] = Math.sqrt(a*a+c*c-(2*a*c*Math.cos(B)));

        }
        else{
            aux1[1] = b;
        }
        if(c == 0){
            aux1[2] = Math.sqrt(a*a+b*b-(2*a*b*Math.cos(C)));

        }else{

            aux1[2] = c;
        }

        return aux1;
    }

    public void TSeno(){
        // a/senA = b/senB = c/senC;
        double a = getA();
        double b = getB();
        double c = getC();

        double A = this.alphha;
        double B = this.beta;
        double C = this.deltha;

        double res = 0;


        //Lados
        if (a == 0 && A != 0){
            if(b != 0 && B != 0){
                res = (b/Math.sin(B))* Math.sin(A);
            }
            if(c != 0 && C != 0){
                res = (c/Math.sin(C))* Math.sin(A);
            }
             setA(res);
        }
        if(b == 0 && B != 0){
            if(c != 0 && C != 0){
                res = (c/Math.sin(C))* Math.sin(B);
            }
            if(a != 0 && A != 0){
                res = (a/Math.sin(A))* Math.sin(B);
            }
            setB(res);
        }
        if(c == 0 && C != 0){
            if(a != 0 && A != 0){
                res = (a/Math.sin(A))* Math.sin(C);
            }
            if(b != 0 && B != 0){
                res = (b/Math.sin(B))* Math.sin(C);
            }
           setC(res);
        }
        //Angulos
        double res2 = 0;
        if (A == 0 && a !=0){
            if(b != 0 && B != 0){
                res2 = (b/Math.sin(B))* Math.sin(A);
            }
            if(c != 0 && C != 0){
                res2 = (c/Math.sin(C))* Math.sin(A);
            }
            setAlphha(res2);
        }
        if(B == 0 && b != 0){
            if(c != 0 && C != 0){
                res2 = (c/Math.sin(C))* Math.sin(B);
            }
            if(a != 0 && A != 0){
                res2 = (a/Math.sin(A))* Math.sin(B);
            }
            setBeta(res2);
        }
        if(C == 0 && c != 0){
            if(a != 0 && A != 0) {
                res2 = (a / Math.sin(A)) * Math.sin(C);
            }
            if(b != 0 && B != 0){
                res2 = (b/Math.sin(B))* Math.sin(C);
            }
            setDeltha(res2);
        }

    }
}
