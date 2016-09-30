package com.google.myanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Scene;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourActivity extends AppCompatActivity {

    private TextView mSmallView;
    private TextView mBigView;
    private ViewGroup mRootView;

    private Scene mScene;
    private View mStartAnimationBtn;
    private float mScaleX;
    private float mScaleY;
    private float mSmallTextSize;
    private float transX;
    private float transY;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        initView();
    }

    private void initView() {
        mRootView = (ViewGroup) findViewById(R.id.activity_four);
        mSmallView = (TextView) findViewById(R.id.small_view);
        mBigView = (TextView) findViewById(R.id.big_view);

        mStartAnimationBtn = findViewById(R.id.start_animation);

        mStartAnimationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBigView.animate().translationX(transX).translationY(transY).scaleX(mScaleX).scaleY(mScaleY).setDuration(1000);
            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        mScaleX = mSmallView.getWidth() / (float)mBigView.getWidth();
        mScaleY = mSmallView.getHeight() / (float)mBigView.getHeight();

        float[] result = initViewOffset(mBigView, mSmallView);
        transX = result[0];
        transY = result[1];
    }





    private float[] initViewOffset(View srcView, View destView) {
        final float srcWith = srcView.getMeasuredWidth();
        final float srcHeight = srcView.getMeasuredHeight();

        final float destWith = destView.getMeasuredWidth();
        final float destHeight = destView.getMeasuredHeight();

        //计算大小电池中心点(而非边缘)坐标对应的x,y的差值，来确定动画距离
        float transX = (destView.getX() + destWith / 2) - (srcView.getX() + srcWith / 2);
        float transY = (destView.getY() + destHeight / 2) - (srcView.getY() + srcHeight / 2);
        float[] result = new float[]{transX, transY};
        return result;
    }


    public static int getTopTo(View target, ViewGroup rootView) {
        if (rootView == null || target == null || rootView == target) {
            return 0;
        }
        final int distance = target.getTop();
        if (target.getParent() instanceof ViewGroup) {
            return distance + getTopTo((ViewGroup) target.getParent(), rootView);
        }
        return distance;
    }

    public static int getLeftTo(View target, ViewGroup rootView) {
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
