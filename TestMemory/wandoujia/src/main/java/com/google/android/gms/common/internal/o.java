package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

final class o
  implements zzr
{
  private IBinder a;

  o(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final zzd a(zzd paramzzd, int paramInt1, int paramInt2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
      if (paramzzd != null);
      for (IBinder localIBinder = paramzzd.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt1);
        localParcel1.writeInt(paramInt2);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        zzd localzzd = zzd.zza.a(localParcel2.readStrongBinder());
        return localzzd;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.o
 * JD-Core Version:    0.6.0
 */