package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;

@a
public final class q
{
  public final String A;
  public final float B;
  public final boolean C;
  public final int D;
  public final int E;
  public final boolean F;
  public final boolean G;
  public final String H;
  public final String I;
  public final boolean J;
  public final int K;
  public final Bundle L;
  public final Bundle a;
  public final AdRequestParcel b;
  public final AdSizeParcel c;
  public final String d;
  public final ApplicationInfo e;
  public final PackageInfo f;
  public final String g;
  public final String h;
  public final Bundle i;
  public final VersionInfoParcel j;
  public final int k;
  public final List l;
  public final List m;
  public final Bundle n;
  public final boolean o;
  public final Messenger p;
  public final int q;
  public final int r;
  public final float s;
  public final String t;
  public final long u;
  public final String v;
  public final List w;
  public final String x;
  public final NativeAdOptionsParcel y;
  public final CapabilityParcel z;

  public q(Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, List paramList1, List paramList2, Bundle paramBundle3, boolean paramBoolean1, Messenger paramMessenger, int paramInt1, int paramInt2, float paramFloat1, String paramString4, long paramLong, String paramString5, List paramList3, String paramString6, NativeAdOptionsParcel paramNativeAdOptionsParcel, CapabilityParcel paramCapabilityParcel, String paramString7, float paramFloat2, boolean paramBoolean2, int paramInt3, int paramInt4, boolean paramBoolean3, boolean paramBoolean4, String paramString8, String paramString9, boolean paramBoolean5, int paramInt5, Bundle paramBundle4)
  {
    this.a = paramBundle1;
    this.b = paramAdRequestParcel;
    this.c = paramAdSizeParcel;
    this.d = paramString1;
    this.e = paramApplicationInfo;
    this.f = paramPackageInfo;
    this.g = paramString2;
    this.h = paramString3;
    this.j = paramVersionInfoParcel;
    this.i = paramBundle2;
    this.o = paramBoolean1;
    this.p = paramMessenger;
    this.q = paramInt1;
    this.r = paramInt2;
    this.s = paramFloat1;
    if ((paramList1 != null) && (paramList1.size() > 0))
    {
      this.k = 3;
      this.l = paramList1;
      this.m = paramList2;
      this.n = paramBundle3;
      this.t = paramString4;
      this.u = paramLong;
      this.v = paramString5;
      this.w = paramList3;
      this.x = paramString6;
      this.y = paramNativeAdOptionsParcel;
      this.z = paramCapabilityParcel;
      this.A = paramString7;
      this.B = paramFloat2;
      this.C = paramBoolean2;
      this.D = paramInt3;
      this.E = paramInt4;
      this.F = paramBoolean3;
      this.G = paramBoolean4;
      this.H = paramString8;
      this.I = paramString9;
      this.J = paramBoolean5;
      this.K = paramInt5;
      this.L = paramBundle4;
      return;
    }
    if (paramAdSizeParcel.k);
    for (this.k = 4; ; this.k = 0)
    {
      this.l = null;
      this.m = null;
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.q
 * JD-Core Version:    0.6.0
 */