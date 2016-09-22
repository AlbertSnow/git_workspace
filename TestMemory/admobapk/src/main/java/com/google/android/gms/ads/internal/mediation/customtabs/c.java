package com.google.android.gms.ads.internal.mediation.customtabs;

import com.google.android.gms.ads.internal.overlay.ak;
import com.google.android.gms.ads.internal.util.client.e;
import com.google.android.gms.ads.mediation.g;

final class c
  implements ak
{
  c(a parama)
  {
  }

  public final void s()
  {
    e.b("AdMobCustomTabsAdapter overlay is closed.");
    this.a.c.g();
    this.a.b.a(this.a.a);
  }

  public final void t()
  {
    e.b("Opening AdMobCustomTabsAdapter overlay.");
    this.a.c.i();
  }

  public final void u()
  {
    e.b("AdMobCustomTabsAdapter overlay is paused.");
  }

  public final void v()
  {
    e.b("AdMobCustomTabsAdapter overlay is resumed.");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.customtabs.c
 * JD-Core Version:    0.6.0
 */