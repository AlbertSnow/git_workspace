package org.simalliance.openmobileapi.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ISmartcardServiceCallback$Stub extends Binder
  implements ISmartcardServiceCallback
{
  private static final String DESCRIPTOR = "org.simalliance.openmobileapi.service.ISmartcardServiceCallback";

  public ISmartcardServiceCallback$Stub()
  {
    attachInterface(this, "org.simalliance.openmobileapi.service.ISmartcardServiceCallback");
  }

  public static ISmartcardServiceCallback asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("org.simalliance.openmobileapi.service.ISmartcardServiceCallback");
    if ((localIInterface != null) && ((localIInterface instanceof ISmartcardServiceCallback)))
      return (ISmartcardServiceCallback)localIInterface;
    return new ISmartcardServiceCallback.Stub.Proxy(paramIBinder);
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
    }
    paramParcel2.writeString("org.simalliance.openmobileapi.service.ISmartcardServiceCallback");
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.service.ISmartcardServiceCallback.Stub
 * JD-Core Version:    0.6.0
 */