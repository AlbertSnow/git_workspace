package com.google.myanimation.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.OvershootInterpolator;

import com.google.myanimation.R;

/**
 * Created by Administrator on 2016/7/6.
 */
public class AnimationStarView extends StarView{
    public static final int DEFAULT_RADIUS = 300;
    /**
     * 逆时针，起点是x正轴上的顶点
     */
    private int radius = DEFAULT_RADIUS;
    private int mLastRadius = DEFAULT_RADIUS;
    private Paint mPaint;
    private Path mBounderPath;
    private StarVertex mPoint1;
    private StarVertex mPoint2;
    private StarVertex mPoint3;
    private StarVertex mPoint4;
    private StarVertex mPoint5;
    private Path path1;
    private Path path2;
    private Path path3;
    private Paint mPointPaint;

    public AnimationStarView(Context context) {
        super(context);
        init();
    }

    public AnimationStarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AnimationStarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void setBigStarRadius(int radius) {
        this.radius = radius;
        invalidate();
    }

    public int getRadius() {
        return radius;
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.YELLOW);
        mPaint.setStyle(Paint.Style.FILL);

        mPointPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPointPaint.setColor(Color.BLACK);
        mPointPaint.setStyle(Paint.Style.FILL);

        updateSize();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mLastRadius != radius){
            updateSize();
            mLastRadius = radius;
        }

        canvas.translate(400, 400);

        canvas.drawPath(mBounderPath, mPaint);

        canvas.drawCircle(0, 0, 10, mPointPaint);
        canvas.drawCircle(mPoint1.x, mPoint1.y, 10, mPointPaint);
        canvas.drawCircle(mPoint2.x, mPoint2.y, 10, mPointPaint);
        canvas.drawCircle(mPoint3.x, mPoint3.y, 10, mPointPaint);
        canvas.drawCircle(mPoint4.x, mPoint4.y, 10, mPointPaint);
        canvas.drawCircle(mPoint5.x, mPoint5.y, 10, mPointPaint);

    }

    private void updateSize(){
        mPoint1 = reUseStarVertex(mPoint1, 0, -radius);
        mPoint2 = reUseStarVertex(mPoint2, -radius * Math.sin(0.4 * Math.PI), -radius * Math.cos(0.4 * Math.PI));
        mPoint3 = reUseStarVertex(mPoint3, -radius * Math.sin(Math.PI/5), radius * Math.cos(Math.PI/5));
        mPoint4 = reUseStarVertex(mPoint4, radius * Math.sin(Math.PI/5), radius * Math.cos(Math.PI/5));
        mPoint5 = reUseStarVertex(mPoint5, radius * Math.sin(0.4 * Math.PI), -radius * Math.cos(0.4 * Math.PI));

        path1 = reUsePath(path1);
        path1.moveTo(mPoint1.x, mPoint1.y);
        path1.lineTo(mPoint3.x, mPoint3.y);
        path1.lineTo(mPoint5.x, mPoint5.y);
        path1.lineTo(0, 0);

        path2 = reUsePath(path2);
        path2.moveTo(mPoint2.x, mPoint2.y);
        path2.lineTo(mPoint4.x, mPoint4.y);
        path2.lineTo(mPoint1.x, mPoint1.y);
        path2.lineTo(0, 0);

        path3 = reUsePath(path3);
        path3.moveTo(mPoint2.x, mPoint2.y);
        path3.lineTo(mPoint5.x, mPoint5.y);
        path3.lineTo(0, 0);

        mBounderPath = reUsePath(mBounderPath);
        mBounderPath.op(path1, Path.Op.UNION);
        mBounderPath.op(path2, Path.Op.UNION);
        mBounderPath.op(path3, Path.Op.UNION);
    }

    private Path reUsePath(Path path){
        if (path == null){
            path = new Path();
        } else {
            path.reset();
        }
        return path;
    };

    private StarVertex reUseStarVertex(StarVertex vertex, double x, double y) {
        if (vertex == null){
            vertex = new StarVertex(x, y);
        } else {
            vertex.setX(x);
            vertex.setY(y);
        }
        return vertex;
    }

    private static class StarVertex{
        float x;
        float y;

        public StarVertex(){
        }

        public StarVertex(double x, double y){
            this.x = (float) x;
            this.y = (float) y;
        }

        public void setX(float x) {
            this.x = x;
        }
        public void setX(double x) {
            this.x = (float) x;
        }

        public void setY(float y) {
            this.y = y;
        }
        public void setY(double y) {
            this.y = (float) y;
        }
    }


    public void startStarAnimation() {
        ObjectAnimator animator = (ObjectAnimator) AnimatorInflater.loadAnimator(getContext(), R.animator.single_start_scale);
        animator.setTarget(this);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                if(animation.getCurrentPlayTime() == animation.getDuration() * 0.8){

                }
            }
        });
        animator.start();
    }
}
