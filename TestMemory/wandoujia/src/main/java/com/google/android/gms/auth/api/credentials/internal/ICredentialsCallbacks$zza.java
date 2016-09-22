package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class ICredentialsCallbacks$zza extends Binder
  implements ICredentialsCallbacks
{
  public ICredentialsCallbacks$zza()
  {
    attachInterface(this, "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
  }

  public static ICredentialsCallbacks a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof ICredentialsCallbacks)))
      return (ICredentialsCallbacks)localIInterface;
    return new a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
      Status localStatus2;
      if (paramParcel1.readInt() != 0)
      {
        localStatus2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label122;
      }
      label122: for (Credential localCredential = (Credential)Credential.CREATOR.createFromParcel(paramParcel1); ; localCredential = null)
      {
        a(localStatus2, localCredential);
        paramParcel2.writeNoException();
        return true;
        localStatus2 = null;
        break;
      }
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    if (paramParcel1.readInt() != 0);
    for (Status localStatus1 = (Status)Status.CREATOR.createFromParcel(paramParcel1); ; localStatus1 = null)
    {
      a(localStatus1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks.zza
 * JD-Core Version:    0.6.0
 */