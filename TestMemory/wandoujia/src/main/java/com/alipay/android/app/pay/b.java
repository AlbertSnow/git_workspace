package com.alipay.android.app.pay;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class b
  implements IAlixPayCallback
{
  private IBinder a;

  b(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final void startActivity(String paramString1, String paramString2, int paramInt, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.alipay.android.app.pay.IAlixPayCallback");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeInt(paramInt);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
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
 * Qualified Name:     com.alipay.android.app.pay.b
 * JD-Core Version:    0.6.0
 */