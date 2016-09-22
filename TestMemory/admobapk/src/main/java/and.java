import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class and
  implements anb
{
  private IBinder a;

  and(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final Account a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localAccount = (Account)Account.CREATOR.createFromParcel(localParcel2);
        return localAccount;
      }
      Account localAccount = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     and
 * JD-Core Version:    0.6.0
 */