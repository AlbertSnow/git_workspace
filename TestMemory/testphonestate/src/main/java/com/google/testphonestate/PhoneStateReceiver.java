package com.google.testphonestate;

import android.Manifest;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.provider.CallLog;
import android.provider.CallLog.Calls;
import android.support.v4.app.ActivityCompat;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/7/8.
 */
public class PhoneStateReceiver extends BroadcastReceiver {
    private static final String TAG = "testPhoneReceiver";
    private boolean isCanRegist = true;

    @Override
    public void onReceive(Context context, Intent intent) {
        int state = getCallState(context);

        switch (state){
            case TelephonyManager.CALL_STATE_RINGING:
                Log.i(TAG, "onReceive, state");

                break;
            case TelephonyManager.CALL_STATE_OFFHOOK:
                Log.i(TAG, "onReceive, OFF_HOOK");

                break;
            case TelephonyManager.CALL_STATE_IDLE:
                testLog(context);
                break;
            default:
                Log.i(TAG, "UNknow receive state:"+state);
                break;
        }

        TelephonyManager tm = (TelephonyManager) context.getSystemService(Service.TELEPHONY_SERVICE);
        if (isCanRegist){
            tm.listen(listener, PhoneStateListener.LISTEN_CALL_STATE);
            isCanRegist = false;
        }
    }

    private void testLog(Context context) {
        CallLogBean logBean = getLastCallLog(context);
        String OUTGOING_TYPE = String.valueOf(Calls.OUTGOING_TYPE);

        if (logBean != null && OUTGOING_TYPE.equals(logBean.getType())) {
            String duration = logBean.getDuration();
            Log.i(TAG, "LogBean duration:" + duration);
            if (!TextUtils.isEmpty(duration)) {
                Toast.makeText(context, "Duration:"+duration, Toast.LENGTH_SHORT).show();
            }
        }
    }


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
            cursor = contentResolver.query(CallLog.Calls.CONTENT_URI, null, null, null, CallLog.Calls.DATE + " desc");
            Log.i(TAG, "cursor size = " + (cursor == null ? 0 : cursor.getCount()));
            if (cursor == null || cursor.getCount() == 0) {
                return null;
            }
            if (cursor.moveToFirst()) {
                String name = cursor.getString(cursor.getColumnIndex(CallLog.Calls.CACHED_NAME));
                String number = cursor.getString(cursor.getColumnIndex(CallLog.Calls.NUMBER));
                String duration = cursor.getString(cursor.getColumnIndex(CallLog.Calls.DURATION));
                String date = cursor.getString(cursor.getColumnIndex(CallLog.Calls.DATE));
                String type = cursor.getString(cursor.getColumnIndex(CallLog.Calls.TYPE));

                callLogBean = new CallLogBean();
                callLogBean.setName(name);
                callLogBean.setNumber(number);
                callLogBean.setDuration(duration);
                callLogBean.setDate(date);
                callLogBean.setType(type);
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

    public synchronized static int getCallState(Context context) {
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Service.TELEPHONY_SERVICE);
        return tm.getCallState();
    }

    final PhoneStateListener listener = new PhoneStateListener() {
        @Override
        public void onCallStateChanged(int state, String incomingNumber) {
            super.onCallStateChanged(state, incomingNumber);
            switch (state) {
                //电话等待接听
                case TelephonyManager.CALL_STATE_RINGING:
                    Log.e(TAG, "Listener ringing:" + incomingNumber);
                    break;
                //电话接听
                case TelephonyManager.CALL_STATE_OFFHOOK:
                    Log.e(TAG, "Listener off hook:" + incomingNumber);
                    break;
                //电话挂机
                case TelephonyManager.CALL_STATE_IDLE:
                    Log.e(TAG, "Listener idle" + incomingNumber);
                    break;
            }
        }
    };
}