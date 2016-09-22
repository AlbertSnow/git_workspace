package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.at;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.mediation.client.b;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import dh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@a
public final class y extends com.google.android.gms.ads.internal.client.z
{
  final Context a;
  final com.google.android.gms.ads.internal.client.v b;
  final b c;
  final com.google.android.gms.ads.internal.formats.client.v d;
  final com.google.android.gms.ads.internal.formats.client.y e;
  final dh f;
  final dh g;
  final NativeAdOptionsParcel h;
  final at i;
  final String j;
  final VersionInfoParcel k;
  WeakReference l;
  final m m;
  final Object n = new Object();

  y(Context paramContext, String paramString, b paramb, VersionInfoParcel paramVersionInfoParcel, com.google.android.gms.ads.internal.client.v paramv, com.google.android.gms.ads.internal.formats.client.v paramv1, com.google.android.gms.ads.internal.formats.client.y paramy, dh paramdh1, dh paramdh2, NativeAdOptionsParcel paramNativeAdOptionsParcel, at paramat, m paramm)
  {
    this.a = paramContext;
    this.j = paramString;
    this.c = paramb;
    this.k = paramVersionInfoParcel;
    this.b = paramv;
    this.e = paramy;
    this.d = paramv1;
    this.f = paramdh1;
    this.g = paramdh2;
    this.h = paramNativeAdOptionsParcel;
    c();
    this.i = paramat;
    this.m = paramm;
  }

  public final String a()
  {
    while (true)
    {
      synchronized (this.n)
      {
        if (this.l == null)
          continue;
        an localan = (an)this.l.get();
        if (localan != null)
        {
          str = localan.D();
          return str;
          return null;
        }
      }
      String str = null;
    }
  }

  public final void a(AdRequestParcel paramAdRequestParcel)
  {
    z localz = new z(this, paramAdRequestParcel);
    com.google.android.gms.ads.internal.util.y.a.post(localz);
  }

  public final boolean b()
  {
    while (true)
    {
      synchronized (this.n)
      {
        if (this.l == null)
          continue;
        an localan = (an)this.l.get();
        if (localan != null)
        {
          bool = localan.k();
          return bool;
          return false;
        }
      }
      boolean bool = false;
    }
  }

  final List c()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.e != null)
      localArrayList.add("1");
    if (this.d != null)
      localArrayList.add("2");
    if (this.f.size() > 0)
      localArrayList.add("3");
    return localArrayList;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.y
 * JD-Core Version:    0.6.0
 */