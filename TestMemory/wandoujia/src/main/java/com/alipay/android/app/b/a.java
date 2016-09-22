package com.alipay.android.app.b;

import android.os.Handler;
import android.os.Looper;

public final class a
  implements Runnable
{
  private static a a;
  private static boolean b;
  private Looper c;
  private Thread.UncaughtExceptionHandler d = new b();

  private a()
  {
    b = false;
  }

  public static void a()
  {
    if (b)
      return;
    if (a == null)
      a = new a();
    new Thread(a).start();
  }

  public final void run()
  {
    b = true;
    Thread.currentThread().setPriority(5);
    Thread.currentThread().setName("lua thread");
    Thread.currentThread().setUncaughtExceptionHandler(this.d);
    this.c = Looper.myLooper();
    if (this.c == null)
    {
      Looper.prepare();
      this.c = Looper.myLooper();
    }
    new Handler(this.c);
    Looper.loop();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.b.a
 * JD-Core Version:    0.6.0
 */