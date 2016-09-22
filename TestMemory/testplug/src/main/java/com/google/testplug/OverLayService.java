package com.google.testplug;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

public class OverLayService extends Service {
    private View mOVerLayView;
    WindowManager windowManager;

    public OverLayService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        initOverLayView();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        windowManager.addView(mOVerLayView, getTestLayoutParams());
        return super.onStartCommand(intent, flags, startId);
    }

    private void initOverLayView() {
        mOVerLayView = LayoutInflater.from(this).inflate(R.layout.over_lay, null);
        mOVerLayView.findViewById(R.id.over_lay_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpGP();
                windowManager.removeView(mOVerLayView);
            }
        });
    }

    public WindowManager.LayoutParams getTestLayoutParams() {
        WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.TYPE_SYSTEM_OVERLAY,
                WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
                PixelFormat.TRANSLUCENT);
        params.flags = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION
                | WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
                | WindowManager.LayoutParams.FLAG_FULLSCREEN
                | WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED
                | WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
                | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD;
        return params;
    }

    private void jumpGP() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.baidu.com"));
        startActivity(intent);
    }

}
