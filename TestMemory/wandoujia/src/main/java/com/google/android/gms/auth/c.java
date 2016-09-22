package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class c
  implements Parcelable.Creator<AccountChangeEventsResponse>
{
  static void a(AccountChangeEventsResponse paramAccountChangeEventsResponse, Parcel paramParcel)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramAccountChangeEventsResponse.a);
    b.a(paramParcel, 2, paramAccountChangeEventsResponse.b);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.c
 * JD-Core Version:    0.6.0
 */