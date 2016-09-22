package android.content.pm;

import android.os.IBinder;
import android.os.Parcel;

final class b
  implements IPackageStatsObserver
{
  private IBinder a;

  b(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("android.content.pm.IPackageStatsObserver");
        if (paramPackageStats == null)
          continue;
        localParcel.writeInt(1);
        paramPackageStats.writeToParcel(localParcel, 0);
        break label85;
        localParcel.writeInt(i);
        this.a.transact(1, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
      finally
      {
        localParcel.recycle();
      }
      label85: 
      do
      {
        i = 0;
        break;
      }
      while (!paramBoolean);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.content.pm.b
 * JD-Core Version:    0.6.0
 */