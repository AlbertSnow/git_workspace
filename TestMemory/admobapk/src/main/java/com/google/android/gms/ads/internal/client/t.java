package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class t extends Binder
  implements s
{
  public t()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdClickListener");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdClickListener");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
    a();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.t
 * JD-Core Version:    0.6.0
 */