package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.o;
import com.google.android.gms.ads.internal.util.client.e;
import md;

@com.google.android.gms.ads.internal.report.client.a
public final class bm
{
  public final com.google.android.gms.ads.internal.mediation.client.a a = new com.google.android.gms.ads.internal.mediation.client.a();
  public final Context b;
  public md c;
  public a d;
  public ah e;
  public String f;
  public com.google.android.gms.ads.reward.b g;
  public boolean h;
  private final h i;

  public bm(Context paramContext)
  {
    this(paramContext, h.a, null);
  }

  private bm(Context paramContext, h paramh, com.google.android.gms.ads.doubleclick.b paramb)
  {
    this.b = paramContext;
    this.i = paramh;
  }

  public final void a()
  {
    try
    {
      a("show");
      this.e.E();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to show interstitial.", localRemoteException);
    }
  }

  public final void a(a parama)
  {
    try
    {
      this.d = parama;
      ah localah;
      if (this.e != null)
      {
        localah = this.e;
        if (parama == null)
          break label40;
      }
      label40: for (b localb = new b(parama); ; localb = null)
      {
        localah.a(localb);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to set the AdClickListener.", localRemoteException);
    }
  }

  public final void a(com.google.android.gms.ads.reward.b paramb)
  {
    try
    {
      this.g = paramb;
      ah localah;
      if (this.e != null)
      {
        localah = this.e;
        if (paramb == null)
          break label40;
      }
      label40: for (o localo = new o(paramb); ; localo = null)
      {
        localah.a(localo);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to set the AdListener.", localRemoteException);
    }
  }

  public final void a(String paramString)
  {
    if (this.e == null)
      throw new IllegalStateException(63 + String.valueOf(paramString).length() + "The ad unit ID must be set on InterstitialAd before " + paramString + " is called.");
  }

  public final void a(md parammd)
  {
    try
    {
      this.c = parammd;
      ah localah;
      if (this.e != null)
      {
        localah = this.e;
        if (parammd == null)
          break label40;
      }
      label40: for (c localc = new c(parammd); ; localc = null)
      {
        localah.a(localc);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to set the AdListener.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.bm
 * JD-Core Version:    0.6.0
 */