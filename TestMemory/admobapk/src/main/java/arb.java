import android.os.Binder;
import android.os.Parcel;

public abstract class arb extends Binder
  implements ara
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.safetynet.internal.ISafetyNetService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
      a(aqy.a(paramParcel1.readStrongBinder()), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
      a(aqy.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
    a(aqy.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createIntArray(), paramParcel1.readInt(), paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     arb
 * JD-Core Version:    0.6.0
 */