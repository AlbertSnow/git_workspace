package com.wandoujia.account.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.listener.d;

final class b extends WebViewClient
{
  private b(a parama)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    a.d(this.a).setVisibility(4);
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    String str;
    if ((paramString.startsWith("http://m.wandoujia.com")) || (paramString.startsWith("https://account.wandoujia.com/sdk/close")))
    {
      str = a.a(paramString);
      if (TextUtils.isEmpty(str))
        str = a.a(this.a);
      if ((!paramString.startsWith("https://account.wandoujia.com/sdk/close")) || (TextUtils.isEmpty(str)))
        break label123;
      if (a.b(this.a) != null)
        a.b(this.a).b(a.a(paramString));
    }
    while (true)
    {
      this.a.dismiss();
      if (!a.d(this.a).isShown())
        a.d(this.a).setVisibility(0);
      super.onPageStarted(paramWebView, paramString, paramBitmap);
      return;
      label123: if ((!TextUtils.isEmpty(str)) && (!a.c(this.a)))
      {
        if (a.b(this.a) == null)
          continue;
        a.b(this.a).b(str);
        continue;
      }
      if ((!TextUtils.isEmpty(str)) || (a.b(this.a) == null))
        continue;
      a.b(this.a).a(new WandouResponse());
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
 * Qualified Name:     com.wandoujia.account.c.b
 * JD-Core Version:    0.6.0
 */