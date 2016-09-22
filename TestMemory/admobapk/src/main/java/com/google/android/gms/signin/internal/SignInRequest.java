package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import asc;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInRequest extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new asc();
  final int a;
  final ResolveAccountRequest b;

  public SignInRequest(int paramInt, ResolveAccountRequest paramResolveAccountRequest)
  {
    this.a = paramInt;
    this.b = paramResolveAccountRequest;
  }

  public SignInRequest(ResolveAccountRequest paramResolveAccountRequest)
  {
    this(1, paramResolveAccountRequest);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, paramInt, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.SignInRequest
 * JD-Core Version:    0.6.0
 */