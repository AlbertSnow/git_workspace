import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;

final class aqn
  implements aql
{
  private IBinder a;

  aqn(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final GassResponseParcel a(GassRequestParcel paramGassRequestParcel)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.gass.internal.IGassService");
        if (paramGassRequestParcel == null)
          continue;
        localParcel1.writeInt(1);
        paramGassRequestParcel.writeToParcel(localParcel1, 0);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        if (localParcel2.readInt() != 0)
        {
          localGassResponseParcel = (GassResponseParcel)GassResponseParcel.CREATOR.createFromParcel(localParcel2);
          return localGassResponseParcel;
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      GassResponseParcel localGassResponseParcel = null;
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aqn
 * JD-Core Version:    0.6.0
 */