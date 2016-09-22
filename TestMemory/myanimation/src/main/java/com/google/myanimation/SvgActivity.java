package com.google.myanimation;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;

public class SvgActivity extends AppCompatActivity {

    private ViewGroup mSvgRoot;
    private View mSvgCircle;
    private View mSvgHand;
    private View mStartAnimationBtn;
    private float mTranslationX;
    DisplayMetrics displayMetrics;
    private View mSvgAnimationParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svg);
        displayMetrics = getResources().getDisplayMetrics();
        initView();
    }

    private void initView() {
        int sideLength = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        mSvgRoot = (ViewGroup) findViewById(R.id.guide_hand_root);
        RelativeLayout.LayoutParams originalLayoutParams = (RelativeLayout.LayoutParams) mSvgRoot.getLayoutParams();
        originalLayoutParams.width = sideLength;
        originalLayoutParams.height = sideLength;
        mSvgRoot.setLayoutParams(originalLayoutParams);

        mSvgAnimationParent = findViewById(R.id.guide_animate_parent);
        mSvgCircle = findViewById(R.id.guide_circle);
        mSvgHand = findViewById(R.id.guide_hand);

        mStartAnimationBtn = findViewById(R.id.start_guide_btn);
        mStartAnimationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSvgRoot.setVisibility(View.VISIBLE);
                mSvgRoot.setAlpha(0f);
                mSvgRoot.animate().alpha(0.3f).setDuration(1000);

                mSvgAnimationParent.animate().translationX(0).setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        mSvgCircle.setScaleX(0);
                        mSvgCircle.setScaleY(0);
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        mSvgCircle.animate().setInterpolator(new LinearInterpolator()).scaleX(1).scaleY(1).setDuration(500);
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {
                    }
                }).setDuration(500);
            }
        });
        mSvgAnimationParent.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                mTranslationX = displayMetrics.widthPixels / 2.0f + mSvgRoot.getWidth() / 2.0f;
            }
        });

    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Log.i("test", "onWindowFocusChanged translationX: " + mTranslationX);
        mSvgAnimationParent.setTranslationX(mTranslationX);
    }
}
