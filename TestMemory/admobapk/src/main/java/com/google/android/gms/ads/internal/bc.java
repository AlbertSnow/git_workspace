package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import aom;
import aon;
import com.google.android.gms.ads.internal.config.i;
import com.google.android.gms.ads.internal.csi.d;
import com.google.android.gms.ads.internal.gmsg.aq;
import com.google.android.gms.ads.internal.interstitial.ac;
import com.google.android.gms.ads.internal.overlay.ai;
import com.google.android.gms.ads.internal.overlay.be;
import com.google.android.gms.ads.internal.request.service.t;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.bf;
import com.google.android.gms.ads.internal.util.y;

@com.google.android.gms.ads.internal.report.client.a
public final class bc
{
  private static bc A;
  private static final Object z = new Object();
  final com.google.android.gms.ads.internal.request.a a = new com.google.android.gms.ads.internal.request.a();
  public final com.google.android.gms.ads.internal.overlay.r b = new com.google.android.gms.ads.internal.overlay.r();
  public final ai c = new ai();
  public final com.google.android.gms.ads.internal.renderer.j d = new com.google.android.gms.ads.internal.renderer.j();
  public final y e = new y();
  public final com.google.android.gms.ads.internal.webview.j f = new com.google.android.gms.ads.internal.webview.j();
  public final ad g = ad.a(Build.VERSION.SDK_INT);
  public final h h = new h(this.e);
  public final aom i = new aon();
  public final d j = new d();
  public final t k = new t();
  public final com.google.android.gms.ads.internal.config.j l = new com.google.android.gms.ads.internal.config.j();
  public final i m = new i();
  public final com.google.android.gms.ads.internal.config.k n = new com.google.android.gms.ads.internal.config.k();
  public final com.google.android.gms.ads.internal.purchase.k o = new com.google.android.gms.ads.internal.purchase.k();
  public final ac p = new ac();
  public final com.google.android.gms.ads.internal.util.bd q = new com.google.android.gms.ads.internal.util.bd();
  public final com.google.android.gms.ads.internal.overlay.bd r = new com.google.android.gms.ads.internal.overlay.bd();
  public final be s = new be();
  public final com.google.android.gms.ads.internal.mediation.k t = new com.google.android.gms.ads.internal.mediation.k();
  public final bf u = new bf();
  final r v = new r();
  public final am w = new am();
  public final aq x = new aq();
  public final com.google.android.gms.ads.internal.util.weaklisteners.a y = new com.google.android.gms.ads.internal.util.weaklisteners.a();

  static
  {
    bc localbc = new bc();
    synchronized (z)
    {
      A = localbc;
      return;
    }
  }

  public static bc a()
  {
    synchronized (z)
    {
      bc localbc = A;
      return localbc;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.bc
 * JD-Core Version:    0.6.0
 */