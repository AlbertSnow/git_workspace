package com.wandoujia.p4.app_launcher.switcher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class WifiSwitcher$1 extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("wifi_state", 0);
    if ((i == 1) || (i == 3))
      this.a.f();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.WifiSwitcher.1
 * JD-Core Version:    0.6.0
 */