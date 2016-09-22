package com.wandoujia.p4.netcheck.controller;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class f extends Handler
{
  f(NetCheckController paramNetCheckController, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    NetCheckController.e(this.a).postDelayed(new h(this.a, 0), 60000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.controller.f
 * JD-Core Version:    0.6.0
 */