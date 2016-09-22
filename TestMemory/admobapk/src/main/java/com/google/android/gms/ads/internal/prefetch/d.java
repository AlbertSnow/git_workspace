package com.google.android.gms.ads.internal.prefetch;

import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Set;

final class d
  implements Runnable
{
  d(c paramc, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    WebView localWebView = new WebView(this.a.a);
    localWebView.getSettings().setJavaScriptEnabled(true);
    localWebView.setWebViewClient(new e(this, localWebView));
    this.a.b.add(localWebView);
    localWebView.loadDataWithBaseURL(this.b, this.c, "text/html", "UTF-8", null);
    com.google.android.gms.ads.internal.util.c.b("Fetching assets finished.");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.prefetch.d
 * JD-Core Version:    0.6.0
 */