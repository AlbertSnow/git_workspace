import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

final class oq
  implements oo
{
  private IBinder a;

  oq(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(ol paramol, LogEventParcelable paramLogEventParcelable)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      IBinder localIBinder = null;
      if (paramol != null)
        localIBinder = paramol.asBinder();
      localParcel.writeStrongBinder(localIBinder);
      if (paramLogEventParcelable != null)
      {
        localParcel.writeInt(1);
        paramLogEventParcelable.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(1, localParcel, null, 1);
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
 * Qualified Name:     oq
 * JD-Core Version:    0.6.0
 */