package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;
import android.os.Parcel;
import apj;
import com.google.android.gms.ads.internal.mediation.client.b;

final class i
  implements g
{
  private IBinder a;

  i(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final IBinder newRewardedVideoAd(apj paramapj, b paramb, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
      if (paramapj != null);
      for (IBinder localIBinder1 = paramapj.asBinder(); ; localIBinder1 = null)
      {
        localParcel1.writeStrongBinder(localIBinder1);
        IBinder localIBinder2 = null;
        if (paramb != null)
          localIBinder2 = paramb.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        localParcel1.writeInt(paramInt);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        IBinder localIBinder3 = localParcel2.readStrongBinder();
        return localIBinder3;
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
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.i
 * JD-Core Version:    0.6.0
 */