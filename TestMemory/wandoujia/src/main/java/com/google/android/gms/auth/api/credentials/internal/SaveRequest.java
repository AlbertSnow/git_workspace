package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class SaveRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<SaveRequest> CREATOR = new c();
  final int a;
  private final Credential b;

  SaveRequest(int paramInt, Credential paramCredential)
  {
    this.a = paramInt;
    this.b = paramCredential;
  }

  public final Credential a()
  {
    return this.b;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.SaveRequest
 * JD-Core Version:    0.6.0
 */