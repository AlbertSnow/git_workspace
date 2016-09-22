package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import apk;

public abstract class e extends Binder
  implements d
{
  public e()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      if (paramParcel1.readInt() != 0);
      for (RewardedVideoAdRequestParcel localRewardedVideoAdRequestParcel = p.a(paramParcel1); ; localRewardedVideoAdRequestParcel = null)
      {
        a(localRewardedVideoAdRequestParcel);
        paramParcel2.writeNoException();
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      a();
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      a(k.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      boolean bool = b();
      paramParcel2.writeNoException();
      if (bool);
      for (int i = 1; ; i = 0)
      {
        paramParcel2.writeInt(i);
        return true;
      }
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      c();
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      d();
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      e();
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      a(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      b(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 11:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    c(apk.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.e
 * JD-Core Version:    0.6.0
 */