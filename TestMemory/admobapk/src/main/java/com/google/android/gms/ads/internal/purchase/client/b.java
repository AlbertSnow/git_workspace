package com.google.android.gms.ads.internal.purchase.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class b extends Binder
  implements a
{
  public b()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      String str = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
    b(paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.client.b
 * JD-Core Version:    0.6.0
 */