package com.google.android.gms.appstreaming;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import mx;
import my;

public final class AppStreamingState extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new my();
  final int a;
  int b;
  public int c;
  public int d;
  public String e;
  int f;

  public AppStreamingState(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramString;
    this.f = paramInt5;
  }

  public AppStreamingState(mx parammx)
  {
    this.a = 1;
    this.b = 0;
    this.c = parammx.a;
    this.d = parammx.b;
    this.e = parammx.c;
    this.f = parammx.d;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.a(paramParcel, 3, this.c);
    aod.a(paramParcel, 4, this.d);
    aod.a(paramParcel, 5, this.e, false);
    aod.a(paramParcel, 6, this.f);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstreaming.AppStreamingState
 * JD-Core Version:    0.6.0
 */