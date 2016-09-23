package com.google.myanimation;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

import com.google.myanimation.util.TwoViewAnimator;

public class CardActivity extends AppCompatActivity {

    private View mCard1;
    private View mCard2;
    private View mCard3;
    private View mJumpBtn;

    private ViewGroup mRootView;
    private TwoViewAnimator mTowViewAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        initView();
        mTowViewAnimator = new TwoViewAnimator(mCard3, mCard1, mRootView);
    }


    private void initView() {
        mRootView = (ViewGroup) findViewById(R.id.activity_card);
        mCard1 = findViewById(R.id.card_1);
        mCard1.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (mCard1.getWidth() != 0) {
                    mTowViewAnimator.initAnimationParams();
                }
            }
        });
        mCard2 = findViewById(R.id.card_2);
        mCard3 = findViewById(R.id.card_3);

        mJumpBtn = findViewById(R.id.start_anim_btn);
        mJumpBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (whichAnimation) {
                    mTowViewAnimator.startAnimation();
                } else {
                    mTowViewAnimator.resetAnimation();
                }

                whichAnimation = !whichAnimation;
            }
        });
    }


    private boolean whichAnimation = true;

}
