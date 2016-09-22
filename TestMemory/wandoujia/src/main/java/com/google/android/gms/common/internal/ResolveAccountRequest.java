package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ResolveAccountRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new r();
  final int a;
  private final Account b;
  private final int c;

  ResolveAccountRequest(int paramInt1, Account paramAccount, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramAccount;
    this.c = paramInt2;
  }

  public final Account a()
  {
    return this.b;
  }

  public final int b()
  {
    return this.c;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    r.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.ResolveAccountRequest
 * JD-Core Version:    0.6.0
 */