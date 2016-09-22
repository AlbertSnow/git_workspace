package com.tencent.open.yyb;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

class AppbarActivity$c extends WebChromeClient
{
  private AppbarActivity$c(AppbarActivity paramAppbarActivity)
  {
  }

  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    AppbarActivity.a(this.a).setTitle(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.AppbarActivity.c
 * JD-Core Version:    0.6.0
 */