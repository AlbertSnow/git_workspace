package com.google.android.gms.ads.internal.webview;

import android.annotation.TargetApi;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import gv;
import ha;

@a
@TargetApi(17)
public final class r
{
  final b a;

  public r(b paramb)
  {
    this.a = paramb;
  }

  @JavascriptInterface
  public final String getClickSignals(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      c.a("Click string is empty, not proceeding.");
      return "";
    }
    ha localha = this.a.n();
    if (localha == null)
    {
      c.a("Signal utils is empty, ignoring.");
      return "";
    }
    gv localgv = localha.e;
    if (localgv == null)
    {
      c.a("Signals object is empty, ignoring.");
      return "";
    }
    if (this.a.getContext() == null)
    {
      c.a("Context is null, ignoring.");
      return "";
    }
    return localgv.a(this.a.getContext(), paramString);
  }

  @JavascriptInterface
  public final void notify(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      c.e("URL is empty, ignoring message");
      return;
    }
    y.a.post(new s(this, paramString));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.r
 * JD-Core Version:    0.6.0
 */