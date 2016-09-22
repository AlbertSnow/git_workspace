import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafeBrowsingData;

public abstract class aqy extends Binder
  implements aqx
{
  public aqy()
  {
    attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
  }

  public static aqx a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof aqx)))
      return (aqx)localIInterface;
    return new aqz(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
      Status localStatus2;
      if (paramParcel1.readInt() != 0)
      {
        localStatus2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label126;
      }
      for (AttestationData localAttestationData = (AttestationData)AttestationData.CREATOR.createFromParcel(paramParcel1); ; localAttestationData = null)
      {
        a(localStatus2, localAttestationData);
        return true;
        localStatus2 = null;
        break;
      }
    case 2:
      label126: paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
      a(paramParcel1.readString());
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    Status localStatus1;
    if (paramParcel1.readInt() != 0)
    {
      localStatus1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0)
        break label212;
    }
    label212: for (SafeBrowsingData localSafeBrowsingData = (SafeBrowsingData)SafeBrowsingData.CREATOR.createFromParcel(paramParcel1); ; localSafeBrowsingData = null)
    {
      a(localStatus1, localSafeBrowsingData);
      return true;
      localStatus1 = null;
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aqy
 * JD-Core Version:    0.6.0
 */