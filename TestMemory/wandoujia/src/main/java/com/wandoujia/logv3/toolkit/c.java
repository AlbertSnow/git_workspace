package com.wandoujia.logv3.toolkit;

import android.os.Handler;
import android.os.Looper;

final class c
  implements Runnable
{
  c(ANRWatchDog paramANRWatchDog)
  {
  }

  public final void run()
  {
    switch (d.a[ANRWatchDog.b(this.a).ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      ANRWatchDog.a(this.a).postDelayed(ANRWatchDog.e(this.a), 15000L);
      return;
      ANRWatchDog.a(this.a, ANRWatchDog.ACKStatus.ACK_WAITING);
      ANRWatchDog.d(this.a).post(ANRWatchDog.c(this.a));
      continue;
      StackTraceElement[] arrayOfStackTraceElement = Looper.getMainLooper().getThread().getStackTrace();
      Throwable localThrowable = new Throwable("Application Not Responding");
      localThrowable.setStackTrace(arrayOfStackTraceElement);
      ae.b(localThrowable);
      ANRWatchDog.a(this.a, ANRWatchDog.ACKStatus.ANR);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.c
 * JD-Core Version:    0.6.0
 */