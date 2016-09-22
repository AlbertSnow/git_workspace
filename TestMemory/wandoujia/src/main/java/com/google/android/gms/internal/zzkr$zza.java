package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Parcel;

public abstract class zzkr$zza extends Binder
  implements zzkr
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.common.internal.service.ICommonService");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
    zzkq.zza.a(paramParcel1.readStrongBinder());
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.zzkr.zza
 * JD-Core Version:    0.6.0
 */