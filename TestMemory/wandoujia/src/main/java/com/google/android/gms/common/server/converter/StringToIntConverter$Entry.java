package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class StringToIntConverter$Entry
  implements SafeParcelable
{
  public static final c CREATOR = new c();
  final int a;
  final String b;
  final int c;

  StringToIntConverter$Entry(int paramInt1, String paramString, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
  }

  StringToIntConverter$Entry(String paramString, int paramInt)
  {
    this.a = 1;
    this.b = paramString;
    this.c = paramInt;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.converter.StringToIntConverter.Entry
 * JD-Core Version:    0.6.0
 */