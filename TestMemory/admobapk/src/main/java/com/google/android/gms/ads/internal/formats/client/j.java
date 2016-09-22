package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.Parcel;
import apj;

final class j
  implements h
{
  private IBinder a;

  j(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final IBinder newNativeAdViewDelegate(apj paramapj1, apj paramapj2, apj paramapj3, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
      IBinder localIBinder1;
      if (paramapj1 != null)
      {
        localIBinder1 = paramapj1.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramapj2 == null)
          break label131;
      }
      label131: for (IBinder localIBinder2 = paramapj2.asBinder(); ; localIBinder2 = null)
      {
        localParcel1.writeStrongBinder(localIBinder2);
        IBinder localIBinder3 = null;
        if (paramapj3 != null)
          localIBinder3 = paramapj3.asBinder();
        localParcel1.writeStrongBinder(localIBinder3);
        localParcel1.writeInt(paramInt);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        IBinder localIBinder4 = localParcel2.readStrongBinder();
        return localIBinder4;
        localIBinder1 = null;
        break;
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
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.j
 * JD-Core Version:    0.6.0
 */