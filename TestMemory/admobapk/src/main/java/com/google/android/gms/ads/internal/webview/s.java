package com.google.android.gms.ads.internal.webview;

import android.net.Uri;

final class s
  implements Runnable
{
  s(r paramr, String paramString)
  {
  }

  public final void run()
  {
    c localc = this.b.a.l();
    if (localc == null)
    {
      com.google.android.gms.ads.internal.util.c.c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
      return;
    }
    localc.a(Uri.parse(this.a));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.s
 * JD-Core Version:    0.6.0
 */