package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import anw;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;

@com.google.android.gms.ads.internal.report.client.a
public class g extends c
  implements com.google.android.gms.ads.internal.mraid.n, v
{
  public g(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, VersionInfoParcel paramVersionInfoParcel, m paramm)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramb, paramVersionInfoParcel, paramm);
  }

  public final void H()
  {
    e();
  }

  public final void I()
  {
    C();
    g();
  }

  public final void J()
  {
    o();
  }

  public final void K()
  {
    m();
  }

  protected com.google.android.gms.ads.internal.webview.b a(com.google.android.gms.ads.internal.state.b paramb, n paramn, com.google.android.gms.ads.internal.safebrowsing.m paramm)
  {
    View localView = this.d.f.getNextView();
    boolean bool = localView instanceof com.google.android.gms.ads.internal.webview.b;
    com.google.android.gms.ads.internal.webview.b localb1 = null;
    if (bool)
    {
      localb1 = (com.google.android.gms.ads.internal.webview.b)localView;
      com.google.android.gms.ads.internal.config.d locald = com.google.android.gms.ads.internal.config.m.L;
      if (!((Boolean)bc.a().n.a(locald)).booleanValue())
        break label233;
      com.google.android.gms.ads.internal.util.c.b("Reusing webview...");
      localb1.a(this.d.c, this.d.i, this.a);
    }
    while (true)
    {
      if (localb1 == null)
      {
        if (localView != null)
          this.d.f.removeView(localView);
        localb1 = com.google.android.gms.ads.internal.webview.j.a(this.d.c, this.d.i, false, false, this.d.d, this.d.e, this.a, this, this.g);
        if (this.d.i.h == null)
          a(localb1.b());
      }
      com.google.android.gms.ads.internal.webview.b localb2 = localb1;
      localb2.l().a(this, this, this, this, false, this, null, paramn, this, paramm);
      a(localb2);
      localb2.b(paramb.a.w);
      return localb2;
      label233: localb1.destroy();
      localb1 = null;
    }
  }

  public final void a(com.google.android.gms.ads.internal.customrenderedad.client.d paramd)
  {
    anw.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
    this.d.y = paramd;
  }

  protected final void a(ak paramak)
  {
    paramak.a("/trackActiveViewUnit", new h(this));
  }

  protected void a(com.google.android.gms.ads.internal.state.b paramb, l paraml)
  {
    if (paramb.e != -2)
    {
      y.a.post(new i(this, paramb));
      return;
    }
    if (paramb.d != null)
      this.d.i = paramb.d;
    if ((paramb.b.h) && (!paramb.b.B))
    {
      this.d.E = 0;
      bd localbd = this.d;
      localbd.h = com.google.android.gms.ads.internal.renderer.j.a(this.d.c, this, paramb, this.d.d, null, this.h, this, paraml);
      return;
    }
    com.google.android.gms.ads.internal.config.d locald = com.google.android.gms.ads.internal.config.m.aN;
    boolean bool = ((Boolean)bc.a().n.a(locald)).booleanValue();
    com.google.android.gms.ads.internal.safebrowsing.m localm = null;
    if (bool)
      localm = this.g.d.a(this.d.c, paramb.b);
    y.a.post(new j(this, paramb, localm, paraml));
  }

  protected boolean a(com.google.android.gms.ads.internal.state.a parama1, com.google.android.gms.ads.internal.state.a parama2)
  {
    if ((this.d.c()) && (this.d.f != null))
      this.d.f.a.b = parama2.z;
    return super.a(parama1, parama2);
  }

  public final void b(View paramView)
  {
    this.d.D = paramView;
    b(new com.google.android.gms.ads.internal.state.a(this.d.k, null, null, null, null, null, null, null));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.g
 * JD-Core Version:    0.6.0
 */