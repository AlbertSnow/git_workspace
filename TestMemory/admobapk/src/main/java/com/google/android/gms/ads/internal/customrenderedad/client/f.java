package com.google.android.gms.ads.internal.customrenderedad.client;

import android.os.IBinder;
import android.os.Parcel;

public final class f
  implements d
{
  private IBinder a;

  public f(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(a parama)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
      if (parama != null);
      for (IBinder localIBinder = parama.asBinder(); ; localIBinder = null)
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
 * Qualified Name:     com.google.android.gms.ads.internal.customrenderedad.client.f
 * JD-Core Version:    0.6.0
 */