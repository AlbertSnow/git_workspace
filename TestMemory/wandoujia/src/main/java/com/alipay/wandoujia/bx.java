package com.alipay.wandoujia;

import android.webkit.WebView;
import android.webkit.WebViewClient;

final class bx extends WebViewClient
{
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bx
 * JD-Core Version:    0.6.0
 */