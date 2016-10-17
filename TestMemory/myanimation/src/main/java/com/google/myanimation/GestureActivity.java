package com.google.myanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.myanimation.util.SwipeGesture;

public class GestureActivity extends AppCompatActivity {

    private ViewGroup mRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesture);
        initView();
    }

    private void initView() {
        mRootView = (ViewGroup) findViewById(R.id.activity_gesture);
        mRootView.setOnTouchListener(new SwipeGesture(this){
            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                Log.i("test", "SwipeRight");
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                Log.i("test", "SwipeLeft");
            }
        });

        TextView textView = new TextView(this);
        textView.setText("helloloojoasjdflnskldfnklasjodfjposjpofjosjf");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mRootView.addView(textView, 0, layoutParams);
    }
}
