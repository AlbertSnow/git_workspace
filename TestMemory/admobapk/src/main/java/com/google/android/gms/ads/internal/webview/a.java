package com.google.android.gms.ads.internal.webview;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import anw;
import com.google.android.gms.ads.internal.overlay.am;
import com.google.android.gms.ads.internal.overlay.ao;
import com.google.android.gms.ads.internal.overlay.bn;
import com.google.android.gms.ads.internal.util.y;

@com.google.android.gms.ads.internal.report.client.a
public final class a
{
  public final b a;
  public final Context b;
  public final ViewGroup c;
  public ao d;

  public a(Context paramContext, ViewGroup paramViewGroup, b paramb)
  {
    this(paramContext, paramViewGroup, paramb, null);
  }

  private a(Context paramContext, ViewGroup paramViewGroup, b paramb, ao paramao)
  {
    this.b = paramContext;
    this.c = paramViewGroup;
    this.a = paramb;
    this.d = null;
  }

  public final ao a()
  {
    anw.b("getAdVideoUnderlay must be called from the UI thread.");
    return this.d;
  }

  public final void b()
  {
    anw.b("onDestroy must be called from the UI thread.");
    if (this.d != null)
    {
      ao localao = this.d;
      bn localbn = localao.b;
      localbn.a = true;
      y.a.removeCallbacks(localbn);
      if (localao.c != null)
        localao.c.f();
      localao.i();
      this.c.removeView(this.d);
      this.d = null;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.a
 * JD-Core Version:    0.6.0
 */