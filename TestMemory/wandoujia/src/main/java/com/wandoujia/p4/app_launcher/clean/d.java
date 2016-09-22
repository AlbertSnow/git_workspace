package com.wandoujia.p4.app_launcher.clean;

import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

public final class d extends TimerTask
{
  private WeakReference<e> a;

  private d(e parame)
  {
    this.a = new WeakReference(parame);
  }

  public static void a(e parame)
  {
    new Timer().schedule(new d(parame), 3000L);
  }

  public final void run()
  {
    if ((this.a != null) && (this.a.get() != null))
      ((e)this.a.get()).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.d
 * JD-Core Version:    0.6.0
 */