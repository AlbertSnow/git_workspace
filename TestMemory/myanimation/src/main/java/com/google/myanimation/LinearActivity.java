package com.google.myanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LinearActivity extends AppCompatActivity {

    private View mTv1;
    private View mTv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        initView();
    }

    private void initView() {
        mTv1 = findViewById(R.id.textView1);
        mTv2 = findViewById(R.id.textView2);

        findViewById(R.id.linear_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float preTv1With = mTv2.getX();
                if (mTv1.getVisibility() != View.VISIBLE) {
                    mTv1.setVisibility(View.VISIBLE);
                } else {
                    mTv1.setVisibility(View.GONE);
                }
                float lastTv1With = mTv2.getX();

                Log.i("test", "preWidth: " + preTv1With + " lastWidth: " + lastTv1With);

            }
        });
    }
}
