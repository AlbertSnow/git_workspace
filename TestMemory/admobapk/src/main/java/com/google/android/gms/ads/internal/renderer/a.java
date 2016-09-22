package com.google.android.gms.ads.internal.renderer;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.an;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.f;
import java.util.concurrent.atomic.AtomicBoolean;

@com.google.android.gms.ads.internal.report.client.a
public abstract class a
  implements an, f
{
  public final Context a;
  public final com.google.android.gms.ads.internal.webview.b b;
  public AdResponseParcel c;
  AtomicBoolean d;
  private k e;
  private com.google.android.gms.ads.internal.state.b f;
  private Runnable g;

  protected a(Context paramContext, com.google.android.gms.ads.internal.state.b paramb, com.google.android.gms.ads.internal.webview.b paramb1, k paramk)
  {
    new Object();
    this.d = new AtomicBoolean(true);
    this.a = paramContext;
    this.f = paramb;
    this.c = this.f.b;
    this.b = paramb1;
    this.e = paramk;
  }

  protected abstract void a();

  protected void a(int paramInt)
  {
    if (paramInt != -2)
      this.c = new AdResponseParcel(paramInt, this.c.k);
    this.b.e();
    k localk = this.e;
    AdRequestInfoParcel localAdRequestInfoParcel = this.f.a;
    localk.b(new com.google.android.gms.ads.internal.state.a(localAdRequestInfoParcel.c, this.b, this.c.d, paramInt, this.c.f, this.c.j, this.c.l, this.c.k, localAdRequestInfoParcel.i, this.c.h, null, null, null, null, null, this.c.i, this.f.d, this.c.g, this.f.f, this.c.n, this.c.o, this.f.h, null, this.c.C, this.c.D, this.c.E, this.c.F, this.c.G, null, this.c.J));
  }

  public final void a(com.google.android.gms.ads.internal.webview.b paramb, boolean paramBoolean)
  {
    c.b("WebView finished loading.");
    if (!this.d.getAndSet(false))
      return;
    int i = 0;
    if (paramBoolean)
      i = b();
    a(i);
    y.a.removeCallbacks(this.g);
  }

  protected int b()
  {
    return -2;
  }

  public void c()
  {
    if (!this.d.getAndSet(false))
      return;
    this.b.stopLoading();
    ad.a(this.b);
    a(-1);
    y.a.removeCallbacks(this.g);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.a
 * JD-Core Version:    0.6.0
 */