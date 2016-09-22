package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class a
  implements Parcelable.Creator<ConnectionEvent>
{
  static void a(ConnectionEvent paramConnectionEvent, Parcel paramParcel)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramConnectionEvent.a);
    b.a(paramParcel, 2, paramConnectionEvent.a());
    b.a(paramParcel, 4, paramConnectionEvent.c());
    b.a(paramParcel, 5, paramConnectionEvent.d());
    b.a(paramParcel, 6, paramConnectionEvent.e());
    b.a(paramParcel, 7, paramConnectionEvent.f());
    b.a(paramParcel, 8, paramConnectionEvent.g());
    b.a(paramParcel, 10, paramConnectionEvent.j());
    b.a(paramParcel, 11, paramConnectionEvent.i());
    b.a(paramParcel, 12, paramConnectionEvent.b());
    b.a(paramParcel, 13, paramConnectionEvent.h());
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.stats.a
 * JD-Core Version:    0.6.0
 */