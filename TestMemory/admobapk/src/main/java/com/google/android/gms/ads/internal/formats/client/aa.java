package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.Parcel;

public final class aa
  implements y
{
  private IBinder a;

  public aa(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(o paramo)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
      if (paramo != null);
      for (IBinder localIBinder = paramo.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
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
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.aa
 * JD-Core Version:    0.6.0
 */