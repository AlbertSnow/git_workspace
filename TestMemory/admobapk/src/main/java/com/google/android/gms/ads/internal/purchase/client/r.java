package com.google.android.gms.ads.internal.purchase.client;

import android.os.IBinder;
import android.os.Parcel;

public final class r
  implements p
{
  private IBinder a;

  public r(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(m paramm)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      if (paramm != null);
      for (IBinder localIBinder = paramm.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final boolean a(String paramString)
  {
    int i = 1;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      localParcel1.writeString(paramString);
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0)
        return i;
      i = 0;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.client.r
 * JD-Core Version:    0.6.0
 */