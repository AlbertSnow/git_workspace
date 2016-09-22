import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public final class aos
{
  public static boolean a(Context paramContext, int paramInt)
  {
    boolean bool1 = aow.a.a(paramContext).a(paramInt, "com.google.android.gms");
    boolean bool2 = false;
    if (!bool1);
    PackageInfo localPackageInfo;
    ahx localahx;
    do
    {
      while (true)
      {
        return bool2;
        PackageManager localPackageManager = paramContext.getPackageManager();
        boolean bool3;
        try
        {
          localPackageInfo = localPackageManager.getPackageInfo("com.google.android.gms", 64);
          localahx = ahx.a(paramContext);
          paramContext.getPackageManager();
          bool2 = false;
          if (localPackageInfo == null)
            continue;
          if (!ahw.c(localahx.a))
            break;
          return localahx.a(localPackageInfo, true);
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          bool3 = Log.isLoggable("UidVerifier", 3);
          bool2 = false;
        }
        if (!bool3)
          continue;
        Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
        return false;
      }
      bool2 = localahx.a(localPackageInfo, false);
    }
    while ((bool2) || (!localahx.a(localPackageInfo, true)));
    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    return bool2;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aos
 * JD-Core Version:    0.6.0
 */