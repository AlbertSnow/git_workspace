package com.google.myanimation;

import android.animation.Animator;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AnimatorActivity extends AppCompatActivity {

    private View mTextView;

    private Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Log.i("test", "show mHandler receive msg");
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);
        initView();
    }

    private void initView() {
        mTextView = findViewById(R.id.test_animator_tv);
        findViewById(R.id.test_animator_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.animate().translationX(800).setDuration(1000).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        Log.i("test", "------------------start");
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        Log.i("test", "------------end");
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        Log.i("test", "--------cancel");
                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {
                        Log.i("test", "--repeat");
                    }
                }).start();
            }
        });
        findViewById(R.id.test_animator_reset_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setTranslationX(0);
            }
        });
        findViewById(R.id.test_animator_cancel_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.animate().cancel();
            }
        });
        findViewById(R.id.test_handler_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHandler.sendEmptyMessage(1);
                Log.i("test", "22222222222222222222222222222");
            }
        });
    }
}
