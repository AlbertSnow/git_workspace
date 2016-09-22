import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.appstreaming.AppStreamingState;

final class nk
  implements ni
{
  private IBinder a;

  nk(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(AppStreamingState paramAppStreamingState)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appstreaming.internal.IAppStreamingStateListener");
      if (paramAppStreamingState != null)
      {
        localParcel1.writeInt(1);
        paramAppStreamingState.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
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
 * Qualified Name:     nk
 * JD-Core Version:    0.6.0
 */