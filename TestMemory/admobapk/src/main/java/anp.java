import android.os.IBinder;
import android.os.Parcel;

final class anp
  implements ann
{
  private IBinder a;

  anp(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final apj getGoogleCertificates()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      apj localapj = apk.a(localParcel2.readStrongBinder());
      return localapj;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final apj getGoogleReleaseCertificates()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      apj localapj = apk.a(localParcel2.readStrongBinder());
      return localapj;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     anp
 * JD-Core Version:    0.6.0
 */