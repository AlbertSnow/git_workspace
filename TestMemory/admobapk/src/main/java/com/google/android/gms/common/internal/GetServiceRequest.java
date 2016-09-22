package com.google.android.gms.common.internal;

import alu;
import amp;
import anc;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import oy;

public class GetServiceRequest extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new amp();
  final int a;
  final int b;
  int c;
  public String d;
  public IBinder e;
  public Scope[] f;
  public Bundle g;
  public Account h;
  long i;

  public GetServiceRequest(int paramInt)
  {
    this.a = 3;
    this.c = oy.b;
    this.b = paramInt;
  }

  public GetServiceRequest(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, long paramLong)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramString;
    Account localAccount;
    if (paramInt1 < 2)
    {
      localAccount = null;
      if (paramIBinder != null)
        localAccount = alu.a(anc.a(paramIBinder));
    }
    for (this.h = localAccount; ; this.h = paramAccount)
    {
      this.f = paramArrayOfScope;
      this.g = paramBundle;
      this.i = paramLong;
      return;
      this.e = paramIBinder;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.a(paramParcel, 3, this.c);
    aod.a(paramParcel, 4, this.d, false);
    aod.a(paramParcel, 5, this.e, false);
    aod.a(paramParcel, 6, this.f, paramInt, false);
    aod.a(paramParcel, 7, this.g, false);
    aod.a(paramParcel, 8, this.h, paramInt, false);
    aod.a(paramParcel, 9, this.i);
    aod.b(paramParcel, j);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.GetServiceRequest
 * JD-Core Version:    0.6.0
 */