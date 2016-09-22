package com.wandoujia.base.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class BatteryUtils extends BroadcastReceiver
{
  private static BatteryUtils instance = null;
  private int current = 100;
  private boolean isCharging = false;
  private int total = 100;

  public static BatteryUtils getInstance()
  {
    if (instance == null)
      instance = new BatteryUtils();
    return instance;
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i;
    if (paramIntent.getAction().equals("android.intent.action.BATTERY_CHANGED"))
    {
      this.current = paramIntent.getExtras().getInt("level");
      this.total = paramIntent.getExtras().getInt("scale");
      if (paramIntent.getExtras().getInt("plugged", 0) == 0)
        break label70;
      i = 1;
      if ((!this.isCharging) || (i != 0))
        break label75;
      this.isCharging = false;
    }
    label70: label75: 
    do
    {
      return;
      i = 0;
      break;
    }
    while ((this.isCharging) || (i == 0));
    this.isCharging = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.BatteryUtils
 * JD-Core Version:    0.6.0
 */