package com.alipay.ut.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BQueryWhoHasOne extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext != null) && (paramIntent.hasExtra("src")))
    {
      a locala = b.a(paramContext);
      if ((locala != null) && (locala.a() != 0L) && (locala.a() == b.a(locala)))
      {
        abortBroadcast();
        String str1 = paramIntent.getStringExtra("src");
        if ((paramContext != null) && (locala != null) && (!android.support.v4.app.b.i(str1)))
        {
          Intent localIntent;
          synchronized (b.a)
          {
            localIntent = new Intent();
            localIntent.setPackage(str1);
            localIntent.setAction("UT.FoundIT");
          }
          try
          {
            String str2 = locala.c();
            String str3 = locala.d();
            String str4 = locala.e();
            String str5 = locala.f();
            if ((!android.support.v4.app.b.i(str2)) && (!android.support.v4.app.b.i(str3)) && (!android.support.v4.app.b.i(str4)) && (!android.support.v4.app.b.i(str5)))
            {
              localIntent.putExtra("e", str2);
              localIntent.putExtra("s", str3);
              localIntent.putExtra("d", str4);
              localIntent.putExtra("u", str5);
              localIntent.putExtra("t", locala.b());
              localIntent.putExtra("S", locala.a());
              paramContext.sendOrderedBroadcast(localIntent, "com.alipay.ut.permission.DEVICE_STATE");
            }
            label232: monitorexit;
            return;
            localObject2 = finally;
            monitorexit;
            throw localObject2;
          }
          catch (Exception localException)
          {
            break label232;
          }
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.device.BQueryWhoHasOne
 * JD-Core Version:    0.6.0
 */