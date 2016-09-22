package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<CheckServerAuthResult>
{
  static void a(CheckServerAuthResult paramCheckServerAuthResult, Parcel paramParcel)
  {
    int i = android.support.v4.app.b.b(paramParcel);
    android.support.v4.app.b.a(paramParcel, 1, paramCheckServerAuthResult.a);
    android.support.v4.app.b.a(paramParcel, 2, paramCheckServerAuthResult.b);
    android.support.v4.app.b.a(paramParcel, 3, paramCheckServerAuthResult.c);
    android.support.v4.app.b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.signin.internal.b
 * JD-Core Version:    0.6.0
 */