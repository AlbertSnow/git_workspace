package com.google.myanimation.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.google.myanimation.R;


import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/6.
 */
public class StarView extends View{
    public static final int DEFFAULT_BIG_STAR_RADIUS = 100;
    public static final int DEFFAULT_SMALL_STAR_RADIUS = 40;
    public static final String TAG = "testAnimation";
    private int mBigStarRadius;
    private int mSmallStarRadius;
    /**
     * 逆时针，起点是x正轴上的顶点
     */
    private Paint mBigStarPaint;
    private Paint mSmallStarPaint;
    private Paint mPointPaint;
    private StarShape mBigStarShape;
    private StarShape mSmallStarShape;

    private ArrayList<StarVertex> mMaxStarVertexs = new ArrayList<StarVertex>(5);

    private int mCentralX = 0;
    private int mCentralY = 0;

    private int mSmallStarAlpha;
    private int mSmallStarTranslate;
    private boolean mIsTriggleSubAnimation = false;

    public StarView(Context context) {
        super(context);
        initStyle(null);
        init();
    }

    public StarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initStyle(attrs);
        init();
    }

    public StarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void initStyle(AttributeSet attrs) {
        if (attrs == null) {
            mBigStarRadius = DEFFAULT_BIG_STAR_RADIUS;
            mSmallStarRadius = DEFFAULT_SMALL_STAR_RADIUS;
            return;
        }

        TypedArray array = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.StarView, 0, 0);
        try {
            mBigStarRadius = array.getInt(R.styleable.StarView_mainStarRadius, DEFFAULT_BIG_STAR_RADIUS);
            mSmallStarRadius = array.getInt(R.styleable.StarView_mainStarRadius, DEFFAULT_SMALL_STAR_RADIUS);
        } finally {
            array.recycle();
        }
    }

    private void init() {
        mBigStarPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mBigStarPaint.setColor(Color.YELLOW);
        mBigStarPaint.setStyle(Paint.Style.FILL);

        mSmallStarPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mSmallStarPaint.setColor(Color.YELLOW);
        mSmallStarPaint.setStyle(Paint.Style.FILL);

        mPointPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPointPaint.setColor(Color.BLACK);
        mPointPaint.setStyle(Paint.Style.FILL);

        mBigStarShape = new StarShape(mBigStarRadius);
        mSmallStarShape = new StarShape(DEFFAULT_SMALL_STAR_RADIUS);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int horizontalPadding = getPaddingLeft() + getPaddingRight();
        int verticalPadding = getPaddingTop() + getPaddingBottom();
        mCentralX = w / 2;
        mCentralY = h / 2;
        Log.i("testView", "onSizeChange x:"+mCentralX+" y:"+mCentralY);
    }

    public void setBigStarRadius(int radius) {
        mBigStarShape.setRadius(radius);
        invalidate();
    }

    /**
     * 减少invalide次数，让radius来invalid
     * @param alpha
     */
    public void setBigStarAlpha(int alpha) {
        mBigStarPaint.setAlpha(alpha);
    }

    public void setSmallStarTranslate(int translate) {
        mSmallStarTranslate = translate;
        invalidate();
    }

    public void setSmallStarAlpha(int alpha) {
        mSmallStarAlpha = alpha;
//        invalidate();
    }

    public int getRadius() {
        return mBigStarShape.getRadius();
    }
    public void startStarAnimation(){
        setLayerType(LAYER_TYPE_HARDWARE, null);
        ObjectAnimator animator = (ObjectAnimator) AnimatorInflater.loadAnimator(getContext(), R.animator.single_start_scale);
        animator.setTarget(this);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                if(!mIsTriggleSubAnimation && animation.getCurrentPlayTime() > animation.getDuration() * 0.8){
                    mIsTriggleSubAnimation = true;

                    mMaxStarVertexs.clear();
                    for(int i=0; i<5; i++){
                        mMaxStarVertexs.add(mBigStarShape.getVertex(i));
                    }

                    ObjectAnimator subAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(getContext(), R.animator.star_translate_fade);
                    subAnimator.addListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animation) {
                        }

                        @Override
                        public void onAnimationEnd(Animator animation) {
                            mIsTriggleSubAnimation = false;
                        }

                        @Override
                        public void onAnimationCancel(Animator animation) {
                        }

                        @Override
                        public void onAnimationRepeat(Animator animation) {
                        }
                    });
                    subAnimator.setTarget(StarView.this);
                    subAnimator.start();
                }
            }
        });
        animator.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(mCentralX, mCentralY);
//        canvas.translate(100, 150);

        canvas.drawPath(mBigStarShape.getStarPath(), mBigStarPaint);


        if (mIsTriggleSubAnimation){
            mSmallStarPaint.setAlpha(mSmallStarAlpha);

            canvas.save();
            canvas.translate(mMaxStarVertexs.get(4).x + mSmallStarTranslate, mMaxStarVertexs.get(4).y - mSmallStarTranslate - 20);
            canvas.drawPath(mSmallStarShape.getStarPath(), mSmallStarPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(mMaxStarVertexs.get(3).x + mSmallStarTranslate, mMaxStarVertexs.get(3).y + mSmallStarTranslate - 10);
            canvas.drawPath(mSmallStarShape.getStarPath(), mSmallStarPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(mMaxStarVertexs.get(2).x - mSmallStarTranslate, mMaxStarVertexs.get(2).y + mSmallStarTranslate -20);
            canvas.drawPath(mSmallStarShape.getStarPath(), mSmallStarPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(mMaxStarVertexs.get(1).x - mSmallStarTranslate, mMaxStarVertexs.get(1).y - mSmallStarTranslate - 15);
            canvas.drawPath(mSmallStarShape.getStarPath(), mSmallStarPaint);
            canvas.restore();
        }

//        for(int i=0; i<5; i++){
//            canvas.drawCircle(mBigStarShape.getVertex(i).x, mBigStarShape.getVertex(i).y, 10, mPointPaint);
//        }
//        canvas.drawCircle(0, 0, 10, mPointPaint);
    }
}
