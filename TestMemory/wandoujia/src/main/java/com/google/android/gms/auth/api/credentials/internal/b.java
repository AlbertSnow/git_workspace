package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<DeleteRequest>
{
  static void a(DeleteRequest paramDeleteRequest, Parcel paramParcel, int paramInt)
  {
    int i = android.support.v4.app.b.b(paramParcel);
    android.support.v4.app.b.a(paramParcel, 1, paramDeleteRequest.a(), paramInt);
    android.support.v4.app.b.a(paramParcel, 1000, paramDeleteRequest.a);
    android.support.v4.app.b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.b
 * JD-Core Version:    0.6.0
 */