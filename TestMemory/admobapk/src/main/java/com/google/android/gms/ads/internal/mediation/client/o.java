package com.google.android.gms.ads.internal.mediation.client;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import apk;
import com.google.android.gms.ads.internal.formats.client.a;
import java.util.List;

public abstract class o extends Binder
  implements n
{
  public o()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      String str5 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str5);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      List localList = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList(localList);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      String str4 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      a locala = d();
      paramParcel2.writeNoException();
      if (locala != null);
      for (IBinder localIBinder = locala.asBinder(); ; localIBinder = null)
      {
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      String str3 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      double d = f();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      String str2 = g();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      String str1 = h();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      i();
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      a(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      b(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      boolean bool2 = j();
      paramParcel2.writeNoException();
      int j = 0;
      if (bool2)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      boolean bool1 = k();
      paramParcel2.writeNoException();
      int i = 0;
      if (bool1)
        i = 1;
      paramParcel2.writeInt(i);
      return true;
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      Bundle localBundle = l();
      paramParcel2.writeNoException();
      if (localBundle != null)
      {
        paramParcel2.writeInt(1);
        localBundle.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 16:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    c(apk.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.o
 * JD-Core Version:    0.6.0
 */