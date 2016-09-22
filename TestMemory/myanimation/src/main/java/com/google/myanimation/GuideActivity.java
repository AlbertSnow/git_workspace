package com.google.myanimation;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class GuideActivity extends AppCompatActivity {

    private ViewGroup mRootView;
    private TextView mGudieText;
    private GestureDetector gesture;
    private Button mSimulateDownEvent;
    private Button mSimulateUpEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initView();
    }

    private void initView() {
        mRootView = (ViewGroup) findViewById(R.id.guide_root);
        mGudieText = (TextView) findViewById(R.id.guide_text);
        mSimulateDownEvent = (Button) findViewById(R.id.start_guide_down);
        mSimulateUpEvent = (Button) findViewById(R.id.start_guide_up);

        gesture = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public void onLongPress(MotionEvent e) {
                super.onLongPress(e);
                Log.i("test", "On long press");
            }
        });

        mRootView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i("test", "down time: " + event.getDownTime());
                        Log.i("test", "event time: " + event.getEventTime());

                        Log.i("test", "Action Down");
                        break;
                    case MotionEvent.ACTION_CANCEL:
                        Log.i("test", "Action Cancel");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i("test", "Action move");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("test", "Action up");
                        break;
                }
                Log.i("test", "Long press return: " + gesture.onTouchEvent(event));
                return true;
            }
        });

        mSimulateDownEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simulateTouchEvent(MotionEvent.ACTION_DOWN);
            }
        });

        mSimulateUpEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simulateTouchEvent(MotionEvent.ACTION_UP);
            }
        });
    }

    private void simulateTouchEvent(int action) {
        // Obtain MotionEvent object
        long downTime = SystemClock.uptimeMillis();
        long eventTime = SystemClock.uptimeMillis() + 100;
        float x = 100f;
        float y = 100f;

        // List of meta states found here:     developer.android.com/reference/android/view/KeyEvent.html#getMetaState()
        int metaState = 0;
        MotionEvent motionEvent = MotionEvent.obtain(
                downTime,
                eventTime,
                action,
                x,
                y,
                metaState
        );

        // Dispatch touch event to view
        mRootView.dispatchTouchEvent(motionEvent);
    }
}
