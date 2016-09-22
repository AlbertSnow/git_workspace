package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import apj;
import com.google.android.gms.ads.internal.mediation.client.b;

final class am
  implements ak
{
  private IBinder a;

  am(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final IBinder newAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, b paramb, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      IBinder localIBinder1;
      if (paramapj != null)
      {
        localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramAdSizeParcel == null)
          break label137;
        localParcel1.writeInt(1);
        paramAdSizeParcel.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString);
        IBinder localIBinder2 = null;
        if (paramb != null)
          localIBinder2 = paramb.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        localParcel1.writeInt(paramInt);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        IBinder localIBinder3 = localParcel2.readStrongBinder();
        return localIBinder3;
        localIBinder1 = null;
        break;
        label137: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final IBinder newAdManagerByType(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, b paramb, int paramInt1, int paramInt2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      IBinder localIBinder1;
      if (paramapj != null)
      {
        localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramAdSizeParcel == null)
          break label144;
        localParcel1.writeInt(1);
        paramAdSizeParcel.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString);
        IBinder localIBinder2 = null;
        if (paramb != null)
          localIBinder2 = paramb.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        localParcel1.writeInt(paramInt1);
        localParcel1.writeInt(paramInt2);
        this.a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        IBinder localIBinder3 = localParcel2.readStrongBinder();
        return localIBinder3;
        localIBinder1 = null;
        break;
        label144: localParcel1.writeInt(0);
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
 * Qualified Name:     com.google.android.gms.ads.internal.client.am
 * JD-Core Version:    0.6.0
 */