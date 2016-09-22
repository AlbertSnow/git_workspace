package com.wandoujia.connection;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IScanApkPartialCallback$Stub extends Binder
  implements IScanApkPartialCallback
{
  public IScanApkPartialCallback$Stub()
  {
    attachInterface(this, "com.wandoujia.connection.IScanApkPartialCallback");
  }

  public static IScanApkPartialCallback a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.wandoujia.connection.IScanApkPartialCallback");
    if ((localIInterface != null) && ((localIInterface instanceof IScanApkPartialCallback)))
      return (IScanApkPartialCallback)localIInterface;
    return new d(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.wandoujia.connection.IScanApkPartialCallback");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.wandoujia.connection.IScanApkPartialCallback");
    ScanResult localScanResult;
    long l1;
    long l2;
    long l3;
    if (paramParcel1.readInt() != 0)
    {
      localScanResult = (ScanResult)ScanResult.CREATOR.createFromParcel(paramParcel1);
      l1 = paramParcel1.readLong();
      l2 = paramParcel1.readLong();
      l3 = paramParcel1.readLong();
      if (paramParcel1.readInt() == 0)
        break label127;
    }
    label127: for (boolean bool = true; ; bool = false)
    {
      a(localScanResult, l1, l2, l3, bool);
      paramParcel2.writeNoException();
      return true;
      localScanResult = null;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.connection.IScanApkPartialCallback.Stub
 * JD-Core Version:    0.6.0
 */