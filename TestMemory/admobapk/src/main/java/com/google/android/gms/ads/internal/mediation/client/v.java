package com.google.android.gms.ads.internal.mediation.client;

import android.os.RemoteException;
import anw;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.j;

@a
public final class v
  implements com.google.android.gms.ads.mediation.e, g, i
{
  j a;
  private final h b;

  public v(h paramh)
  {
    this.b = paramh;
  }

  public final void a()
  {
    anw.b("onAdClicked must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdClicked.");
    try
    {
      this.b.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdClicked.", localRemoteException);
    }
  }

  public final void a(int paramInt)
  {
    anw.b("onAdFailedToLoad must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b(55 + "Adapter called onAdFailedToLoad with error. " + paramInt);
    try
    {
      this.b.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public final void a(j paramj)
  {
    anw.b("onAdLoaded must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdLoaded.");
    this.a = paramj;
    try
    {
      this.b.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public final void b()
  {
    anw.b("onAdClosed must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdClosed.");
    try
    {
      this.b.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdClosed.", localRemoteException);
    }
  }

  public final void b(int paramInt)
  {
    anw.b("onAdFailedToLoad must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b(55 + "Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      this.b.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public final void c()
  {
    anw.b("onAdLeftApplication must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdLeftApplication.");
    try
    {
      this.b.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public final void c(int paramInt)
  {
    anw.b("onAdFailedToLoad must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b(55 + "Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      this.b.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public final void d()
  {
    anw.b("onAdOpened must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdOpened.");
    try
    {
      this.b.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdOpened.", localRemoteException);
    }
  }

  public final void e()
  {
    anw.b("onAdLoaded must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdLoaded.");
    try
    {
      this.b.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public final void f()
  {
    anw.b("onAdClicked must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdClicked.");
    try
    {
      this.b.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdClicked.", localRemoteException);
    }
  }

  public final void g()
  {
    anw.b("onAdClosed must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdClosed.");
    try
    {
      this.b.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdClosed.", localRemoteException);
    }
  }

  public final void h()
  {
    anw.b("onAdLeftApplication must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdLeftApplication.");
    try
    {
      this.b.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public final void i()
  {
    anw.b("onAdOpened must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdOpened.");
    try
    {
      this.b.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdOpened.", localRemoteException);
    }
  }

  public final void j()
  {
    anw.b("onAdLoaded must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdLoaded.");
    try
    {
      this.b.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public final void k()
  {
    anw.b("onAdOpened must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdOpened.");
    try
    {
      this.b.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdOpened.", localRemoteException);
    }
  }

  public final void l()
  {
    anw.b("onAdClosed must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdClosed.");
    try
    {
      this.b.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdClosed.", localRemoteException);
    }
  }

  public final void m()
  {
    anw.b("onAdLeftApplication must be called on the main UI thread.");
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdLeftApplication.");
    try
    {
      this.b.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public final void n()
  {
    anw.b("onAdClicked must be called on the main UI thread.");
    j localj = this.a;
    if (localj == null)
    {
      com.google.android.gms.ads.internal.util.client.e.e("Could not call onAdClicked since NativeAdMapper is null.");
      return;
    }
    if (!localj.b)
    {
      com.google.android.gms.ads.internal.util.client.e.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
      return;
    }
    com.google.android.gms.ads.internal.util.client.e.b("Adapter called onAdClicked.");
    try
    {
      this.b.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Could not call onAdClicked.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.v
 * JD-Core Version:    0.6.0
 */