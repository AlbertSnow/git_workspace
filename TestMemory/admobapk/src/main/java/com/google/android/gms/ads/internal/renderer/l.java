package com.google.android.gms.ads.internal.renderer;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.f;

@com.google.android.gms.ads.internal.report.client.a
public class l extends a
  implements f
{
  l(Context paramContext, com.google.android.gms.ads.internal.state.b paramb, com.google.android.gms.ads.internal.webview.b paramb1, k paramk)
  {
    super(paramContext, paramb, paramb1, paramk);
  }

  protected final void a()
  {
    if (this.c.e != -2)
      return;
    this.b.l().e = this;
    e();
    c.b("Loading HTML in WebView.");
    com.google.android.gms.ads.internal.webview.b localb = this.b;
    localb.loadDataWithBaseURL(y.a(this.c.b), this.c.c, "text/html", "UTF-8", null);
  }

  protected void e()
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.l
 * JD-Core Version:    0.6.0
 */