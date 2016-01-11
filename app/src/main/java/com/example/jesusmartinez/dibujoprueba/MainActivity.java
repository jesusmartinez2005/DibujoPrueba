package com.example.jesusmartinez.dibujoprueba;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final CanvasView mCanvas;
        setContentView(R.layout.activity_main);
        mCanvas=(CanvasView) findViewById(R.id.signaturecanvas);

        mCanvas.paint.setColor(Color.RED);
        mCanvas.paint.setStyle(Paint.Style.STROKE);

        Button buttonrojo=(Button) findViewById(R.id.rojob);

        buttonrojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   R.id.signaturecanvas.add
                CanvasView mCanvas2=new CanvasView(getApplicationContext(),null);
                mCanvas2=(CanvasView) findViewById(R.id.signaturecanvas);
                mCanvas2.paint.setColor(Color.BLACK);
                mCanvas2.paint.setStrokeWidth(25f);



            }
        });

    }








}
