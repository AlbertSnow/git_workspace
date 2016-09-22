package com.google.android.gms.ads.internal.formats.client;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import apj;

public abstract class b extends Binder
  implements a
{
  public b()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }

  public static a a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    if ((localIInterface != null) && ((localIInterface instanceof a)))
      return (a)localIInterface;
    return new c(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      apj localapj = a();
      paramParcel2.writeNoException();
      if (localapj != null);
      for (IBinder localIBinder = localapj.asBinder(); ; localIBinder = null)
      {
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      Uri localUri = b();
      paramParcel2.writeNoException();
      if (localUri != null)
      {
        paramParcel2.writeInt(1);
        localUri.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    double d = c();
    paramParcel2.writeNoException();
    paramParcel2.writeDouble(d);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.b
 * JD-Core Version:    0.6.0
 */