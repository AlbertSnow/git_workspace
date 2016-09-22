package com.wandoujia.connection;

import android.os.IBinder;
import android.os.Parcel;

final class d
  implements IScanApkPartialCallback
{
  private IBinder a;

  d(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(ScanResult paramScanResult, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.wandoujia.connection.IScanApkPartialCallback");
        if (paramScanResult == null)
          continue;
        localParcel1.writeInt(1);
        paramScanResult.writeToParcel(localParcel1, 0);
        localParcel1.writeLong(paramLong1);
        localParcel1.writeLong(paramLong2);
        localParcel1.writeLong(paramLong3);
        if (paramBoolean)
        {
          localParcel1.writeInt(i);
          this.a.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      i = 0;
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.connection.d
 * JD-Core Version:    0.6.0
 */