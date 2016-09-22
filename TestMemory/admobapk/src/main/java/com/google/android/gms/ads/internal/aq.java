package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.client.y;
import com.google.android.gms.ads.internal.formats.e;
import com.google.android.gms.ads.internal.util.c;

final class aq
  implements Runnable
{
  aq(an paraman, e parame)
  {
  }

  public final void run()
  {
    try
    {
      if (this.b.d.t != null)
        this.b.d.t.a(this.a);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      c.c("Could not call OnContentAdLoadedListener.onContentAdLoaded().", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.aq
 * JD-Core Version:    0.6.0
 */