package com.google.myanimation;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.google.myanimation.view.BackGroundView;
import com.google.myanimation.view.CircleProgressView;

public class ProgressActivity extends AppCompatActivity {

    private ProgressBar mProgressBar;
    private float progress;
    private CircleProgressView mCustomProgress;
    private BackGroundView mDogView;
    private int mDogViewHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        initView();
    }

    private void initView() {
        mCustomProgress = (CircleProgressView) findViewById(R.id.circleProgressView);
        mDogView = (BackGroundView) findViewById(R.id.background_view);
//        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        mHandler.sendEmptyMessage(1);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        mDogViewHeight = mDogView.getHeight();
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            progress += 5;
            if (progress > 100) {
                progress = 0;
            }
            mCustomProgress.setProgress(progress);
            sendEmptyMessageDelayed(1, 500);
        }
    };

    @Override
    public void onBackPressed() {
        mDogView.setTranslationY(mDogViewHeight);
        mDogView.animate().translationY(0).setDuration(1000);
    }
}
