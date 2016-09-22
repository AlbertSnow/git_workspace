package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import aoa;
import aod;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class ValidateAccountRequest extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new aoa();
  final int a;
  final int b;
  final IBinder c;
  final Scope[] d;
  final Bundle e;
  final String f;

  public ValidateAccountRequest(int paramInt1, int paramInt2, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, String paramString)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramIBinder;
    this.d = paramArrayOfScope;
    this.e = paramBundle;
    this.f = paramString;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.a(paramParcel, 3, this.c, false);
    aod.a(paramParcel, 4, this.d, paramInt, false);
    aod.a(paramParcel, 5, this.e, false);
    aod.a(paramParcel, 6, this.f, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ValidateAccountRequest
 * JD-Core Version:    0.6.0
 */