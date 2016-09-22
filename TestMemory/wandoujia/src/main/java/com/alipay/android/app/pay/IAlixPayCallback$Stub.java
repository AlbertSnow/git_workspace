package com.alipay.android.app.pay;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IAlixPayCallback$Stub extends Binder
  implements IAlixPayCallback
{
  public IAlixPayCallback$Stub()
  {
    attachInterface(this, "com.alipay.android.app.pay.IAlixPayCallback");
  }

  public static IAlixPayCallback a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.alipay.android.app.pay.IAlixPayCallback");
    if ((localIInterface != null) && ((localIInterface instanceof IAlixPayCallback)))
      return (IAlixPayCallback)localIInterface;
    return new b(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.alipay.android.app.pay.IAlixPayCallback");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.alipay.android.app.pay.IAlixPayCallback");
    String str1 = paramParcel1.readString();
    String str2 = paramParcel1.readString();
    int i = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0);
    for (Bundle localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle = null)
    {
      startActivity(str1, str2, i, localBundle);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.pay.IAlixPayCallback.Stub
 * JD-Core Version:    0.6.0
 */