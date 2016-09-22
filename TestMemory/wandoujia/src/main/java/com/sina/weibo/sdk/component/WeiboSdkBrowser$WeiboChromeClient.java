package com.sina.weibo.sdk.component;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.sina.weibo.sdk.component.view.LoadingBar;

class WeiboSdkBrowser$WeiboChromeClient extends WebChromeClient
{
  private WeiboSdkBrowser$WeiboChromeClient(WeiboSdkBrowser paramWeiboSdkBrowser)
  {
  }

  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    WeiboSdkBrowser.a(this.this$0).a(paramInt);
    if (paramInt == 100)
    {
      WeiboSdkBrowser.a(this.this$0, false);
      this.this$0.b();
    }
    do
      return;
    while (WeiboSdkBrowser.b(this.this$0));
    WeiboSdkBrowser.a(this.this$0, true);
    this.this$0.b();
  }

  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    if (!WeiboSdkBrowser.b(WeiboSdkBrowser.c(this.this$0)))
    {
      WeiboSdkBrowser.a(this.this$0, paramString);
      WeiboSdkBrowser.d(this.this$0);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.WeiboSdkBrowser.WeiboChromeClient
 * JD-Core Version:    0.6.0
 */