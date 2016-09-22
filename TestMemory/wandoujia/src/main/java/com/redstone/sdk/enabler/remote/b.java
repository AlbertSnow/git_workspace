package com.redstone.sdk.enabler.remote;

import android.os.IBinder;
import android.os.Parcel;

final class b
  implements IRsSystemService
{
  private IBinder a;

  b(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final int a(String paramString1, String paramString2, IRsServiceObserver paramIRsServiceObserver)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.redstone.sdk.enabler.remote.IRsSystemService");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      if (paramIRsServiceObserver != null);
      for (IBinder localIBinder = paramIRsServiceObserver.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
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
 * Qualified Name:     com.redstone.sdk.enabler.remote.b
 * JD-Core Version:    0.6.0
 */