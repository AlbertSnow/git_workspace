package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzji$zza extends Binder
  implements zzji
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
    if (paramParcel1.readInt() != 0)
      Account.CREATOR.createFromParcel(paramParcel1);
    paramParcel1.readInt();
    zzjh.zza.a(paramParcel1.readStrongBinder());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.zzji.zza
 * JD-Core Version:    0.6.0
 */