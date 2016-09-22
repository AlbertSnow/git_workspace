package com.wandoujia.update.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.wandoujia.update.protocol.UpdateInfo;

public abstract class IUpdateRemoteService$Stub extends Binder
  implements IUpdateRemoteService
{
  public IUpdateRemoteService$Stub()
  {
    attachInterface(this, "com.wandoujia.update.aidl.IUpdateRemoteService");
  }

  public static IUpdateRemoteService a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.wandoujia.update.aidl.IUpdateRemoteService");
    if ((localIInterface != null) && ((localIInterface instanceof IUpdateRemoteService)))
      return (IUpdateRemoteService)localIInterface;
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
      paramParcel2.writeString("com.wandoujia.update.aidl.IUpdateRemoteService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.wandoujia.update.aidl.IUpdateRemoteService");
      IUpdateCallback localIUpdateCallback = IUpdateCallback.Stub.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0);
      for (UpdateParams localUpdateParams2 = (UpdateParams)UpdateParams.CREATOR.createFromParcel(paramParcel1); ; localUpdateParams2 = null)
      {
        a(localIUpdateCallback, localUpdateParams2);
        paramParcel2.writeNoException();
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.wandoujia.update.aidl.IUpdateRemoteService");
      UpdateInfo localUpdateInfo;
      if (paramParcel1.readInt() != 0)
      {
        localUpdateInfo = (UpdateInfo)UpdateInfo.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label194;
      }
      for (UpdateParams localUpdateParams1 = (UpdateParams)UpdateParams.CREATOR.createFromParcel(paramParcel1); ; localUpdateParams1 = null)
      {
        a(localUpdateInfo, localUpdateParams1);
        paramParcel2.writeNoException();
        return true;
        localUpdateInfo = null;
        break;
      }
    case 3:
      label194: paramParcel1.enforceInterface("com.wandoujia.update.aidl.IUpdateRemoteService");
      a();
      paramParcel2.writeNoException();
      return true;
    case 4:
    }
    paramParcel1.enforceInterface("com.wandoujia.update.aidl.IUpdateRemoteService");
    b();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.aidl.IUpdateRemoteService.Stub
 * JD-Core Version:    0.6.0
 */