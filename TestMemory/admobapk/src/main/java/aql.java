import android.os.IInterface;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;

public abstract interface aql extends IInterface
{
  public abstract GassResponseParcel a(GassRequestParcel paramGassRequestParcel);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aql
 * JD-Core Version:    0.6.0
 */