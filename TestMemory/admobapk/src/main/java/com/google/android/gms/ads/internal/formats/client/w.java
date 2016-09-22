package com.google.android.gms.ads.internal.formats.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class w extends Binder
  implements v
{
  public w()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    IBinder localIBinder = paramParcel1.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
      localObject = null;
    while (true)
    {
      a((k)localObject);
      paramParcel2.writeNoException();
      return true;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      if ((localIInterface != null) && ((localIInterface instanceof k)))
      {
        localObject = (k)localIInterface;
        continue;
      }
      localObject = new m(localIBinder);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.w
 * JD-Core Version:    0.6.0
 */