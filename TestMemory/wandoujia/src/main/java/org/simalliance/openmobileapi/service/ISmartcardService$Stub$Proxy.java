package org.simalliance.openmobileapi.service;

import android.os.IBinder;
import android.os.Parcel;

class ISmartcardService$Stub$Proxy
  implements ISmartcardService
{
  private IBinder mRemote;

  ISmartcardService$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.mRemote;
  }

  public void closeChannel(long paramLong, SmartcardError paramSmartcardError)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("org.simalliance.openmobileapi.service.ISmartcardService");
      localParcel1.writeLong(paramLong);
      this.mRemote.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
        paramSmartcardError.readFromParcel(localParcel2);
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public byte[] getAtr(String paramString, SmartcardError paramSmartcardError)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("org.simalliance.openmobileapi.service.ISmartcardService");
      localParcel1.writeString(paramString);
      this.mRemote.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      byte[] arrayOfByte = localParcel2.createByteArray();
      if (localParcel2.readInt() != 0)
        paramSmartcardError.readFromParcel(localParcel2);
      return arrayOfByte;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public String getInterfaceDescriptor()
  {
    return "org.simalliance.openmobileapi.service.ISmartcardService";
  }

  public String[] getReaders(SmartcardError paramSmartcardError)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("org.simalliance.openmobileapi.service.ISmartcardService");
      this.mRemote.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String[] arrayOfString = localParcel2.createStringArray();
      if (localParcel2.readInt() != 0)
        paramSmartcardError.readFromParcel(localParcel2);
      return arrayOfString;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public byte[] getSelectResponse(long paramLong, SmartcardError paramSmartcardError)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("org.simalliance.openmobileapi.service.ISmartcardService");
      localParcel1.writeLong(paramLong);
      this.mRemote.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      byte[] arrayOfByte = localParcel2.createByteArray();
      if (localParcel2.readInt() != 0)
        paramSmartcardError.readFromParcel(localParcel2);
      return arrayOfByte;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public boolean isCardPresent(String paramString, SmartcardError paramSmartcardError)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("org.simalliance.openmobileapi.service.ISmartcardService");
      localParcel1.writeString(paramString);
      this.mRemote.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      int j = 0;
      if (i != 0)
        j = 1;
      if (localParcel2.readInt() != 0)
        paramSmartcardError.readFromParcel(localParcel2);
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public long openBasicChannel(String paramString, ISmartcardServiceCallback paramISmartcardServiceCallback, SmartcardError paramSmartcardError)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("org.simalliance.openmobileapi.service.ISmartcardService");
      localParcel1.writeString(paramString);
      if (paramISmartcardServiceCallback != null);
      for (IBinder localIBinder = paramISmartcardServiceCallback.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.mRemote.transact(5, localParcel1, localParcel2, 0);
        localParcel2.readException();
        long l = localParcel2.readLong();
        if (localParcel2.readInt() != 0)
          paramSmartcardError.readFromParcel(localParcel2);
        return l;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public long openBasicChannelAid(String paramString, byte[] paramArrayOfByte, ISmartcardServiceCallback paramISmartcardServiceCallback, SmartcardError paramSmartcardError)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("org.simalliance.openmobileapi.service.ISmartcardService");
      localParcel1.writeString(paramString);
      localParcel1.writeByteArray(paramArrayOfByte);
      if (paramISmartcardServiceCallback != null);
      for (IBinder localIBinder = paramISmartcardServiceCallback.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.mRemote.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        long l = localParcel2.readLong();
        if (localParcel2.readInt() != 0)
          paramSmartcardError.readFromParcel(localParcel2);
        return l;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public long openLogicalChannel(String paramString, byte[] paramArrayOfByte, ISmartcardServiceCallback paramISmartcardServiceCallback, SmartcardError paramSmartcardError)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("org.simalliance.openmobileapi.service.ISmartcardService");
      localParcel1.writeString(paramString);
      localParcel1.writeByteArray(paramArrayOfByte);
      if (paramISmartcardServiceCallback != null);
      for (IBinder localIBinder = paramISmartcardServiceCallback.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.mRemote.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        long l = localParcel2.readLong();
        if (localParcel2.readInt() != 0)
          paramSmartcardError.readFromParcel(localParcel2);
        return l;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public byte[] transmit(long paramLong, byte[] paramArrayOfByte, SmartcardError paramSmartcardError)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("org.simalliance.openmobileapi.service.ISmartcardService");
      localParcel1.writeLong(paramLong);
      localParcel1.writeByteArray(paramArrayOfByte);
      this.mRemote.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      byte[] arrayOfByte = localParcel2.createByteArray();
      if (localParcel2.readInt() != 0)
        paramSmartcardError.readFromParcel(localParcel2);
      return arrayOfByte;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.service.ISmartcardService.Stub.Proxy
 * JD-Core Version:    0.6.0
 */