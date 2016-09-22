package com.google.android.gms.ads.identifier.internal;

import android.os.Binder;
import android.os.Parcel;

public abstract class b extends Binder
  implements a
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      String str3 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      if (paramParcel1.readInt() != 0);
      for (boolean bool2 = true; ; bool2 = false)
      {
        boolean bool3 = a(bool2);
        paramParcel2.writeNoException();
        int j = 0;
        if (bool3)
          j = 1;
        paramParcel2.writeInt(j);
        return true;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      String str2 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 4:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    String str1 = paramParcel1.readString();
    int i = paramParcel1.readInt();
    boolean bool1 = false;
    if (i != 0)
      bool1 = true;
    a(str1, bool1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.internal.b
 * JD-Core Version:    0.6.0
 */