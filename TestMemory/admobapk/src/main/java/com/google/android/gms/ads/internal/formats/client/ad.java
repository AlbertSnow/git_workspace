package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.Parcel;

public final class ad
  implements ab
{
  private IBinder a;

  public ad(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(s params, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
      if (params != null);
      for (IBinder localIBinder = params.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.a.transact(1, localParcel1, localParcel2, 0);
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

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.ad
 * JD-Core Version:    0.6.0
 */