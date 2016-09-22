package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<CredentialRequest>
{
  static void a(CredentialRequest paramCredentialRequest, Parcel paramParcel)
  {
    int i = android.support.v4.app.b.b(paramParcel);
    android.support.v4.app.b.a(paramParcel, 1, paramCredentialRequest.a());
    android.support.v4.app.b.a(paramParcel, 1000, paramCredentialRequest.a);
    android.support.v4.app.b.a(paramParcel, 2, paramCredentialRequest.b());
    android.support.v4.app.b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.b
 * JD-Core Version:    0.6.0
 */