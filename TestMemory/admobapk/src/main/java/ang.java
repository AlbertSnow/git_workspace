import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class ang extends Binder
  implements anf
{
  public ang()
  {
    attachInterface(this, "com.google.android.gms.common.internal.ICertData");
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
      paramParcel2.writeString("com.google.android.gms.common.internal.ICertData");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.ICertData");
      apj localapj = b();
      paramParcel2.writeNoException();
      if (localapj != null);
      for (IBinder localIBinder = localapj.asBinder(); ; localIBinder = null)
      {
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.ICertData");
    int i = c();
    paramParcel2.writeNoException();
    paramParcel2.writeInt(i);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ang
 * JD-Core Version:    0.6.0
 */