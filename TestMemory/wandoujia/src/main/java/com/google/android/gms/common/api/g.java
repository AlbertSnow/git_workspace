package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.d;
import android.support.v4.app.i;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.j;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class g
  implements p
{
  private final a a;
  private final Lock b;
  private final Context c;
  private ConnectionResult d;
  private int e = 0;
  private boolean f = false;
  private int g;
  private final Bundle h = new Bundle();
  private final Set<i> i = new HashSet();
  private int j;
  private boolean k;
  private final a l;
  private final Map<a<?>, Integer> m;

  public g(a parama1, a parama2, Map<a<?>, Integer> paramMap, Lock paramLock, Context paramContext)
  {
    this.a = parama1;
    this.l = null;
    this.m = null;
    this.b = paramLock;
    this.c = paramContext;
  }

  private boolean a(ConnectionResult paramConnectionResult)
  {
    return (this.j == 2) || ((this.j == 1) && (!paramConnectionResult.a()));
  }

  private void b(ConnectionResult paramConnectionResult)
  {
    this.f = false;
    this.a.f.clear();
    this.d = paramConnectionResult;
    paramConnectionResult.a();
    a(3);
    this.a.k();
    this.a.a.a(paramConnectionResult);
    this.a.a.a();
  }

  private boolean b(int paramInt)
  {
    if (this.e != paramInt)
    {
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + c(this.e) + " but received callback for step " + c(paramInt));
      b(new ConnectionResult(8, null));
      return false;
    }
    return true;
  }

  private static String c(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return "UNKNOWN";
    case 0:
      return "STEP_GETTING_SERVICE_BINDINGS";
    case 1:
      return "STEP_VALIDATING_ACCOUNT";
    case 2:
      return "STEP_AUTHENTICATING";
    case 3:
    }
    return "STEP_GETTING_REMOTE_SERVICE";
  }

  private boolean d()
  {
    this.g = (-1 + this.g);
    if (this.g > 0)
      return false;
    if (this.g < 0)
    {
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
      b(new ConnectionResult(8, null));
      return false;
    }
    if (this.d != null)
    {
      b(this.d);
      return false;
    }
    return true;
  }

  private void e()
  {
    if (this.a.f.isEmpty())
      g();
    this.e = 3;
    this.g = this.a.d.size();
    Iterator localIterator1 = this.a.d.keySet().iterator();
    while (localIterator1.hasNext())
    {
      i locali1 = (i)localIterator1.next();
      if (this.a.e.containsKey(locali1))
      {
        if (!d())
          continue;
        this.a.g();
        Iterator localIterator2 = this.a.e.keySet().iterator();
        while (localIterator2.hasNext())
        {
          i locali2 = (i)localIterator2.next();
          this.a.d.get(locali2);
        }
        if (this.f)
        {
          this.f = false;
          a(-1);
          continue;
        }
        this.h.isEmpty();
        this.a.a.c();
        continue;
      }
      this.a.d.get(locali1);
    }
  }

  private void f()
  {
    this.a.f.clear();
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (this.a.e.containsKey(locali))
        continue;
      this.a.e.put(locali, new ConnectionResult(17, null));
    }
  }

  private Set<Scope> g()
  {
    HashSet localHashSet = new HashSet(this.l.m());
    Map localMap = this.l.n();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (this.a.e.containsKey(locala.b()))
        continue;
      localHashSet.addAll(((a)localMap.get(locala)).j);
    }
    return localHashSet;
  }

  public final void a()
  {
    this.a.a.b();
    this.a.e.clear();
    this.f = false;
    this.d = null;
    this.e = 0;
    this.j = 2;
    this.k = false;
    int n = com.google.android.gms.common.a.a(this.c);
    if (n != 0)
    {
      ConnectionResult localConnectionResult = new ConnectionResult(n, null);
      this.a.c.post(new h(this, localConnectionResult));
    }
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap();
      Iterator localIterator1 = this.m.keySet().iterator();
      while (localIterator1.hasNext())
      {
        a locala = (a)localIterator1.next();
        b localb = (b)this.a.d.get(locala.b());
        ((Integer)this.m.get(locala)).intValue();
        locala.a();
        localHashMap.put(localb, new d(this));
      }
      this.g = this.a.d.size();
      Iterator localIterator2 = this.a.d.values().iterator();
      while (localIterator2.hasNext())
        localHashMap.get((b)localIterator2.next());
    }
  }

  public final void a(int paramInt)
  {
    if (paramInt == -1)
    {
      Iterator localIterator = this.a.b.iterator();
      while (localIterator.hasNext())
      {
        if (((o)localIterator.next()).b() == 1)
          continue;
        localIterator.remove();
      }
      this.a.e();
      if ((this.d == null) && (!this.a.b.isEmpty()))
      {
        this.f = true;
        return;
      }
      this.a.e.clear();
      this.d = null;
    }
    this.a.h();
  }

  public final void b()
  {
    this.f = false;
  }

  public final String c()
  {
    return "CONNECTING";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.g
 * JD-Core Version:    0.6.0
 */