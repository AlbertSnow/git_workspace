package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import aod;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@com.google.android.gms.ads.internal.report.client.a
public final class SearchAdRequestParcel extends AbstractSafeParcelable
{
  public static final bt CREATOR = new bt();
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  public final String j;
  public final int k;
  public final String l;
  public final int m;
  public final int n;
  public final String o;

  SearchAdRequestParcel(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, String paramString1, int paramInt10, String paramString2, int paramInt11, int paramInt12, String paramString3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
    this.f = paramInt6;
    this.g = paramInt7;
    this.h = paramInt8;
    this.i = paramInt9;
    this.j = paramString1;
    this.k = paramInt10;
    this.l = paramString2;
    this.m = paramInt11;
    this.n = paramInt12;
    this.o = paramString3;
  }

  public SearchAdRequestParcel(com.google.android.gms.ads.search.a parama)
  {
    this.a = 1;
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = 0;
    this.h = 0;
    this.i = 0;
    this.j = null;
    this.k = 0;
    this.l = null;
    this.m = 0;
    this.n = 0;
    this.o = null;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.a(paramParcel, 3, this.c);
    aod.a(paramParcel, 4, this.d);
    aod.a(paramParcel, 5, this.e);
    aod.a(paramParcel, 6, this.f);
    aod.a(paramParcel, 7, this.g);
    aod.a(paramParcel, 8, this.h);
    aod.a(paramParcel, 9, this.i);
    aod.a(paramParcel, 10, this.j, false);
    aod.a(paramParcel, 11, this.k);
    aod.a(paramParcel, 12, this.l, false);
    aod.a(paramParcel, 13, this.m);
    aod.a(paramParcel, 14, this.n);
    aod.a(paramParcel, 15, this.o, false);
    aod.b(paramParcel, i1);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.SearchAdRequestParcel
 * JD-Core Version:    0.6.0
 */