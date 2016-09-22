package com.google.android.gms.ads.internal.purchase.client;

import android.os.IBinder;
import android.os.Parcel;

final class c
  implements a
{
  private IBinder a;

  c(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final String a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      localParcel1.writeInt(paramInt);
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
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

  public final void b(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      localParcel1.writeInt(paramInt);
      this.a.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
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
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.client.c
 * JD-Core Version:    0.6.0
 */