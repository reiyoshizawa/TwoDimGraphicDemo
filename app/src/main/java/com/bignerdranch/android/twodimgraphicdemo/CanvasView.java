package com.bignerdranch.android.twodimgraphicdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

public class CanvasView extends View{
    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // drawing
//        Paint red = new Paint();
//        red.setARGB(255,255,0,0);
//        red.setStyle(Paint.Style.FILL_AND_STROKE);
//
//        canvas.drawRect(50,50,150,150, red);
//
//        Paint blue = new Paint();
//        blue.setARGB(255,0,0,255);
//        blue.setTypeface(Typeface.create(Typeface.MONOSPACE, Typeface.BOLD));
//        blue.setTextSize(50);
//        blue.setStyle(Paint.Style.FILL);
//
//        canvas.drawCircle(300,300,100, blue);
//        canvas.drawText("Welcome Back!", 200, 200, blue);

        Paint yellow = new Paint();
        yellow.setARGB(255,255,255,0);
        yellow.setStyle(Paint.Style.FILL);

        Paint blue = new Paint();
        blue.setARGB(255,0,0,255);
        blue.setStyle(Paint.Style.FILL);

        Paint black = new Paint();
        black.setARGB(255,51,51,0);
        black.setTypeface(Typeface.create(Typeface.MONOSPACE, Typeface.BOLD));
        black.setTextSize(300);
        black.setStyle(Paint.Style.FILL);

        Paint red = new Paint();
        red.setARGB(255,255,0,0);
        red.setStyle(Paint.Style.FILL_AND_STROKE);

        // face
        canvas.drawCircle(200,150,300, yellow);
        // eyes
        canvas.drawCircle(140,140,30, blue);
        canvas.drawCircle(230,140,30, blue);
        // nose
        canvas.drawCircle(190,180,20, black);
        // mouth
        canvas.drawRect(160,230,230,250, red);
        // text
        canvas.drawText("shit", 120, 600, black);

//        canvas.drawArc(100,210,100,100,red);




    }
}
