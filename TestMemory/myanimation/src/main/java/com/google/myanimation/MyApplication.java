package com.google.myanimation;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/8/24.
 */

public class MyApplication extends Application{
    private static Context appContext;

    public static Context getApplicaionContext(){
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
    }
}
