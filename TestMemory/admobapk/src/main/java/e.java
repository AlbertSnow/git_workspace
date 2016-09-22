import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;

public final class e
{
  public final Intent a = new Intent("android.intent.action.VIEW");
  private ArrayList b = null;
  private Bundle c = null;
  private ArrayList d = null;

  public e()
  {
    this(null);
  }

  public e(h paramh)
  {
    if (paramh != null)
      this.a.setPackage(paramh.b.getPackageName());
    Bundle localBundle = new Bundle();
    IBinder localIBinder = null;
    if (paramh == null)
    {
      if (Build.VERSION.SDK_INT < 18)
        break label103;
      localBundle.putBinder("android.support.customtabs.extra.SESSION", localIBinder);
    }
    while (true)
    {
      this.a.putExtras(localBundle);
      return;
      localIBinder = paramh.a.asBinder();
      break;
      label103: x.a(localBundle, "android.support.customtabs.extra.SESSION", localIBinder);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     e
 * JD-Core Version:    0.6.0
 */