package com.unionpay.mpay_2.upview;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Timer;

final class d extends WebViewClient
{
  private d(b paramb)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    b.b(this.a).cancel();
    b.b(this.a).purge();
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    b.a(this.a, new Timer());
    e locale = new e(this, paramWebView);
    b.b(this.a).schedule(locale, 15000L);
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    b.c(this.a);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upview.d
 * JD-Core Version:    0.6.0
 */