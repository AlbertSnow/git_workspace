package com.wandoujia.update.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.wandoujia.update.protocol.UpdateInfo;

public abstract class IUpdateCallback$Stub extends Binder
  implements IUpdateCallback
{
  public IUpdateCallback$Stub()
  {
    attachInterface(this, "com.wandoujia.update.aidl.IUpdateCallback");
  }

  public static IUpdateCallback a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.wandoujia.update.aidl.IUpdateCallback");
    if ((localIInterface != null) && ((localIInterface instanceof IUpdateCallback)))
      return (IUpdateCallback)localIInterface;
    return new a(paramIBinder);
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
      paramParcel2.writeString("com.wandoujia.update.aidl.IUpdateCallback");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.wandoujia.update.aidl.IUpdateCallback");
      int j = paramParcel1.readInt();
      UpdateInfo localUpdateInfo2 = null;
      if (j != 0)
        localUpdateInfo2 = (UpdateInfo)UpdateInfo.CREATOR.createFromParcel(paramParcel1);
      a(localUpdateInfo2);
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.wandoujia.update.aidl.IUpdateCallback");
      a();
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.wandoujia.update.aidl.IUpdateCallback");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.wandoujia.update.aidl.IUpdateCallback");
      int i = paramParcel1.readInt();
      UpdateInfo localUpdateInfo1 = null;
      if (i != 0)
        localUpdateInfo1 = (UpdateInfo)UpdateInfo.CREATOR.createFromParcel(paramParcel1);
      a(localUpdateInfo1, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5:
    }
    paramParcel1.enforceInterface("com.wandoujia.update.aidl.IUpdateCallback");
    if (paramParcel1.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      a(bool);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.aidl.IUpdateCallback.Stub
 * JD-Core Version:    0.6.0
 */