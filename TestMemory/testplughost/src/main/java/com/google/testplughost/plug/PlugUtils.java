package com.google.testplughost.plug;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Log;

import java.io.File;
import java.lang.reflect.Field;

/**
 * Created by Administrator on 2016/7/14.
 */
public class PlugUtils {
    public static final String PLUG_PROCESS_NAME = "com.plug.process";

    public static boolean isPlugProcess(String processName){
        return TextUtils.isEmpty(processName) && PLUG_PROCESS_NAME.equals(processName);
    }

//    public static void replaceContext(Context base) {
//        Object mPackageInfor = getField(base, "mPackageInfo");
//        if (mPackageInfor == nulll) {
//            return;
//        }
//
//        File nativeLibraryFile = base.getDir("lib", Context.MODE_PRIVATE);
//        if (nativeLibraryFile == null) {
//            Log.i("test", "Plug Utils,Library: "+nativeLibraryFile.getAbsolutePath());
//            return;
//        }
//
//        String nativeLibraryString = nativeLibraryFile.getAbsolutePath();
//        ApplicationInfo applicationInfo= base.getApplicationInfo();
//        if (applicationInfo !=null){
//            nativeLibraryString = applicationInfo.nativeLibraryDir;
//        }
//
//        setFieldUnsafe(mPackageInfor, "mClassLoader",
//                new IreaderClassLoader(ReplaceConstantUtils.APK_PATH,
//                        ReplaceConstantUtils.getDexCacheParentDirectPath(), nativeLibraryString, base
//                        .getClassLoader().getParent()));
//
//
//    }

    private static Object getField(Object paramClass, String paramString) {
        Field field = null;
        Object object = null;
        try {
            field = paramClass.getClass().getDeclaredField(paramString);
            field.setAccessible(true);
            object = field.get(paramClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

    private static void setFieldUnsafe(Object paramClass, String paramString,
                                       Object newClass) throws NoSuchFieldException, IllegalAccessException, IllegalArgumentException {
        Field field = null;
        field = paramClass.getClass().getDeclaredField(paramString);
        field.setAccessible(true);
        field.set(paramClass, newClass);
    }

}
