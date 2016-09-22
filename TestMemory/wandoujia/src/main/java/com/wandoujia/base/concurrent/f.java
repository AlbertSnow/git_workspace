package com.wandoujia.base.concurrent;

import android.os.Process;

final class f
  implements Runnable
{
  private final Runnable a;

  f(RestrictGivenPeriodExecutor paramRestrictGivenPeriodExecutor, Runnable paramRunnable)
  {
    this.a = paramRunnable;
  }

  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      long l = System.currentTimeMillis();
      if (l - RestrictGivenPeriodExecutor.access$000(this.b) < RestrictGivenPeriodExecutor.access$100(this.b))
        Thread.sleep(RestrictGivenPeriodExecutor.access$100(this.b) - (l - RestrictGivenPeriodExecutor.access$000(this.b)));
      RestrictGivenPeriodExecutor.access$002(this.b, l);
      this.a.run();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (!RestrictGivenPeriodExecutor.access$200(this.b));
      RestrictGivenPeriodExecutor.access$300();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.concurrent.f
 * JD-Core Version:    0.6.0
 */