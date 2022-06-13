package com.example.primerparcial;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

public class GraficarRectangulo extends View {
    int h, b;
    private static final String TAG = "Mis Datos";
    public GraficarRectangulo(Context context, int h, int b) {
        super(context);
        this.h = h;
        this.b = b;

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        if(b > 1000 || h > 1000){
            canvas.drawLine(40,400,40,400+h/10,paint);
            canvas.drawLine(40,400,40+b/10,400,paint);
            canvas.drawLine(40+b/10,400,40+b/10,400+h/10,paint);
            canvas.drawLine(40,400+h/10,40+b/10,400+h/10,paint);
            canvas.drawText("Base:"+b+" Altura:"+h, 40,1050,paint);
            canvas.drawText("Escala de 10", 40,1100,paint);
        }else if(b > 100000|| h > 100000){
            canvas.drawLine(40,400,40,400+h/100,paint);
            canvas.drawLine(40,400,40+b/100,400,paint);
            canvas.drawLine(40+b/100,400,40+b/100,400+h/100,paint);
            canvas.drawLine(40,400+h/100,40+b/100,400+h/100,paint);
            canvas.drawText("Base:"+b+" Altura:"+h, 40,1050,paint);
            canvas.drawText("Escala de 100", 40,1100,paint);
        }else if(b > 10000000 || h > 10000000){
            canvas.drawLine(40,400,40,400+h/1000,paint);
            canvas.drawLine(40,400,40+b/1000,400,paint);
            canvas.drawLine(40+b/1000,400,40+b/1000,400+h/1000,paint);
            canvas.drawLine(40,400+h/1000,40+b/1000,400+h/1000,paint);
            canvas.drawText("Base:"+b+" Altura:"+h, 40,1050,paint);
            canvas.drawText("Escala de 1000", 40,1100,paint);
        }else{
            canvas.drawLine(40,400,40,400+h,paint);
            canvas.drawLine(40,400,40+b,400,paint);
            canvas.drawLine(40+b,400,40+b,400+h,paint);
            canvas.drawLine(40,400+h,40+b,400+h,paint);
            canvas.drawText("Base:"+b+" Altura:"+h, 40,1050,paint);
            canvas.drawText("Escala Normal", 40,1100,paint);
        }


    }

}
