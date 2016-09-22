package com.google.myanimation;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class PartialBlurActivity extends AppCompatActivity {

    private View mChildView;
    private View mRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partial_blur);

        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                mChildView.setTranslationY(mChildView.getHeight());

                mChildView.animate().translationY(0).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        mRootView.requestLayout();
                    }
                }).setDuration(1000).start();
//                mChildView.setTranslationY(100);
            }
        });
    }

    private void initView() {
        mChildView = findViewById(R.id.partial_child);
        mRootView = findViewById(R.id.content_partial_blur);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("test", "Childe height: " + mChildView.getHeight());
    }
}
