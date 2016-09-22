import android.os.IBinder;
import android.os.Parcel;

final class aqf
  implements aqd
{
  private IBinder a;

  aqf(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final int a(apj paramapj, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final int a(apj paramapj, String paramString, boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        int i = 0;
        if (paramBoolean)
          i = 1;
        localParcel1.writeInt(i);
        this.a.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int j = localParcel2.readInt();
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

  public final apj a(apj paramapj, String paramString, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        localParcel1.writeInt(paramInt);
        this.a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        apj localapj = apk.a(localParcel2.readStrongBinder());
        return localapj;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aqf
 * JD-Core Version:    0.6.0
 */