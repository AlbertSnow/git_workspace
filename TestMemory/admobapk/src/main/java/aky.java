import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class aky extends BroadcastReceiver
{
  public Context a;
  private final akz b;

  public aky(akz paramakz)
  {
    this.b = paramakz;
  }

  public final void a()
  {
    monitorenter;
    try
    {
      if (this.a != null)
        this.a.unregisterReceiver(this);
      this.a = null;
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    Uri localUri = paramIntent.getData();
    String str = null;
    if (localUri != null)
      str = localUri.getSchemeSpecificPart();
    if ("com.google.android.gms".equals(str))
    {
      this.b.a();
      a();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aky
 * JD-Core Version:    0.6.0
 */