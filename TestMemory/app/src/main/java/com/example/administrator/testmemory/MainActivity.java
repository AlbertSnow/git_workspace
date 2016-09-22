package com.example.administrator.testmemory;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Camera.open();
        setContentView(R.layout.recycle_layout);
        initView();
//        testAnimation();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.i("testLife", "MainActivity onSaveInstanceState");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    private void testAnimation() {
//        View animBtn = findViewById(R.id.main_anim_btn);
//        View alignBtn = findViewById(R.id.test_align_btn);
//
//        ObjectAnimator animator = ObjectAnimator.ofFloat(animBtn, "translationX", -100);
//        animator.setDuration((long) (3 * 1000));
//        animator.addListener(animatorListener);
//        animator.setInterpolator(new DecelerateInterpolator(1));
//        final float reverseX = mTranslationX;
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator valueAnimator) {
//                float value = (Float) valueAnimator.getAnimatedValue();
//                float percent = (1f - value / target);
//                float offset = reverseX * percent;
//                calculateReverse(offset);
//                font.setAlpha(mAlpha);
//            }
//        });
//        animator.start();
    }

    private void initView() {
//        findViewById(R.id.main_jump_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, SecondActivity.class));
//            }
//        });
        mRecycleView = (RecyclerView) findViewById(R.id.recycle_view);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mRecycleView.setItemAnimator(new DefaultItemAnimator());
        mRecycleView.setAdapter(new MyAdapter());

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });
    }


    private static class MyAdapter extends RecyclerView.Adapter {

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            final View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item, parent, false);
            final View secondView = rootView.findViewById(R.id.textView2);

            rootView.findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    secondView.setVisibility(
                            secondView.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                }
            });
            RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(rootView) {
                @Override
                public String toString() {
                    return super.toString();
                }
            };
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    int rotation = getWindowManager().getDefaultDisplay().getRotation();
                    Log.i("testRotation", "Rotation:" + rotation);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
