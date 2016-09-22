package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.report.client.a;
import java.util.ArrayList;
import java.util.List;

@a
public final class f
{
  public Location a;
  public Bundle b;
  private long c;
  private Bundle d;
  private int e;
  private List f;
  private boolean g;
  private int h;
  private boolean i;
  private String j;
  private SearchAdRequestParcel k;
  private String l;
  private Bundle m;
  private List n;
  private String o;
  private String p;
  private boolean q;

  public f()
  {
    this.c = -1L;
    this.d = new Bundle();
    this.e = -1;
    this.f = new ArrayList();
    this.g = false;
    this.h = -1;
    this.i = false;
    this.j = null;
    this.k = null;
    this.a = null;
    this.l = null;
    this.b = new Bundle();
    this.m = new Bundle();
    this.n = new ArrayList();
    this.o = null;
    this.p = null;
    this.q = false;
  }

  public f(AdRequestParcel paramAdRequestParcel)
  {
    this.c = paramAdRequestParcel.b;
    this.d = paramAdRequestParcel.c;
    this.e = paramAdRequestParcel.d;
    this.f = paramAdRequestParcel.e;
    this.g = paramAdRequestParcel.f;
    this.h = paramAdRequestParcel.g;
    this.i = paramAdRequestParcel.h;
    this.j = paramAdRequestParcel.i;
    this.k = paramAdRequestParcel.j;
    this.a = paramAdRequestParcel.k;
    this.l = paramAdRequestParcel.l;
    this.b = paramAdRequestParcel.m;
    this.m = paramAdRequestParcel.n;
    this.n = paramAdRequestParcel.o;
    this.o = paramAdRequestParcel.p;
    this.p = paramAdRequestParcel.q;
  }

  public final AdRequestParcel a()
  {
    return new AdRequestParcel(7, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.a, this.l, this.b, this.m, this.n, this.o, this.p, false);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.f
 * JD-Core Version:    0.6.0
 */