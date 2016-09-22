import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafeBrowsingData;

final class aqz
  implements aqx
{
  private IBinder a;

  aqz(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(Status paramStatus, AttestationData paramAttestationData)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
        if (paramStatus == null)
          continue;
        localParcel.writeInt(1);
        paramStatus.writeToParcel(localParcel, 0);
        if (paramAttestationData != null)
        {
          localParcel.writeInt(1);
          paramAttestationData.writeToParcel(localParcel, 0);
          this.a.transact(1, localParcel, null, 1);
          return;
          localParcel.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel.recycle();
      }
      localParcel.writeInt(0);
    }
  }

  public final void a(Status paramStatus, SafeBrowsingData paramSafeBrowsingData)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
        if (paramStatus == null)
          continue;
        localParcel.writeInt(1);
        paramStatus.writeToParcel(localParcel, 0);
        if (paramSafeBrowsingData != null)
        {
          localParcel.writeInt(1);
          paramSafeBrowsingData.writeToParcel(localParcel, 0);
          this.a.transact(3, localParcel, null, 1);
          return;
          localParcel.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel.recycle();
      }
      localParcel.writeInt(0);
    }
  }

  public final void a(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
      localParcel.writeString(paramString);
      this.a.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aqz
 * JD-Core Version:    0.6.0
 */