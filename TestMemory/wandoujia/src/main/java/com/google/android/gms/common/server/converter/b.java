package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<StringToIntConverter>
{
  static void a(StringToIntConverter paramStringToIntConverter, Parcel paramParcel)
  {
    int i = android.support.v4.app.b.b(paramParcel);
    android.support.v4.app.b.a(paramParcel, 1, paramStringToIntConverter.a());
    android.support.v4.app.b.a(paramParcel, 2, paramStringToIntConverter.b());
    android.support.v4.app.b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.converter.b
 * JD-Core Version:    0.6.0
 */