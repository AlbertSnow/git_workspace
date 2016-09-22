package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v7.app.f;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class i
{
  private static i e;
  private final Context a;
  private final b b;
  private final ac c;
  private final ConcurrentMap<c, Boolean> d;

  private i(Context paramContext, b paramb, ac paramac)
  {
    if (paramContext == null)
      throw new NullPointerException("context cannot be null");
    this.a = paramContext.getApplicationContext();
    this.c = paramac;
    this.d = new ConcurrentHashMap();
    this.b = paramb;
    this.b.a(new j(this));
    this.b.a(new ag(this.a));
    new aj();
    if (Build.VERSION.SDK_INT >= 14)
      this.a.registerComponentCallbacks(new k(this));
  }

  public static i a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (e != null)
        break label67;
      if (paramContext == null)
      {
        q.a();
        throw new NullPointerException();
      }
    }
    finally
    {
      monitorexit;
    }
    new m();
    e = new i(paramContext, new b(new ak(paramContext)), ad.c());
    label67: i locali = e;
    monitorexit;
    return locali;
  }

  public final void a()
  {
    this.c.a();
  }

  final boolean a(Uri paramUri)
  {
    monitorenter;
    while (true)
    {
      zzcb localzzcb;
      String str;
      try
      {
        localzzcb = zzcb.a();
        if (!localzzcb.a(paramUri))
          break label209;
        str = localzzcb.d();
        int j = l.a[localzzcb.b().ordinal()];
        switch (j)
        {
        default:
          i = 1;
          return i;
        case 1:
          Iterator localIterator2 = this.d.keySet().iterator();
          if (!localIterator2.hasNext())
            continue;
          c localc2 = (c)localIterator2.next();
          if (!a.a().equals(str))
            continue;
          localc2.a();
          continue;
        case 2:
        case 3:
        }
      }
      finally
      {
        monitorexit;
      }
      Iterator localIterator1 = this.d.keySet().iterator();
      while (localIterator1.hasNext())
      {
        c localc1 = (c)localIterator1.next();
        if (a.a().equals(str))
        {
          localzzcb.c();
          localc1.a();
          continue;
        }
        if (null.k() == null)
          continue;
        localc1.a();
      }
      continue;
      label209: int i = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.i
 * JD-Core Version:    0.6.0
 */