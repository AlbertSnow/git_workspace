package com.google.android.gms.ads.internal.purchase.client;

import android.os.IBinder;
import android.os.Parcel;
import apj;

final class l
  implements j
{
  private IBinder a;

  l(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final IBinder newInAppPurchaseManager(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
      if (paramapj != null);
      for (IBinder localIBinder1 = paramapj.asBinder(); ; localIBinder1 = null)
      {
        localParcel1.writeStrongBinder(localIBinder1);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        IBinder localIBinder2 = localParcel2.readStrongBinder();
        return localIBinder2;
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

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.client.l
 * JD-Core Version:    0.6.0
 */