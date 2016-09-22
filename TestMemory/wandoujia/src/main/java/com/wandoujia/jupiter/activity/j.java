package com.wandoujia.jupiter.activity;

import android.os.Handler;
import android.os.Message;

final class j extends Handler
{
  private j(NoDexLaunchActivity paramNoDexLaunchActivity)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    this.a.finish();
    System.exit(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.j
 * JD-Core Version:    0.6.0
 */