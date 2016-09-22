package com.google.android.gms.common.internal;

import alw;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AuthAccountRequest extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new alw();
  final int a;
  final IBinder b;
  final Scope[] c;
  Integer d;
  Integer e;

  public AuthAccountRequest(int paramInt, IBinder paramIBinder, Scope[] paramArrayOfScope, Integer paramInteger1, Integer paramInteger2)
  {
    this.a = paramInt;
    this.b = paramIBinder;
    this.c = paramArrayOfScope;
    this.d = paramInteger1;
    this.e = paramInteger2;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.a(paramParcel, 3, this.c, paramInt, false);
    aod.a(paramParcel, 4, this.d, false);
    aod.a(paramParcel, 5, this.e, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.AuthAccountRequest
 * JD-Core Version:    0.6.0
 */