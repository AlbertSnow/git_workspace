package com.google.android.gms.internal;

import android.support.v4.app.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class w
{
  private final y a;
  private final r b;
  private boolean c;
  private long d;
  private long e;
  private long f;
  private long g;
  private long h;
  private boolean i;
  private final Map<Class<? extends x>, x> j;
  private final List<af> k;

  private w(w paramw)
  {
    this.a = paramw.a;
    this.b = paramw.b;
    this.d = paramw.d;
    this.e = paramw.e;
    this.f = paramw.f;
    this.g = paramw.g;
    this.h = paramw.h;
    this.k = new ArrayList(paramw.k);
    this.j = new HashMap(paramw.j.size());
    Iterator localIterator = paramw.j.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      x localx = c((Class)localEntry.getKey());
      ((x)localEntry.getValue()).a(localx);
      this.j.put(localEntry.getKey(), localx);
    }
  }

  w(y paramy, r paramr)
  {
    d.a(paramy);
    d.a(paramr);
    this.a = paramy;
    this.b = paramr;
    this.g = 1800000L;
    this.h = 3024000000L;
    this.j = new HashMap();
    this.k = new ArrayList();
  }

  private static <T extends x> T c(Class<T> paramClass)
  {
    try
    {
      x localx = (x)paramClass.newInstance();
      return localx;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new IllegalArgumentException("dataType doesn't have default constructor", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new IllegalArgumentException("dataType default constructor is not accessible", localIllegalAccessException);
  }

  public final w a()
  {
    return new w(this);
  }

  public final <T extends x> T a(Class<T> paramClass)
  {
    return (x)this.j.get(paramClass);
  }

  public final void a(long paramLong)
  {
    this.e = paramLong;
  }

  public final void a(x paramx)
  {
    d.a(paramx);
    Class localClass = paramx.getClass();
    if (localClass.getSuperclass() != x.class)
      throw new IllegalArgumentException();
    paramx.a(b(localClass));
  }

  public final <T extends x> T b(Class<T> paramClass)
  {
    x localx = (x)this.j.get(paramClass);
    if (localx == null)
    {
      localx = c(paramClass);
      this.j.put(paramClass, localx);
    }
    return localx;
  }

  public final Collection<x> b()
  {
    return this.j.values();
  }

  public final List<af> c()
  {
    return this.k;
  }

  public final long d()
  {
    return this.d;
  }

  public final void e()
  {
    this.a.j().a(this);
  }

  public final boolean f()
  {
    return this.c;
  }

  final void g()
  {
    this.f = this.b.b();
    if (this.e != 0L);
    for (this.d = this.e; ; this.d = this.b.a())
    {
      this.c = true;
      return;
    }
  }

  final y h()
  {
    return this.a;
  }

  final boolean i()
  {
    return this.i;
  }

  final void j()
  {
    this.i = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.w
 * JD-Core Version:    0.6.0
 */