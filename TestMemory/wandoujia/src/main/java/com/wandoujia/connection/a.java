package com.wandoujia.connection;

import android.os.IBinder;
import android.os.Parcel;

final class a
  implements IConnectionService
{
  private IBinder a;

  a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(IConnectionServiceCallback paramIConnectionServiceCallback)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.connection.IConnectionService");
      if (paramIConnectionServiceCallback != null);
      for (IBinder localIBinder = paramIConnectionServiceCallback.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(IOptimizeCallback paramIOptimizeCallback)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.connection.IConnectionService");
      if (paramIOptimizeCallback != null);
      for (IBinder localIBinder = paramIOptimizeCallback.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
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

  public final void b(IConnectionServiceCallback paramIConnectionServiceCallback)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.connection.IConnectionService");
      if (paramIConnectionServiceCallback != null);
      for (IBinder localIBinder = paramIConnectionServiceCallback.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
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
 * Qualified Name:     com.wandoujia.connection.a
 * JD-Core Version:    0.6.0
 */