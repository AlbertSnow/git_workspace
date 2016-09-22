package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract class zzau$zza extends Binder
  implements zzau
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.auth.IAuthManagerService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      paramParcel1.readString();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      Bundle localBundle3 = a();
      paramParcel2.writeNoException();
      if (localBundle3 != null)
      {
        paramParcel2.writeInt(1);
        localBundle3.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      Bundle localBundle2 = b();
      paramParcel2.writeNoException();
      if (localBundle2 != null)
      {
        paramParcel2.writeInt(1);
        localBundle2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      if (paramParcel1.readInt() != 0)
        AccountChangeEventsRequest.CREATOR.createFromParcel(paramParcel1);
      AccountChangeEventsResponse localAccountChangeEventsResponse = c();
      paramParcel2.writeNoException();
      if (localAccountChangeEventsResponse != null)
      {
        paramParcel2.writeInt(1);
        localAccountChangeEventsResponse.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5:
    }
    paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
    if (paramParcel1.readInt() != 0)
      Account.CREATOR.createFromParcel(paramParcel1);
    paramParcel1.readString();
    if (paramParcel1.readInt() != 0)
      Bundle.CREATOR.createFromParcel(paramParcel1);
    Bundle localBundle1 = d();
    paramParcel2.writeNoException();
    if (localBundle1 != null)
    {
      paramParcel2.writeInt(1);
      localBundle1.writeToParcel(paramParcel2, 1);
      return true;
    }
    paramParcel2.writeInt(0);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.zzau.zza
 * JD-Core Version:    0.6.0
 */