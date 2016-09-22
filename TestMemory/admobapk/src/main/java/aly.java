import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class aly extends amc
{
  private int c;
  private Bundle d;

  protected aly(alx paramalx, int paramInt, Bundle paramBundle)
  {
    super(paramalx, Boolean.valueOf(true));
    this.c = paramInt;
    this.d = paramBundle;
  }

  protected abstract void a(ConnectionResult paramConnectionResult);

  protected abstract boolean a();
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aly
 * JD-Core Version:    0.6.0
 */