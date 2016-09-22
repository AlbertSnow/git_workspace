package com.google.android.gms.appstreaming;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import mv;
import mw;

public final class AppStreamingInfo extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new mw();
  final int a;
  public String b;
  public long c;
  public String d;
  public String e;
  public String f;
  public String g;
  public boolean h;
  public boolean i;
  boolean j;
  public String k;

  public AppStreamingInfo(int paramInt, String paramString1, long paramLong, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString6)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramLong;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramString5;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
    this.j = paramBoolean3;
    this.k = paramString6;
  }

  public AppStreamingInfo(mv parammv)
  {
    this.a = 2;
    this.b = parammv.a;
    this.c = parammv.b;
    this.d = parammv.c;
    this.e = parammv.d;
    this.f = parammv.e;
    this.g = parammv.f;
    this.h = false;
    this.i = parammv.g;
    this.j = false;
    this.k = parammv.h;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.a(paramParcel, 3, this.c);
    aod.a(paramParcel, 4, this.d, false);
    aod.a(paramParcel, 5, this.e, false);
    aod.a(paramParcel, 6, this.f, false);
    aod.a(paramParcel, 7, this.g, false);
    aod.a(paramParcel, 8, this.h);
    aod.a(paramParcel, 9, this.i);
    aod.a(paramParcel, 10, this.j);
    aod.a(paramParcel, 11, this.k, false);
    aod.b(paramParcel, m);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstreaming.AppStreamingInfo
 * JD-Core Version:    0.6.0
 */