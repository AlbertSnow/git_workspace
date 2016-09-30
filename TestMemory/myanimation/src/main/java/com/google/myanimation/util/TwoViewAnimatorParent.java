package com.google.myanimation.util;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/**
 * 用于两个View之间进行动画，mSrcView、mDestView。destView是srcView运行的目的地
 * Created by AlbertSnow on 2016/8/29.
 */
public class TwoViewAnimatorParent {
    private ViewGroup mRootView;
    private View mSrcView;
    private View mDestView;

    private float mTranslationY;
    private float mTranslationX;

    private float mScaleX;
    private float mScaleY;


    public TwoViewAnimatorParent(View srcView, View destView, ViewGroup rootView) {
        mSrcView = srcView;
        mDestView = destView;
        mRootView = rootView;
    }

    public void initAnimationParams() {
        float[] bitToSmallTranslate = initViewOffset();
        mTranslationX = bitToSmallTranslate[0];
        mTranslationY = bitToSmallTranslate[1];

        mScaleX = mDestView.getWidth() / (float) mSrcView.getWidth();
        mScaleY = mDestView.getHeight() / (float) mSrcView.getHeight();
    }

    public float getTranslationY() {
        return mTranslationY;
    }

    public float getTranslationX() {
        return mTranslationX;
    }

    public float getScaleX() {
        return mScaleX;
    }

    public float getScaleY() {
        return mScaleY;
    }

    private float[] initViewOffset() {
        final float srcWith = mSrcView.getMeasuredWidth();
        final float srcHeight = mSrcView.getMeasuredHeight();

        final float destWith = mDestView.getMeasuredWidth();
        final float destHeight = mDestView.getMeasuredHeight();

        float transX = (getLeftTo(mDestView, mRootView) + destWith / 2) - (getLeftTo(mSrcView, mRootView) + srcWith / 2);
        float transY = (getTopTo(mDestView, mRootView) + destHeight / 2) - (getTopTo(mSrcView, mRootView) + srcHeight / 2);
        return new float[]{transX, transY};
    }

    private static int getTopTo(View target, ViewGroup rootView) {
        if (rootView == null || target == null || rootView == target) {
            return 0;
        }
        final int distance = target.getTop();
        if (target.getParent() instanceof ViewGroup) {
            return distance + getTopTo((ViewGroup) target.getParent(), rootView);
        }
        return distance;
    }

    private static int getLeftTo(View target, ViewGroup rootView) {
        if (rootView == null || target == null || rootView == target) {
            return 0;
        }
        final int distance = target.getLeft();
        if (target.getParent() instanceof ViewGroup) {
            return distance + getLeftTo((ViewGroup) target.getParent(), rootView);
        }
        return distance;
    }
}
