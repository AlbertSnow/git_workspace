package com.wandoujia.connection;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IOptimizeCallback$Stub extends Binder
  implements IOptimizeCallback
{
  public IOptimizeCallback$Stub()
  {
    attachInterface(this, "com.wandoujia.connection.IOptimizeCallback");
  }

  public static IOptimizeCallback a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.wandoujia.connection.IOptimizeCallback");
    if ((localIInterface != null) && ((localIInterface instanceof IOptimizeCallback)))
      return (IOptimizeCallback)localIInterface;
    return new c(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.wandoujia.connection.IOptimizeCallback");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.wandoujia.connection.IOptimizeCallback");
      int i1 = a(IScanApkPartialCallback.Stub.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i1);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.wandoujia.connection.IOptimizeCallback");
      ScanResult localScanResult2 = a();
      paramParcel2.writeNoException();
      if (localScanResult2 != null)
      {
        paramParcel2.writeInt(1);
        localScanResult2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.wandoujia.connection.IOptimizeCallback");
      ScanResult localScanResult1 = b();
      paramParcel2.writeNoException();
      if (localScanResult1 != null)
      {
        paramParcel2.writeInt(1);
        localScanResult1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.wandoujia.connection.IOptimizeCallback");
      boolean bool5 = c();
      paramParcel2.writeNoException();
      int n = 0;
      if (bool5)
        n = 1;
      paramParcel2.writeInt(n);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.wandoujia.connection.IOptimizeCallback");
      boolean bool4 = d();
      paramParcel2.writeNoException();
      int m = 0;
      if (bool4)
        m = 1;
      paramParcel2.writeInt(m);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.wandoujia.connection.IOptimizeCallback");
      boolean bool3 = e();
      paramParcel2.writeNoException();
      int k = 0;
      if (bool3)
        k = 1;
      paramParcel2.writeInt(k);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.wandoujia.connection.IOptimizeCallback");
      boolean bool2 = f();
      paramParcel2.writeNoException();
      int j = 0;
      if (bool2)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 8:
    }
    paramParcel1.enforceInterface("com.wandoujia.connection.IOptimizeCallback");
    boolean bool1 = a(paramParcel1.createStringArrayList());
    paramParcel2.writeNoException();
    int i = 0;
    if (bool1)
      i = 1;
    paramParcel2.writeInt(i);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.connection.IOptimizeCallback.Stub
 * JD-Core Version:    0.6.0
 */