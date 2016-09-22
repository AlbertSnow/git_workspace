package com.UCMobile.PayPluginEx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PayResultReceiverEx extends BroadcastReceiver
{
  private static native void native_UCPayResultNotify(String paramString);

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    native_UCPayResultNotify(paramIntent.getStringExtra("ResultURL"));
    String str = paramContext.getPackageName();
    if (str.startsWith("com.UCMobile"))
    {
      Intent localIntent = new Intent("com.UCMobile.PluginApp.ActivityState");
      localIntent.putExtra("ActivityState", "inactive");
      localIntent.putExtra("PackageName", str);
      paramContext.sendBroadcast(localIntent);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.UCMobile.PayPluginEx.PayResultReceiverEx
 * JD-Core Version:    0.6.0
 */