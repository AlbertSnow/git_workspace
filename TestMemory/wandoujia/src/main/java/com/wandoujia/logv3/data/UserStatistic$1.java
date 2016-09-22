package com.wandoujia.logv3.data;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class UserStatistic$1 extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    int i = -1;
    switch (str.hashCode())
    {
    default:
      switch (i)
      {
      default:
      case 0:
      case 1:
      }
    case -1454123155:
    case -2128145023:
    }
    while (true)
    {
      a.a();
      return;
      if (!str.equals("android.intent.action.SCREEN_ON"))
        break;
      i = 0;
      break;
      if (!str.equals("android.intent.action.SCREEN_OFF"))
        break;
      i = 1;
      break;
      a.a(true);
      continue;
      a.a(false);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.data.UserStatistic.1
 * JD-Core Version:    0.6.0
 */