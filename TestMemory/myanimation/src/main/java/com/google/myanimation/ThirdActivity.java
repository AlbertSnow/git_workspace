package com.google.myanimation;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

import com.google.myanimation.view.StarView;

import java.io.File;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    private StarView mStarView;
    private SeekBar mSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initView();
        getInstallComponent();
    }

    private void initView() {
        mStarView = (StarView) findViewById(R.id.star_view);
        mSeekBar = (SeekBar) findViewById(R.id.seekBar);
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                double radius = 300 * (i/100.0d + 1);
                mStarView.setBigStarRadius((int) radius);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        findViewById(R.id.animation_start_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStarView.startStarAnimation();
            }
        });
    }


    private void getInstallComponent(){
        String str = "/CanavaCancel.apk";
        String fileName = Environment.getExternalStorageDirectory() + str;
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.fromFile(new File(fileName)), "application/vnd.android.package-archive");
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> componenets = packageManager.queryIntentActivities(intent, PackageManager.GET_RESOLVED_FILTER);
        for (ResolveInfo info : componenets) {
            Log.i("testComponet", "className:"+info.activityInfo.toString());
        }
        if (componenets.size() <= 0) {
            Log.i("testComponet", "lsit size is :" + componenets.size());
        }
    }

    public void getYaHooAdComponent(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
        intent.setData(Uri.parse("https://www.baidu.com"));
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
//        getYaHooAdComponent();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName("com.google.android.packageinstaller", "com.android.packageinstaller.UninstallAppProgress");
        startActivity(intent);
    }
}
