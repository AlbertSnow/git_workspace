package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public abstract class zze$zza extends Binder
  implements zze
{
  public zze$zza()
  {
    attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
  }

  public static zze a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zze)))
      return (zze)localIInterface;
    return new c(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      ConnectionResult localConnectionResult;
      if (paramParcel1.readInt() != 0)
      {
        localConnectionResult = (ConnectionResult)ConnectionResult.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label122;
      }
      label122: for (AuthAccountResult localAuthAccountResult = (AuthAccountResult)AuthAccountResult.CREATOR.createFromParcel(paramParcel1); ; localAuthAccountResult = null)
      {
        a(localConnectionResult, localAuthAccountResult);
        paramParcel2.writeNoException();
        return true;
        localConnectionResult = null;
        break;
      }
    case 4:
    }
    paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
    if (paramParcel1.readInt() != 0);
    for (Status localStatus = (Status)Status.CREATOR.createFromParcel(paramParcel1); ; localStatus = null)
    {
      a(localStatus);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.signin.internal.zze.zza
 * JD-Core Version:    0.6.0
 */