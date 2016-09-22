package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class c
  implements Parcelable.Creator<ValidateAccountRequest>
{
  static void a(ValidateAccountRequest paramValidateAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramValidateAccountRequest.a);
    b.a(paramParcel, 2, paramValidateAccountRequest.a());
    b.a(paramParcel, 3, paramValidateAccountRequest.b);
    b.a(paramParcel, 4, paramValidateAccountRequest.b(), paramInt);
    b.a(paramParcel, 5, paramValidateAccountRequest.d());
    b.a(paramParcel, 6, paramValidateAccountRequest.c());
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.c
 * JD-Core Version:    0.6.0
 */