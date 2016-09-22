import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appstreaming.AppStreamingState;

public abstract class ng extends Binder
  implements nf
{
  public ng()
  {
    attachInterface(this, "com.google.android.gms.appstreaming.internal.IAppStreamingHelperDelegate");
  }

  public static nf asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.appstreaming.internal.IAppStreamingHelperDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof nf)))
      return (nf)localIInterface;
    return new nh(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.appstreaming.internal.IAppStreamingHelperDelegate");
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingHelperDelegate");
      initialize(apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingHelperDelegate");
      boolean bool = isAppStreamingSupported();
      paramParcel2.writeNoException();
      if (bool);
      for (int i = 1; ; i = 0)
      {
        paramParcel2.writeInt(i);
        return true;
      }
    case 4:
    }
    paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingHelperDelegate");
    if (paramParcel1.readInt() != 0);
    for (AppStreamingState localAppStreamingState = (AppStreamingState)AppStreamingState.CREATOR.createFromParcel(paramParcel1); ; localAppStreamingState = null)
    {
      apj localapj = getDefaultDialog(localAppStreamingState, apk.a(paramParcel1.readStrongBinder()), apk.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder = null;
      if (localapj != null)
        localIBinder = localapj.asBinder();
      paramParcel2.writeStrongBinder(localIBinder);
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ng
 * JD-Core Version:    0.6.0
 */