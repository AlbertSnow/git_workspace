package com.wandoujia.connection;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IConnectionService$Stub extends Binder
  implements IConnectionService
{
  public IConnectionService$Stub()
  {
    attachInterface(this, "com.wandoujia.connection.IConnectionService");
  }

  public static IConnectionService a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.wandoujia.connection.IConnectionService");
    if ((localIInterface != null) && ((localIInterface instanceof IConnectionService)))
      return (IConnectionService)localIInterface;
    return new a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.wandoujia.connection.IConnectionService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.wandoujia.connection.IConnectionService");
      a(IConnectionServiceCallback.Stub.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.wandoujia.connection.IConnectionService");
      a(IOptimizeCallback.Stub.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.wandoujia.connection.IConnectionService");
    b(IConnectionServiceCallback.Stub.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.connection.IConnectionService.Stub
 * JD-Core Version:    0.6.0
 */