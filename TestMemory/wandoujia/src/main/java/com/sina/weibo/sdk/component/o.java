package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v4.app.b;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

final class o extends l
{
  private Activity b;
  private m c;
  private com.sina.weibo.sdk.auth.c d;
  private n e;

  public o(Activity paramActivity, m paramm)
  {
    this.b = paramActivity;
    this.c = paramm;
    this.e = paramm.m();
    this.d = paramm.j();
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (this.a != null)
      this.a.a();
    super.onPageFinished(paramWebView, paramString);
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if (this.a != null)
      this.a.a(paramString);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    if (this.a != null)
      this.a.a(paramInt, paramString1, paramString2);
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }

  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    boolean bool = paramString.startsWith("sinaweibo://browser/close");
    if ((paramString.startsWith("sinaweibo://browser/close")) || (paramString.startsWith("sinaweibo://browser/datatransfer")))
    {
      Bundle localBundle = b.l(paramString);
      if ((!localBundle.isEmpty()) && (this.d != null))
        this.d.a(localBundle);
      if (this.e != null)
        this.e.a(paramString);
      if (bool)
        WeiboSdkBrowser.a(this.b, this.c.k(), this.c.n());
      return true;
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.o
 * JD-Core Version:    0.6.0
 */