package com.wandoujia.ripple_framework;

import java.util.TimerTask;

final class g extends TimerTask
{
  g(AppMd5Manager.ScreenReceiver paramScreenReceiver)
  {
  }

  public final void run()
  {
    synchronized (AppMd5Manager.ScreenReceiver.a(this.a))
    {
      AppMd5Manager.ScreenReceiver.a(this.a, Thread.currentThread());
      AppMd5Manager.d(this.a.a);
    }
    synchronized (AppMd5Manager.ScreenReceiver.a(this.a))
    {
      AppMd5Manager.ScreenReceiver.a(this.a, null);
      AppMd5Manager.ScreenReceiver.b(this.a);
      return;
      localObject1 = finally;
      monitorexit;
      throw localObject1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.g
 * JD-Core Version:    0.6.0
 */