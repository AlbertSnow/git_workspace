package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ax extends Binder
  implements aw
{
  public ax()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }

  public static aw a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    if ((localIInterface != null) && ((localIInterface instanceof aw)))
      return (aw)localIInterface;
    return new ay(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      b();
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      a(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    if (paramParcel1.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      a(bool);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.ax
 * JD-Core Version:    0.6.0
 */