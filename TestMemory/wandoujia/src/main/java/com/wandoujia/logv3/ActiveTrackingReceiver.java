package com.wandoujia.logv3;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.base.log.Log;

public class ActiveTrackingReceiver extends BroadcastReceiver
{
  public static void a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(paramString, ActiveTrackingReceiver.class.getName()));
    localIntent.setAction("com.wandoujia.logv3.INSTALL_REFERRER");
    paramContext.sendBroadcast(localIntent);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Log.i("ActiveTrackingReceiver", "actived by jupiter", new Object[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.ActiveTrackingReceiver
 * JD-Core Version:    0.6.0
 */