package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.client.aa;
import com.google.android.gms.ads.internal.formats.client.ae;
import com.google.android.gms.ads.internal.formats.client.ag;
import com.google.android.gms.ads.internal.formats.client.v;
import com.google.android.gms.ads.internal.formats.client.x;
import com.google.android.gms.ads.internal.formats.t;

public abstract class ac extends Binder
  implements ab
{
  public ac()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
  }

  public static ab a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    if ((localIInterface != null) && ((localIInterface instanceof ab)))
      return (ab)localIInterface;
    return new ad(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      y localy = a();
      paramParcel2.writeNoException();
      if (localy != null);
      for (IBinder localIBinder5 = localy.asBinder(); ; localIBinder5 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder5);
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      a(w.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      IBinder localIBinder4 = paramParcel1.readStrongBinder();
      Object localObject4 = null;
      if (localIBinder4 == null);
      while (true)
      {
        a((v)localObject4);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface4 = localIBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        if ((localIInterface4 != null) && ((localIInterface4 instanceof v)))
        {
          localObject4 = (v)localIInterface4;
          continue;
        }
        localObject4 = new x(localIBinder4);
      }
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      IBinder localIBinder3 = paramParcel1.readStrongBinder();
      Object localObject3 = null;
      if (localIBinder3 == null);
      while (true)
      {
        a((com.google.android.gms.ads.internal.formats.client.y)localObject3);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface3 = localIBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if ((localIInterface3 != null) && ((localIInterface3 instanceof com.google.android.gms.ads.internal.formats.client.y)))
        {
          localObject3 = (com.google.android.gms.ads.internal.formats.client.y)localIInterface3;
          continue;
        }
        localObject3 = new aa(localIBinder3);
      }
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      String str = paramParcel1.readString();
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      Object localObject1;
      IBinder localIBinder2;
      Object localObject2;
      if (localIBinder1 == null)
      {
        localObject1 = null;
        localIBinder2 = paramParcel1.readStrongBinder();
        localObject2 = null;
        if (localIBinder2 != null)
          break label425;
      }
      while (true)
      {
        a(str, (ae)localObject1, (com.google.android.gms.ads.internal.formats.client.ab)localObject2);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface1 = localIBinder1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        if ((localIInterface1 != null) && ((localIInterface1 instanceof ae)))
        {
          localObject1 = (ae)localIInterface1;
          break;
        }
        localObject1 = new ag(localIBinder1);
        break;
        IInterface localIInterface2 = localIBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if ((localIInterface2 != null) && ((localIInterface2 instanceof com.google.android.gms.ads.internal.formats.client.ab)))
        {
          localObject2 = (com.google.android.gms.ads.internal.formats.client.ab)localIInterface2;
          continue;
        }
        localObject2 = new com.google.android.gms.ads.internal.formats.client.ad(localIBinder2);
      }
    case 6:
      label425: paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      int i = paramParcel1.readInt();
      NativeAdOptionsParcel localNativeAdOptionsParcel = null;
      if (i != 0)
        localNativeAdOptionsParcel = t.a(paramParcel1);
      a(localNativeAdOptionsParcel);
      paramParcel2.writeNoException();
      return true;
    case 7:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    a(au.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.ac
 * JD-Core Version:    0.6.0
 */