package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.purchase.client.p;

final class d
  implements Runnable
{
  d(c paramc, g paramg, Intent paramIntent)
  {
  }

  public final void run()
  {
    try
    {
      if (this.c.c.a(this.a.b, this.b))
      {
        this.c.b.a(new h(this.c.a, this.a.c, true, -1, this.b, this.a));
        return;
      }
      this.c.b.a(new h(this.c.a, this.a.c, false, -1, this.b, this.a));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.e("Fail to verify and dispatch pending transaction");
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.d
 * JD-Core Version:    0.6.0
 */