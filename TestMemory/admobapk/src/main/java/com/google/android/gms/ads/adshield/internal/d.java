package com.google.android.gms.ads.adshield.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import apj;
import apk;

public abstract class d extends Binder
  implements c
{
  public d()
  {
    attachInterface(this, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
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
      paramParcel2.writeString("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      String str4 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      a(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      boolean bool4 = a(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      int k = 0;
      if (bool4)
        k = 1;
      paramParcel2.writeInt(k);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      boolean bool3 = b(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      int j = 0;
      if (bool3)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      apj localapj2 = a(apk.a(paramParcel1.readStrongBinder()), apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      if (localapj2 != null);
      for (IBinder localIBinder2 = localapj2.asBinder(); ; localIBinder2 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      }
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      String str3 = c(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      String str2 = a(apk.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      d(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      apj localapj1 = b(apk.a(paramParcel1.readStrongBinder()), apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (localapj1 != null)
        localIBinder1 = localapj1.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    case 11:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    String str1 = paramParcel1.readString();
    if (paramParcel1.readInt() != 0);
    for (boolean bool1 = true; ; bool1 = false)
    {
      boolean bool2 = a(str1, bool1);
      paramParcel2.writeNoException();
      int i = 0;
      if (bool2)
        i = 1;
      paramParcel2.writeInt(i);
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.adshield.internal.d
 * JD-Core Version:    0.6.0
 */