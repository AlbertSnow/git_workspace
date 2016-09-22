package org.simalliance.openmobileapi.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ISmartcardService$Stub extends Binder
  implements ISmartcardService
{
  private static final String DESCRIPTOR = "org.simalliance.openmobileapi.service.ISmartcardService";
  static final int TRANSACTION_closeChannel = 1;
  static final int TRANSACTION_getAtr = 4;
  static final int TRANSACTION_getReaders = 2;
  static final int TRANSACTION_getSelectResponse = 9;
  static final int TRANSACTION_isCardPresent = 3;
  static final int TRANSACTION_openBasicChannel = 5;
  static final int TRANSACTION_openBasicChannelAid = 6;
  static final int TRANSACTION_openLogicalChannel = 7;
  static final int TRANSACTION_transmit = 8;

  public ISmartcardService$Stub()
  {
    attachInterface(this, "org.simalliance.openmobileapi.service.ISmartcardService");
  }

  public static ISmartcardService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("org.simalliance.openmobileapi.service.ISmartcardService");
    if ((localIInterface != null) && ((localIInterface instanceof ISmartcardService)))
      return (ISmartcardService)localIInterface;
    return new ISmartcardService.Stub.Proxy(paramIBinder);
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
      paramParcel2.writeString("org.simalliance.openmobileapi.service.ISmartcardService");
      return true;
    case 1:
      paramParcel1.enforceInterface("org.simalliance.openmobileapi.service.ISmartcardService");
      long l6 = paramParcel1.readLong();
      SmartcardError localSmartcardError9 = new SmartcardError();
      closeChannel(l6, localSmartcardError9);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(1);
      localSmartcardError9.writeToParcel(paramParcel2, 1);
      return true;
    case 2:
      paramParcel1.enforceInterface("org.simalliance.openmobileapi.service.ISmartcardService");
      SmartcardError localSmartcardError8 = new SmartcardError();
      String[] arrayOfString = getReaders(localSmartcardError8);
      paramParcel2.writeNoException();
      paramParcel2.writeStringArray(arrayOfString);
      paramParcel2.writeInt(1);
      localSmartcardError8.writeToParcel(paramParcel2, 1);
      return true;
    case 3:
      paramParcel1.enforceInterface("org.simalliance.openmobileapi.service.ISmartcardService");
      String str5 = paramParcel1.readString();
      SmartcardError localSmartcardError7 = new SmartcardError();
      boolean bool = isCardPresent(str5, localSmartcardError7);
      paramParcel2.writeNoException();
      if (bool);
      for (int i = 1; ; i = 0)
      {
        paramParcel2.writeInt(i);
        paramParcel2.writeInt(1);
        localSmartcardError7.writeToParcel(paramParcel2, 1);
        return true;
      }
    case 4:
      paramParcel1.enforceInterface("org.simalliance.openmobileapi.service.ISmartcardService");
      String str4 = paramParcel1.readString();
      SmartcardError localSmartcardError6 = new SmartcardError();
      byte[] arrayOfByte6 = getAtr(str4, localSmartcardError6);
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(arrayOfByte6);
      paramParcel2.writeInt(1);
      localSmartcardError6.writeToParcel(paramParcel2, 1);
      return true;
    case 5:
      paramParcel1.enforceInterface("org.simalliance.openmobileapi.service.ISmartcardService");
      String str3 = paramParcel1.readString();
      ISmartcardServiceCallback localISmartcardServiceCallback3 = ISmartcardServiceCallback.Stub.asInterface(paramParcel1.readStrongBinder());
      SmartcardError localSmartcardError5 = new SmartcardError();
      long l5 = openBasicChannel(str3, localISmartcardServiceCallback3, localSmartcardError5);
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l5);
      paramParcel2.writeInt(1);
      localSmartcardError5.writeToParcel(paramParcel2, 1);
      return true;
    case 6:
      paramParcel1.enforceInterface("org.simalliance.openmobileapi.service.ISmartcardService");
      String str2 = paramParcel1.readString();
      byte[] arrayOfByte5 = paramParcel1.createByteArray();
      ISmartcardServiceCallback localISmartcardServiceCallback2 = ISmartcardServiceCallback.Stub.asInterface(paramParcel1.readStrongBinder());
      SmartcardError localSmartcardError4 = new SmartcardError();
      long l4 = openBasicChannelAid(str2, arrayOfByte5, localISmartcardServiceCallback2, localSmartcardError4);
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l4);
      paramParcel2.writeInt(1);
      localSmartcardError4.writeToParcel(paramParcel2, 1);
      return true;
    case 7:
      paramParcel1.enforceInterface("org.simalliance.openmobileapi.service.ISmartcardService");
      String str1 = paramParcel1.readString();
      byte[] arrayOfByte4 = paramParcel1.createByteArray();
      ISmartcardServiceCallback localISmartcardServiceCallback1 = ISmartcardServiceCallback.Stub.asInterface(paramParcel1.readStrongBinder());
      SmartcardError localSmartcardError3 = new SmartcardError();
      long l3 = openLogicalChannel(str1, arrayOfByte4, localISmartcardServiceCallback1, localSmartcardError3);
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l3);
      paramParcel2.writeInt(1);
      localSmartcardError3.writeToParcel(paramParcel2, 1);
      return true;
    case 8:
      paramParcel1.enforceInterface("org.simalliance.openmobileapi.service.ISmartcardService");
      long l2 = paramParcel1.readLong();
      byte[] arrayOfByte2 = paramParcel1.createByteArray();
      SmartcardError localSmartcardError2 = new SmartcardError();
      byte[] arrayOfByte3 = transmit(l2, arrayOfByte2, localSmartcardError2);
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(arrayOfByte3);
      paramParcel2.writeInt(1);
      localSmartcardError2.writeToParcel(paramParcel2, 1);
      return true;
    case 9:
    }
    paramParcel1.enforceInterface("org.simalliance.openmobileapi.service.ISmartcardService");
    long l1 = paramParcel1.readLong();
    SmartcardError localSmartcardError1 = new SmartcardError();
    byte[] arrayOfByte1 = getSelectResponse(l1, localSmartcardError1);
    paramParcel2.writeNoException();
    paramParcel2.writeByteArray(arrayOfByte1);
    paramParcel2.writeInt(1);
    localSmartcardError1.writeToParcel(paramParcel2, 1);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.service.ISmartcardService.Stub
 * JD-Core Version:    0.6.0
 */