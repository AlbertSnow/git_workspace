package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.sina.weibo.sdk.exception.WeiboAuthException;

final class b extends l
{
  private Activity b;
  private a c;
  private com.sina.weibo.sdk.auth.c d;
  private boolean e = false;

  public b(Activity paramActivity, a parama)
  {
    this.b = paramActivity;
    this.c = parama;
    this.d = this.c.b();
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
    if ((paramString.startsWith(this.c.a().b())) && (!this.e))
    {
      this.e = true;
      Bundle localBundle = android.support.v4.app.b.k(paramString);
      String str1 = localBundle.getString("error");
      String str2 = localBundle.getString("error_code");
      String str3 = localBundle.getString("error_description");
      if ((str1 == null) && (str2 == null))
        if (this.d != null)
          this.d.a(localBundle);
      while (true)
      {
        paramWebView.stopLoading();
        WeiboSdkBrowser.a(this.b, this.c.c(), null);
        return;
        if (this.d == null)
          continue;
        this.d.a(new WeiboAuthException(str2, str1, str3));
      }
    }
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
    if (paramString.startsWith("sms:"))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.putExtra("address", paramString.replace("sms:", ""));
      localIntent.setType("vnd.android-dir/mms-sms");
      this.b.startActivity(localIntent);
      return true;
    }
    if (paramString.startsWith("sinaweibo://browser/close"))
    {
      if (this.d != null)
        this.d.a();
      WeiboSdkBrowser.a(this.b, this.c.c(), null);
      return true;
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.b
 * JD-Core Version:    0.6.0
 */