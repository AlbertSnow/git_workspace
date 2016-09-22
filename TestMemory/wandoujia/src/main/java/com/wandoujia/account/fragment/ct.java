package com.wandoujia.account.fragment;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

final class ct extends WebViewClient
{
  private ct(WebViewFragment paramWebViewFragment)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (this.a.o == null)
      WebViewFragment.b(this.a).setVisibility(4);
    while (true)
    {
      super.onPageFinished(paramWebView, paramString);
      return;
      this.a.o.b(paramWebView);
    }
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if ((paramString.equals("https://account.wandoujia.com/sdk/close")) || (paramString.endsWith("sdk/close")))
      WebViewFragment.a(this.a);
    if (this.a.o == null)
      if (!WebViewFragment.b(this.a).isShown())
        WebViewFragment.b(this.a).setVisibility(0);
    while (true)
    {
      super.onPageStarted(paramWebView, paramString, paramBitmap);
      return;
    }
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    new StringBuilder("errorCode=").append(paramInt).append(" description= ").append(paramString1).append("  failingUrl= ").append(paramString2);
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }

  @TargetApi(8)
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    paramSslErrorHandler.proceed();
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ct
 * JD-Core Version:    0.6.0
 */