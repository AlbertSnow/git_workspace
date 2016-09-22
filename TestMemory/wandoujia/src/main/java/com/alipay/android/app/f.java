package com.alipay.android.app;

import com.alipay.wandoujia.i;

final class f
  implements Thread.UncaughtExceptionHandler
{
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    com.alipay.wandoujia.b.a().e();
    i.a().b(paramThrowable, "uncatch crash");
    android.support.v4.app.b.b(paramThrowable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.f
 * JD-Core Version:    0.6.0
 */