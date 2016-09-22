package com.alipay.wandoujia;

import android.content.Context;

public abstract class l
{
  private Context a;
  private boolean b;
  private Object c;
  private Runnable d = new m(this);

  protected l(Context paramContext)
  {
    this.a = paramContext;
    this.b = false;
    this.c = new Object();
  }

  protected static boolean b()
  {
    return b.a().d() > 0;
  }

  public final void a()
  {
    synchronized (this.c)
    {
      if (this.b)
        return;
      this.b = true;
      new Thread(this.d).start();
      return;
    }
  }

  protected final boolean c()
  {
    return x.b(this.a) == id.a;
  }

  protected final Context d()
  {
    return this.a;
  }

  protected abstract void e();

  protected abstract void f();

  protected abstract boolean g();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.l
 * JD-Core Version:    0.6.0
 */