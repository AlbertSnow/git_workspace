package com.unionpay.mobile.tsm.connect;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IRemoteApdu$Stub extends Binder
  implements IRemoteApdu
{
  public IRemoteApdu$Stub()
  {
    attachInterface(this, "com.unionpay.mobile.tsm.connect.IRemoteApdu");
  }

  public static IRemoteApdu a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.unionpay.mobile.tsm.connect.IRemoteApdu");
    if ((localIInterface != null) && ((localIInterface instanceof IRemoteApdu)))
      return (IRemoteApdu)localIInterface;
    return new b(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.unionpay.mobile.tsm.connect.IRemoteApdu");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.unionpay.mobile.tsm.connect.IRemoteApdu");
      String str = writeApdu(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.unionpay.mobile.tsm.connect.IRemoteApdu");
      closeChannel(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.unionpay.mobile.tsm.connect.IRemoteApdu");
      init();
      paramParcel2.writeNoException();
      return true;
    case 4:
    }
    paramParcel1.enforceInterface("com.unionpay.mobile.tsm.connect.IRemoteApdu");
    registerCallback(IInitCallback.Stub.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mobile.tsm.connect.IRemoteApdu.Stub
 * JD-Core Version:    0.6.0
 */