package com.unionpay.mpay_2.upview;

import android.os.Handler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

final class b$b extends WebChromeClient
{
  private b$b(b paramb)
  {
  }

  public final void onProgressChanged(WebView paramWebView, int paramInt)
  {
    if (paramInt == 100)
      b.a(this.a).sendEmptyMessage(1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upview.b.b
 * JD-Core Version:    0.6.0
 */