import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class n
  implements l
{
  private IBinder a;

  n(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final Bundle a(String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          continue;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
        this.a.transact(5, localParcel1, localParcel2, 0);
        localParcel2.readException();
        if (localParcel2.readInt() != 0)
        {
          localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          return localBundle;
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Bundle localBundle = null;
    }
  }

  public final boolean a(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      localParcel1.writeLong(paramLong);
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      int j = 0;
      if (i != 0)
        j = 1;
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final boolean a(i parami)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      if (parami != null);
      for (IBinder localIBinder = parami.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        int j = 0;
        if (i != 0)
          j = 1;
        return j;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final boolean a(i parami, Uri paramUri, Bundle paramBundle, List paramList)
  {
    int i = 1;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
        if (parami == null)
          continue;
        IBinder localIBinder = parami.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramUri == null)
          continue;
        localParcel1.writeInt(1);
        paramUri.writeToParcel(localParcel1, 0);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          localParcel1.writeTypedList(paramList);
          this.a.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int j = localParcel2.readInt();
          if (j == 0)
            break label165;
          return i;
          localIBinder = null;
          continue;
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      localParcel1.writeInt(0);
      continue;
      label165: i = 0;
    }
  }

  public final boolean a(i parami, Bundle paramBundle)
  {
    int i = 1;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
        if (parami == null)
          continue;
        IBinder localIBinder = parami.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramBundle == null)
          continue;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
        this.a.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int j = localParcel2.readInt();
        if (j != 0)
        {
          return i;
          localIBinder = null;
          continue;
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      i = 0;
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     n
 * JD-Core Version:    0.6.0
 */