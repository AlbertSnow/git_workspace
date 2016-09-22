package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import aod;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import mi;
import mj;

@com.google.android.gms.ads.internal.report.client.a
public class AdSizeParcel extends AbstractSafeParcelable
{
  public static final i CREATOR = new i();
  public final int a;
  public final String b;
  public final int c;
  public final int d;
  public final boolean e;
  public final int f;
  public final int g;
  public final AdSizeParcel[] h;
  public final boolean i;
  public final boolean j;
  public boolean k;

  public AdSizeParcel()
  {
    this(5, "interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
  }

  AdSizeParcel(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, int paramInt5, AdSizeParcel[] paramArrayOfAdSizeParcel, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramBoolean1;
    this.f = paramInt4;
    this.g = paramInt5;
    this.h = paramArrayOfAdSizeParcel;
    this.i = paramBoolean2;
    this.j = paramBoolean3;
    this.k = paramBoolean4;
  }

  public AdSizeParcel(Context paramContext, mi parammi)
  {
    this(paramContext, new mi[] { parammi });
  }

  public AdSizeParcel(Context paramContext, mi[] paramArrayOfmi)
  {
    mi localmi = paramArrayOfmi[0];
    this.a = 5;
    this.e = false;
    boolean bool;
    label72: int m;
    label83: int n;
    label95: DisplayMetrics localDisplayMetrics;
    label162: int i2;
    label202: int i3;
    if ((localmi.i == -3) && (localmi.j == -4))
    {
      bool = true;
      this.j = bool;
      if (!this.j)
        break label334;
      this.f = mi.a.i;
      this.c = mi.a.j;
      if (this.f != -1)
        break label353;
      m = 1;
      if (this.c != -2)
        break label359;
      n = 1;
      localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      if (m == 0)
        break label377;
      if ((!com.google.android.gms.ads.internal.util.client.a.c(paramContext)) || (!com.google.android.gms.ads.internal.util.client.a.d(paramContext)))
        break label365;
      int i6 = localDisplayMetrics.widthPixels;
      this.g = (i6 - com.google.android.gms.ads.internal.util.client.a.e(paramContext));
      double d1 = this.g / localDisplayMetrics.density;
      int i5 = (int)d1;
      if (d1 - (int)d1 >= 0.01D)
        i5++;
      i2 = i5;
      if (n == 0)
        break label410;
      i3 = c(localDisplayMetrics);
      label214: this.d = com.google.android.gms.ads.internal.util.client.a.a(localDisplayMetrics, i3);
      if ((m == 0) && (n == 0))
        break label419;
      this.b = (26 + i2 + "x" + i3 + "_as");
    }
    while (true)
    {
      if (paramArrayOfmi.length <= 1)
        break label446;
      this.h = new AdSizeParcel[paramArrayOfmi.length];
      for (int i4 = 0; i4 < paramArrayOfmi.length; i4++)
        this.h[i4] = new AdSizeParcel(paramContext, paramArrayOfmi[i4]);
      bool = false;
      break;
      label334: this.f = localmi.i;
      this.c = localmi.j;
      break label72;
      label353: m = 0;
      break label83;
      label359: n = 0;
      break label95;
      label365: this.g = localDisplayMetrics.widthPixels;
      break label162;
      label377: int i1 = this.f;
      this.g = com.google.android.gms.ads.internal.util.client.a.a(localDisplayMetrics, this.f);
      i2 = i1;
      break label202;
      label410: i3 = this.c;
      break label214;
      label419: if (this.j)
      {
        this.b = "320x50_mb";
        continue;
      }
      this.b = localmi.toString();
    }
    label446: this.h = null;
    this.i = false;
    this.k = false;
  }

  public AdSizeParcel(AdSizeParcel paramAdSizeParcel, AdSizeParcel[] paramArrayOfAdSizeParcel)
  {
    this(5, paramAdSizeParcel.b, paramAdSizeParcel.c, paramAdSizeParcel.d, paramAdSizeParcel.e, paramAdSizeParcel.f, paramAdSizeParcel.g, paramArrayOfAdSizeParcel, paramAdSizeParcel.i, paramAdSizeParcel.j, paramAdSizeParcel.k);
  }

  public static int a(DisplayMetrics paramDisplayMetrics)
  {
    return paramDisplayMetrics.widthPixels;
  }

  public static AdSizeParcel a()
  {
    return new AdSizeParcel(5, "320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
  }

  public static int b(DisplayMetrics paramDisplayMetrics)
  {
    return (int)(c(paramDisplayMetrics) * paramDisplayMetrics.density);
  }

  public static AdSizeParcel b()
  {
    return new AdSizeParcel(5, "reward_mb", 0, 0, true, 0, 0, null, false, false, false);
  }

  private static int c(DisplayMetrics paramDisplayMetrics)
  {
    int m = (int)(paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
    if (m <= 400)
      return 32;
    if (m <= 720)
      return 50;
    return 90;
  }

  public final mi c()
  {
    return mj.a(this.f, this.c, this.b);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.a(paramParcel, 3, this.c);
    aod.a(paramParcel, 4, this.d);
    aod.a(paramParcel, 5, this.e);
    aod.a(paramParcel, 6, this.f);
    aod.a(paramParcel, 7, this.g);
    aod.a(paramParcel, 8, this.h, paramInt, false);
    aod.a(paramParcel, 9, this.i);
    aod.a(paramParcel, 10, this.j);
    aod.a(paramParcel, 11, this.k);
    aod.b(paramParcel, m);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.AdSizeParcel
 * JD-Core Version:    0.6.0
 */