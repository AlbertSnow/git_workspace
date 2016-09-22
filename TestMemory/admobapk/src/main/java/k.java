import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class k
  implements i
{
  private IBinder a;

  k(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(int paramInt, Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
      localParcel.writeInt(paramInt);
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(2, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final void a(String paramString, Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
      localParcel.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(3, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     k
 * JD-Core Version:    0.6.0
 */