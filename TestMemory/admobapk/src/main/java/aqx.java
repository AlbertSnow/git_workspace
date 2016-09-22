import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafeBrowsingData;

public abstract interface aqx extends IInterface
{
  public abstract void a(Status paramStatus, AttestationData paramAttestationData);

  public abstract void a(Status paramStatus, SafeBrowsingData paramSafeBrowsingData);

  public abstract void a(String paramString);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aqx
 * JD-Core Version:    0.6.0
 */