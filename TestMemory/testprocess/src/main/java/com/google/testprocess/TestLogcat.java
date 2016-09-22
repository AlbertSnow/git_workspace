package com.google.testprocess;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/8/16.
 */

public class TestLogcat {

    public static void recordLogcat() {
        File logFile = new File("/sdcard", "testAdb.txt");
        if (!logFile.exists()) {
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        recordLogcat(logFile);

    }

    private static void recordLogcat(final File logFile) {
        Log.i("test", "logFile path:" + logFile.getAbsolutePath());

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        File[] testFiles = logFile.getParentFile().listFiles();
                        for (File file: testFiles) {
                            Log.i("test", "subFile: " + file.getAbsolutePath());
                        }
                    }
                }
        ).start();


        try{
            Process ps = Runtime.getRuntime().exec("logcat -d -f " + logFile.getAbsolutePath());
            ps.waitFor();
            ps.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
