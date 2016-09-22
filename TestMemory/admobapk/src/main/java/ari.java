import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;

public final class ari extends amq
{
  private final Context l;

  public ari(Context paramContext, Looper paramLooper, amk paramamk, aiq paramaiq, air paramair)
  {
    super(paramContext, paramLooper, 45, paramamk, paramaiq, paramair);
    this.l = paramContext;
  }

  protected final String a()
  {
    return "com.google.android.gms.safetynet.service.START";
  }

  protected final String b()
  {
    return "com.google.android.gms.safetynet.internal.ISafetyNetService";
  }

  final String c()
  {
    try
    {
      PackageManager localPackageManager = this.l.getPackageManager();
      if (localPackageManager == null)
        return null;
      ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo(this.l.getPackageName(), 128);
      if (localApplicationInfo == null)
        return null;
      Bundle localBundle = localApplicationInfo.metaData;
      if (localBundle == null)
        return null;
      String str = (String)localBundle.get("com.google.android.safetynet.API_KEY");
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ari
 * JD-Core Version:    0.6.0
 */