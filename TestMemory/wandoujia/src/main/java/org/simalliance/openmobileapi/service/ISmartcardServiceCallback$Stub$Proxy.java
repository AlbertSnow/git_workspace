package org.simalliance.openmobileapi.service;

import android.os.IBinder;

class ISmartcardServiceCallback$Stub$Proxy
  implements ISmartcardServiceCallback
{
  private IBinder mRemote;

  ISmartcardServiceCallback$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.mRemote;
  }

  public String getInterfaceDescriptor()
  {
    return "org.simalliance.openmobileapi.service.ISmartcardServiceCallback";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.service.ISmartcardServiceCallback.Stub.Proxy
 * JD-Core Version:    0.6.0
 */