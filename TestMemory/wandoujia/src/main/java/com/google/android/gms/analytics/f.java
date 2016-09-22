package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class f extends o
{
  private static List<Runnable> a = new ArrayList();
  private boolean b;
  private boolean c;

  public f(w paramw)
  {
    super(paramw);
    new HashSet();
  }

  public static f a(Context paramContext)
  {
    return w.a(paramContext).j();
  }

  public static void c()
  {
    monitorenter;
    try
    {
      if (a == null)
        break label54;
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext())
        ((Runnable)localIterator.next()).run();
    }
    finally
    {
      monitorexit;
    }
    a = null;
    label54: monitorexit;
  }

  public final l a(String paramString)
  {
    monitorenter;
    try
    {
      l locall = new l(e(), paramString);
      locall.A();
      return locall;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a()
  {
    n localn = e().k();
    localn.d();
    if (localn.g())
      this.c = localn.h();
    localn.d();
    this.b = true;
  }

  public final boolean b()
  {
    return this.b;
  }

  public final boolean d()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.f
 * JD-Core Version:    0.6.0
 */