package com.wandoujia.jupiter.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

class DexLoadingActivity$StopSelfReceiver extends BroadcastReceiver
{
  private DexLoadingActivity$StopSelfReceiver(DexLoadingActivity paramDexLoadingActivity)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (DexLoadingActivity.a(this.a) != null)
    {
      Message localMessage = new Message();
      localMessage.what = 1;
      DexLoadingActivity.a(this.a).sendMessageDelayed(localMessage, 100L);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.DexLoadingActivity.StopSelfReceiver
 * JD-Core Version:    0.6.0
 */