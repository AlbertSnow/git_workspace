package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.ay;
import com.google.android.gms.ads.internal.gmsg.c;
import com.google.android.gms.ads.internal.overlay.an;
import com.google.android.gms.ads.internal.overlay.as;
import com.google.android.gms.ads.internal.overlay.av;
import com.google.android.gms.ads.internal.overlay.bg;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.safebrowsing.k;
import com.google.android.gms.ads.internal.safebrowsing.n;

@a
public final class m
{
  public final ay a;
  public final an b;
  public final as c;
  public final n d;

  public m(ay paramay, an paraman, as paramas, n paramn)
  {
    this.a = paramay;
    this.b = paraman;
    this.c = paramas;
    this.d = paramn;
  }

  public static m a()
  {
    return new m(new c(), new av(), new bg(), new k());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.m
 * JD-Core Version:    0.6.0
 */