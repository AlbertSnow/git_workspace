package com.google.android.gms.ads.internal.purchase.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class q extends Binder
  implements p
{
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      boolean bool = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (bool);
      for (int i = 1; ; i = 0)
      {
        paramParcel2.writeInt(i);
        return true;
      }
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
    IBinder localIBinder = paramParcel1.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
      localObject = null;
    while (true)
    {
      a((m)localObject);
      paramParcel2.writeNoException();
      return true;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
      if ((localIInterface != null) && ((localIInterface instanceof m)))
      {
        localObject = (m)localIInterface;
        continue;
      }
      localObject = new o(localIBinder);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.client.q
 * JD-Core Version:    0.6.0
 */