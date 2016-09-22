package com.alipay.android.mini.window.sdk;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

final class bi extends WebViewClient
{
  bi(MiniWebActivity paramMiniWebActivity)
  {
  }

  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    super.onLoadResource(paramWebView, paramString);
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    MiniWebActivity.b(this.a).setEnabled(paramWebView.canGoBack());
    MiniWebActivity.c(this.a).setEnabled(paramWebView.canGoForward());
    paramWebView.loadUrl("javascript:window.local_obj.showSource('<head>'+document.getElementsByTagName('html')[0].innerHTML+'</head>');");
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    MiniWebActivity.a(this.a).setVisibility(0);
    paramWebView.loadUrl(paramString);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.bi
 * JD-Core Version:    0.6.0
 */