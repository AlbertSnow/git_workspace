package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CredentialRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<CredentialRequest> CREATOR = new b();
  final int a;
  private final boolean b;
  private final String[] c;

  CredentialRequest(int paramInt, boolean paramBoolean, String[] paramArrayOfString)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramArrayOfString;
  }

  public final boolean a()
  {
    return this.b;
  }

  public final String[] b()
  {
    return this.c;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.CredentialRequest
 * JD-Core Version:    0.6.0
 */