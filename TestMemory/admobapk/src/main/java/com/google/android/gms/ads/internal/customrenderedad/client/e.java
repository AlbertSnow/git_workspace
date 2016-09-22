package com.google.android.gms.ads.internal.customrenderedad.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class e extends Binder
  implements d
{
  public e()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    IBinder localIBinder = paramParcel1.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
      localObject = null;
    while (true)
    {
      a((a)localObject);
      paramParcel2.writeNoException();
      return true;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
      if ((localIInterface != null) && ((localIInterface instanceof a)))
      {
        localObject = (a)localIInterface;
        continue;
      }
      localObject = new c(localIBinder);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.customrenderedad.client.e
 * JD-Core Version:    0.6.0
 */