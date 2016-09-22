package com.wandoujia.p4.b;

import android.os.Handler;
import android.support.v7.app.f;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.n;

public final class l extends a<f>
{
  private static l g;
  private volatile boolean a = false;
  private volatile boolean b = false;
  private volatile boolean c = false;
  private volatile boolean d = false;
  private String e;
  private final n f = new m(this);

  static
  {
    if (g == null)
      g = new l();
  }

  private l()
  {
    ReceiverMonitor.a().a(this.f);
  }

  private void a(int paramInt)
  {
    Handler localHandler = a();
    if (localHandler != null)
      localHandler.sendEmptyMessage(paramInt);
  }

  public static l c()
  {
    return g;
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, String paramString)
  {
    monitorenter;
    try
    {
      this.a = paramBoolean1;
      this.d = paramBoolean2;
      this.b = paramBoolean3;
      this.c = paramBoolean4;
      this.e = paramString;
      a(26);
      a(27);
      a(25);
      new p();
      b();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final boolean d()
  {
    monitorenter;
    try
    {
      boolean bool = this.a;
      monitorexit;
      return bool;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final boolean e()
  {
    monitorenter;
    try
    {
      boolean bool = this.b;
      monitorexit;
      return bool;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final boolean f()
  {
    monitorenter;
    try
    {
      boolean bool = this.d;
      monitorexit;
      return bool;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final boolean g()
  {
    monitorenter;
    try
    {
      boolean bool = this.c;
      monitorexit;
      return bool;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final String h()
  {
    monitorenter;
    try
    {
      String str = this.e;
      monitorexit;
      return str;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void i()
  {
    monitorenter;
    try
    {
      this.a = false;
      this.d = false;
      this.b = false;
      this.c = false;
      this.e = null;
      a(26);
      a(27);
      a(25);
      new o();
      b();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.b.l
 * JD-Core Version:    0.6.0
 */