package com.bignerdranch.android.twodimgraphicdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TargetView extends View{
    public TargetView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint red = new Paint();
        red.setARGB(255,255,0,0);
        red.setStyle(Paint.Style.FILL_AND_STROKE);

        Paint white = new Paint();
        white.setARGB(255,255,255,255);
        white.setStyle(Paint.Style.FILL_AND_STROKE);

        int width = canvas.getWidth();
        int num = 5;
        int height = canvas.getHeight();
        for (int i = 0; i < num; i++) {
            canvas.drawCircle(
                    width / 2,
                    height / 2,
                    width / 2 - 100 * i,
                    i % 2 == 0 ? red : white);
        }

    }
}
