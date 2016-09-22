package com.google.android.gms.ads.internal.appcontent;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

final class f
  implements Runnable
{
  private ValueCallback e = new g(this);

  f(d paramd, a parama, WebView paramWebView, boolean paramBoolean)
  {
  }

  public final void run()
  {
    if (this.b.getSettings().getJavaScriptEnabled());
    try
    {
      this.b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.e);
      return;
    }
    catch (Throwable localThrowable)
    {
      this.e.onReceiveValue("");
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.f
 * JD-Core Version:    0.6.0
 */