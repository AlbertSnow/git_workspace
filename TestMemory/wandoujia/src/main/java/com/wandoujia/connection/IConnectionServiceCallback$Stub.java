package com.wandoujia.connection;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IConnectionServiceCallback$Stub extends Binder
  implements IConnectionServiceCallback
{
  public IConnectionServiceCallback$Stub()
  {
    attachInterface(this, "com.wandoujia.connection.IConnectionServiceCallback");
  }

  public static IConnectionServiceCallback a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.wandoujia.connection.IConnectionServiceCallback");
    if ((localIInterface != null) && ((localIInterface instanceof IConnectionServiceCallback)))
      return (IConnectionServiceCallback)localIInterface;
    return new b(paramIBinder);
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
      paramParcel2.writeString("com.wandoujia.connection.IConnectionServiceCallback");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.wandoujia.connection.IConnectionServiceCallback");
    boolean bool1;
    boolean bool2;
    label72: boolean bool3;
    if (paramParcel1.readInt() != 0)
    {
      bool1 = true;
      if (paramParcel1.readInt() == 0)
        break label120;
      bool2 = true;
      if (paramParcel1.readInt() == 0)
        break label126;
      bool3 = true;
      label82: if (paramParcel1.readInt() == 0)
        break label132;
    }
    label132: for (boolean bool4 = true; ; bool4 = false)
    {
      a(bool1, bool2, bool3, bool4, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
      bool1 = false;
      break;
      label120: bool2 = false;
      break label72;
      label126: bool3 = false;
      break label82;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.connection.IConnectionServiceCallback.Stub
 * JD-Core Version:    0.6.0
 */