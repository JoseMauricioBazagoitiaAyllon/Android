package com.example.myapplication2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

public class EjemploGraficos extends View {


    private static final String TAG = "Mis Datos";


    public EjemploGraficos(Context context, int x, int y) {
        super(context);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        int width = getWidth();
        int height = getHeight();
        float LimiteInfX = -20;
        float LimiteSupX = 20;
        float LimiteInfY = -20;
        float LimiteSupY = 20;
        Log.i(TAG, "ancho = " + width+" Alto = "+height);
        canvas.drawLine(0,height/2,width,height/2,paint);
        canvas.drawLine(width/2,0,width/2,height,paint);
        paint.setColor(Color.BLUE);
        for (float x = LimiteInfX; x<=LimiteSupX; x += 0.02){
            float y = (float) fx(x);
            float tx = ((x-LimiteInfX)*width)/(LimiteSupX-LimiteInfX);
            float ty = height - (((y-LimiteInfY)*height)/(LimiteSupY-LimiteInfY));
            canvas.drawCircle(tx,ty,6,paint);
        }

    }
    private double fx(float x){

        return  Math.cos(x);
    }
}
