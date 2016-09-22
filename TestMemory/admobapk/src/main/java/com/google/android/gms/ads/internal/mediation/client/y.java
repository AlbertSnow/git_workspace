package com.google.android.gms.ads.internal.mediation.client;

import android.location.Location;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.formats.d;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.mediation.m;
import java.util.Date;
import java.util.List;
import java.util.Set;

@a
public final class y
  implements m
{
  private final Date a;
  private final int b;
  private final Set c;
  private final boolean d;
  private final Location e;
  private final int f;
  private final NativeAdOptionsParcel g;
  private final List h;
  private final boolean i;

  public y(Date paramDate, int paramInt1, Set paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList, boolean paramBoolean2)
  {
    this.a = paramDate;
    this.b = paramInt1;
    this.c = paramSet;
    this.e = paramLocation;
    this.d = paramBoolean1;
    this.f = paramInt2;
    this.g = paramNativeAdOptionsParcel;
    this.h = paramList;
    this.i = paramBoolean2;
  }

  public final Date a()
  {
    return this.a;
  }

  public final int b()
  {
    return this.b;
  }

  public final Set c()
  {
    return this.c;
  }

  public final Location d()
  {
    return this.e;
  }

  public final boolean e()
  {
    return this.d;
  }

  public final int f()
  {
    return this.f;
  }

  public final boolean g()
  {
    return this.i;
  }

  public final c h()
  {
    if (this.g == null)
      return null;
    d locald = new d();
    locald.a = this.g.b;
    locald.b = this.g.c;
    locald.c = this.g.d;
    return locald.a();
  }

  public final boolean i()
  {
    return (this.h != null) && (this.h.contains("2"));
  }

  public final boolean j()
  {
    return (this.h != null) && (this.h.contains("1"));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.y
 * JD-Core Version:    0.6.0
 */