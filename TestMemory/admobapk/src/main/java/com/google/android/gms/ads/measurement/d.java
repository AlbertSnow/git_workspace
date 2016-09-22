package com.google.android.gms.ads.measurement;

import amg;
import android.os.Bundle;

final class d
  implements Runnable
{
  d(c paramc, Bundle paramBundle)
  {
  }

  public final void run()
  {
    com.google.android.gms.ads.internal.util.c.b("Start GmpConversionTrackingClientTask in background.");
    c localc = this.b;
    Bundle localBundle = this.a;
    a locala = new b(localc.a, localBundle).a;
    locala.a(new amg(locala));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.measurement.d
 * JD-Core Version:    0.6.0
 */