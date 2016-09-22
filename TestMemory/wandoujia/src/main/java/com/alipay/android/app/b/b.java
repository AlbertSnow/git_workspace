package com.alipay.android.app.b;

import com.alipay.wandoujia.i;

final class b
  implements Thread.UncaughtExceptionHandler
{
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    i.a().b(paramThrowable, "uncatch crash");
    android.support.v4.app.b.b(paramThrowable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.b.b
 * JD-Core Version:    0.6.0
 */