package com.google.android.gms.ads.internal.formats.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import apj;
import apk;

public abstract class f extends Binder
  implements e
{
  public f()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      a(paramParcel1.readString(), apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      apj localapj = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localapj != null);
      for (IBinder localIBinder = localapj.asBinder(); ; localIBinder = null)
      {
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      a(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    a();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.f
 * JD-Core Version:    0.6.0
 */