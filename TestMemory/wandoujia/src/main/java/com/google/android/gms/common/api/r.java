package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class r
  implements Parcelable.Creator<Status>
{
  static void a(Status paramStatus, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramStatus.d());
    b.a(paramParcel, 1000, paramStatus.c());
    b.a(paramParcel, 2, paramStatus.b());
    b.a(paramParcel, 3, paramStatus.a(), paramInt);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.r
 * JD-Core Version:    0.6.0
 */