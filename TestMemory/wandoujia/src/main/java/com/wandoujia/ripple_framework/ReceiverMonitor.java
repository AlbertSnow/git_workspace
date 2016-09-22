package com.wandoujia.ripple_framework;

import android.net.NetworkInfo;
import android.support.v7.app.f;
import android.support.v7.app.k;
import com.wandoujia.p4.utils.x;
import com.wandoujia.p4.utils.y;
import java.util.Iterator;
import java.util.List;

public final class ReceiverMonitor
{
  private static ReceiverMonitor a = new ReceiverMonitor();
  private final x<l> b = new x();
  private final x<n> c = new x();
  private final x<m> d = new x();
  private final x<k> e = new x();
  private final x<f> f = new x();

  public static ReceiverMonitor a()
  {
    return a;
  }

  public final void a(NetworkInfo paramNetworkInfo)
  {
    y localy = this.c.a();
    while (true)
    {
      n localn = (n)localy.a();
      if (localn == null)
        break;
      localn.a(paramNetworkInfo);
    }
  }

  public final void a(k paramk)
  {
    if (paramk != null)
      this.e.a(paramk);
  }

  public final void a(ReceiverMonitor.AppActionType paramAppActionType, List<String> paramList)
  {
    y localy = this.b.a();
    while (true)
    {
      l locall = (l)localy.a();
      if (locall == null)
        break;
      locall.a(paramAppActionType, paramList);
    }
  }

  public final void a(ReceiverMonitor.MediaState paramMediaState)
  {
    y localy = this.d.a();
    while (true)
    {
      m localm = (m)localy.a();
      if (localm == null)
        break;
      localm.a(paramMediaState);
    }
  }

  public final void a(l paraml)
  {
    if (paraml != null)
      this.b.a(paraml);
  }

  public final void a(m paramm)
  {
    if (paramm != null)
      this.d.a(paramm);
  }

  public final void a(n paramn)
  {
    if (paramn != null)
      this.c.a(paramn);
  }

  public final void b()
  {
    Iterator localIterator = this.f.b().iterator();
    while (localIterator.hasNext())
      localIterator.next();
  }

  public final void b(n paramn)
  {
    if (paramn != null)
      this.c.b(paramn);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ReceiverMonitor
 * JD-Core Version:    0.6.0
 */