package com.wandoujia.logv3.toolkit;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

final class ANRWatchDog
{
  private ANRWatchDog.ACKStatus a = ANRWatchDog.ACKStatus.ACK_WAITING;
  private Handler b;
  private Handler c = new Handler(Looper.getMainLooper());
  private Runnable d = new a(this);
  private Runnable e = new c(this);

  public ANRWatchDog()
  {
    HandlerThread localHandlerThread = new HandlerThread("ANRWatchDog");
    localHandlerThread.setPriority(1);
    localHandlerThread.start();
    this.b = new Handler(localHandlerThread.getLooper());
    this.c.post(this.d);
    this.b.postDelayed(this.e, 15000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.ANRWatchDog
 * JD-Core Version:    0.6.0
 */