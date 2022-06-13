package com.example.calculadora2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Grafico extends View {

    public Grafico(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /*canvas.drawColor(Color.WHITE);*/
        Paint paint = new Paint();

        /*
        float limInf = -20;
        float limSup = 20;

        for(float x = limInf; x<=limSup; x++){
            double y = Fx(x);
            Log.i(TAG, msg: "x = "+x+" y = "+y);
        }
        */

        /* esto es fuera de protected void .....
        private double fx(float x){
            returm x*x;
        }
         */

        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);

        int ancho = canvas.getWidth();
        int alto = canvas.getHeight();

        paint.setColor(Color.BLUE);

        paint.setTextSize(20);
        paint.setAntiAlias(true);

        canvas.drawText("ancho = " + ancho + " alto = " + alto, 30, 30, paint);

        paint.setColor(Color.RED);

        canvas.drawLine(0, 942, ancho, 942, paint);
        canvas.drawLine(540, 0,540, alto, paint);

        paint.setColor(Color.BLUE);
        float i = 0;
        while (i < ancho){
            float x1=(float) Math.sqrt(i)*10;
            float y1=i;
            canvas.drawCircle((ancho / 2)+x1, (alto / 2)-y1, 2, paint);
            canvas.drawCircle((ancho / 2)-x1, (alto / 2)-y1, 2, paint);
            i++;
        }
    }
}
