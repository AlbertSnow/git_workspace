package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public abstract class ICredentialsService$zza extends Binder
  implements ICredentialsService
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      ICredentialsCallbacks.zza.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
        CredentialRequest.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      ICredentialsCallbacks.zza.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
        SaveRequest.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      ICredentialsCallbacks.zza.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
        DeleteRequest.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 4:
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    ICredentialsCallbacks.zza.a(paramParcel1.readStrongBinder());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.ICredentialsService.zza
 * JD-Core Version:    0.6.0
 */