package com.usfx.segundoejercicio;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class EjemploGraficos extends View {

    private static final String TAG = "MISDATOS";

    public EjemploGraficos(Context context) {
        super(context);
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

        Log.i(TAG, "Ancho: "+ancho+" Alto: "+alto);


        for(float x = liminfx; x <= limsupx; x+=0.02 ){

            float y = (float)fx(x);
            float tx = ((x-liminfx) * ancho) / (limsupx - liminfx);
            float ty = alto - ((y-liminfy) * alto) / (limsupy - liminfy);

            canvas.drawCircle(tx, ty, 2, paint);
        }

        paint.setColor(Color.RED);
        canvas.drawLine(ancho/2, 0, ancho/2, alto*1, paint);
        canvas.drawLine(0, alto/2,ancho*1, alto/2, paint);
        /*for(int i = 0; i<= 300; i++){


            paint.setColor(Color.rgb(20*i, 30*i, 40*i));

            canvas.drawCircle(10+(2+i), 10+(i+3),10+(5+i),paint);
        }*/


    }
    private float fx(double x){

        return (float) Math.tan(x);
    }
}


