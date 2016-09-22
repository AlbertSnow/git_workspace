package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.Parcel;

final class ab
  implements z
{
  private IBinder a;

  ab(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(AdResponseParcel paramAdResponseParcel)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdResponseListener");
      if (paramAdResponseParcel != null)
      {
        localParcel1.writeInt(1);
        paramAdResponseParcel.writeToParcel(localParcel1, 0);
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
 * Qualified Name:     com.google.android.gms.ads.internal.request.ab
 * JD-Core Version:    0.6.0
 */