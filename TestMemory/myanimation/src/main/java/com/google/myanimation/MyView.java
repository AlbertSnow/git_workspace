package com.google.myanimation;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class MyView extends View {

    MyShape myShape;
    float ratioRadius, ratioInnerRadius;
    int numberOfPoint = 3; //default

    //corresponding to UI element
    TextView textLayerInfo;

    public MyView(Context context) {
        super(context);
        initMyView();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initMyView();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initMyView();
    }

    public void initMyView(){
        myShape = new MyShape();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        long starting = System.nanoTime();

        int w = getWidth();
        int h = getHeight();

        if((w==0) || (h==0)){
            return;
        }

        float x = (float)w/2.0f;
        float y = (float)h/2.0f;
        float radius, innerRadius;
        if(w > h){
            radius = h * ratioRadius;
            innerRadius = h * ratioInnerRadius;
        }else{
            radius = w * ratioRadius;
            innerRadius = w * ratioInnerRadius;
        }

        myShape.setStar(x, y, radius, innerRadius, numberOfPoint);
        canvas.drawPath(myShape.getPath(), myShape.getPaint());

        long end = System.nanoTime();

        String info = "myView.isHardwareAccelerated() = " + isHardwareAccelerated() + "\n"
                + "canvas.isHardwareAccelerated() = " + canvas.isHardwareAccelerated() + "\n"
                + "processing time (reference only) : " + String.valueOf(end - starting) + " (ns)";
        textLayerInfo.setText(info);

    }

    public void setShapeRadiusRatio(float ratio){
        ratioRadius = ratio;
    }

    public void setShapeInnerRadiusRatio(float ratio){
        ratioInnerRadius = ratio;
    }

    public void setNumberOfPoint(int pt){
        numberOfPoint = pt;
    }

    public void passElements(TextView textLayerInfo){
        this.textLayerInfo = textLayerInfo;
    }

}
