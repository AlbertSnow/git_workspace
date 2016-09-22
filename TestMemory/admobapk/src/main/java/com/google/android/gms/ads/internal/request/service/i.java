package com.google.android.gms.ads.internal.request.service;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.z;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.c;

final class i
  implements Runnable
{
  i(b paramb, AdRequestInfoParcel paramAdRequestInfoParcel, z paramz)
  {
  }

  public final void run()
  {
    try
    {
      AdResponseParcel localAdResponseParcel2 = this.c.a(this.a);
      localAdResponseParcel1 = localAdResponseParcel2;
      if (localAdResponseParcel1 == null)
        localAdResponseParcel1 = new AdResponseParcel(0);
    }
    catch (Exception localException)
    {
      try
      {
        this.b.a(localAdResponseParcel1);
        return;
        localException = localException;
        bc.a().h.a(localException, true);
        c.c("Could not fetch ad response due to an Exception.", localException);
        AdResponseParcel localAdResponseParcel1 = null;
      }
      catch (RemoteException localRemoteException)
      {
        c.c("Fail to forward ad response.", localRemoteException);
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.service.i
 * JD-Core Version:    0.6.0
 */