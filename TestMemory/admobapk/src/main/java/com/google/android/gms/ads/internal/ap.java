package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.client.v;
import com.google.android.gms.ads.internal.formats.d;
import com.google.android.gms.ads.internal.util.c;

final class ap
  implements Runnable
{
  ap(an paraman, d paramd)
  {
  }

  public final void run()
  {
    try
    {
      if (this.b.d.s != null)
        this.b.d.s.a(this.a);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      c.c("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ap
 * JD-Core Version:    0.6.0
 */