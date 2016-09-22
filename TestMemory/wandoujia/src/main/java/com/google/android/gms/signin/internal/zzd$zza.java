package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;

public abstract class zzd$zza extends Binder
  implements zzd
{
  public zzd$zza()
  {
    attachInterface(this, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
      paramParcel1.readString();
      paramParcel1.createTypedArrayList(Scope.CREATOR);
      zzf.zza.a(paramParcel1.readStrongBinder());
      paramParcel2.writeNoException();
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
    paramParcel1.readString();
    paramParcel1.readString();
    zzf.zza.a(paramParcel1.readStrongBinder());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.signin.internal.zzd.zza
 * JD-Core Version:    0.6.0
 */