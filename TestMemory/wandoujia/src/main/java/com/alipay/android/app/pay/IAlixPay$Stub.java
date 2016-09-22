package com.alipay.android.app.pay;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IAlixPay$Stub extends Binder
  implements IAlixPay
{
  public IAlixPay$Stub()
  {
    attachInterface(this, "com.alipay.android.app.pay.IAlixPay");
  }

  public static IAlixPay a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.alipay.android.app.pay.IAlixPay");
    if ((localIInterface != null) && ((localIInterface instanceof IAlixPay)))
      return (IAlixPay)localIInterface;
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
      paramParcel2.writeString("com.alipay.android.app.pay.IAlixPay");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.alipay.android.app.pay.IAlixPay");
      String str2 = pay(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.alipay.android.app.pay.IAlixPay");
      String str1 = payWithURL(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.alipay.android.app.pay.IAlixPay");
      boolean bool = isAuthenticated();
      paramParcel2.writeNoException();
      if (bool);
      for (int i = 1; ; i = 0)
      {
        paramParcel2.writeInt(i);
        return true;
      }
    case 4:
      paramParcel1.enforceInterface("com.alipay.android.app.pay.IAlixPay");
      registerCallback(IAlixPayCallback.Stub.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5:
    }
    paramParcel1.enforceInterface("com.alipay.android.app.pay.IAlixPay");
    unregisterCallback(IAlixPayCallback.Stub.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.pay.IAlixPay.Stub
 * JD-Core Version:    0.6.0
 */