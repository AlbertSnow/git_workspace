package com.tencent.open;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

public final class g
{
  private WeakReference<WebView> a;
  private long b;

  public g(WebView paramWebView)
  {
    this.a = new WeakReference(paramWebView);
    this.b = 4L;
  }

  public final void a()
  {
    WebView localWebView = (WebView)this.a.get();
    if (localWebView == null)
      return;
    localWebView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.b + ",{'r':0,'result':" + "'undefined'" + "});");
  }

  public final void b()
  {
    WebView localWebView = (WebView)this.a.get();
    if (localWebView == null)
      return;
    localWebView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.b + ",{'r':1,'result':'no such method'})");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.g
 * JD-Core Version:    0.6.0
 */