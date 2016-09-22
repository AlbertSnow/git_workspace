package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class ao extends Binder
  implements an
{
  public ao()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAppEventListener");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
    a(paramParcel1.readString(), paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.ao
 * JD-Core Version:    0.6.0
 */