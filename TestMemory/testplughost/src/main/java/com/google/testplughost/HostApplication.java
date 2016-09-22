package com.google.testplughost;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

import com.google.testplughost.plug.PlugUtils;

/**
 * Created by Administrator on 2016/7/14.
 */
public class HostApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        String processName = getApplicationInfo().processName;
        Log.i("testApplication", "ProcessName:" + processName);

        if (PlugUtils.isPlugProcess(processName)) {
//            PlugUtils.replaceContext(base);
        }

        super.attachBaseContext(base);
    }
}
