package com.alipay.wandoujia;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Binder;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static b a;
  private SparseArray b = new SparseArray();
  private SparseArray c = new SparseArray();

  public static final b a()
  {
    if (a == null)
      a = new b();
    return a;
  }

  public static void a(b paramb, a parama)
  {
    if (parama.c() != null)
      parama.c().g();
    paramb.d(parama.a());
    if (parama.i() != null)
      parama.i().b();
  }

  public final void a(com.alipay.android.app.c paramc)
  {
    this.c.put(Binder.getCallingPid(), paramc);
  }

  public final boolean a(int paramInt)
  {
    monitorenter;
    try
    {
      Object localObject2 = this.b.get(paramInt);
      if (localObject2 != null)
      {
        i = 1;
        return i;
      }
      int i = 0;
    }
    finally
    {
      monitorexit;
    }
  }

  public final a b(int paramInt)
  {
    monitorenter;
    try
    {
      a locala = (a)this.b.get(paramInt);
      if (locala == null)
      {
        locala = new a(paramInt);
        this.b.put(paramInt, locala);
      }
      return locala;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void b()
  {
    List localList = ((ActivityManager)com.wandoujia.image.c.a.a().b().getSystemService("activity")).getRunningAppProcesses();
    int i = 0;
    if (i >= this.b.size())
      return;
    int j = this.b.keyAt(i);
    a locala = (a)this.b.get(j);
    int k;
    Iterator localIterator;
    int m;
    if (locala != null)
    {
      k = locala.j();
      localIterator = localList.iterator();
      m = 0;
    }
    while (true)
    {
      if (!localIterator.hasNext())
      {
        if (m == 0)
          a(this, locala);
        i++;
        break;
      }
      if (k != ((ActivityManager.RunningAppProcessInfo)localIterator.next()).pid)
        continue;
      m = 1;
    }
  }

  public final a c(int paramInt)
  {
    monitorenter;
    try
    {
      int i = Binder.getCallingPid();
      for (int j = 0; ; j++)
      {
        int k = this.b.size();
        a locala;
        if (j >= k)
          locala = null;
        int n;
        do
        {
          return locala;
          int m = this.b.keyAt(j);
          locala = (a)this.b.get(m);
          if ((locala == null) || (locala.j() != i))
            break;
          n = locala.a();
        }
        while (n != paramInt);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void c()
  {
    this.c.remove(Binder.getCallingPid());
  }

  public final int d()
  {
    if (this.b != null)
      return this.b.size();
    return 0;
  }

  public final void d(int paramInt)
  {
    this.b.put(paramInt, null);
    this.b.remove(paramInt);
  }

  public final com.alipay.android.app.c e(int paramInt)
  {
    return (com.alipay.android.app.c)this.c.get(paramInt);
  }

  public final void e()
  {
    for (int i = 0; ; i++)
    {
      if (i >= this.b.size())
        return;
      int j = this.b.keyAt(i);
      a locala = (a)this.b.get(j);
      if (locala == null)
        continue;
      locala.c().g();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.b
 * JD-Core Version:    0.6.0
 */