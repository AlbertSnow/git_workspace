package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import apj;
import apk;
import com.google.android.gms.ads.internal.mediation.client.c;

public abstract class al extends Binder
  implements ak
{
  public al()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
  }

  public static ak asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
    if ((localIInterface != null) && ((localIInterface instanceof ak)))
      return (ak)localIInterface;
    return new am(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      apj localapj2 = apk.a(paramParcel1.readStrongBinder());
      int j = paramParcel1.readInt();
      AdSizeParcel localAdSizeParcel2 = null;
      if (j != 0)
        localAdSizeParcel2 = i.a(paramParcel1);
      IBinder localIBinder2 = newAdManager(localapj2, localAdSizeParcel2, paramParcel1.readString(), c.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
    apj localapj1 = apk.a(paramParcel1.readStrongBinder());
    int i = paramParcel1.readInt();
    AdSizeParcel localAdSizeParcel1 = null;
    if (i != 0)
      localAdSizeParcel1 = i.a(paramParcel1);
    IBinder localIBinder1 = newAdManagerByType(localapj1, localAdSizeParcel1, paramParcel1.readString(), c.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
    paramParcel2.writeNoException();
    paramParcel2.writeStrongBinder(localIBinder1);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.al
 * JD-Core Version:    0.6.0
 */