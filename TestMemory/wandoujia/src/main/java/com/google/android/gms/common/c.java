package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class c
  implements Parcelable.Creator<ConnectionResult>
{
  static void a(ConnectionResult paramConnectionResult, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramConnectionResult.b);
    b.a(paramParcel, 2, paramConnectionResult.c());
    b.a(paramParcel, 3, paramConnectionResult.d(), paramInt);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.c
 * JD-Core Version:    0.6.0
 */