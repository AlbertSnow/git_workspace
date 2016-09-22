package com.google.android.gms.ads.adshield.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import apk;

public abstract class g extends Binder
  implements f
{
  public g()
  {
    attachInterface(this, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
  }

  public static f asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    if ((localIInterface != null) && ((localIInterface instanceof f)))
      return (f)localIInterface;
    return new h(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
      IBinder localIBinder2 = newAdShieldClient(paramParcel1.readString(), apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    IBinder localIBinder1 = newAdShieldClientWithoutAdvertisingId(paramParcel1.readString(), apk.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    paramParcel2.writeStrongBinder(localIBinder1);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.adshield.internal.g
 * JD-Core Version:    0.6.0
 */