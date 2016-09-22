package com.google.android.gms.ads.internal.state;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class a
{
  public final i A;
  public boolean B = false;
  public boolean C = false;
  public final List D;
  public final AdRequestParcel a;
  public final com.google.android.gms.ads.internal.webview.b b;
  public final List c;
  public final int d;
  public final List e;
  public final List f;
  public final int g;
  public final long h;
  public final String i;
  public final JSONObject j;
  public final boolean k;
  public boolean l;
  public final boolean m;
  public final com.google.android.gms.ads.internal.mediation.b n;
  public final com.google.android.gms.ads.internal.mediation.client.e o;
  public final String p;
  public final com.google.android.gms.ads.internal.mediation.c q;
  public final com.google.android.gms.ads.internal.mediation.e r;
  public final String s;
  public final AdSizeParcel t;
  public final RewardItemParcel u;
  public final List v;
  public final List w;
  public final long x;
  public final long y;
  public final String z;

  public a(AdRequestParcel paramAdRequestParcel, com.google.android.gms.ads.internal.webview.b paramb, List paramList1, int paramInt1, List paramList2, List paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean1, com.google.android.gms.ads.internal.mediation.b paramb1, com.google.android.gms.ads.internal.mediation.client.e parame, String paramString2, com.google.android.gms.ads.internal.mediation.c paramc, com.google.android.gms.ads.internal.mediation.e parame1, long paramLong2, AdSizeParcel paramAdSizeParcel, long paramLong3, long paramLong4, long paramLong5, String paramString3, JSONObject paramJSONObject, i parami, RewardItemParcel paramRewardItemParcel, List paramList4, List paramList5, boolean paramBoolean2, AutoClickProtectionConfigurationParcel paramAutoClickProtectionConfigurationParcel, String paramString4, List paramList6)
  {
    this.a = paramAdRequestParcel;
    this.b = paramb;
    this.c = a(paramList1);
    this.d = paramInt1;
    this.e = a(paramList2);
    this.f = a(paramList3);
    this.g = paramInt2;
    this.h = paramLong1;
    this.i = paramString1;
    this.m = paramBoolean1;
    this.n = paramb1;
    this.o = parame;
    this.p = paramString2;
    this.q = paramc;
    this.r = parame1;
    this.t = paramAdSizeParcel;
    this.x = paramLong4;
    this.y = paramLong5;
    this.z = paramString3;
    this.j = paramJSONObject;
    this.A = parami;
    this.u = paramRewardItemParcel;
    this.v = a(paramList4);
    this.w = a(paramList5);
    this.k = paramBoolean2;
    this.s = paramString4;
    this.D = a(paramList6);
  }

  public a(b paramb, com.google.android.gms.ads.internal.webview.b paramb1, com.google.android.gms.ads.internal.mediation.b paramb2, com.google.android.gms.ads.internal.mediation.client.e parame, String paramString1, com.google.android.gms.ads.internal.mediation.e parame1, i parami, String paramString2)
  {
    this(paramb.a.c, null, paramb.b.d, paramb.e, paramb.b.f, paramb.b.j, paramb.b.l, paramb.b.k, paramb.a.i, paramb.b.h, null, null, null, paramb.c, null, paramb.b.i, paramb.d, paramb.b.g, paramb.f, paramb.g, paramb.b.o, paramb.h, null, paramb.b.C, paramb.b.D, paramb.b.D, paramb.b.F, paramb.b.G, null, paramb.b.J);
  }

  private static List a(List paramList)
  {
    if (paramList == null)
      return null;
    return Collections.unmodifiableList(paramList);
  }

  public final boolean a()
  {
    if ((this.b == null) || (this.b.l() == null))
      return false;
    return this.b.l().a();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.state.a
 * JD-Core Version:    0.6.0
 */