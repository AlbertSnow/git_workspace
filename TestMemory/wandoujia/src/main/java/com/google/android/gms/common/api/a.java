package com.google.android.gms.common.api;

import android.content.Context;
import android.support.v4.app.i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.j;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class a<L>
{
  final j a;
  final Queue<o<?>> b;
  final n c;
  final Map<i<?>, b> d;
  final Map<i<?>, ConnectionResult> e;
  Set<Scope> f;
  final Set<o<?>> g;
  public final c h;
  public final e i;
  public final Set<Scope> j;
  private final android.support.v7.app.f<?, O> k;
  private final i<?> l;
  private final String m;
  private final Lock n;
  private final Condition o;
  private final Context p;
  private volatile p q;
  private final Set<a<?>> r;
  private volatile L s;
  private final Set<Scope> t;
  private final Map<a<?>, a> u;

  public final android.support.v7.app.f<?, O> a()
  {
    if (this.k != null);
    for (boolean bool = true; ; bool = false)
    {
      android.support.v4.app.d.a(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return this.k;
    }
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    g.a(null).lock();
    try
    {
      if (g.b(null, paramConnectionResult))
      {
        g.c(null);
        g.d(null);
      }
      while (true)
      {
        return;
        g.a(null, paramConnectionResult);
      }
    }
    finally
    {
      g.a(null).unlock();
    }
    throw localObject;
  }

  public final void a(d paramd)
  {
    this.a.a(paramd);
  }

  public final void a(e parame)
  {
    this.a.a(parame);
  }

  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.append(paramString).append("mState=").append(this.q.c());
    paramPrintWriter.append(" mResuming=").print(false);
    paramPrintWriter.append(" mWorkQueue.size()=").print(this.b.size());
    paramPrintWriter.append(" mUnconsumedRunners.size()=").println(this.g.size());
    new StringBuilder().append(paramString).append("  ");
    Iterator localIterator = null.keySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      paramPrintWriter.append(paramString).append(locala.m).println(":");
      this.d.get(locala.b());
    }
  }

  public final i<?> b()
  {
    if (this.l != null);
    for (boolean bool = true; ; bool = false)
    {
      android.support.v4.app.d.a(bool, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
      return this.l;
    }
  }

  public final void b(d paramd)
  {
    this.a.b(paramd);
  }

  public final void b(e parame)
  {
    this.a.b(parame);
  }

  public final void c()
  {
    this.n.lock();
    try
    {
      this.q.b();
      return;
    }
    finally
    {
      this.n.unlock();
    }
    throw localObject;
  }

  public final void d()
  {
    k();
    this.n.lock();
    try
    {
      this.q.a(-1);
      return;
    }
    finally
    {
      this.n.unlock();
    }
    throw localObject;
  }

  final void e()
  {
    Iterator localIterator1 = this.g.iterator();
    while (localIterator1.hasNext())
      localIterator1.next();
    this.g.clear();
    Iterator localIterator2 = this.r.iterator();
    while (localIterator2.hasNext())
      ((a)localIterator2.next()).s = null;
    this.r.clear();
    this.f.clear();
  }

  final void f()
  {
    this.n.lock();
    try
    {
      this.q = new g(this, null, null, this.n, this.p);
      this.q.a();
      this.o.signalAll();
      return;
    }
    finally
    {
      this.n.unlock();
    }
    throw localObject;
  }

  final void g()
  {
    this.n.lock();
    try
    {
      k();
      this.q = new f(this);
      this.q.a();
      this.o.signalAll();
      return;
    }
    finally
    {
      this.n.unlock();
    }
    throw localObject;
  }

  final void h()
  {
    this.n.lock();
    try
    {
      this.q = new m(this);
      this.q.a();
      this.o.signalAll();
      return;
    }
    finally
    {
      this.n.unlock();
    }
    throw localObject;
  }

  public final boolean i()
  {
    return this.q instanceof f;
  }

  public final boolean j()
  {
    return this.q instanceof g;
  }

  final boolean k()
  {
    this.n.lock();
    this.n.unlock();
    return false;
  }

  public final Set<Scope> m()
  {
    return this.t;
  }

  public final Map<a<?>, a> n()
  {
    return this.u;
  }

  public final void o()
  {
    new k(null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.a
 * JD-Core Version:    0.6.0
 */