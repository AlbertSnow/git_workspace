package com.unionpay.mpay_2.upview;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Timer;
import java.util.TimerTask;

final class e extends TimerTask
{
  e(d paramd, WebView paramWebView)
  {
  }

  public final void run()
  {
    if (this.a.getProgress() < 100)
    {
      b.a(this.b.a).sendEmptyMessage(3);
      b.b(this.b.a).cancel();
      b.b(this.b.a).purge();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upview.e
 * JD-Core Version:    0.6.0
 */