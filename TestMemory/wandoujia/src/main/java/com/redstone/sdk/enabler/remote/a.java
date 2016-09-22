package com.redstone.sdk.enabler.remote;

import android.os.IBinder;
import android.os.Parcel;

final class a
  implements IRsServiceObserver
{
  private IBinder a;

  a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(String paramString, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.redstone.sdk.enabler.remote.IRsServiceObserver");
      localParcel1.writeString(paramString);
      localParcel1.writeInt(paramInt);
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
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
 * Qualified Name:     com.redstone.sdk.enabler.remote.a
 * JD-Core Version:    0.6.0
 */