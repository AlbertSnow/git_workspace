package com.google.myanimation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.google.myanimation.R;

import java.util.List;

/**
 * Created by Administrator on 2016/7/6.
 */
public class StarViewContainer extends LinearLayout {
    private View mStartView1;
    private View mStartView2;
    private View mStartView3;
    private View mStartView4;
    private AnimationSet mAnimationSet;

    public StarViewContainer(Context context) {
        super(context);
        init();
    }

    public StarViewContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public StarViewContainer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mAnimationSet = (AnimationSet) AnimationUtils.loadAnimation(getContext(), R.anim.start_scale);
    }

    private void initChildView() {
        mStartView1 = getChildAt(0);
        mStartView2 = getChildAt(1);
        mStartView3 = getChildAt(2);
        mStartView4 = getChildAt(3);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initChildView();
    }

    public void startAnimation(){
        List<Animation> animations = mAnimationSet.getAnimations();

        mStartView1.setAnimation(animations.get(0));
        mStartView2.setAnimation(animations.get(1));
        mStartView3.setAnimation(animations.get(2));
        mStartView4.setAnimation(animations.get(3));
        mAnimationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                setLayerType(LAYER_TYPE_HARDWARE, null);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                setLayerType(LAYER_TYPE_SOFTWARE, null);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        mAnimationSet.startNow();
        requestLayout();
    }
}
