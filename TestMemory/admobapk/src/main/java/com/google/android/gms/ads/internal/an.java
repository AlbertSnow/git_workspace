package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import anw;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.formats.client.ab;
import com.google.android.gms.ads.internal.formats.f;
import com.google.android.gms.ads.internal.formats.g;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.ads.internal.mediation.client.n;
import com.google.android.gms.ads.internal.mediation.client.q;
import com.google.android.gms.ads.internal.renderer.j;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import dh;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class an extends c
{
  public an(Context paramContext, m paramm, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, VersionInfoParcel paramVersionInfoParcel)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramb, paramVersionInfoParcel, paramm);
  }

  private final void a(com.google.android.gms.ads.internal.formats.d paramd)
  {
    y.a.post(new ap(this, paramd));
  }

  private final void a(com.google.android.gms.ads.internal.formats.e parame)
  {
    y.a.post(new aq(this, parame));
  }

  public final void E()
  {
    throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
  }

  public final void a(com.google.android.gms.ads.internal.customrenderedad.client.d paramd)
  {
    throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
  }

  public final void a(com.google.android.gms.ads.internal.purchase.client.d paramd)
  {
    throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
  }

  public final void a(com.google.android.gms.ads.internal.state.b paramb, l paraml)
  {
    if (paramb.d != null)
      this.d.i = paramb.d;
    if (paramb.e != -2)
    {
      y.a.post(new ao(this, paramb));
      return;
    }
    this.d.E = 0;
    bd localbd = this.d;
    localbd.h = j.a(this.d.c, this, paramb, this.d.d, null, this.h, this, paraml);
    String str1 = String.valueOf(this.d.h.getClass().getName());
    if (str1.length() != 0);
    for (String str2 = "AdRenderer: ".concat(str1); ; str2 = new String("AdRenderer: "))
    {
      com.google.android.gms.ads.internal.util.c.b(str2);
      return;
    }
  }

  public final void a(List paramList)
  {
    anw.b("setNativeTemplates must be called on the main UI thread.");
    this.d.A = paramList;
  }

  protected final boolean a(AdRequestParcel paramAdRequestParcel, com.google.android.gms.ads.internal.state.a parama, boolean paramBoolean)
  {
    return this.c.b;
  }

  protected final boolean a(com.google.android.gms.ads.internal.state.a parama1, com.google.android.gms.ads.internal.state.a parama2)
  {
    a(null);
    if (!this.d.c())
      throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    if (parama2.m);
    while (true)
    {
      try
      {
        if (parama2.o == null)
          continue;
        n localn = parama2.o.h();
        if (parama2.o == null)
          continue;
        q localq = parama2.o.i();
        if ((localn == null) || (this.d.s == null))
          continue;
        String str4 = localn.a();
        List localList2 = localn.b();
        String str5 = localn.c();
        com.google.android.gms.ads.internal.formats.client.a locala3 = localn.d();
        com.google.android.gms.ads.internal.formats.client.a locala4 = null;
        if (locala3 == null)
          continue;
        locala4 = localn.d();
        com.google.android.gms.ads.internal.formats.d locald = new com.google.android.gms.ads.internal.formats.d(str4, localList2, str5, locala4, localn.e(), localn.f(), localn.g(), localn.h(), null, localn.l());
        locald.a(new g(this.d.c, this, this.d.d, localn));
        a(locald);
        return super.a(parama1, parama2);
        localn = null;
        continue;
        localq = null;
        continue;
        if ((localq == null) || (this.d.t == null))
          continue;
        String str2 = localq.a();
        List localList1 = localq.b();
        String str3 = localq.c();
        com.google.android.gms.ads.internal.formats.client.a locala1 = localq.d();
        com.google.android.gms.ads.internal.formats.client.a locala2 = null;
        if (locala1 == null)
          continue;
        locala2 = localq.d();
        com.google.android.gms.ads.internal.formats.e locale = new com.google.android.gms.ads.internal.formats.e(str2, localList1, str3, locala2, localq.e(), localq.f(), null, localq.j());
        locale.a(new g(this.d.c, this, this.d.d, localq));
        a(locale);
        continue;
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.c.c("Failed to get native ad mapper", localRemoteException);
        continue;
        com.google.android.gms.ads.internal.util.c.e("No matching mapper/listener for retrieved native ad template.");
        a(0);
        return false;
      }
      i locali = parama2.A;
      if (((locali instanceof com.google.android.gms.ads.internal.formats.e)) && (this.d.t != null))
      {
        a((com.google.android.gms.ads.internal.formats.e)parama2.A);
        continue;
      }
      if (((locali instanceof com.google.android.gms.ads.internal.formats.d)) && (this.d.s != null))
      {
        a((com.google.android.gms.ads.internal.formats.d)parama2.A);
        continue;
      }
      if ((!(locali instanceof f)) || (this.d.v == null) || (this.d.v.get(((f)locali).k()) == null))
        break;
      String str1 = ((f)locali).k();
      y.a.post(new ar(this, str1, parama2));
    }
    com.google.android.gms.ads.internal.util.c.e("No matching listener for retrieved native ad template.");
    a(0);
    return false;
  }

  public final ab b(String paramString)
  {
    anw.b("getOnCustomClickListener must be called on the main UI thread.");
    return (ab)this.d.u.get(paramString);
  }

  public final void h()
  {
    throw new IllegalStateException("Native Ad DOES NOT support pause().");
  }

  public final void i()
  {
    throw new IllegalStateException("Native Ad DOES NOT support resume().");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.an
 * JD-Core Version:    0.6.0
 */