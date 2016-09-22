package com.google.android.gms.analytics.internal;

final class x
  implements Thread.UncaughtExceptionHandler
{
  x(w paramw)
  {
  }

  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    g localg = this.a.f();
    if (localg != null)
      localg.e("Job execution failed", paramThrowable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.x
 * JD-Core Version:    0.6.0
 */