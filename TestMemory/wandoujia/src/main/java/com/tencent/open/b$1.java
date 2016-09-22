package com.tencent.open;

import android.os.Build.VERSION;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.tencent.open.a.f;

class b$1 extends WebChromeClient
{
  public void onConsoleMessage(String paramString1, int paramInt, String paramString2)
  {
    f.c("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + paramString1 + " -- From 222 line " + paramInt + " of " + paramString2);
    if (Build.VERSION.SDK_INT == 7)
      this.a.a(paramString1);
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    if (paramConsoleMessage == null)
      return false;
    f.c("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + paramConsoleMessage.message() + " -- From  111 line " + paramConsoleMessage.lineNumber() + " of " + paramConsoleMessage.sourceId());
    h localh;
    if (Build.VERSION.SDK_INT > 7)
    {
      localh = this.a;
      if (paramConsoleMessage != null)
        break label81;
    }
    label81: for (String str = ""; ; str = paramConsoleMessage.message())
    {
      localh.a(str);
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.b.1
 * JD-Core Version:    0.6.0
 */