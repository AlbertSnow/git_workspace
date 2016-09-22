package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.report.client.a;
import md;

@a
public class r extends md
{
  final Object a = new Object();
  md b;

  public void a()
  {
    synchronized (this.a)
    {
      if (this.b != null)
        this.b.a();
      return;
    }
  }

  public void a(int paramInt)
  {
    synchronized (this.a)
    {
      if (this.b != null)
        this.b.a(paramInt);
      return;
    }
  }

  public final void a(md parammd)
  {
    synchronized (this.a)
    {
      this.b = parammd;
      return;
    }
  }

  public final void b()
  {
    synchronized (this.a)
    {
      if (this.b != null)
        this.b.b();
      return;
    }
  }

  public final void c()
  {
    synchronized (this.a)
    {
      if (this.b != null)
        this.b.c();
      return;
    }
  }

  public final void d()
  {
    synchronized (this.a)
    {
      if (this.b != null)
        this.b.d();
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.r
 * JD-Core Version:    0.6.0
 */