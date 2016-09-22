import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ResolveAccountResponse;

public final class ans
  implements anq
{
  private IBinder a;

  public ans(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(ResolveAccountResponse paramResolveAccountResponse)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
      if (paramResolveAccountResponse != null)
      {
        localParcel1.writeInt(1);
        paramResolveAccountResponse.writeToParcel(localParcel1, 0);
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
 * Qualified Name:     ans
 * JD-Core Version:    0.6.0
 */