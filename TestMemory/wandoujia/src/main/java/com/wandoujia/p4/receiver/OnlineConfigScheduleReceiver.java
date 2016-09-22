package com.wandoujia.p4.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.online_config.c;

public class OnlineConfigScheduleReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("launcher.intent.action.CHECK_ONLINE_CONFIG".equals(paramIntent.getAction()))
    {
      c.a().b();
      c.m();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.receiver.OnlineConfigScheduleReceiver
 * JD-Core Version:    0.6.0
 */