package com.google.android.gms.ads.internal.mediation.client;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import apk;
import com.google.android.gms.ads.internal.formats.client.a;
import java.util.List;

public abstract class r extends Binder
  implements q
{
  public r()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      String str4 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      List localList = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList(localList);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      String str3 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      a locala = d();
      paramParcel2.writeNoException();
      if (locala != null);
      for (IBinder localIBinder = locala.asBinder(); ; localIBinder = null)
      {
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      String str2 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      String str1 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      g();
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      a(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      b(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      boolean bool2 = h();
      paramParcel2.writeNoException();
      int j = 0;
      if (bool2)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      boolean bool1 = i();
      paramParcel2.writeNoException();
      int i = 0;
      if (bool1)
        i = 1;
      paramParcel2.writeInt(i);
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      Bundle localBundle = j();
      paramParcel2.writeNoException();
      if (localBundle != null)
      {
        paramParcel2.writeInt(1);
        localBundle.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 14:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    c(apk.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.r
 * JD-Core Version:    0.6.0
 */