package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<AccountChangeEventsRequest>
{
  static void a(AccountChangeEventsRequest paramAccountChangeEventsRequest, Parcel paramParcel, int paramInt)
  {
    int i = android.support.v4.app.b.b(paramParcel);
    android.support.v4.app.b.a(paramParcel, 1, paramAccountChangeEventsRequest.a);
    android.support.v4.app.b.a(paramParcel, 2, paramAccountChangeEventsRequest.b);
    android.support.v4.app.b.a(paramParcel, 3, paramAccountChangeEventsRequest.c);
    android.support.v4.app.b.a(paramParcel, 4, paramAccountChangeEventsRequest.d, paramInt);
    android.support.v4.app.b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.b
 * JD-Core Version:    0.6.0
 */