package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class z extends Binder
  implements y
{
  public z()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoader");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
      if (paramParcel1.readInt() != 0);
      for (AdRequestParcel localAdRequestParcel = g.a(paramParcel1); ; localAdRequestParcel = null)
      {
        a(localAdRequestParcel);
        paramParcel2.writeNoException();
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
      String str = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
    boolean bool = b();
    paramParcel2.writeNoException();
    if (bool);
    for (int i = 1; ; i = 0)
    {
      paramParcel2.writeInt(i);
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.z
 * JD-Core Version:    0.6.0
 */