package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IPackageDataObserver$Stub extends Binder
  implements IPackageDataObserver
{
  private static final String DESCRIPTOR = "android.content.pm.IPackageDataObserver";
  static final int TRANSACTION_onRemoveCompleted = 1;

  public IPackageDataObserver$Stub()
  {
    attachInterface(this, "android.content.pm.IPackageDataObserver");
  }

  public static IPackageDataObserver asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.content.pm.IPackageDataObserver");
    if ((localIInterface != null) && ((localIInterface instanceof IPackageDataObserver)))
      return (IPackageDataObserver)localIInterface;
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
      paramParcel2.writeString("android.content.pm.IPackageDataObserver");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("android.content.pm.IPackageDataObserver");
    String str = paramParcel1.readString();
    if (paramParcel1.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      onRemoveCompleted(str, bool);
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.content.pm.IPackageDataObserver.Stub
 * JD-Core Version:    0.6.0
 */