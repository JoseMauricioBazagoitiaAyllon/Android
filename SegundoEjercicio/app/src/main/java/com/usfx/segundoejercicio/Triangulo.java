package com.usfx.segundoejercicio;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Triangulo extends View {

    private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Triangulo(Context context, int a, int b) {

        super(context);
        this.a = a;
        this.b = b;
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int y = this.a/10 ;
        int x = this.b/10 ;
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();


        paint.setColor(Color.rgb(0,0,0));

        //canvas.drawLine(500,0, 0,400, paint);

        //canvas.drawLine(0,400,500,400,paint);

        //canvas.drawLine(500,0,500,400,paint);

        //punto a
        canvas.drawLine(500, 500, 500, 500+y, paint);
        //punto b
        canvas.drawLine(500,500+y,500+x, 500+y, paint);
        //punto c
        canvas.drawLine(500+x,500+y, 500, 500, paint);

        canvas.drawLine(0, 1000, 1080, 1000, paint);

        canvas.drawLine(800, 0, 800, 1000, paint);


    }


}
