package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<FastJsonResponse.Field>
{
  static void a(FastJsonResponse.Field paramField, Parcel paramParcel, int paramInt)
  {
    int i = android.support.v4.app.b.b(paramParcel);
    android.support.v4.app.b.a(paramParcel, 1, paramField.a());
    android.support.v4.app.b.a(paramParcel, 2, paramField.b());
    android.support.v4.app.b.a(paramParcel, 3, paramField.c());
    android.support.v4.app.b.a(paramParcel, 4, paramField.d());
    android.support.v4.app.b.a(paramParcel, 5, paramField.e());
    android.support.v4.app.b.a(paramParcel, 6, paramField.f());
    android.support.v4.app.b.a(paramParcel, 7, paramField.g());
    android.support.v4.app.b.a(paramParcel, 8, paramField.i());
    android.support.v4.app.b.a(paramParcel, 9, paramField.k(), paramInt);
    android.support.v4.app.b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.response.b
 * JD-Core Version:    0.6.0
 */