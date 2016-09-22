package com.google.testprocess;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/6/27.
 */
public class MyApplication extends Application {
    Application instance = this;

    public Context getAppContext(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                Log.i("testLife", "onActivityCreated");

            }

            @Override
            public void onActivityStarted(Activity activity) {
                Log.i("testLife", "onActivityStarted");

            }

            @Override
            public void onActivityResumed(Activity activity) {
                Log.i("testLife", "onActivityResumed");

            }

            @Override
            public void onActivityPaused(Activity activity) {
                Log.i("testLife", "onActivityPaused");

            }

            @Override
            public void onActivityStopped(Activity activity) {
                Log.i("testLife", "onActivityCreated");

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                Log.i("testLife", "onActivitySaveInstanceState");
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                Log.i("testLife", "onActivityDestroyed");
            }
        });

        getBatteryLevel();
        testApplicationBug();
    }

    private void testApplicationBug() {
        ContextWrapper wrapper = new ContextWrapper(this);
        Application wrapper1 = (Application) wrapper;
    }

    private float getBatteryLevel() {
        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = registerReceiver(null, ifilter);
        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

        float batteryPct = level / (float)scale;

        Log.i("test", "level: " + level + "; scale:" + scale + "; batteryPct: " + batteryPct);
        return batteryPct;
    }
}
