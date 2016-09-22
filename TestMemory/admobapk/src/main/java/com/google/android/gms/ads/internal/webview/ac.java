package com.google.android.gms.ads.internal.webview;

import android.annotation.TargetApi;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.google.android.gms.ads.internal.report.client.a;

@a
@TargetApi(14)
public final class ac extends t
{
  public ac(b paramb)
  {
    super(paramb);
  }

  public final void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    a(paramView, paramInt, paramCustomViewCallback);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.ac
 * JD-Core Version:    0.6.0
 */