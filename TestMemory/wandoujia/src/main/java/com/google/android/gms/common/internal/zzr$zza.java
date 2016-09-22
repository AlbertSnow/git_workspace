package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzr$zza extends Binder
  implements zzr
{
  public static zzr a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
    if ((localIInterface != null) && ((localIInterface instanceof zzr)))
      return (zzr)localIInterface;
    return new o(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
    zzd localzzd = a(zzd.zza.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
    paramParcel2.writeNoException();
    if (localzzd != null);
    for (IBinder localIBinder = localzzd.asBinder(); ; localIBinder = null)
    {
      paramParcel2.writeStrongBinder(localIBinder);
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzr.zza
 * JD-Core Version:    0.6.0
 */