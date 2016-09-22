package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class c
  implements Parcelable.Creator<SaveRequest>
{
  static void a(SaveRequest paramSaveRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramSaveRequest.a(), paramInt);
    b.a(paramParcel, 1000, paramSaveRequest.a);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.c
 * JD-Core Version:    0.6.0
 */