package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import apj;
import apk;
import com.google.android.gms.ads.internal.formats.client.e;
import com.google.android.gms.ads.internal.mediation.client.c;
import com.google.android.gms.ads.internal.overlay.client.b;
import com.google.android.gms.ads.internal.purchase.client.g;
import com.google.android.gms.ads.internal.reward.client.d;

public abstract class ar extends Binder
  implements aq
{
  public ar()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
  }

  public static aq asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
    if ((localIInterface != null) && ((localIInterface instanceof aq)))
      return (aq)localIInterface;
    return new as(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IClientApi");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
      apj localapj3 = apk.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0);
      for (AdSizeParcel localAdSizeParcel3 = i.a(paramParcel1); ; localAdSizeParcel3 = null)
      {
        ah localah3 = createBannerAdManager(localapj3, localAdSizeParcel3, paramParcel1.readString(), c.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        IBinder localIBinder10 = null;
        if (localah3 != null)
          localIBinder10 = localah3.asBinder();
        paramParcel2.writeStrongBinder(localIBinder10);
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
      apj localapj2 = apk.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0);
      for (AdSizeParcel localAdSizeParcel2 = i.a(paramParcel1); ; localAdSizeParcel2 = null)
      {
        ah localah2 = createInterstitialAdManager(localapj2, localAdSizeParcel2, paramParcel1.readString(), c.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        IBinder localIBinder9 = null;
        if (localah2 != null)
          localIBinder9 = localah2.asBinder();
        paramParcel2.writeStrongBinder(localIBinder9);
        return true;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
      ab localab = createAdLoaderBuilder(apk.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), c.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      IBinder localIBinder8 = null;
      if (localab != null)
        localIBinder8 = localab.asBinder();
      paramParcel2.writeStrongBinder(localIBinder8);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
      aw localaw2 = getMobileAdsSettingsManager(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder7 = null;
      if (localaw2 != null)
        localIBinder7 = localaw2.asBinder();
      paramParcel2.writeStrongBinder(localIBinder7);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
      e locale = createNativeAdViewDelegate(apk.a(paramParcel1.readStrongBinder()), apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder6 = null;
      if (locale != null)
        localIBinder6 = locale.asBinder();
      paramParcel2.writeStrongBinder(localIBinder6);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
      d locald = createRewardedVideoAd(apk.a(paramParcel1.readStrongBinder()), c.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      IBinder localIBinder5 = null;
      if (locald != null)
        localIBinder5 = locald.asBinder();
      paramParcel2.writeStrongBinder(localIBinder5);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
      g localg = createInAppPurchaseManager(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder4 = null;
      if (localg != null)
        localIBinder4 = localg.asBinder();
      paramParcel2.writeStrongBinder(localIBinder4);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
      b localb = createAdOverlay(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder3 = null;
      if (localb != null)
        localIBinder3 = localb.asBinder();
      paramParcel2.writeStrongBinder(localIBinder3);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
      aw localaw1 = getMobileAdsSettingsManagerWithClientJarVersion(apk.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (localaw1 != null)
        localIBinder2 = localaw1.asBinder();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 10:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
    apj localapj1 = apk.a(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0);
    for (AdSizeParcel localAdSizeParcel1 = i.a(paramParcel1); ; localAdSizeParcel1 = null)
    {
      ah localah1 = createSearchAdManager(localapj1, localAdSizeParcel1, paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (localah1 != null)
        localIBinder1 = localah1.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.ar
 * JD-Core Version:    0.6.0
 */