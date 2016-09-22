package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.an;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;

final class e
  implements Runnable
{
  e(c paramc, com.google.android.gms.ads.internal.util.promise.a parama)
  {
  }

  public final void run()
  {
    synchronized (this.b.b)
    {
      c localc1 = this.b;
      c localc2 = this.b;
      VersionInfoParcel localVersionInfoParcel = this.b.a.j;
      com.google.android.gms.ads.internal.util.promise.a locala = this.a;
      Context localContext = localc2.c;
      n localn;
      if (new h(localContext).a(localVersionInfoParcel))
      {
        com.google.android.gms.ads.internal.util.c.b("Fetching ad response from local ad request service.");
        localn = new n(localContext, locala, localc2);
        ((Void)localn.d());
      }
      for (Object localObject3 = localn; ; localObject3 = null)
      {
        localc1.e = ((an)localObject3);
        if (this.b.e == null)
        {
          this.b.a(0, "Could not start the ad request service.");
          y.a.removeCallbacks(this.b.d);
        }
        return;
        com.google.android.gms.ads.internal.util.c.b("Fetching ad response from remote ad request service.");
        if (com.google.android.gms.ads.internal.util.client.a.b(localContext))
          break;
        com.google.android.gms.ads.internal.util.c.e("Failed to connect to remote ad request service.");
      }
      localObject3 = new o(localContext, localVersionInfoParcel, locala, localc2);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.e
 * JD-Core Version:    0.6.0
 */