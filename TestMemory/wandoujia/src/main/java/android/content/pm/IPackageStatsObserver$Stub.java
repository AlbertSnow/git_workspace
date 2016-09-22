package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IPackageStatsObserver$Stub extends Binder
  implements IPackageStatsObserver
{
  private static final String DESCRIPTOR = "android.content.pm.IPackageStatsObserver";
  static final int TRANSACTION_onGetStatsCompleted = 1;

  public IPackageStatsObserver$Stub()
  {
    attachInterface(this, "android.content.pm.IPackageStatsObserver");
  }

  public static IPackageStatsObserver asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.content.pm.IPackageStatsObserver");
    if ((localIInterface != null) && ((localIInterface instanceof IPackageStatsObserver)))
      return (IPackageStatsObserver)localIInterface;
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
      paramParcel2.writeString("android.content.pm.IPackageStatsObserver");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("android.content.pm.IPackageStatsObserver");
    PackageStats localPackageStats;
    if (paramParcel1.readInt() != 0)
    {
      localPackageStats = (PackageStats)PackageStats.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0)
        break label99;
    }
    label99: for (boolean bool = true; ; bool = false)
    {
      onGetStatsCompleted(localPackageStats, bool);
      return true;
      localPackageStats = null;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.content.pm.IPackageStatsObserver.Stub
 * JD-Core Version:    0.6.0
 */