package com.wandoujia.base.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

final class d<T>
  implements Future<T>
{
  private Runnable a;
  private boolean b;
  private T c;
  private final CountDownLatch d = new CountDownLatch(1);

  private d(CachedThreadPoolExecutorWithCapacity paramCachedThreadPoolExecutorWithCapacity)
  {
  }

  public final boolean cancel(boolean paramBoolean)
  {
    this.b = this.e.cancel(this.a, paramBoolean);
    return this.b;
  }

  public final T get()
  {
    this.d.await();
    return this.c;
  }

  public final T get(long paramLong, TimeUnit paramTimeUnit)
  {
    this.d.await(paramLong, paramTimeUnit);
    return this.c;
  }

  public final boolean isCancelled()
  {
    return this.b;
  }

  public final boolean isDone()
  {
    return this.d.getCount() == 0L;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.concurrent.d
 * JD-Core Version:    0.6.0
 */