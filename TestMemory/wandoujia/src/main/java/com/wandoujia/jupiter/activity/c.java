package com.wandoujia.jupiter.activity;

import android.os.Handler;
import android.os.Message;

final class c extends Handler
{
  private c(DexLoadingActivity paramDexLoadingActivity)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    this.a.finish();
    this.a.overridePendingTransition(2130968605, 2130968605);
    System.exit(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.c
 * JD-Core Version:    0.6.0
 */