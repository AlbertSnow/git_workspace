package com.google.myanimation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/9/23.
 */

public class CardLayout  extends ViewGroup {

    private int mWidth;
    private int mHeight;

    public CardLayout(Context context) {
        super(context);
    }

    public CardLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CardLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w - getPaddingLeft() - getPaddingRight();
        mHeight = h - getPaddingTop() - getPaddingBottom();
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        View child1 = getChildAt(0);
        View child2 = getChildAt(1);
        View child3 = getChildAt(2);

//        child1.layout();
    }
}
