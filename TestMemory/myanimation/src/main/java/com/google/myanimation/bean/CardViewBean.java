package com.google.myanimation.bean;

import android.view.View;

import com.google.myanimation.util.TwoViewAnimator;

/**
 * Created by Administrator on 2016/9/23.
 */

public class CardViewBean {
    public float x;
    public float y;

    public float translationX;
    public float translationY;

    public float scaleX;
    public float scaleY;

    public float height;
    public float width;

    public CardViewBean(View view) {
        x = view.getX();
        y = view.getY();

        height = view.getHeight();
        width = view.getWidth();
    }

    public void initAnimateData(TwoViewAnimator twoViewAnimator) {
        translationX = twoViewAnimator.getTranslationX();
        translationY = twoViewAnimator.getTranslationY();

        scaleX = twoViewAnimator.getScaleX();
        scaleY = twoViewAnimator.getScaleY();
    }

    @Override
    public String toString() {
        return "CardViewBean{" +
                "x=" + x +
                ", y=" + y +
                ", translationX=" + translationX +
                ", translationY=" + translationY +
                ", scaleX=" + scaleX +
                ", scaleY=" + scaleY +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
