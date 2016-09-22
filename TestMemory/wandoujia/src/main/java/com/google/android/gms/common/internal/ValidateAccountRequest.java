package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValidateAccountRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<ValidateAccountRequest> CREATOR = new c();
  final int a;
  final IBinder b;
  private final int c;
  private final Scope[] d;
  private final Bundle e;
  private final String f;

  ValidateAccountRequest(int paramInt1, int paramInt2, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, String paramString)
  {
    this.a = paramInt1;
    this.c = paramInt2;
    this.b = paramIBinder;
    this.d = paramArrayOfScope;
    this.e = paramBundle;
    this.f = paramString;
  }

  public final int a()
  {
    return this.c;
  }

  public final Scope[] b()
  {
    return this.d;
  }

  public final String c()
  {
    return this.f;
  }

  public final Bundle d()
  {
    return this.e;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.ValidateAccountRequest
 * JD-Core Version:    0.6.0
 */