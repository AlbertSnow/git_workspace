package com.google.android.gms.ads.internal.config;

import ahw;
import android.content.Context;
import com.google.android.gms.ads.internal.bc;
import java.util.concurrent.Callable;

final class n
  implements Callable
{
  n(Context paramContext)
  {
  }

  private Void a()
  {
    k localk = bc.a().n;
    Context localContext1 = this.a;
    Context localContext2;
    synchronized (localk.a)
    {
      if (localk.b)
        break label80;
      localContext2 = ahw.d(localContext1);
      if (localContext2 != null);
    }
    localk.c = localContext2.getSharedPreferences("google_ads_flags", 1);
    localk.b = true;
    monitorexit;
    label80: return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.config.n
 * JD-Core Version:    0.6.0
 */