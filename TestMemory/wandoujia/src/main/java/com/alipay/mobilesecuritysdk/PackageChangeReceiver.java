package com.alipay.mobilesecuritysdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobilesecuritysdk.a.a;

public class PackageChangeReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    new StringBuilder(String.valueOf(paramIntent.getDataString().substring(8))).append(paramIntent.getPackage());
    if (("android.intent.action.PACKAGE_ADDED".equals(paramIntent.getAction())) || ("android.intent.action.PACKAGE_REMOVED".equals(paramIntent.getAction())));
    try
    {
      paramIntent.getDataString().substring(8);
      new a().start();
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.getLocalizedMessage();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.PackageChangeReceiver
 * JD-Core Version:    0.6.0
 */