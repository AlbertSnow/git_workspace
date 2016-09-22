package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class c
  implements a
{
  private IBinder a;

  public c(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.measurement.service.IGmpConversionTrackingService");
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
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
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.measurement.service.c
 * JD-Core Version:    0.6.0
 */