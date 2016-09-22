package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.client.ae;
import com.google.android.gms.ads.internal.formats.f;
import com.google.android.gms.ads.internal.state.a;
import com.google.android.gms.ads.internal.util.c;
import dh;

final class ar
  implements Runnable
{
  ar(an paraman, String paramString, a parama)
  {
  }

  public final void run()
  {
    try
    {
      ((ae)this.c.d.v.get(this.a)).a((f)this.b.A);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      c.c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ar
 * JD-Core Version:    0.6.0
 */