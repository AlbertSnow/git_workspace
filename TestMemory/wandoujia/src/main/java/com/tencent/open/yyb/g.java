package com.tencent.open.yyb;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.open.a.f;

final class g extends WebViewClient
{
  private g(AppbarActivity paramAppbarActivity)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    AppbarActivity.a(this.a, true);
    AppbarActivity.b(this.a).a("readyCallback", 1, "true");
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    AppbarActivity.a(this.a, false);
    if (!paramString.startsWith("http"))
      paramString.startsWith("https");
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    f.a("openSDK_LOG.AppbarActivity", "-->(AppbarDialog)shouldOverrideUrlLoading : url = " + paramString);
    if (TextUtils.isEmpty(paramString));
    do
    {
      return false;
      if ((paramString.startsWith("http")) || (paramString.startsWith("https")))
        return super.shouldOverrideUrlLoading(paramWebView, paramString);
      if (!paramString.startsWith("jsb://"))
        continue;
      AppbarActivity.b(this.a).a(paramString);
      return true;
    }
    while (((!paramString.equals("about:blank;")) && (!paramString.equals("about:blank"))) || (Build.VERSION.SDK_INT >= 11));
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.g
 * JD-Core Version:    0.6.0
 */