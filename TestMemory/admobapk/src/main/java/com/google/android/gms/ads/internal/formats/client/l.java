package com.google.android.gms.ads.internal.formats.client;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import apj;
import java.util.List;

public abstract class l extends Binder
  implements k
{
  public l()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      apj localapj = i();
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (localapj != null)
        localIBinder2 = localapj.asBinder();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      String str5 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str5);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      List localList = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList(localList);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      String str4 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      a locala = d();
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (locala != null)
        localIBinder1 = locala.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      String str3 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      double d = f();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      String str2 = g();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      String str1 = h();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      Bundle localBundle = m();
      paramParcel2.writeNoException();
      if (localBundle != null)
      {
        paramParcel2.writeInt(1);
        localBundle.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 12:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    n();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.l
 * JD-Core Version:    0.6.0
 */