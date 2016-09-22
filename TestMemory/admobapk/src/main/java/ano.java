import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ano extends Binder
  implements ann
{
  public ano()
  {
    attachInterface(this, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
  }

  public static ann asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
    if ((localIInterface != null) && ((localIInterface instanceof ann)))
      return (ann)localIInterface;
    return new anp(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      apj localapj2 = getGoogleCertificates();
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (localapj2 != null)
        localIBinder2 = localapj2.asBinder();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
    apj localapj1 = getGoogleReleaseCertificates();
    paramParcel2.writeNoException();
    IBinder localIBinder1 = null;
    if (localapj1 != null)
      localIBinder1 = localapj1.asBinder();
    paramParcel2.writeStrongBinder(localIBinder1);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ano
 * JD-Core Version:    0.6.0
 */