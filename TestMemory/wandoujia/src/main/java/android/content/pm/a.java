package android.content.pm;

import android.os.IBinder;
import android.os.Parcel;

final class a
  implements IPackageDataObserver
{
  private IBinder a;

  a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final void onRemoveCompleted(String paramString, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.content.pm.IPackageDataObserver");
      localParcel.writeString(paramString);
      if (paramBoolean);
      while (true)
      {
        localParcel.writeInt(i);
        this.a.transact(1, localParcel, null, 1);
        return;
        i = 0;
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.content.pm.a
 * JD-Core Version:    0.6.0
 */