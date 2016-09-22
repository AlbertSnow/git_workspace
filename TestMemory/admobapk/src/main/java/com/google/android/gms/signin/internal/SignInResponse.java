package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import asd;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInResponse extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new asd();
  final int a;
  public final ConnectionResult b;
  public final ResolveAccountResponse c;

  public SignInResponse(int paramInt)
  {
    this(new ConnectionResult(8, null), null);
  }

  public SignInResponse(int paramInt, ConnectionResult paramConnectionResult, ResolveAccountResponse paramResolveAccountResponse)
  {
    this.a = paramInt;
    this.b = paramConnectionResult;
    this.c = paramResolveAccountResponse;
  }

  private SignInResponse(ConnectionResult paramConnectionResult, ResolveAccountResponse paramResolveAccountResponse)
  {
    this(1, paramConnectionResult, null);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, paramInt, false);
    aod.a(paramParcel, 3, this.c, paramInt, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.SignInResponse
 * JD-Core Version:    0.6.0
 */