package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import aoe;

public final class ConnectionEvent extends StatsEvent
{
  public static final Parcelable.Creator CREATOR = new aoe();
  final int a;
  final long b;
  int c;
  final String d;
  final String e;
  final String f;
  final String g;
  final String h;
  final String i;
  final long j;
  final long k;
  private long l;

  public ConnectionEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this.a = paramInt1;
    this.b = paramLong1;
    this.c = paramInt2;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.l = -1L;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramLong2;
    this.k = paramLong3;
  }

  public ConnectionEvent(long paramLong1, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this(1, paramLong1, paramInt, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramLong2, paramLong3);
  }

  public final long a()
  {
    return this.b;
  }

  public final int b()
  {
    return this.c;
  }

  public final long c()
  {
    return this.l;
  }

  public final String d()
  {
    String str1 = String.valueOf("\t");
    String str2 = String.valueOf(this.d);
    String str3 = String.valueOf(this.e);
    String str4 = String.valueOf("\t");
    String str5 = String.valueOf(this.f);
    String str6 = String.valueOf(this.g);
    String str7 = String.valueOf("\t");
    if (this.h == null);
    for (String str8 = ""; ; str8 = this.h)
    {
      String str9 = String.valueOf("\t");
      long l1 = this.k;
      return 22 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length() + str1 + str2 + "/" + str3 + str4 + str5 + "/" + str6 + str7 + str8 + str9 + l1;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.a(paramParcel, 4, this.d, false);
    aod.a(paramParcel, 5, this.e, false);
    aod.a(paramParcel, 6, this.f, false);
    aod.a(paramParcel, 7, this.g, false);
    aod.a(paramParcel, 8, this.h, false);
    aod.a(paramParcel, 10, this.j);
    aod.a(paramParcel, 11, this.k);
    aod.a(paramParcel, 12, this.c);
    aod.a(paramParcel, 13, this.i, false);
    aod.b(paramParcel, m);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.ConnectionEvent
 * JD-Core Version:    0.6.0
 */