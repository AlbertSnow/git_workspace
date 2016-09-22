package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class c
  implements Parcelable.Creator<IdToken>
{
  static void a(IdToken paramIdToken, Parcel paramParcel)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramIdToken.a());
    b.a(paramParcel, 1000, paramIdToken.a);
    b.a(paramParcel, 2, paramIdToken.b());
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.c
 * JD-Core Version:    0.6.0
 */