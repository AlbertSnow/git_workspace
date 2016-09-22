package com.unionpay.mobile.tsm.connect;

import android.os.IBinder;
import android.os.Parcel;

final class a
  implements IInitCallback
{
  private IBinder a;

  a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final void initFailed()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.unionpay.mobile.tsm.connect.IInitCallback");
      this.a.transact(2, localParcel1, localParcel2, 0);
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

  public final void initSucceed()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.unionpay.mobile.tsm.connect.IInitCallback");
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
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mobile.tsm.connect.a
 * JD-Core Version:    0.6.0
 */