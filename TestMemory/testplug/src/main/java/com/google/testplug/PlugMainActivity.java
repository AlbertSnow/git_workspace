package com.google.testplug;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.PixelFormat;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public class PlugMainActivity extends AppCompatActivity {

    private View mOVerLayView;
    private WindowManager windowManager;
    private WindowManager.LayoutParams params;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plug_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        findViewById(R.id.main_jump_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpGP();
            }
        });

        initWindowManager();
        initOverLayView();

        findViewById(R.id.main_alert_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                windowManager.addView(mOVerLayView, params);
            }
        });

        findViewById(R.id.main_service_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(PlugMainActivity.this, OverLayService.class);
                startService(intent);
            }
        });

        findViewById(R.id.main_start_no_task_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
    }

    private void initWindowManager() {
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.TYPE_SYSTEM_ALERT,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                        | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                        | WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
                PixelFormat.TRANSLUCENT);

        params.type = WindowManager.LayoutParams.TYPE_TOAST;
    }

    private void initOverLayView() {
        mOVerLayView = getLayoutInflater().inflate(R.layout.over_lay, null);
        mOVerLayView.findViewById(R.id.over_lay_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpGP();
                windowManager.removeView(mOVerLayView);
            }
        });
    }

    private void jumpGP() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.baidu.com"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
