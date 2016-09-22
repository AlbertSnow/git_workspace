import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appstreaming.AppStreamingState;

public abstract class nj extends Binder
  implements ni
{
  public nj()
  {
    attachInterface(this, "com.google.android.gms.appstreaming.internal.IAppStreamingStateListener");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.appstreaming.internal.IAppStreamingStateListener");
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingStateListener");
    if (paramParcel1.readInt() != 0);
    for (AppStreamingState localAppStreamingState = (AppStreamingState)AppStreamingState.CREATOR.createFromParcel(paramParcel1); ; localAppStreamingState = null)
    {
      a(localAppStreamingState);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     nj
 * JD-Core Version:    0.6.0
 */