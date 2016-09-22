package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;

@a
public final class af
{
  public final int a;
  public final ViewGroup.LayoutParams b;
  public final ViewGroup c;
  public final Context d;

  public af(b paramb)
  {
    this.b = paramb.getLayoutParams();
    ViewParent localViewParent = paramb.getParent();
    this.d = paramb.g();
    if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
    {
      this.c = ((ViewGroup)localViewParent);
      this.a = this.c.indexOfChild(paramb.b());
      this.c.removeView(paramb.b());
      paramb.a(true);
      return;
    }
    throw new ad("Could not get the parent of the WebView for an overlay.");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.af
 * JD-Core Version:    0.6.0
 */