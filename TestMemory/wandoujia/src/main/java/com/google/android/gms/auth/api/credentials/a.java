package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class a
  implements Parcelable.Creator<Credential>
{
  static void a(Credential paramCredential, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1001, paramCredential.a());
    b.a(paramParcel, 1, paramCredential.c());
    b.a(paramParcel, 1000, paramCredential.a);
    b.a(paramParcel, 2, paramCredential.d());
    b.a(paramParcel, 3, paramCredential.e(), paramInt);
    b.a(paramParcel, 1002, paramCredential.b());
    b.a(paramParcel, 4, paramCredential.f());
    b.a(paramParcel, 5, paramCredential.g());
    b.a(paramParcel, 6, paramCredential.h());
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.a
 * JD-Core Version:    0.6.0
 */