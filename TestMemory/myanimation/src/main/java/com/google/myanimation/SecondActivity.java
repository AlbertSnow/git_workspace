package com.google.myanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.myanimation.view.StarViewContainer;

public class SecondActivity extends AppCompatActivity {

    private View mStartAnimationBtn;
    private StarViewContainer mStarContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    private void initView() {
        mStarContainer = (StarViewContainer) findViewById(R.id.star_container);

        mStartAnimationBtn = findViewById(R.id.start_anim_btn);
        mStartAnimationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStarContainer.startAnimation();
            }
        });

    }
}
