package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public abstract class zzjl$zza extends Binder
  implements zzjl
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.auth.api.internal.IAuthService");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
    zzjk.zza.a(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0)
      ProxyRequest.CREATOR.createFromParcel(paramParcel1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.zzjl.zza
 * JD-Core Version:    0.6.0
 */