package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class j
  implements Handler.Callback
{
  private final k a;
  private final ArrayList<com.google.android.gms.common.api.d> b;
  private final ArrayList<e> c;
  private volatile boolean d;
  private final AtomicInteger e;
  private boolean f;
  private final Handler g;
  private final Object h;

  public final void a()
  {
    this.d = false;
    this.e.incrementAndGet();
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    this.g.removeMessages(1);
    synchronized (this.h)
    {
      ArrayList localArrayList = new ArrayList(this.c);
      int i = this.e.get();
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        e locale = (e)localIterator.next();
        if ((!this.d) || (this.e.get() != i))
          return;
        if (!this.c.contains(locale))
          continue;
        locale.a(paramConnectionResult);
      }
    }
    monitorexit;
  }

  public final void a(com.google.android.gms.common.api.d paramd)
  {
    android.support.v4.app.d.a(paramd);
    synchronized (this.h)
    {
      if (this.b.contains(paramd))
      {
        new StringBuilder("registerConnectionCallbacks(): listener ").append(paramd).append(" is already registered");
        if (this.a.l())
          this.g.sendMessage(this.g.obtainMessage(1, paramd));
        return;
      }
      this.b.add(paramd);
    }
  }

  public final void a(e parame)
  {
    android.support.v4.app.d.a(parame);
    synchronized (this.h)
    {
      if (this.c.contains(parame))
      {
        new StringBuilder("registerConnectionFailedListener(): listener ").append(parame).append(" is already registered");
        return;
      }
      this.c.add(parame);
    }
  }

  public final void b()
  {
    this.d = true;
  }

  public final void b(com.google.android.gms.common.api.d paramd)
  {
    android.support.v4.app.d.a(paramd);
    synchronized (this.h)
    {
      if (!this.b.remove(paramd))
        new StringBuilder("unregisterConnectionCallbacks(): listener ").append(paramd).append(" not found");
      do
        return;
      while (!this.f);
      null.add(paramd);
    }
  }

  public final void b(e parame)
  {
    android.support.v4.app.d.a(parame);
    synchronized (this.h)
    {
      if (!this.c.remove(parame))
        new StringBuilder("unregisterConnectionFailedListener(): listener ").append(parame).append(" not found");
      return;
    }
  }

  public final void c()
  {
    boolean bool1 = true;
    while (true)
    {
      synchronized (this.h)
      {
        if (!this.f)
        {
          bool2 = bool1;
          android.support.v4.app.d.a(bool2);
          this.g.removeMessages(1);
          this.f = true;
          if (null.size() != 0)
            break label160;
          android.support.v4.app.d.a(bool1);
          ArrayList localArrayList = new ArrayList(this.b);
          int i = this.e.get();
          Iterator localIterator = localArrayList.iterator();
          if (!localIterator.hasNext())
            break;
          com.google.android.gms.common.api.d locald = (com.google.android.gms.common.api.d)localIterator.next();
          if ((!this.d) || (!this.a.l()) || (this.e.get() != i))
            break;
          if (null.contains(locald))
            continue;
          locald.o();
        }
      }
      boolean bool2 = false;
      continue;
      label160: bool1 = false;
    }
    null.clear();
    this.f = false;
    monitorexit;
  }

  public final void d()
  {
    this.g.removeMessages(1);
    synchronized (this.h)
    {
      this.f = true;
      ArrayList localArrayList = new ArrayList(this.b);
      int i = this.e.get();
      Iterator localIterator = localArrayList.iterator();
      if (localIterator.hasNext())
      {
        com.google.android.gms.common.api.d locald = (com.google.android.gms.common.api.d)localIterator.next();
        if ((this.d) && (this.e.get() == i))
          this.b.contains(locald);
      }
    }
    null.clear();
    this.f = false;
    monitorexit;
  }

  public final boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      com.google.android.gms.common.api.d locald = (com.google.android.gms.common.api.d)paramMessage.obj;
      synchronized (this.h)
      {
        if ((this.d) && (this.a.l()) && (this.b.contains(locald)))
          locald.o();
        return true;
      }
    }
    Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.j
 * JD-Core Version:    0.6.0
 */