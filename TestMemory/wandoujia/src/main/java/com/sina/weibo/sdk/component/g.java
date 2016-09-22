package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

final class g extends l
{
  private Activity b;
  private e c;
  private com.sina.weibo.sdk.auth.c d;

  public g(Activity paramActivity, e parame)
  {
    this.b = paramActivity;
    this.c = parame;
    this.d = parame.c();
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
    e.a(this.b, paramString1);
    WeiboSdkBrowser.a(this.b, this.c.h(), null);
  }

  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    paramSslErrorHandler.cancel();
    e.a(this.b, "ReceivedSslError");
    WeiboSdkBrowser.a(this.b, this.c.h(), null);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString.startsWith("sinaweibo://browser/close"))
    {
      Bundle localBundle = b.l(paramString);
      if ((!localBundle.isEmpty()) && (this.d != null))
        this.d.a(localBundle);
      String str1 = localBundle.getString("code");
      String str2 = localBundle.getString("msg");
      if (TextUtils.isEmpty(str1))
        e.b(this.b);
      while (true)
      {
        WeiboSdkBrowser.a(this.b, this.c.h(), null);
        return true;
        if (!"0".equals(str1))
        {
          e.a(this.b, str2);
          continue;
        }
        e.c(this.b);
      }
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.g
 * JD-Core Version:    0.6.0
 */