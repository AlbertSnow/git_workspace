import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class aje
  implements air
{
  public final int a;
  public final aio b;
  public final air c;

  public aje(ajd paramajd, int paramInt, aio paramaio, air paramair)
  {
    this.a = paramInt;
    this.b = paramaio;
    this.c = paramair;
    paramaio.a(this);
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    String str = String.valueOf(paramConnectionResult);
    Log.d("AutoManageHelper", 27 + String.valueOf(str).length() + "beginFailureResolution for " + str);
    this.d.b(paramConnectionResult, this.a);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aje
 * JD-Core Version:    0.6.0
 */