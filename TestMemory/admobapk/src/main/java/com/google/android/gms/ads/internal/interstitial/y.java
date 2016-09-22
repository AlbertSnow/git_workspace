package com.google.android.gms.ads.internal.interstitial;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.c;

final class y
  implements Runnable
{
  y(b paramb, z paramz, aa paramaa)
  {
  }

  public final void run()
  {
    try
    {
      this.a.a(this.b);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      c.c("Could not propagate interstitial ad event.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.interstitial.y
 * JD-Core Version:    0.6.0
 */