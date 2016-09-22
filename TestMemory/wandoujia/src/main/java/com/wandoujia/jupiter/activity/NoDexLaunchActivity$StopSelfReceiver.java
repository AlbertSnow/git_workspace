package com.wandoujia.jupiter.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

class NoDexLaunchActivity$StopSelfReceiver extends BroadcastReceiver
{
  private NoDexLaunchActivity$StopSelfReceiver(NoDexLaunchActivity paramNoDexLaunchActivity)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (NoDexLaunchActivity.a(this.a) != null)
    {
      Message localMessage = new Message();
      localMessage.what = 1;
      NoDexLaunchActivity.a(this.a).sendMessageDelayed(localMessage, 1000L);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.NoDexLaunchActivity.StopSelfReceiver
 * JD-Core Version:    0.6.0
 */