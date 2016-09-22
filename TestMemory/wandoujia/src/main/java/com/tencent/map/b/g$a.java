package com.tencent.map.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class g$a extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED"))
      paramIntent.getIntExtra("wifi_state", 4);
    if (((!paramIntent.getAction().equals("android.net.wifi.SCAN_RESULTS")) && (!paramIntent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED"))) || (paramIntent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")))
      return;
    System.currentTimeMillis();
    new b(null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.map.b.g.a
 * JD-Core Version:    0.6.0
 */