package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.d;
import com.google.android.gms.analytics.f;
import com.google.android.gms.internal.r;
import com.google.android.gms.internal.s;
import com.google.android.gms.internal.z;

public class w
{
  private static w a;
  private final Context b;
  private final Context c;
  private final r d;
  private final as e;
  private final g f;
  private final z g;
  private final o h;
  private final ax i;
  private final n j;
  private final j k;
  private final f l;
  private final am m;
  private final b n;
  private final ag o;
  private final aw p;

  private w(y paramy)
  {
    Context localContext1 = paramy.a();
    d.a(localContext1, "Application context can't be null");
    d.b(localContext1 instanceof Application, "getApplicationContext didn't return the application");
    Context localContext2 = paramy.b();
    d.a(localContext2);
    this.b = localContext1;
    this.c = localContext2;
    this.d = s.c();
    this.e = y.b(this);
    g localg = new g(this);
    localg.A();
    this.f = localg;
    e().e("Google Analytics " + v.a + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
    j localj = y.f(this);
    localj.A();
    this.k = localj;
    n localn = new n(this);
    localn.A();
    this.j = localn;
    o localo = new o(this, paramy);
    am localam = y.a(this);
    b localb = new b(this);
    ag localag = new ag(this);
    aw localaw = new aw(this);
    z localz = z.a(localContext1);
    localz.a(new x(this));
    this.g = localz;
    f localf = new f(this);
    localam.A();
    this.m = localam;
    localb.A();
    this.n = localb;
    localag.A();
    this.o = localag;
    localaw.A();
    this.p = localaw;
    ax localax = y.e(this);
    localax.A();
    this.i = localax;
    localo.A();
    this.h = localo;
    localf.a();
    this.l = localf;
    localo.b();
  }

  public static w a(Context paramContext)
  {
    d.a(paramContext);
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
      {
        r localr = s.c();
        long l1 = localr.b();
        w localw = new w(new y(paramContext.getApplicationContext()));
        a = localw;
        f.c();
        long l2 = localr.b() - l1;
        long l3 = ((Long)az.E.a()).longValue();
        if (l2 > l3)
          localw.e().c("Slow initialization (ms)", Long.valueOf(l2), Long.valueOf(l3));
      }
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static void a(u paramu)
  {
    d.a(paramu, "Analytics service not created/initialized");
    d.b(paramu.y(), "Analytics service not initialized");
  }

  public static void r()
  {
    z.d();
  }

  public final Context a()
  {
    return this.b;
  }

  public final Context b()
  {
    return this.c;
  }

  public final r c()
  {
    return this.d;
  }

  public final as d()
  {
    return this.e;
  }

  public final g e()
  {
    a(this.f);
    return this.f;
  }

  public final g f()
  {
    return this.f;
  }

  public final z g()
  {
    d.a(this.g);
    return this.g;
  }

  public final o h()
  {
    a(this.h);
    return this.h;
  }

  public final ax i()
  {
    a(this.i);
    return this.i;
  }

  public final f j()
  {
    d.a(this.l);
    d.b(this.l.b(), "Analytics instance not initialized");
    return this.l;
  }

  public final n k()
  {
    a(this.j);
    return this.j;
  }

  public final j l()
  {
    a(this.k);
    return this.k;
  }

  public final j m()
  {
    if ((this.k == null) || (!this.k.y()))
      return null;
    return this.k;
  }

  public final b n()
  {
    a(this.n);
    return this.n;
  }

  public final am o()
  {
    a(this.m);
    return this.m;
  }

  public final ag p()
  {
    a(this.o);
    return this.o;
  }

  public final aw q()
  {
    return this.p;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.w
 * JD-Core Version:    0.6.0
 */