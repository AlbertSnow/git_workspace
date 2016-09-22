package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class x extends Binder
  implements w
{
  public x()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
      int i = paramParcel1.readInt();
      AdRequestInfoParcel localAdRequestInfoParcel2 = null;
      if (i != 0)
        localAdRequestInfoParcel2 = r.a(paramParcel1);
      AdResponseParcel localAdResponseParcel = a(localAdRequestInfoParcel2);
      paramParcel2.writeNoException();
      if (localAdResponseParcel != null)
      {
        paramParcel2.writeInt(1);
        localAdResponseParcel.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
    AdRequestInfoParcel localAdRequestInfoParcel1;
    IBinder localIBinder;
    Object localObject;
    if (paramParcel1.readInt() != 0)
    {
      localAdRequestInfoParcel1 = r.a(paramParcel1);
      localIBinder = paramParcel1.readStrongBinder();
      localObject = null;
      if (localIBinder != null)
        break label180;
    }
    while (true)
    {
      a(localAdRequestInfoParcel1, (z)localObject);
      paramParcel2.writeNoException();
      return true;
      localAdRequestInfoParcel1 = null;
      break;
      label180: IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
      if ((localIInterface != null) && ((localIInterface instanceof z)))
      {
        localObject = (z)localIInterface;
        continue;
      }
      localObject = new ab(localIBinder);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.x
 * JD-Core Version:    0.6.0
 */