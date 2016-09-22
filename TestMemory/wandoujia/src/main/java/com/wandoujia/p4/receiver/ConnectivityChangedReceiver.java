package com.wandoujia.p4.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.wandoujia.base.services.AlarmService;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.ReceiverMonitor.MediaState;

public class ConnectivityChangedReceiver extends BroadcastReceiver
{
  private static void a(int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("phoenix.intent.extra.USER_AGENT", "phoenix");
    localIntent.putExtra("phoenix.intent.extra.SOURCE", paramInt);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    AlarmService.scheduleAlarm(paramContext, "CONNECTION_ACTION", AlarmService.class);
    if (str.equals("android.intent.action.MEDIA_MOUNTED"))
      ReceiverMonitor.a().a(ReceiverMonitor.MediaState.MOUNTED);
    NetworkInfo localNetworkInfo;
    do
    {
      do
        return;
      while (!str.equals("android.net.conn.CONNECTIVITY_CHANGE"));
      localNetworkInfo = (NetworkInfo)paramIntent.getParcelableExtra("networkInfo");
    }
    while (localNetworkInfo == null);
    if (localNetworkInfo.getType() == 1)
    {
      if (!localNetworkInfo.isConnected())
        break label137;
      a(1);
      Intent localIntent = new Intent();
      localIntent.putExtra("phoenix.intent.extra.USER_AGENT", "phoenix");
      localIntent.putExtra("phoenix.intent.extra.SOURCE", 8);
    }
    while (true)
    {
      ReceiverMonitor.a().a(localNetworkInfo);
      if (localNetworkInfo.getType() != 1)
        break;
      if (!localNetworkInfo.isConnected())
        break label144;
      a(1);
      return;
      label137: a(5);
    }
    label144: a(5);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.receiver.ConnectivityChangedReceiver
 * JD-Core Version:    0.6.0
 */