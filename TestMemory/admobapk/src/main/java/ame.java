import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;

public final class ame extends ani
{
  private alx a;
  private final int b;

  public ame(alx paramalx, int paramInt)
  {
    this.a = paramalx;
    this.b = paramInt;
  }

  public final void a(int paramInt, Bundle paramBundle)
  {
    Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
  }

  public final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    anw.a(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
    alx localalx = this.a;
    int i = this.b;
    localalx.d.sendMessage(localalx.d.obtainMessage(1, i, -1, new amh(localalx, paramInt, paramIBinder, paramBundle)));
    this.a = null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ame
 * JD-Core Version:    0.6.0
 */