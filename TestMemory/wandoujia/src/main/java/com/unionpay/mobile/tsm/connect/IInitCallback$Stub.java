package com.unionpay.mobile.tsm.connect;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IInitCallback$Stub extends Binder
  implements IInitCallback
{
  public IInitCallback$Stub()
  {
    attachInterface(this, "com.unionpay.mobile.tsm.connect.IInitCallback");
  }

  public static IInitCallback a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.unionpay.mobile.tsm.connect.IInitCallback");
    if ((localIInterface != null) && ((localIInterface instanceof IInitCallback)))
      return (IInitCallback)localIInterface;
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
      paramParcel2.writeString("com.unionpay.mobile.tsm.connect.IInitCallback");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.unionpay.mobile.tsm.connect.IInitCallback");
      initSucceed();
      paramParcel2.writeNoException();
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.unionpay.mobile.tsm.connect.IInitCallback");
    initFailed();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mobile.tsm.connect.IInitCallback.Stub
 * JD-Core Version:    0.6.0
 */