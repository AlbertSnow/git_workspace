package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@com.google.android.gms.ads.internal.report.client.a
public final class bi
{
  public static final String a = com.google.android.gms.ads.internal.util.client.a.a("emulator");
  final Date b;
  final String c;
  final int d;
  final Set e;
  final Location f;
  final boolean g;
  final Bundle h;
  public final Map i;
  final String j;
  final String k;
  final com.google.android.gms.ads.search.a l;
  final int m;
  final Set n;
  final Bundle o;
  final Set p;
  final boolean q;

  public bi(bj parambj)
  {
    this(parambj, null);
  }

  private bi(bj parambj, com.google.android.gms.ads.search.a parama)
  {
    this.b = parambj.g;
    this.c = null;
    this.d = parambj.h;
    this.e = Collections.unmodifiableSet(parambj.a);
    this.f = parambj.i;
    this.g = false;
    this.h = parambj.b;
    this.i = Collections.unmodifiableMap(parambj.c);
    this.j = null;
    this.k = null;
    this.l = null;
    this.m = parambj.j;
    this.n = Collections.unmodifiableSet(parambj.d);
    this.o = parambj.e;
    this.p = Collections.unmodifiableSet(parambj.f);
    this.q = parambj.k;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.bi
 * JD-Core Version:    0.6.0
 */