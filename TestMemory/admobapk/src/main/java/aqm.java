import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;

public abstract class aqm extends Binder
  implements aql
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.gass.internal.IGassService");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.gass.internal.IGassService");
    GassRequestParcel localGassRequestParcel;
    if (paramParcel1.readInt() != 0)
    {
      localGassRequestParcel = (GassRequestParcel)GassRequestParcel.CREATOR.createFromParcel(paramParcel1);
      GassResponseParcel localGassResponseParcel = a(localGassRequestParcel);
      paramParcel2.writeNoException();
      if (localGassResponseParcel == null)
        break label110;
      paramParcel2.writeInt(1);
      localGassResponseParcel.writeToParcel(paramParcel2, 1);
    }
    while (true)
    {
      return true;
      localGassRequestParcel = null;
      break;
      label110: paramParcel2.writeInt(0);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aqm
 * JD-Core Version:    0.6.0
 */