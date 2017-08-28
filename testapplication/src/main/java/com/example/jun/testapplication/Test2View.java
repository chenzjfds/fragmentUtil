package com.example.jun.testapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LightingColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 陈志军 on 2017/8/6.
 */

public class Test2View extends View {
    public Test2View(Context context) {
        super(context);
    }

    public Test2View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Test2View(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
Paint  paint=new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Shader shader1 = new LinearGradient(100, 100, 500, 500, Color.parseColor("#E91E63"),
                Color.parseColor("#ff0000"), Shader.TileMode.CLAMP);
       /* Shader shader2 = new SweepGradient(200, 200,  Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"));
        Shader shader = new ComposeShader(shader1,);*/
        paint.setShader(shader1);
        paint.setColorFilter(new LightingColorFilter(0x00ffff,0x000000));
        canvas.drawCircle(300, 300, 200, paint);
    }
}
