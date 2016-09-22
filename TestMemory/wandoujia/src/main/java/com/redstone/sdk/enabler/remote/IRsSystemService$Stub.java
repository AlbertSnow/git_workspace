package com.redstone.sdk.enabler.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IRsSystemService$Stub extends Binder
  implements IRsSystemService
{
  public IRsSystemService$Stub()
  {
    attachInterface(this, "com.redstone.sdk.enabler.remote.IRsSystemService");
  }

  public static IRsSystemService a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.redstone.sdk.enabler.remote.IRsSystemService");
    if ((localIInterface != null) && ((localIInterface instanceof IRsSystemService)))
      return (IRsSystemService)localIInterface;
    return new b(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.redstone.sdk.enabler.remote.IRsSystemService");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.redstone.sdk.enabler.remote.IRsSystemService");
    int i = a(paramParcel1.readString(), paramParcel1.readString(), IRsServiceObserver.Stub.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    paramParcel2.writeInt(i);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.redstone.sdk.enabler.remote.IRsSystemService.Stub
 * JD-Core Version:    0.6.0
 */