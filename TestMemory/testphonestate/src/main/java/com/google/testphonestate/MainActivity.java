package com.google.testphonestate;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

import com.google.myanimation.MyShape;
import com.google.myanimation.ThirdActivity;

public class MainActivity extends AppCompatActivity {

    private String TAG = "testPhone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MyShape();
//        startActivity(new Intent(this, ThirdActivity.class));
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        getLastCallLog(this);
    }


    private CallLogBean getAllCallLog(Context context) {
//        Log.i(TAG, "updateCallLog");
        Cursor cursor = null;
        CallLogBean callLogBean = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_CALL_LOG) != PackageManager.PERMISSION_GRANTED) {
                Log.i(TAG, "No Permission");
                return null;
            }
            Uri uri = CallLog.Calls.CONTENT_URI;
            uri.buildUpon().appendQueryParameter("limit", "1").build();
            cursor = contentResolver.query(uri, null, null, null, CallLog.Calls.DATE + " desc");
            Log.i(TAG, "cursor size = " + (cursor == null ? 0 : cursor.getCount()));
            if (cursor == null || cursor.getCount() == 0) {
                return null;
            }
            while (cursor.moveToNext()) {
                callLogBean = parseCallLog(cursor);
                Log.i(TAG, callLogBean.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.i(TAG, "updateCallLog  e : " + e.toString());
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return callLogBean;
    }

    private static String[] PROJECTIONS = new String[]{
            CallLog.Calls.CACHED_NAME, CallLog.Calls.NUMBER, CallLog.Calls.DURATION, CallLog.Calls.DATE, CallLog.Calls.TYPE};

    private CallLogBean getLastCallLog(Context context) {
//        Log.i(TAG, "updateCallLog");
        Cursor cursor = null;
        CallLogBean callLogBean = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_CALL_LOG) != PackageManager.PERMISSION_GRANTED) {
                Log.i(TAG, "No Permission");
                return null;
            }
            Uri uri = CallLog.Calls.CONTENT_URI;
            uri = uri.buildUpon().appendQueryParameter("limit", "1").build();
            Log.i("test", "Uri is:" + uri.toString());
            cursor = contentResolver.query(uri, null, null, null, CallLog.Calls.DATE + " desc");
//
//            cursor = contentResolver.query(uri, PROJECTIONS,
//                    null, null, CallLog.Calls.DATE + " desc");
            Log.i(TAG, "cursor---size = " + (cursor == null ? 0 : cursor.getCount()));
            if (cursor == null || cursor.getCount() == 0) {
                return null;
            }
            while (cursor.moveToNext()) {
                callLogBean = parseCallLog(cursor);
                Log.i(TAG, callLogBean.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.i(TAG, "updateCallLog  e : " + e.toString());
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return callLogBean;
    }

    @NonNull
    private CallLogBean parseCallLog(Cursor cursor) {
        String name = cursor.getString(cursor.getColumnIndex(CallLog.Calls.CACHED_NAME));
        String number = cursor.getString(cursor.getColumnIndex(CallLog.Calls.NUMBER));
        String duration = cursor.getString(cursor.getColumnIndex(CallLog.Calls.DURATION));
        String date = cursor.getString(cursor.getColumnIndex(CallLog.Calls.DATE));
        String type = cursor.getString(cursor.getColumnIndex(CallLog.Calls.TYPE));

        CallLogBean callLogBean = new CallLogBean();
        callLogBean.setName(name);
        callLogBean.setNumber(number);
        callLogBean.setDuration(duration);
        callLogBean.setDate(date);
        callLogBean.setType(type);
        return callLogBean;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_HOME || keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_MENU){
            Log.i("test", "jdfldjsf");
        }
        return super.onKeyDown(keyCode, event);
    }
}
