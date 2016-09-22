package com.google.android.gms.ads.internal.renderer;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.ad;

@com.google.android.gms.ads.internal.report.client.a
public final class e extends a
{
  private c e;

  e(Context paramContext, com.google.android.gms.ads.internal.state.b paramb, com.google.android.gms.ads.internal.webview.b paramb1, k paramk)
  {
    super(paramContext, paramb, paramb1, paramk);
  }

  protected final void a()
  {
    AdSizeParcel localAdSizeParcel = this.b.k();
    int i;
    int j;
    AdResponseParcel localAdResponseParcel;
    com.google.android.gms.ads.internal.webview.b localb;
    if (localAdSizeParcel.e)
    {
      DisplayMetrics localDisplayMetrics = this.a.getResources().getDisplayMetrics();
      i = localDisplayMetrics.widthPixels;
      j = localDisplayMetrics.heightPixels;
      this.e = new c(this, this.b, i, j);
      this.b.l().e = this;
      c localc = this.e;
      localAdResponseParcel = this.c;
      ad localad = new ad(localc, localc.e, localAdResponseParcel.q);
      localc.e.setWebViewClient(localad);
      localb = localc.e;
      if (!TextUtils.isEmpty(localAdResponseParcel.b))
        break label171;
    }
    label171: for (String str = null; ; str = y.a(localAdResponseParcel.b))
    {
      localb.loadDataWithBaseURL(str, localAdResponseParcel.c, "text/html", "UTF-8", null);
      return;
      i = localAdSizeParcel.g;
      j = localAdSizeParcel.d;
      break;
    }
  }

  protected final int b()
  {
    if (this.e.b())
    {
      com.google.android.gms.ads.internal.util.c.b("Ad-Network indicated no fill with passback URL.");
      return 3;
    }
    if (!this.e.f)
      return 2;
    return -2;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.e
 * JD-Core Version:    0.6.0
 */