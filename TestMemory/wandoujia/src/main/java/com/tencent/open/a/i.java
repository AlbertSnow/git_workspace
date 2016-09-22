package com.tencent.open.a;

import android.support.v4.app.b;

public abstract class i
{
  private volatile int a = c.a;
  private volatile boolean b = true;

  public i()
  {
    this(i);
  }

  public i(int paramInt)
  {
    this.a = paramInt;
    this.b = true;
  }

  protected abstract void a(int paramInt, Thread paramThread, long paramLong, String paramString1, String paramString2, Throwable paramThrowable);

  public final void b(int paramInt, Thread paramThread, long paramLong, String paramString1, String paramString2, Throwable paramThrowable)
  {
    if ((this.b) && (b.b(this.a, paramInt)))
      a(paramInt, paramThread, paramLong, paramString1, paramString2, paramThrowable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.a.i
 * JD-Core Version:    0.6.0
 */