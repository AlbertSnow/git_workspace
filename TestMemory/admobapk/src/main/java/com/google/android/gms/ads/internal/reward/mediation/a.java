package com.google.android.gms.ads.internal.reward.mediation;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;

@com.google.android.gms.ads.internal.report.client.a
public final class a extends com.google.android.gms.ads.internal.util.a
  implements d, g
{
  final Context a;
  final String b;
  final String c;
  private final com.google.android.gms.ads.internal.state.b d;
  private final k e;
  private final g f;
  private final Object g;
  private final String h;
  private int i = 0;
  private int k = 3;

  public a(Context paramContext, String paramString1, String paramString2, String paramString3, com.google.android.gms.ads.internal.state.b paramb, k paramk, g paramg)
  {
    this.a = paramContext;
    this.b = paramString1;
    this.c = paramString2;
    this.h = paramString3;
    this.d = paramb;
    this.e = paramk;
    this.g = new Object();
    this.f = paramg;
  }

  private boolean a(long paramLong)
  {
    long l = 20000L - (bc.a().i.b() - paramLong);
    if (l <= 0L)
      return false;
    try
    {
      this.g.wait(l);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    return false;
  }

  public final void a()
  {
    if ((this.e == null) || (this.e.b == null) || (this.e.a == null))
      return;
    f localf = this.e.b;
    localf.b = this;
    localf.a = this;
    AdRequestParcel localAdRequestParcel = this.d.a.c;
    e locale = this.e.a;
    try
    {
      if (locale.g())
      {
        com.google.android.gms.ads.internal.util.client.a.a.post(new b(this, localAdRequestParcel, locale));
        l = bc.a().i.b();
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        synchronized (this.g)
        {
          long l;
          if (this.i == 0)
            continue;
          localf.b = null;
          localf.a = null;
          if (this.i != 1)
            break;
          this.f.a(this.b);
          return;
          com.google.android.gms.ads.internal.util.client.a.a.post(new c(this, locale, localAdRequestParcel, localf));
          continue;
          localRemoteException = localRemoteException;
          com.google.android.gms.ads.internal.util.c.c("Fail to check if adapter is initialized.", localRemoteException);
          a(0);
          continue;
          if (a(l));
        }
        monitorexit;
      }
      this.f.a(this.k);
    }
  }

  public final void a(int paramInt)
  {
    synchronized (this.g)
    {
      this.i = 2;
      this.k = paramInt;
      this.g.notify();
      return;
    }
  }

  final void a(AdRequestParcel paramAdRequestParcel, e parame)
  {
    try
    {
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.b))
      {
        parame.a(paramAdRequestParcel, this.c, this.h);
        return;
      }
      parame.a(paramAdRequestParcel, this.c);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.c("Fail to load ad from adapter.", localRemoteException);
      a(0);
    }
  }

  public final void a(String paramString)
  {
    synchronized (this.g)
    {
      this.i = 1;
      this.g.notify();
      return;
    }
  }

  public final void b()
  {
  }

  public final void e()
  {
    a(this.d.a.c, this.e.a);
  }

  public final void f()
  {
    a(0);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.a
 * JD-Core Version:    0.6.0
 */