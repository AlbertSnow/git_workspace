package com.google.myanimation;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.google.myanimation.bean.CardViewBean;
import com.google.myanimation.util.TwoViewAnimator;

import java.util.ArrayList;
import java.util.List;

public class CardActivity extends AppCompatActivity {

    private View mCard1;
    private View mCard2;
    private View mCard3;
    private View mCard4;

    private View mJumpBtn;
    private View mInitBtn;

    private ViewGroup mRootView;
    private TwoViewAnimator mCard2Animator;

    private TwoViewAnimator mCard3Animator;
    private List<View> mCardDataList = new ArrayList<>(4);
    private List<View> cardViewlist = new ArrayList<>(4);

    private CardViewBean card1Bean;
    private CardViewBean card2Bean;
    private CardViewBean card3Bean;
    private CardViewBean card4Bean;


    private boolean whichAnimation = true;
    private int mTopCardIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        initView();
        mCard2Animator = new TwoViewAnimator(mCard2, mCard1, mRootView);
        mCard3Animator = new TwoViewAnimator(mCard3, mCard2, mRootView);
    }


    private void initView() {
        mRootView = (ViewGroup) findViewById(R.id.activity_card);
        mCard1 = findViewById(R.id.card_1);
        mCard2 = findViewById(R.id.card_2);
        mCard3 = findViewById(R.id.card_3);
        mCard4 = findViewById(R.id.card_4);

        mCardDataList.add(mCard1);
        mCardDataList.add(mCard2);
        mCardDataList.add(mCard3);
        mCardDataList.add(mCard4);

        card1Bean = new CardViewBean(mCard1);
        card2Bean = new CardViewBean(mCard2);
        card3Bean = new CardViewBean(mCard3);
        card4Bean = new CardViewBean(mCard4);

        mJumpBtn = findViewById(R.id.start_anim_btn);
        mJumpBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Log.i("test", "X: " + mCard2.getX());
                Log.i("test", "TranslationＸ：　" + mCard2Animator.getTranslationX() + "Translation Y: " + mCard2Animator.getTranslationY());
                Log.i("test", "ScaleＸ：　" + mCard2Animator.getScaleX() + "Scale Y: " + mCard2Animator.getScaleY());
                Log.i("test", "TranslationＸ：　" + mCard3Animator.getTranslationX() + "Translation Y: " + mCard3Animator.getTranslationY());
                Log.i("test", "ScaleＸ：　" + mCard3Animator.getScaleX() + "Scale Y: " + mCard3Animator.getScaleY());
                if (whichAnimation) {
                    mCard2Animator.startAnimation();
                    mCard3Animator.startAnimation();
                } else {
                    mCard2Animator.resetAnimation();
                    mCard3Animator.resetAnimation();
                }

                whichAnimation = !whichAnimation;
            }

        });
        mInitBtn = findViewById(R.id.start_init_btn);
        mInitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCard2Animator.initAnimationParams();
                mCard3Animator.initAnimationParams();

                card2Bean.initAnimateData(mCard2Animator);
                card3Bean.initAnimateData(mCard3Animator);
            }
        });
    }

    private void popCard() {
//        mCardDataList.get(0)
    }
}
