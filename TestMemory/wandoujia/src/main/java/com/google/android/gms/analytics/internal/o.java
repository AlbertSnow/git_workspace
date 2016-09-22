package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.internal.z;
import com.wandoujia.p4.app_launcher.manager.b;

public final class o extends u
{
  private final ah a;

  public o(w paramw, y paramy)
  {
    super(paramw);
    android.support.v4.app.d.a(paramy);
    this.a = paramy.c(paramw);
  }

  public final long a(b paramb)
  {
    z();
    android.support.v4.app.d.a(paramb);
    w.r();
    long l = this.a.b(paramb);
    if (l == 0L)
      this.a.a(paramb);
    return l;
  }

  protected final void a()
  {
    this.a.A();
  }

  public final void a(ay paramay)
  {
    z();
    n().a(new s(this, paramay));
  }

  public final void a(d paramd)
  {
    android.support.v4.app.d.a(paramd);
    z();
    b("Hit delivery requested", paramd);
    n().a(new r(this, paramd));
  }

  public final void a(String paramString, Runnable paramRunnable)
  {
    android.support.v4.app.d.a(paramString, "campaign param can't be empty");
    n().a(new q(this, paramString, paramRunnable));
  }

  public final void a(boolean paramBoolean)
  {
    a("Network connectivity status changed", Boolean.valueOf(paramBoolean));
    n().a(new p(this));
  }

  public final void b()
  {
    this.a.b();
  }

  public final void c()
  {
    z();
    Context localContext = k();
    if ((AnalyticsReceiver.a(localContext)) && (AnalyticsService.a(localContext)))
    {
      Intent localIntent = new Intent(localContext, AnalyticsService.class);
      localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      localContext.startService(localIntent);
      return;
    }
    a(null);
  }

  public final void d()
  {
    z();
    z.d();
    this.a.f();
  }

  final void e()
  {
    w.r();
    this.a.e();
  }

  final void f()
  {
    w.r();
    this.a.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.o
 * JD-Core Version:    0.6.0
 */