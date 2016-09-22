package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class bd extends Binder
  implements bc
{
  public bd()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoController");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IVideoController");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
      a();
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
      b();
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
      int k = paramParcel1.readInt();
      boolean bool2 = false;
      if (k != 0)
        bool2 = true;
      a(bool2);
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
      boolean bool1 = c();
      paramParcel2.writeNoException();
      int j = 0;
      if (bool1)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
      int i = d();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
      float f2 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f2);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
      float f1 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f1);
      return true;
    case 8:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
    IBinder localIBinder = paramParcel1.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
      localObject = null;
    while (true)
    {
      a((bf)localObject);
      paramParcel2.writeNoException();
      return true;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof bf)))
      {
        localObject = (bf)localIInterface;
        continue;
      }
      localObject = new bh(localIBinder);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.bd
 * JD-Core Version:    0.6.0
 */