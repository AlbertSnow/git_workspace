package com.redstone.sdk.enabler.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IRsServiceObserver$Stub extends Binder
  implements IRsServiceObserver
{
  public IRsServiceObserver$Stub()
  {
    attachInterface(this, "com.redstone.sdk.enabler.remote.IRsServiceObserver");
  }

  public static IRsServiceObserver a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.redstone.sdk.enabler.remote.IRsServiceObserver");
    if ((localIInterface != null) && ((localIInterface instanceof IRsServiceObserver)))
      return (IRsServiceObserver)localIInterface;
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
      paramParcel2.writeString("com.redstone.sdk.enabler.remote.IRsServiceObserver");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.redstone.sdk.enabler.remote.IRsServiceObserver");
    a(paramParcel1.readString(), paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.redstone.sdk.enabler.remote.IRsServiceObserver.Stub
 * JD-Core Version:    0.6.0
 */