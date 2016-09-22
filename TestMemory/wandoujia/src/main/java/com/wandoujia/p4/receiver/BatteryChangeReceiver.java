package com.wandoujia.p4.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.ripple_framework.ReceiverMonitor;

public class BatteryChangeReceiver extends BroadcastReceiver
{
  private Boolean a;

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = 1;
    int j = paramIntent.getIntExtra("plugged", -1);
    if ((j == 2) || (j == i) || (j == 4));
    while (true)
    {
      if ((this.a == null) || (this.a.booleanValue() != i))
      {
        this.a = Boolean.valueOf(i);
        ReceiverMonitor.a().b();
      }
      return;
      i = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.receiver.BatteryChangeReceiver
 * JD-Core Version:    0.6.0
 */