package com.google.android.gms.ads.internal.formats.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class z extends Binder
  implements y
{
  public z()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    IBinder localIBinder = paramParcel1.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
      localObject = null;
    while (true)
    {
      a((o)localObject);
      paramParcel2.writeNoException();
      return true;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      if ((localIInterface != null) && ((localIInterface instanceof o)))
      {
        localObject = (o)localIInterface;
        continue;
      }
      localObject = new q(localIBinder);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.z
 * JD-Core Version:    0.6.0
 */