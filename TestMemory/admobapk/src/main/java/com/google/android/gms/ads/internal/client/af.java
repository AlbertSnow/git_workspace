package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import apk;
import com.google.android.gms.ads.internal.mediation.client.c;

public abstract class af extends Binder
  implements ae
{
  public af()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
  }

  public static ae asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    if ((localIInterface != null) && ((localIInterface instanceof ae)))
      return (ae)localIInterface;
    return new ag(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    IBinder localIBinder = newAdLoaderBuilder(apk.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), c.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
    paramParcel2.writeNoException();
    paramParcel2.writeStrongBinder(localIBinder);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.af
 * JD-Core Version:    0.6.0
 */