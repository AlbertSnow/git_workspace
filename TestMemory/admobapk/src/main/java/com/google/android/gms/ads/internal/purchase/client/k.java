package com.google.android.gms.ads.internal.purchase.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import apk;

public abstract class k extends Binder
  implements j
{
  public k()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
  }

  public static j asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
    if ((localIInterface != null) && ((localIInterface instanceof j)))
      return (j)localIInterface;
    return new l(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
    IBinder localIBinder = newInAppPurchaseManager(apk.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    paramParcel2.writeStrongBinder(localIBinder);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.client.k
 * JD-Core Version:    0.6.0
 */