package com.wandoujia.appmanager.service.aidl;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Parcel;

public abstract class AppResService$Stub extends Binder
  implements AppResService
{
  public AppResService$Stub()
  {
    attachInterface(this, "com.wandoujia.appmanager.service.aidl.AppResService");
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.wandoujia.appmanager.service.aidl.AppResService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.wandoujia.appmanager.service.aidl.AppResService");
      paramParcel1.readString();
      Bitmap localBitmap = a();
      paramParcel2.writeNoException();
      if (localBitmap != null)
      {
        paramParcel2.writeInt(1);
        localBitmap.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.wandoujia.appmanager.service.aidl.AppResService");
    paramParcel1.readString();
    String str = b();
    paramParcel2.writeNoException();
    paramParcel2.writeString(str);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.service.aidl.AppResService.Stub
 * JD-Core Version:    0.6.0
 */