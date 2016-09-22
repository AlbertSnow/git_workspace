package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class INotificationSideChannel$Stub extends Binder
  implements INotificationSideChannel
{
  public INotificationSideChannel$Stub()
  {
    attachInterface(this, "android.support.v4.app.INotificationSideChannel");
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default:
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
      do
      {
        return bool;
        paramParcel2.writeString("android.support.v4.app.INotificationSideChannel");
        return bool;
        paramParcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
        paramParcel1.readString();
        paramParcel1.readInt();
        paramParcel1.readString();
      }
      while (paramParcel1.readInt() == 0);
      Notification.CREATOR.createFromParcel(paramParcel1);
      return bool;
    case 2:
      paramParcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
      paramParcel1.readString();
      paramParcel1.readInt();
      paramParcel1.readString();
      return bool;
    case 3:
    }
    paramParcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
    paramParcel1.readString();
    return bool;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.INotificationSideChannel.Stub
 * JD-Core Version:    0.6.0
 */