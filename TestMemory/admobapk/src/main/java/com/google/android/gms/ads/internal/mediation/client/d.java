package com.google.android.gms.ads.internal.mediation.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

final class d
  implements b
{
  private IBinder a;

  d(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final e a(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
      localParcel1.writeString(paramString);
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      IBinder localIBinder = localParcel2.readStrongBinder();
      Object localObject2;
      if (localIBinder == null)
        localObject2 = null;
      while (true)
      {
        return localObject2;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if ((localIInterface != null) && ((localIInterface instanceof e)))
        {
          localObject2 = (e)localIInterface;
          continue;
        }
        localObject2 = new g(localIBinder);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject1;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final boolean b(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
      localParcel1.writeString(paramString);
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      int j = 0;
      if (i != 0)
        j = 1;
      return j;
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
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.d
 * JD-Core Version:    0.6.0
 */