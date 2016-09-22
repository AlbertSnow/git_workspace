package com.google.android.gms.ads.internal.webview;

import com.google.android.gms.ads.internal.overlay.ab;
import com.google.android.gms.ads.internal.overlay.ae;

final class e
  implements Runnable
{
  e(c paramc)
  {
  }

  public final void run()
  {
    this.a.a.A();
    ab localab = this.a.a.i();
    if (localab != null)
    {
      localab.g.removeView(localab.c);
      localab.a(true);
    }
    if (this.a.g != null)
    {
      this.a.g.a();
      this.a.g = null;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.e
 * JD-Core Version:    0.6.0
 */