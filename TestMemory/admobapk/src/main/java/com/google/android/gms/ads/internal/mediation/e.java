package com.google.android.gms.ads.internal.mediation;

import com.google.android.gms.ads.internal.mediation.client.i;
import com.google.android.gms.ads.internal.mediation.client.k;
import com.google.android.gms.ads.internal.report.client.a;

@a
public final class e extends i
{
  final Object a = new Object();
  j b;
  private d c;

  public final void a()
  {
    synchronized (this.a)
    {
      if (this.c != null)
        this.c.w();
      return;
    }
  }

  public final void a(int paramInt)
  {
    while (true)
    {
      synchronized (this.a)
      {
        if (this.b == null)
          continue;
        if (paramInt == 3)
        {
          i = 1;
          this.b.a(i);
          this.b = null;
          return;
        }
      }
      int i = 2;
    }
  }

  public final void a(k paramk)
  {
    synchronized (this.a)
    {
      if (this.b != null)
      {
        this.b.a(0, paramk);
        this.b = null;
        return;
      }
      if (this.c != null)
        this.c.A();
      return;
    }
  }

  public final void a(d paramd)
  {
    synchronized (this.a)
    {
      this.c = paramd;
      return;
    }
  }

  public final void b()
  {
    synchronized (this.a)
    {
      if (this.c != null)
        this.c.x();
      return;
    }
  }

  public final void c()
  {
    synchronized (this.a)
    {
      if (this.c != null)
        this.c.y();
      return;
    }
  }

  public final void d()
  {
    synchronized (this.a)
    {
      if (this.c != null)
        this.c.z();
      return;
    }
  }

  public final void e()
  {
    synchronized (this.a)
    {
      if (this.b != null)
      {
        this.b.a(0);
        this.b = null;
        return;
      }
      if (this.c != null)
        this.c.A();
      return;
    }
  }

  public final void f()
  {
    synchronized (this.a)
    {
      if (this.c != null)
        this.c.B();
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.e
 * JD-Core Version:    0.6.0
 */