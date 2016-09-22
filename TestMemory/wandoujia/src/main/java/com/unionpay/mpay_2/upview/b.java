package com.unionpay.mpay_2.upview;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.unionpay.mpay.b.c;
import java.util.Timer;

public final class b extends WebView
  implements Handler.Callback
{
  private WebSettings a = null;
  private Handler b = null;
  private b.a c = null;
  private Timer d = null;

  public b(Context paramContext, b.a parama)
  {
    super(paramContext);
    this.c = parama;
    setScrollBarStyle(33554432);
    this.a = getSettings();
    this.a.setJavaScriptEnabled(true);
    setWebChromeClient(new b.b(this, 0));
    setWebViewClient(new d(this, 0));
  }

  private final void a()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = c.ab.n;
    loadData(String.format("<div align=\"center\">%s</div>", arrayOfObject), "text/html", "utf-8");
  }

  public final void a(String paramString)
  {
    Message localMessage = this.b.obtainMessage(0);
    localMessage.obj = paramString;
    this.b.sendMessage(localMessage);
  }

  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 0:
    case 3:
    case 1:
    case 2:
    }
    while (true)
    {
      return true;
      if (this.c != null)
        this.c.m();
      String str = "";
      if (paramMessage.obj != null)
        str = (String)paramMessage.obj;
      loadUrl(str);
      continue;
      a();
      if (this.c == null)
        continue;
      this.c.n();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upview.b
 * JD-Core Version:    0.6.0
 */