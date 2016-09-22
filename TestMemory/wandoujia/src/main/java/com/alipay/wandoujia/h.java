package com.alipay.wandoujia;

final class h
  implements Thread.UncaughtExceptionHandler
{
  public static void a()
  {
    h localh = new h();
    Thread.currentThread().setUncaughtExceptionHandler(localh);
  }

  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.h
 * JD-Core Version:    0.6.0
 */