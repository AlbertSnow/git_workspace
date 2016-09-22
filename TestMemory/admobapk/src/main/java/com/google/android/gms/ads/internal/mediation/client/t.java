package com.google.android.gms.ads.internal.mediation.client;

import android.location.Location;
import java.util.Date;
import java.util.Set;

@com.google.android.gms.ads.internal.report.client.a
public final class t
  implements com.google.android.gms.ads.mediation.a
{
  private final Date a;
  private final int b;
  private final Set c;
  private final boolean d;
  private final Location e;
  private final int f;
  private final boolean g;

  public t(Date paramDate, int paramInt1, Set paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    this.a = paramDate;
    this.b = paramInt1;
    this.c = paramSet;
    this.e = paramLocation;
    this.d = paramBoolean1;
    this.f = paramInt2;
    this.g = paramBoolean2;
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
    return this.g;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.t
 * JD-Core Version:    0.6.0
 */