package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.RemoteException;
import anw;
import apn;
import com.google.android.gms.ads.internal.util.client.e;
import com.google.android.gms.ads.reward.mediation.b;

@com.google.android.gms.ads.internal.report.client.a
public final class d
  implements b
{
  private final a a;

  public d(a parama)
  {
    this.a = parama;
  }

  public final void a(com.google.android.gms.ads.reward.mediation.a parama)
  {
    anw.b("onInitializationSucceeded must be called on the main UI thread.");
    e.b("Adapter called onInitializationSucceeded.");
    try
    {
      this.a.a(apn.a(parama));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onInitializationSucceeded.", localRemoteException);
    }
  }

  public final void a(com.google.android.gms.ads.reward.mediation.a parama, int paramInt)
  {
    anw.b("onAdFailedToLoad must be called on the main UI thread.");
    e.b("Adapter called onAdFailedToLoad.");
    try
    {
      this.a.b(apn.a(parama), paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public final void a(com.google.android.gms.ads.reward.mediation.a parama, com.google.android.gms.ads.reward.a parama1)
  {
    anw.b("onRewarded must be called on the main UI thread.");
    e.b("Adapter called onRewarded.");
    if (parama1 != null);
    try
    {
      this.a.a(apn.a(parama), new RewardItemParcel(parama1));
      return;
      this.a.a(apn.a(parama), new RewardItemParcel(parama.getClass().getName(), 1));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onRewarded.", localRemoteException);
    }
  }

  public final void b(com.google.android.gms.ads.reward.mediation.a parama)
  {
    anw.b("onAdLoaded must be called on the main UI thread.");
    e.b("Adapter called onAdLoaded.");
    try
    {
      this.a.b(apn.a(parama));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public final void c(com.google.android.gms.ads.reward.mediation.a parama)
  {
    anw.b("onAdOpened must be called on the main UI thread.");
    e.b("Adapter called onAdOpened.");
    try
    {
      this.a.c(apn.a(parama));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onAdOpened.", localRemoteException);
    }
  }

  public final void d(com.google.android.gms.ads.reward.mediation.a parama)
  {
    anw.b("onVideoStarted must be called on the main UI thread.");
    e.b("Adapter called onVideoStarted.");
    try
    {
      this.a.d(apn.a(parama));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onVideoStarted.", localRemoteException);
    }
  }

  public final void e(com.google.android.gms.ads.reward.mediation.a parama)
  {
    anw.b("onAdClosed must be called on the main UI thread.");
    e.b("Adapter called onAdClosed.");
    try
    {
      this.a.e(apn.a(parama));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onAdClosed.", localRemoteException);
    }
  }

  public final void f(com.google.android.gms.ads.reward.mediation.a parama)
  {
    anw.b("onAdLeftApplication must be called on the main UI thread.");
    e.b("Adapter called onAdLeftApplication.");
    try
    {
      this.a.g(apn.a(parama));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onAdLeftApplication.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.client.d
 * JD-Core Version:    0.6.0
 */