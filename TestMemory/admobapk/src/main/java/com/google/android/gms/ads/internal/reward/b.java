package com.google.android.gms.ads.internal.reward;

import android.content.Context;
import android.os.RemoteException;
import anw;
import apj;
import apn;
import com.google.android.gms.ads.internal.bd;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.j;
import com.google.android.gms.ads.internal.reward.mediation.k;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@com.google.android.gms.ads.internal.report.client.a
public final class b extends com.google.android.gms.ads.internal.reward.client.e
{
  private final c a;
  private final Object b;

  public b(Context paramContext, m paramm, com.google.android.gms.ads.internal.mediation.client.b paramb, VersionInfoParcel paramVersionInfoParcel)
  {
    this.a = new c(paramContext, paramm, AdSizeParcel.b(), paramb, paramVersionInfoParcel);
    this.b = new Object();
  }

  public final void a()
  {
    synchronized (this.b)
    {
      c localc = this.a;
      anw.b("showAd must be called on the main UI thread.");
      if (!localc.H())
        com.google.android.gms.ads.internal.util.c.e("The reward video has not loaded.");
      while (true)
      {
        return;
        localc.j = true;
        k localk = localc.b(localc.d.j.p);
        if (localk == null)
          continue;
        com.google.android.gms.ads.internal.mediation.client.e locale = localk.a;
        if (locale == null)
          continue;
        try
        {
          localk.a.f();
        }
        catch (RemoteException localRemoteException)
        {
          com.google.android.gms.ads.internal.util.c.c("Could not call showVideo.", localRemoteException);
        }
      }
    }
  }

  public final void a(apj paramapj)
  {
    synchronized (this.b)
    {
      this.a.h();
      return;
    }
  }

  public final void a(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    synchronized (this.b)
    {
      this.a.a(paramRewardedVideoAdRequestParcel);
      return;
    }
  }

  public final void a(j paramj)
  {
    synchronized (this.b)
    {
      this.a.a(paramj);
      return;
    }
  }

  public final void a(String paramString)
  {
    com.google.android.gms.ads.internal.util.c.e("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
  }

  public final void b(apj paramapj)
  {
    Object localObject1 = this.b;
    monitorenter;
    Object localObject3;
    if (paramapj == null)
      localObject3 = null;
    while (true)
    {
      if (localObject3 != null);
      try
      {
        Iterator localIterator = this.a.i.values().iterator();
        while (localIterator.hasNext())
        {
          k localk = (k)localIterator.next();
          try
          {
            localk.a.a(apn.a(localObject3));
          }
          catch (RemoteException localRemoteException)
          {
            com.google.android.gms.ads.internal.util.c.b("Unable to call Adapter.onContextChanged.", localRemoteException);
          }
        }
      }
      catch (Exception localException)
      {
        com.google.android.gms.ads.internal.util.c.c("Unable to extract updated context.", localException);
        this.a.i();
        return;
        Context localContext = (Context)apn.a(paramapj);
        localObject3 = localContext;
        continue;
      }
      finally
      {
        monitorexit;
      }
    }
    throw localObject2;
  }

  public final boolean b()
  {
    synchronized (this.b)
    {
      boolean bool = this.a.H();
      return bool;
    }
  }

  public final void c()
  {
    a(null);
  }

  public final void c(apj paramapj)
  {
    synchronized (this.b)
    {
      this.a.a();
      return;
    }
  }

  public final void d()
  {
    b(null);
  }

  public final void e()
  {
    c(null);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.b
 * JD-Core Version:    0.6.0
 */