package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;

final class av
  implements at
{
  private IBinder a;

  av(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final long a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      long l = localParcel2.readLong();
      return l;
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

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.av
 * JD-Core Version:    0.6.0
 */