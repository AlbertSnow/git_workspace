package com.google.android.gms.ads.internal.prefetch;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Set;

final class e extends WebViewClient
{
  e(d paramd, WebView paramWebView)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    com.google.android.gms.ads.internal.util.c.b("Loading assets have finished");
    this.b.a.b.remove(this.a);
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    com.google.android.gms.ads.internal.util.c.e("Loading assets have failed.");
    this.b.a.b.remove(this.a);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.prefetch.e
 * JD-Core Version:    0.6.0
 */