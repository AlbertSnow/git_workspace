package com.alipay.wandoujia;

import android.os.Binder;

public final class a
  implements bd
{
  private static Class d;
  private int a;
  private int b;
  private Object c;
  private bc e;
  private com.wandoujia.clean.b.a f;
  private d g;
  private f h;
  private aj i;
  private c j;

  protected a(int paramInt)
  {
    this.a = paramInt;
    this.b = Binder.getCallingPid();
    this.c = new Object();
    this.f = new com.wandoujia.clean.b.a();
    this.h = new f(this);
    this.g = new d(this.h);
    this.i = new aj();
    this.i.a(this);
  }

  public static void a(Class paramClass)
  {
    d = paramClass;
  }

  public final int a()
  {
    return this.a;
  }

  public final com.alipay.android.app.c b()
  {
    return b.a().e(this.b);
  }

  public final c c()
  {
    if (this.j == null)
      this.j = new c(this);
    return this.j;
  }

  // ERROR //
  public final void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 42	com/alipay/wandoujia/a:c	Ljava/lang/Object;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 42	com/alipay/wandoujia/a:c	Ljava/lang/Object;
    //   18: astore_3
    //   19: aload_3
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 42	com/alipay/wandoujia/a:c	Ljava/lang/Object;
    //   25: invokevirtual 92	java/lang/Object:wait	()V
    //   28: aload_3
    //   29: monitorexit
    //   30: goto -19 -> 11
    //   33: astore 5
    //   35: aload_3
    //   36: monitorexit
    //   37: aload 5
    //   39: athrow
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    //   45: astore 4
    //   47: new 94	com/alipay/android/app/exception/AppErrorException
    //   50: dup
    //   51: aload 4
    //   53: invokevirtual 98	java/lang/Object:getClass	()Ljava/lang/Class;
    //   56: invokespecial 100	com/alipay/android/app/exception/AppErrorException:<init>	(Ljava/lang/Class;)V
    //   59: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   21	28	33	finally
    //   28	30	33	finally
    //   35	37	33	finally
    //   47	60	33	finally
    //   2	7	40	finally
    //   14	21	40	finally
    //   37	40	40	finally
    //   21	28	45	java/lang/InterruptedException
  }

  public final void e()
  {
    if (this.c == null)
      return;
    synchronized (this.c)
    {
      this.c.notifyAll();
      return;
    }
  }

  public final nd f()
  {
    return null;
  }

  public final f g()
  {
    return this.h;
  }

  public final void h()
  {
    b.a().d(this.a);
    if (this.i != null)
      this.i.b();
    com.wandoujia.jupiter.paid.d.a.b().a(this.a);
    try
    {
      this.c.notify();
      label41: this.j = null;
      this.i = null;
      this.a = 0;
      this.b = 0;
      this.c = null;
      return;
    }
    catch (Exception localException)
    {
      break label41;
    }
  }

  public final aj i()
  {
    return this.i;
  }

  public final int j()
  {
    return this.b;
  }

  public final d k()
  {
    return this.g;
  }

  public final bc l()
  {
    if ((d != null) && (this.e == null));
    try
    {
      this.e = ((bc)d.newInstance());
      label26: return this.e;
    }
    catch (Exception localException)
    {
      break label26;
    }
  }

  public final com.wandoujia.clean.b.a m$24af20d5()
  {
    return this.f;
  }

  public final ai p()
  {
    return this.g.g();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.a
 * JD-Core Version:    0.6.0
 */