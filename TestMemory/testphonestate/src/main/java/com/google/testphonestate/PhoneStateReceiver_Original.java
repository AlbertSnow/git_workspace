package com.google.testphonestate;

import android.Manifest;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.provider.CallLog.Calls;
import android.support.v4.app.ActivityCompat;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by Administrator on 2016/7/8.
 */
public class PhoneStateReceiver_Original extends BroadcastReceiver {
    private static final String TAG = "testPhoneReceiver";
    private static final String TAG_LISTENER = "testPhoneListener";
    private static boolean incomingFlag = false;

    private Context mContext;
    static final String[] CALL_LOG_PROJECTION = new String[]{Calls._ID, // 0
            Calls.NUMBER, // 1
            Calls.DATE, // 2
            Calls.DURATION, // 3
            Calls.TYPE, // 4
            Calls.CACHED_NAME};

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "Action: " + intent.getAction());

        mContext = context;
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Service.TELEPHONY_SERVICE);
        tm.listen(listener, PhoneStateListener.LISTEN_CALL_STATE);

        int state = tm.getCallState();
        switch (state) {
            case TelephonyManager.CALL_STATE_RINGING:
                Log.e(TAG, "Receive Ringing:");
                break;
            case TelephonyManager.CALL_STATE_OFFHOOK:
                Log.e(TAG, "Receive OffHook:");
                break;
            case TelephonyManager.CALL_STATE_IDLE:
                Log.e(TAG, "Receive Idle:");
                break;
            default:
                break;
        }
        if (state == TelephonyManager.CALL_STATE_IDLE) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_CALL_LOG) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            //取最后一条通话纪录
            Cursor c = mContext.getContentResolver().query(Calls.CONTENT_URI, CALL_LOG_PROJECTION, null, null,
                    "_id asc LIMIT -1 OFFSET (select count(_id) from calls )-1");

            if (c.moveToFirst()) {
                Log.e(TAG,
                        " _ID " + c.getLong(c.getColumnIndex(Calls._ID)) + " NUMBER "
                                + c.getString(c.getColumnIndex(Calls.NUMBER)) + " DATE "
                                + c.getLong(c.getColumnIndex(Calls.DATE)) + " DURATION "
                                + c.getInt(c.getColumnIndex(Calls.DURATION)) + " TYPE "
                                + c.getInt(c.getColumnIndex(Calls.TYPE)) + " CACHED_NAME "
                                + c.getString(c.getColumnIndex(Calls.CACHED_NAME)));
            }
            c.close();

            testCallLog(context);
        }
    }


    private void testCallLog(Context context) {
        Cursor cursor = null;
        CallLogBean callLogBean = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_CALL_LOG) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            cursor = contentResolver.query(Calls.CONTENT_URI, null, null, null, Calls.DATE + " desc");
                Log.i(TAG, "cursor size = " + (cursor == null ? 0 : cursor.getCount()));
                if (cursor == null || cursor.getCount() == 0) {
                    return;
                }
                if (cursor.moveToFirst()) {
                    String name = cursor.getString(cursor.getColumnIndex(Calls.CACHED_NAME));
                    String number = cursor.getString(cursor.getColumnIndex(Calls.NUMBER));
                    String duration = cursor.getString(cursor.getColumnIndex(Calls.DURATION));
                    String date = cursor.getString(cursor.getColumnIndex(Calls.DATE));
                    String type = cursor.getString(cursor.getColumnIndex(Calls.TYPE));

                    callLogBean = new CallLogBean();
                    callLogBean.setName(name);
                    callLogBean.setNumber(number);
                    callLogBean.setDuration(duration);
                    callLogBean.setDate(date);
                    callLogBean.setType(type);
                    Log.i(TAG, "2222"+callLogBean.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.i(TAG, "updateCallLog  e : " + e.toString());
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }

    final PhoneStateListener listener = new PhoneStateListener() {
        @Override
        public void onCallStateChanged(int state, String incomingNumber) {
            super.onCallStateChanged(state, incomingNumber);
            switch (state) {
                //电话等待接听
                case TelephonyManager.CALL_STATE_RINGING:
                    incomingFlag = true;
                    Log.i(TAG_LISTENER, "Listener ringing:" + incomingNumber);
                    break;
                //电话接听
                case TelephonyManager.CALL_STATE_OFFHOOK:
                    Log.i(TAG_LISTENER, "Listener off hook:" + incomingNumber);
                    break;
                //电话挂机
                case TelephonyManager.CALL_STATE_IDLE:
                    Log.i(TAG_LISTENER, "Listener idle" + incomingNumber);
                    break;
            }
        }
    };
}