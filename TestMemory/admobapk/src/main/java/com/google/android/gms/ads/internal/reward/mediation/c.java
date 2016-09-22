package com.google.android.gms.ads.internal.reward.mediation;

import android.os.RemoteException;
import apn;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.mediation.client.e;

final class c
  implements Runnable
{
  c(a parama, e parame, AdRequestParcel paramAdRequestParcel, f paramf)
  {
  }

  public final void run()
  {
    String str1;
    try
    {
      this.a.a(apn.a(this.d.a), this.b, null, this.c, this.d.c);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      str1 = String.valueOf(this.d.b);
      if (str1.length() == 0);
    }
    for (String str2 = "Fail to initialize adapter ".concat(str1); ; str2 = new String("Fail to initialize adapter "))
    {
      com.google.android.gms.ads.internal.util.c.c(str2, localRemoteException);
      this.d.a(0);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.c
 * JD-Core Version:    0.6.0
 */