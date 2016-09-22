import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class aqe extends Binder
  implements aqd
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.dynamite.IDynamiteLoader");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
      int j = a(apk.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
      apj localapj2 = a(apk.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (localapj2 != null);
      for (IBinder localIBinder = localapj2.asBinder(); ; localIBinder = null)
      {
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
    apj localapj1 = apk.a(paramParcel1.readStrongBinder());
    String str = paramParcel1.readString();
    if (paramParcel1.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      int i = a(localapj1, str, bool);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aqe
 * JD-Core Version:    0.6.0
 */