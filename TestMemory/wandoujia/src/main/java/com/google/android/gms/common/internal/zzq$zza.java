package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzq$zza extends Binder
  implements zzq
{
  public zzq$zza()
  {
    attachInterface(this, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
  }

  public static zzq a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzq)))
      return (zzq)localIInterface;
    return new n(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
    if (paramParcel1.readInt() != 0);
    for (ResolveAccountResponse localResolveAccountResponse = (ResolveAccountResponse)ResolveAccountResponse.CREATOR.createFromParcel(paramParcel1); ; localResolveAccountResponse = null)
    {
      a(localResolveAccountResponse);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzq.zza
 * JD-Core Version:    0.6.0
 */