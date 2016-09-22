package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.e;

final class bq
  implements Runnable
{
  bq(bp parambp)
  {
  }

  public final void run()
  {
    if (this.a.a.a != null);
    try
    {
      this.a.a.a.a(1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not notify onAdFailedToLoad event.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.bq
 * JD-Core Version:    0.6.0
 */