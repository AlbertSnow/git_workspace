package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;

@com.google.android.gms.ads.internal.report.client.a
final class ac extends com.google.android.gms.ads.internal.util.a
{
  private final int b;

  public ac(ab paramab, int paramInt)
  {
    this.b = paramInt;
  }

  public final void a()
  {
    boolean bool1 = this.a.d.G;
    boolean bool2 = this.a.L();
    boolean bool3 = this.a.i;
    float f = this.a.j;
    int i;
    InterstitialAdParameterParcel localInterstitialAdParameterParcel;
    int j;
    if (this.a.d.G)
    {
      i = this.b;
      localInterstitialAdParameterParcel = new InterstitialAdParameterParcel(bool1, bool2, bool3, f, i);
      j = this.a.d.j.b.q();
      if (j != -1)
        break label197;
    }
    label197: for (int k = this.a.d.j.g; ; k = j)
    {
      AdOverlayInfoParcel localAdOverlayInfoParcel = new AdOverlayInfoParcel(this.a, this.a, this.a, this.a.d.j.b, k, this.a.d.e, this.a.d.j.z, localInterstitialAdParameterParcel);
      y.a.post(new ad(this, localAdOverlayInfoParcel));
      return;
      i = -1;
      break;
    }
  }

  public final void b()
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ac
 * JD-Core Version:    0.6.0
 */