package com.google.android.gms.internal;

import android.util.Log;
import java.util.concurrent.FutureTask;

final class ac extends FutureTask<T>
{
  ac(ab paramab, Runnable paramRunnable, Object paramObject)
  {
    super(paramRunnable, paramObject);
  }

  protected final void setException(Throwable paramThrowable)
  {
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = z.b(this.a.a);
    if (localUncaughtExceptionHandler != null)
      localUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), paramThrowable);
    while (true)
    {
      super.setException(paramThrowable);
      return;
      if (!Log.isLoggable("GAv4", 6))
        continue;
      new StringBuilder("MeasurementExecutor: job failed with ").append(paramThrowable);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.ac
 * JD-Core Version:    0.6.0
 */