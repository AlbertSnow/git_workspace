import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

public abstract class op extends Binder
  implements oo
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    IBinder localIBinder = paramParcel1.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
      localObject = null;
    while (true)
    {
      int i = paramParcel1.readInt();
      LogEventParcelable localLogEventParcelable = null;
      if (i != 0)
        localLogEventParcelable = nw.a(paramParcel1);
      a((ol)localObject, localLogEventParcelable);
      return true;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof ol)))
      {
        localObject = (ol)localIInterface;
        continue;
      }
      localObject = new on(localIBinder);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     op
 * JD-Core Version:    0.6.0
 */