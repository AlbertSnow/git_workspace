import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.appstreaming.AppStreamingState;

final class nh
  implements nf
{
  private IBinder a;

  nh(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final apj getDefaultDialog(AppStreamingState paramAppStreamingState, apj paramapj1, apj paramapj2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.appstreaming.internal.IAppStreamingHelperDelegate");
        if (paramAppStreamingState == null)
          continue;
        localParcel1.writeInt(1);
        paramAppStreamingState.writeToParcel(localParcel1, 0);
        if (paramapj1 != null)
        {
          localIBinder1 = paramapj1.asBinder();
          localParcel1.writeStrongBinder(localIBinder1);
          IBinder localIBinder2 = null;
          if (paramapj2 == null)
            continue;
          localIBinder2 = paramapj2.asBinder();
          localParcel1.writeStrongBinder(localIBinder2);
          this.a.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          apj localapj = apk.a(localParcel2.readStrongBinder());
          return localapj;
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      IBinder localIBinder1 = null;
    }
  }

  public final void initialize(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appstreaming.internal.IAppStreamingHelperDelegate");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
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

  public final boolean isAppStreamingSupported()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appstreaming.internal.IAppStreamingHelperDelegate");
      this.a.transact(3, localParcel1, localParcel2, 0);
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
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     nh
 * JD-Core Version:    0.6.0
 */