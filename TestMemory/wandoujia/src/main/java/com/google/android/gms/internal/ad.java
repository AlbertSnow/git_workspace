package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ad
  implements ThreadFactory
{
  private static final AtomicInteger a = new AtomicInteger();

  public final Thread newThread(Runnable paramRunnable)
  {
    return new ae(paramRunnable, "measurement-" + a.incrementAndGet());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.ad
 * JD-Core Version:    0.6.0
 */