package com.example.jesusmartinez.dibujoprueba;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by jesusmartinez on 29/12/15.
 */
public class CanvasView extends View {


    float x=50;
    float y=50;
    String action="acción";
    Path path = new Path();
    Paint paint = new Paint();

    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //
        //

        if (action == "comienzo") {
            path.moveTo(x, y);
        }

        if (action == "movimiento") {

            path.lineTo(x, y);
        }
        canvas.drawPath(path, paint);
        canvas.save();




    }

    public boolean onTouchEvent(MotionEvent event) {

        x = event.getX();
        y = event.getY();
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            action = "comienzo";


        }

        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            action = "movimiento";
        }
        invalidate();

        return true;
    }

}