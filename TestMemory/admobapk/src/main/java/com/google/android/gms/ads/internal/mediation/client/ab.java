package com.google.android.gms.ads.internal.mediation.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.e;
import ga;

final class ab
  implements Runnable
{
  ab(aa paramaa, ga paramga)
  {
  }

  public final void run()
  {
    try
    {
      this.b.a.a(ad.a(this.a));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.ab
 * JD-Core Version:    0.6.0
 */