package com.wandoujia.base.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class m
  implements ThreadFactory
{
  private static final AtomicInteger a = new AtomicInteger(1);
  private final ThreadGroup b;
  private final AtomicInteger c = new AtomicInteger(1);
  private final String d;
  private final int e;

  m(int paramInt)
  {
    this.e = paramInt;
    this.b = Thread.currentThread().getThreadGroup();
    this.d = ("pool-" + paramInt + "-" + a.getAndIncrement() + "-thread-");
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new Thread(this.b, paramRunnable, this.d + this.c.getAndIncrement(), 0L);
    localThread.setDaemon(false);
    localThread.setPriority(this.e);
    return localThread;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.m
 * JD-Core Version:    0.6.0
 */