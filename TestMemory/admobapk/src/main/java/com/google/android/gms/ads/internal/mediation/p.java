package com.google.android.gms.ads.internal.mediation;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.util.c;

final class p
  implements Runnable
{
  p(o paramo, i parami)
  {
  }

  public final void run()
  {
    try
    {
      this.a.c.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      c.c("Could not destroy mediation adapter.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.p
 * JD-Core Version:    0.6.0
 */