package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class a
  implements Parcelable.Creator<AccountChangeEvent>
{
  static void a(AccountChangeEvent paramAccountChangeEvent, Parcel paramParcel)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramAccountChangeEvent.a);
    b.a(paramParcel, 2, paramAccountChangeEvent.b);
    b.a(paramParcel, 3, paramAccountChangeEvent.c);
    b.a(paramParcel, 4, paramAccountChangeEvent.d);
    b.a(paramParcel, 5, paramAccountChangeEvent.e);
    b.a(paramParcel, 6, paramAccountChangeEvent.f);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.a
 * JD-Core Version:    0.6.0
 */