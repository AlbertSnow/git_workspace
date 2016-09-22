package com.google.myanimation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/8/30.
 */

public class SvgAnimationView extends View{
    //Order is out to inner
    private Paint circlePaint1;
    private Paint circlePaint2;
    private Paint circlePaint3;
    private Paint handPaint;
    
    private Path circlePath1;
    private Path circlePath2;
    private Path circlePath3;
    private Path handPath;
    
    private static final String DATA_CIRCLE_PATH_1 = "M63,61.6a25.7,25.6 0,1 0,51.4 0a25.7,25.6 0,1 0,-51.4 0";
    private static final String DATA_CIRCLE_PATH_2 = "M88.7,79.7c10,0 18.1,-8.1 18.1,-18s-8.1,-18 -18.1,-18s-18.1,8.1 -18.1,18S78.7,79.7 88.7,79.7z";
    private static final String DATA_CIRCLE_PATH_3 = "M88.7,75c7.4,0 13.4,-6 13.4,-13.4s-6,-13.4 -13.4,-13.4s-13.4,6 -13.4,13.4S81.3,75 88.7,75z";
    private static final String DATA_HAND_PATH = "M125.5,102.4c-2.3,-2.6 -5.6,-3.1 -9,-3.6l-2.5,-0.2l-1.6,-2.7c-0.2,-0.4 -0.5,-0.8 -0.9,-1.1c-2.6,-1.2 -3.9,-0.8 -6.7,-0.9l-2.5,0.5l-0.2,-0.3l-7.8,-31.3c-1.1,-4 -3,-4 -5,-3.7c0,0 -4.1,0.6 -3.3,5.3l7.8,44c0.1,0.5 0.1,0.9 0.1,1.4c0,2.1 -0.6,3.9 -1.9,5.4c-0.3,0.5 -0.9,0.9 -1.3,0.9c-2.4,0.4 -4.5,-0.2 -6.4,-1.8c-2.4,-1.9 -4,-4.4 -5.6,-6.9c-0.9,-1.4 -1.7,-3.2 -2.8,-4.5c-2,-2.4 -6.5,-4.1 -9,-1.9c-0.8,0.7 -1.7,2.6 -0.9,3.7c1.1,1.5 2.5,3.2 3.2,4.8c0.6,1.4 1.1,2.8 1.6,4.4C71.1,114.9 71.3,116 72,116.6c0.8,0.7 1.3,2.4 1.9,3.2c1.3,2 3,4.4 3.9,6.8c2.4,3.8 3.5,8.6 6.3,12.3c3.3,4.4 6.7,8.4 11.6,11c1.8,1.1 3.2,2.5 4.2,4.4c0,0 0.8,4.3 1.3,7c0.4,1.6 1.4,2 2.9,1.9c3.9,-0.1 6.9,-0.1 14.8,-1.3c7.9,-1.2 12.2,-2.9 15.1,-4.1c1.6,-0.2 2,-1.2 1.8,-2.3c-0.5,-2.3 -1.4,-6.3 -1.4,-6.3c0.5,-2.1 1,-4.1 1.5,-6.1c0.4,-1.6 0.6,-3.2 0.7,-4.8c0.2,-4.3 -0.4,-10.8 -0.2,-15.1c0,-0.8 0.1,-1.5 0.2,-2.3c0.3,-2.5 -1.7,-11.4 -6.7,-11.7C128.4,106.5 127.5,104.7 125.5,102.4z";
    
    private static final float SVG_VIEW_PORT_WIDTH = 200;
    private static final float SVG_VIEW_PORT_HEIGHT = 200;
    private int mWidth;
    private int mHeight;
    private float mCenterX;
    private float mCenterY;

    public SvgAnimationView(Context context) {
        super(context);
        init();
    }

    public SvgAnimationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SvgAnimationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        initPaint();
    }

    private void initPath(Matrix matrix) {
        circlePath1 = new Path();
        circlePath1.addPath(PathParser.parsePath(DATA_CIRCLE_PATH_1), matrix);

        circlePath2 = new Path();
        circlePath2.addPath(PathParser.parsePath(DATA_CIRCLE_PATH_2), matrix);

        circlePath3 = new Path();
        circlePath3.addPath(PathParser.parsePath(DATA_CIRCLE_PATH_3), matrix);

        handPath = new Path();
        handPath.addPath(PathParser.parsePath(DATA_HAND_PATH), matrix);
    }

    private void initPaint() {
        circlePaint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        circlePaint1.setColor(Color.parseColor("#FFFFFFFF"));
        circlePaint1.setStrokeWidth(1.9685f);
        circlePaint1.setStyle(Paint.Style.STROKE);

        circlePaint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        circlePaint2.setColor(Color.parseColor("#33FFFFFF"));  //0.2 transparent
        circlePaint2.setStyle(Paint.Style.FILL);

        circlePaint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
        circlePaint3.setColor(Color.parseColor("#B2FFFFFF"));   //0.7 transparent
        circlePaint3.setStyle(Paint.Style.FILL);

        handPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        handPaint.setColor(Color.parseColor("#FFFFFFFF"));
        handPaint.setStyle(Paint.Style.STROKE);
        handPaint.setStrokeWidth(4);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w - getPaddingLeft() - getPaddingRight();
        mHeight = h - getPaddingTop() - getPaddingBottom();

        mCenterX = w / 2.0f;
        mCenterY = h / 2.0f;

        float scaleX = w / SVG_VIEW_PORT_WIDTH;
        float scaleY = h / SVG_VIEW_PORT_HEIGHT;
        Matrix matrix = new Matrix();
        matrix.postScale(scaleX, scaleX);
        initPath(matrix);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        canvas.drawPath(circlePath1, circlePaint1);
        canvas.drawPath(circlePath2, circlePaint2);
        canvas.drawPath(circlePath3, circlePaint3);


        canvas.drawPath(handPath, handPaint);
//        canvas.
    }
}
