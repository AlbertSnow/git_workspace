package com.google.android.gms.ads.internal.mediation.client;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.mediation.k;
import com.google.ads.mediation.m;
import com.google.android.gms.ads.internal.util.client.e;
import ga;

@com.google.android.gms.ads.internal.report.client.a
public final class aa
  implements k, m
{
  final h a;

  public aa(h paramh)
  {
    this.a = paramh;
  }

  public final void a(ga paramga)
  {
    String str = String.valueOf(paramga);
    e.b(47 + String.valueOf(str).length() + "Adapter called onFailedToReceiveAd with error. " + str);
    if (!com.google.android.gms.ads.internal.util.client.a.b())
    {
      e.e("onFailedToReceiveAd must be called on the main UI thread.");
      com.google.android.gms.ads.internal.util.client.a.a.post(new ab(this, paramga));
      return;
    }
    try
    {
      this.a.a(ad.a(paramga));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public final void b(ga paramga)
  {
    String str = String.valueOf(paramga);
    e.b(47 + String.valueOf(str).length() + "Adapter called onFailedToReceiveAd with error " + str + ".");
    if (!com.google.android.gms.ads.internal.util.client.a.b())
    {
      e.e("onFailedToReceiveAd must be called on the main UI thread.");
      com.google.android.gms.ads.internal.util.client.a.a.post(new ac(this, paramga));
      return;
    }
    try
    {
      this.a.a(ad.a(paramga));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.aa
 * JD-Core Version:    0.6.0
 */