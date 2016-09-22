package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.text.TextUtils;
import aod;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

@a
public final class AdResponseParcel extends AbstractSafeParcelable
{
  public static final t CREATOR = new t();
  public final boolean A;
  public final boolean B;
  public final RewardItemParcel C;
  public final List D;
  public final List E;
  public final boolean F;
  public final AutoClickProtectionConfigurationParcel G;
  public final boolean H;
  public String I;
  public final List J;
  public final String K;
  public final boolean L;
  public final String M;
  private AdRequestInfoParcel N;
  public final int a;
  public final String b;
  public String c;
  public final List d;
  public final int e;
  public final List f;
  public final long g;
  public final boolean h;
  public final long i;
  public final List j;
  public final long k;
  public final int l;
  public final String m;
  public final long n;
  public final String o;
  public final boolean p;
  public final String q;
  public final String r;
  public final boolean s;
  public final boolean t;
  public final boolean u;
  public final boolean v;
  public final boolean w;
  public LargeParcelTeleporter x;
  public String y;
  public final String z;

  public AdResponseParcel(int paramInt)
  {
    this(18, null, null, null, paramInt, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, null, false, null);
  }

  public AdResponseParcel(int paramInt, long paramLong)
  {
    this(18, null, null, null, paramInt, null, -1L, false, -1L, null, paramLong, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, null, false, null);
  }

  AdResponseParcel(int paramInt1, String paramString1, String paramString2, List paramList1, int paramInt2, List paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List paramList3, long paramLong3, int paramInt3, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, LargeParcelTeleporter paramLargeParcelTeleporter, String paramString7, String paramString8, boolean paramBoolean8, boolean paramBoolean9, RewardItemParcel paramRewardItemParcel, List paramList4, List paramList5, boolean paramBoolean10, AutoClickProtectionConfigurationParcel paramAutoClickProtectionConfigurationParcel, boolean paramBoolean11, String paramString9, List paramList6, String paramString10, boolean paramBoolean12, String paramString11)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    List localList1;
    List localList2;
    if (paramList1 != null)
    {
      localList1 = Collections.unmodifiableList(paramList1);
      this.d = localList1;
      this.e = paramInt2;
      if (paramList2 == null)
        break label332;
      localList2 = Collections.unmodifiableList(paramList2);
      label55: this.f = localList2;
      this.g = paramLong1;
      this.h = paramBoolean1;
      this.i = paramLong2;
      if (paramList3 == null)
        break label338;
    }
    label332: label338: for (List localList3 = Collections.unmodifiableList(paramList3); ; localList3 = null)
    {
      this.j = localList3;
      this.k = paramLong3;
      this.l = paramInt3;
      this.m = paramString3;
      this.n = paramLong4;
      this.o = paramString4;
      this.p = paramBoolean2;
      this.q = paramString5;
      this.r = paramString6;
      this.s = paramBoolean3;
      this.t = paramBoolean4;
      this.u = paramBoolean5;
      this.v = paramBoolean6;
      this.w = paramBoolean7;
      this.x = paramLargeParcelTeleporter;
      this.y = paramString7;
      this.z = paramString8;
      if ((this.c == null) && (this.x != null))
      {
        StringParcel localStringParcel = (StringParcel)this.x.a(StringParcel.CREATOR);
        if ((localStringParcel != null) && (!TextUtils.isEmpty(localStringParcel.b)))
          this.c = localStringParcel.b;
      }
      this.A = paramBoolean8;
      this.B = paramBoolean9;
      this.C = paramRewardItemParcel;
      this.D = paramList4;
      this.E = paramList5;
      this.F = paramBoolean10;
      this.G = paramAutoClickProtectionConfigurationParcel;
      this.H = paramBoolean11;
      this.I = paramString9;
      this.J = paramList6;
      this.K = paramString10;
      this.L = paramBoolean12;
      this.M = paramString11;
      return;
      localList1 = null;
      break;
      localList2 = null;
      break label55;
    }
  }

  public AdResponseParcel(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString1, String paramString2, List paramList1, List paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List paramList3, long paramLong3, int paramInt, String paramString3, long paramLong4, String paramString4, String paramString5, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, String paramString6, boolean paramBoolean7, boolean paramBoolean8, RewardItemParcel paramRewardItemParcel, List paramList4, List paramList5, boolean paramBoolean9, AutoClickProtectionConfigurationParcel paramAutoClickProtectionConfigurationParcel, boolean paramBoolean10, String paramString7, List paramList6, String paramString8, boolean paramBoolean11, String paramString9)
  {
    this(18, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, -1L, paramList3, paramLong3, paramInt, paramString3, paramLong4, paramString4, false, null, paramString5, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, false, null, null, paramString6, paramBoolean7, paramBoolean8, paramRewardItemParcel, paramList4, paramList5, paramBoolean9, paramAutoClickProtectionConfigurationParcel, paramBoolean10, paramString7, paramList6, paramString8, paramBoolean11, paramString9);
    this.N = paramAdRequestInfoParcel;
  }

  public AdResponseParcel(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString1, String paramString2, List paramList1, List paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List paramList3, long paramLong3, int paramInt, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, String paramString7, boolean paramBoolean8, boolean paramBoolean9, RewardItemParcel paramRewardItemParcel, List paramList4, List paramList5, boolean paramBoolean10, AutoClickProtectionConfigurationParcel paramAutoClickProtectionConfigurationParcel, boolean paramBoolean11, String paramString8, List paramList6, String paramString9, boolean paramBoolean12, String paramString10)
  {
    this(18, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, paramLong2, paramList3, paramLong3, paramInt, paramString3, paramLong4, paramString4, paramBoolean2, paramString5, paramString6, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramBoolean7, null, null, paramString7, paramBoolean8, paramBoolean9, paramRewardItemParcel, paramList4, paramList5, paramBoolean10, paramAutoClickProtectionConfigurationParcel, paramBoolean11, paramString8, paramList6, paramString9, paramBoolean12, paramString10);
    this.N = paramAdRequestInfoParcel;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if ((this.N != null) && (this.N.a >= 9) && (!TextUtils.isEmpty(this.c)))
    {
      this.x = new LargeParcelTeleporter(new StringParcel(this.c));
      this.c = null;
    }
    int i1 = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.a(paramParcel, 3, this.c, false);
    aod.a(paramParcel, 4, this.d, false);
    aod.a(paramParcel, 5, this.e);
    aod.a(paramParcel, 6, this.f, false);
    aod.a(paramParcel, 7, this.g);
    aod.a(paramParcel, 8, this.h);
    aod.a(paramParcel, 9, this.i);
    aod.a(paramParcel, 10, this.j, false);
    aod.a(paramParcel, 11, this.k);
    aod.a(paramParcel, 12, this.l);
    aod.a(paramParcel, 13, this.m, false);
    aod.a(paramParcel, 14, this.n);
    aod.a(paramParcel, 15, this.o, false);
    aod.a(paramParcel, 18, this.p);
    aod.a(paramParcel, 19, this.q, false);
    aod.a(paramParcel, 21, this.r, false);
    aod.a(paramParcel, 22, this.s);
    aod.a(paramParcel, 23, this.t);
    aod.a(paramParcel, 24, this.u);
    aod.a(paramParcel, 25, this.v);
    aod.a(paramParcel, 26, this.w);
    aod.a(paramParcel, 28, this.x, paramInt, false);
    aod.a(paramParcel, 29, this.y, false);
    aod.a(paramParcel, 30, this.z, false);
    aod.a(paramParcel, 31, this.A);
    aod.a(paramParcel, 32, this.B);
    aod.a(paramParcel, 33, this.C, paramInt, false);
    aod.a(paramParcel, 34, this.D, false);
    aod.a(paramParcel, 35, this.E, false);
    aod.a(paramParcel, 36, this.F);
    aod.a(paramParcel, 37, this.G, paramInt, false);
    aod.a(paramParcel, 38, this.H);
    aod.a(paramParcel, 39, this.I, false);
    aod.a(paramParcel, 40, this.J, false);
    aod.a(paramParcel, 41, this.K, false);
    aod.a(paramParcel, 42, this.L);
    aod.a(paramParcel, 43, this.M, false);
    aod.b(paramParcel, i1);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.AdResponseParcel
 * JD-Core Version:    0.6.0
 */