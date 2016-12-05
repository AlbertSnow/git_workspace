package com.albert.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String ANDROID_PERMISSION_BROADCAST_STICKY = "android.permission.BROADCAST_STICKY";
    private static final String EXTRA_NAME = "extra_name";
    private BroadcastReceiver stickyReceiver = new StickyReceiver();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.send_broadcast).setOnClickListener(this);
        findViewById(R.id.register_receiver).setOnClickListener(this);
        findViewById(R.id.unregister_sticky_receiver).setOnClickListener(this);
        findViewById(R.id.register_sticky_receiver).setOnClickListener(this);
    }

    int times = 0;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.send_broadcast:
                Intent testIntent = new Intent(ANDROID_PERMISSION_BROADCAST_STICKY);
                testIntent.putExtra(EXTRA_NAME, "AlbertSnow " + times);
                if (times == Integer.MAX_VALUE) {
                    times = 0;
                } else {
                    times++;
                }
                sendStickyBroadcast(testIntent);
                break;
            case R.id.register_receiver:
                handleBroadCast();
                break;
            case R.id.register_sticky_receiver:
                IntentFilter filter = new IntentFilter(ANDROID_PERMISSION_BROADCAST_STICKY);
                registerReceiver(stickyReceiver, filter);
                break;
            case R.id.unregister_sticky_receiver:
                unregisterReceiver(stickyReceiver);
                break;
        }
    }

    private void handleBroadCast() {
        IntentFilter filter = new IntentFilter(ANDROID_PERMISSION_BROADCAST_STICKY);
        Intent resultIntent =  registerReceiver(null, filter);
        Log.i("test", "Name: " + resultIntent.getStringExtra(EXTRA_NAME));
    }

    private static class StickyReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i("test", "Name: " + intent.getStringExtra(EXTRA_NAME));
        }
    }

}
