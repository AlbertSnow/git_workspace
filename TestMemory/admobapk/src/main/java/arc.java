import android.os.IBinder;
import android.os.Parcel;

final class arc
  implements ara
{
  private IBinder a;

  arc(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(aqx paramaqx)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
      if (paramaqx != null);
      for (IBinder localIBinder = paramaqx.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(aqx paramaqx, String paramString1, int[] paramArrayOfInt, int paramInt, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
      if (paramaqx != null);
      for (IBinder localIBinder = paramaqx.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString1);
        localParcel1.writeIntArray(paramArrayOfInt);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString2);
        this.a.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(aqx paramaqx, byte[] paramArrayOfByte)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
      if (paramaqx != null);
      for (IBinder localIBinder = paramaqx.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeByteArray(paramArrayOfByte);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
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
 * Qualified Name:     arc
 * JD-Core Version:    0.6.0
 */