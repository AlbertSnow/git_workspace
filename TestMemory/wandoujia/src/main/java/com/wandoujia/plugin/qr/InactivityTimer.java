package com.wandoujia.plugin.qr;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class InactivityTimer
{
  private final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor(new g(0));
  private final Activity b;
  private ScheduledFuture<?> c = null;

  public InactivityTimer(Activity paramActivity)
  {
    new InactivityTimer.PowerStatusReceiver(this, 0);
    this.b = paramActivity;
    a();
  }

  private void c()
  {
    ScheduledFuture localScheduledFuture = this.c;
    if (localScheduledFuture != null)
    {
      localScheduledFuture.cancel(true);
      this.c = null;
    }
  }

  public final void a()
  {
    c();
    if (!this.a.isShutdown());
    try
    {
      this.c = this.a.schedule(new f(this.b), 300L, TimeUnit.SECONDS);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
    }
  }

  public final void b()
  {
    c();
    this.a.shutdown();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.plugin.qr.InactivityTimer
 * JD-Core Version:    0.6.0
 */