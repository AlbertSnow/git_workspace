package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import aod;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

@a
public final class AdRequestInfoParcel extends AbstractSafeParcelable
{
  public static final r CREATOR = new r();
  public final List A;
  public final long B;
  public final CapabilityParcel C;
  public final String D;
  public final float E;
  public final int F;
  public final int G;
  public final boolean H;
  public final boolean I;
  public final String J;
  public final boolean K;
  public final String L;
  public final boolean M;
  public final int N;
  public final Bundle O;
  public final int a;
  public final Bundle b;
  public final AdRequestParcel c;
  public final AdSizeParcel d;
  public final String e;
  public final ApplicationInfo f;
  public final PackageInfo g;
  public final String h;
  public final String i;
  public final String j;
  public final VersionInfoParcel k;
  public final Bundle l;
  public final int m;
  public final List n;
  public final Bundle o;
  public final boolean p;
  public final Messenger q;
  public final int r;
  public final int s;
  public final float t;
  public final String u;
  public final long v;
  public final String w;
  public final List x;
  public final String y;
  public final NativeAdOptionsParcel z;

  AdRequestInfoParcel(int paramInt1, Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, int paramInt2, List paramList1, Bundle paramBundle3, boolean paramBoolean1, Messenger paramMessenger, int paramInt3, int paramInt4, float paramFloat1, String paramString5, long paramLong1, String paramString6, List paramList2, String paramString7, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList3, long paramLong2, CapabilityParcel paramCapabilityParcel, String paramString8, float paramFloat2, boolean paramBoolean2, int paramInt5, int paramInt6, boolean paramBoolean3, boolean paramBoolean4, String paramString9, String paramString10, boolean paramBoolean5, int paramInt7, Bundle paramBundle4)
  {
    this.a = paramInt1;
    this.b = paramBundle1;
    this.c = paramAdRequestParcel;
    this.d = paramAdSizeParcel;
    this.e = paramString1;
    this.f = paramApplicationInfo;
    this.g = paramPackageInfo;
    this.h = paramString2;
    this.i = paramString3;
    this.j = paramString4;
    this.k = paramVersionInfoParcel;
    this.l = paramBundle2;
    this.m = paramInt2;
    this.n = paramList1;
    List localList1;
    if (paramList3 == null)
    {
      localList1 = Collections.emptyList();
      this.A = localList1;
      this.o = paramBundle3;
      this.p = paramBoolean1;
      this.q = paramMessenger;
      this.r = paramInt3;
      this.s = paramInt4;
      this.t = paramFloat1;
      this.u = paramString5;
      this.v = paramLong1;
      this.w = paramString6;
      if (paramList2 != null)
        break label278;
    }
    label278: for (List localList2 = Collections.emptyList(); ; localList2 = Collections.unmodifiableList(paramList2))
    {
      this.x = localList2;
      this.y = paramString7;
      this.z = paramNativeAdOptionsParcel;
      this.B = paramLong2;
      this.C = paramCapabilityParcel;
      this.D = paramString8;
      this.E = paramFloat2;
      this.K = paramBoolean2;
      this.F = paramInt5;
      this.G = paramInt6;
      this.H = paramBoolean3;
      this.I = paramBoolean4;
      this.J = paramString9;
      this.L = paramString10;
      this.M = paramBoolean5;
      this.N = paramInt7;
      this.O = paramBundle4;
      return;
      localList1 = Collections.unmodifiableList(paramList3);
      break;
    }
  }

  private AdRequestInfoParcel(Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, int paramInt1, List paramList1, List paramList2, Bundle paramBundle3, boolean paramBoolean1, Messenger paramMessenger, int paramInt2, int paramInt3, float paramFloat1, String paramString5, long paramLong1, String paramString6, List paramList3, String paramString7, NativeAdOptionsParcel paramNativeAdOptionsParcel, long paramLong2, CapabilityParcel paramCapabilityParcel, String paramString8, float paramFloat2, boolean paramBoolean2, int paramInt4, int paramInt5, boolean paramBoolean3, boolean paramBoolean4, String paramString9, String paramString10, boolean paramBoolean5, int paramInt6, Bundle paramBundle4)
  {
    this(18, paramBundle1, paramAdRequestParcel, paramAdSizeParcel, paramString1, paramApplicationInfo, paramPackageInfo, paramString2, paramString3, paramString4, paramVersionInfoParcel, paramBundle2, paramInt1, paramList1, paramBundle3, paramBoolean1, paramMessenger, paramInt2, paramInt3, paramFloat1, paramString5, paramLong1, paramString6, paramList3, paramString7, paramNativeAdOptionsParcel, paramList2, paramLong2, paramCapabilityParcel, paramString8, paramFloat2, paramBoolean2, paramInt4, paramInt5, paramBoolean3, paramBoolean4, paramString9, paramString10, paramBoolean5, paramInt6, paramBundle4);
  }

  public AdRequestInfoParcel(q paramq, String paramString, long paramLong)
  {
    this(paramq.a, paramq.b, paramq.c, paramq.d, paramq.e, paramq.f, paramString, paramq.g, paramq.h, paramq.j, paramq.i, paramq.k, paramq.l, paramq.m, paramq.n, paramq.o, paramq.p, paramq.q, paramq.r, paramq.s, paramq.t, paramq.u, paramq.v, paramq.w, paramq.x, paramq.y, paramLong, paramq.z, paramq.A, paramq.B, paramq.C, paramq.D, paramq.E, paramq.F, paramq.G, paramq.H, paramq.I, paramq.J, paramq.K, paramq.L);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.a(paramParcel, 3, this.c, paramInt, false);
    aod.a(paramParcel, 4, this.d, paramInt, false);
    aod.a(paramParcel, 5, this.e, false);
    aod.a(paramParcel, 6, this.f, paramInt, false);
    aod.a(paramParcel, 7, this.g, paramInt, false);
    aod.a(paramParcel, 8, this.h, false);
    aod.a(paramParcel, 9, this.i, false);
    aod.a(paramParcel, 10, this.j, false);
    aod.a(paramParcel, 11, this.k, paramInt, false);
    aod.a(paramParcel, 12, this.l, false);
    aod.a(paramParcel, 13, this.m);
    aod.a(paramParcel, 14, this.n, false);
    aod.a(paramParcel, 15, this.o, false);
    aod.a(paramParcel, 16, this.p);
    aod.a(paramParcel, 17, this.q, paramInt, false);
    aod.a(paramParcel, 18, this.r);
    aod.a(paramParcel, 19, this.s);
    aod.a(paramParcel, 20, this.t);
    aod.a(paramParcel, 21, this.u, false);
    aod.a(paramParcel, 25, this.v);
    aod.a(paramParcel, 26, this.w, false);
    aod.a(paramParcel, 27, this.x, false);
    aod.a(paramParcel, 28, this.y, false);
    aod.a(paramParcel, 29, this.z, paramInt, false);
    aod.a(paramParcel, 30, this.A, false);
    aod.a(paramParcel, 31, this.B);
    aod.a(paramParcel, 32, this.C, paramInt, false);
    aod.a(paramParcel, 33, this.D, false);
    aod.a(paramParcel, 34, this.E);
    aod.a(paramParcel, 35, this.F);
    aod.a(paramParcel, 36, this.G);
    aod.a(paramParcel, 37, this.H);
    aod.a(paramParcel, 38, this.I);
    aod.a(paramParcel, 39, this.J, false);
    aod.a(paramParcel, 40, this.K);
    aod.a(paramParcel, 41, this.L, false);
    aod.a(paramParcel, 42, this.M);
    aod.a(paramParcel, 43, this.N);
    aod.a(paramParcel, 44, this.O, false);
    aod.b(paramParcel, i1);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.AdRequestInfoParcel
 * JD-Core Version:    0.6.0
 */