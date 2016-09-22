package com.alipay.android.mini.window.sdk;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

class u extends WebChromeClient
{
  u(MiniWebActivity paramMiniWebActivity)
  {
  }

  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    MiniWebActivity.a(this.a).setSecondaryProgress(paramInt);
    if (paramInt == 100)
      MiniWebActivity.a(this.a).setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.u
 * JD-Core Version:    0.6.0
 */