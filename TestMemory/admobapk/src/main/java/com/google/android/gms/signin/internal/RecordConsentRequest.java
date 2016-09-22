package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import asa;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RecordConsentRequest extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new asa();
  final int a;
  final Account b;
  final Scope[] c;
  final String d;

  public RecordConsentRequest(int paramInt, Account paramAccount, Scope[] paramArrayOfScope, String paramString)
  {
    this.a = paramInt;
    this.b = paramAccount;
    this.c = paramArrayOfScope;
    this.d = paramString;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, paramInt, false);
    aod.a(paramParcel, 3, this.c, paramInt, false);
    aod.a(paramParcel, 4, this.d, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.RecordConsentRequest
 * JD-Core Version:    0.6.0
 */