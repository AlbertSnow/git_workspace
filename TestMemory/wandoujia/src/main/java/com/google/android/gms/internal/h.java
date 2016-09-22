package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

final class h
  implements zzjk
{
  private IBinder a;

  h(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(ProxyResponse paramProxyResponse)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthCallbacks");
      if (paramProxyResponse != null)
      {
        localParcel1.writeInt(1);
        paramProxyResponse.writeToParcel(localParcel1, 0);
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

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.h
 * JD-Core Version:    0.6.0
 */