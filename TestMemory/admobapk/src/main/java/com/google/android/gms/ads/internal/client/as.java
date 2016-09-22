package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import apj;
import com.google.android.gms.ads.internal.formats.client.e;
import com.google.android.gms.ads.internal.purchase.client.i;
import com.google.android.gms.ads.internal.reward.client.f;

final class as
  implements aq
{
  private IBinder a;

  as(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final ab createAdLoaderBuilder(apj paramapj, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
      if (paramapj != null);
      for (IBinder localIBinder1 = paramapj.asBinder(); ; localIBinder1 = null)
      {
        localParcel1.writeStrongBinder(localIBinder1);
        localParcel1.writeString(paramString);
        IBinder localIBinder2 = null;
        if (paramb != null)
          localIBinder2 = paramb.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        localParcel1.writeInt(paramInt);
        this.a.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        ab localab = ac.a(localParcel2.readStrongBinder());
        return localab;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final com.google.android.gms.ads.internal.overlay.client.b createAdOverlay(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
      IBinder localIBinder1;
      IBinder localIBinder2;
      Object localObject2;
      if (paramapj != null)
      {
        localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        this.a.transact(8, localParcel1, localParcel2, 0);
        localParcel2.readException();
        localIBinder2 = localParcel2.readStrongBinder();
        localObject2 = null;
        if (localIBinder2 != null)
          break label82;
      }
      while (true)
      {
        return localObject2;
        localIBinder1 = null;
        break;
        label82: IInterface localIInterface = localIBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if ((localIInterface != null) && ((localIInterface instanceof com.google.android.gms.ads.internal.overlay.client.b)))
        {
          localObject2 = (com.google.android.gms.ads.internal.overlay.client.b)localIInterface;
          continue;
        }
        localObject2 = new com.google.android.gms.ads.internal.overlay.client.d(localIBinder2);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject1;
  }

  public final ah createBannerAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
      IBinder localIBinder1;
      if (paramapj != null)
      {
        localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramAdSizeParcel == null)
          break label140;
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
        ah localah = ai.a(localParcel2.readStrongBinder());
        return localah;
        localIBinder1 = null;
        break;
        label140: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final com.google.android.gms.ads.internal.purchase.client.g createInAppPurchaseManager(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
      IBinder localIBinder1;
      IBinder localIBinder2;
      Object localObject2;
      if (paramapj != null)
      {
        localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        this.a.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        localIBinder2 = localParcel2.readStrongBinder();
        localObject2 = null;
        if (localIBinder2 != null)
          break label82;
      }
      while (true)
      {
        return localObject2;
        localIBinder1 = null;
        break;
        label82: IInterface localIInterface = localIBinder2.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        if ((localIInterface != null) && ((localIInterface instanceof com.google.android.gms.ads.internal.purchase.client.g)))
        {
          localObject2 = (com.google.android.gms.ads.internal.purchase.client.g)localIInterface;
          continue;
        }
        localObject2 = new i(localIBinder2);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject1;
  }

  public final ah createInterstitialAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
      IBinder localIBinder1;
      if (paramapj != null)
      {
        localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramAdSizeParcel == null)
          break label140;
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
        this.a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        ah localah = ai.a(localParcel2.readStrongBinder());
        return localah;
        localIBinder1 = null;
        break;
        label140: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final e createNativeAdViewDelegate(apj paramapj1, apj paramapj2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
      IBinder localIBinder1;
      IBinder localIBinder2;
      label45: IBinder localIBinder3;
      Object localObject2;
      if (paramapj1 != null)
      {
        localIBinder1 = paramapj1.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramapj2 == null)
          break label104;
        localIBinder2 = paramapj2.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        this.a.transact(5, localParcel1, localParcel2, 0);
        localParcel2.readException();
        localIBinder3 = localParcel2.readStrongBinder();
        localObject2 = null;
        if (localIBinder3 != null)
          break label110;
      }
      while (true)
      {
        return localObject2;
        localIBinder1 = null;
        break;
        label104: localIBinder2 = null;
        break label45;
        label110: IInterface localIInterface = localIBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if ((localIInterface != null) && ((localIInterface instanceof e)))
        {
          localObject2 = (e)localIInterface;
          continue;
        }
        localObject2 = new com.google.android.gms.ads.internal.formats.client.g(localIBinder3);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject1;
  }

  public final com.google.android.gms.ads.internal.reward.client.d createRewardedVideoAd(apj paramapj, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
      IBinder localIBinder1;
      IBinder localIBinder2;
      label48: IBinder localIBinder3;
      Object localObject2;
      if (paramapj != null)
      {
        localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramb == null)
          break label117;
        localIBinder2 = paramb.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        localParcel1.writeInt(paramInt);
        this.a.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        localIBinder3 = localParcel2.readStrongBinder();
        localObject2 = null;
        if (localIBinder3 != null)
          break label123;
      }
      while (true)
      {
        return localObject2;
        localIBinder1 = null;
        break;
        label117: localIBinder2 = null;
        break label48;
        label123: IInterface localIInterface = localIBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        if ((localIInterface != null) && ((localIInterface instanceof com.google.android.gms.ads.internal.reward.client.d)))
        {
          localObject2 = (com.google.android.gms.ads.internal.reward.client.d)localIInterface;
          continue;
        }
        localObject2 = new f(localIBinder3);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject1;
  }

  public final ah createSearchAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
      IBinder localIBinder;
      if (paramapj != null)
      {
        localIBinder = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramAdSizeParcel == null)
          break label117;
        localParcel1.writeInt(1);
        paramAdSizeParcel.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString);
        localParcel1.writeInt(paramInt);
        this.a.transact(10, localParcel1, localParcel2, 0);
        localParcel2.readException();
        ah localah = ai.a(localParcel2.readStrongBinder());
        return localah;
        localIBinder = null;
        break;
        label117: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final aw getMobileAdsSettingsManager(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        aw localaw = ax.a(localParcel2.readStrongBinder());
        return localaw;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final aw getMobileAdsSettingsManagerWithClientJarVersion(apj paramapj, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        this.a.transact(9, localParcel1, localParcel2, 0);
        localParcel2.readException();
        aw localaw = ax.a(localParcel2.readStrongBinder());
        return localaw;
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
 * Qualified Name:     com.google.android.gms.ads.internal.client.as
 * JD-Core Version:    0.6.0
 */