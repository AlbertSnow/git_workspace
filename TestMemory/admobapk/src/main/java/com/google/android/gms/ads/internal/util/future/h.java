package com.google.android.gms.ads.internal.util.future;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class h
{
  final Object a = new Object();
  final List b = new ArrayList();
  boolean c = false;
  private final List d = new ArrayList();

  static void c(Runnable paramRunnable)
  {
    com.google.android.gms.ads.internal.util.client.a.a.post(paramRunnable);
  }

  public final void a()
  {
    synchronized (this.a)
    {
      if (this.c)
        return;
      Iterator localIterator1 = this.d.iterator();
      if (localIterator1.hasNext())
        s.a((Runnable)localIterator1.next());
    }
    Iterator localIterator2 = this.b.iterator();
    while (localIterator2.hasNext())
      c((Runnable)localIterator2.next());
    this.d.clear();
    this.b.clear();
    this.c = true;
    monitorexit;
  }

  public final void a(Runnable paramRunnable)
  {
    synchronized (this.a)
    {
      if (this.c)
      {
        s.a(paramRunnable);
        return;
      }
      this.d.add(paramRunnable);
    }
  }

  public final void b(Runnable paramRunnable)
  {
    synchronized (this.a)
    {
      if (this.c)
      {
        c(paramRunnable);
        return;
      }
      this.b.add(paramRunnable);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.future.h
 * JD-Core Version:    0.6.0
 */