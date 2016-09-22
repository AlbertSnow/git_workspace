import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;

public final class ant
{
  private static Object a = new Object();
  private static boolean b;
  private static int c;

  public static int a(Context paramContext)
  {
    while (true)
    {
      String str;
      aov localaov;
      synchronized (a)
      {
        if (b)
          return c;
        b = true;
        str = paramContext.getPackageName();
        localaov = aow.a.a(paramContext);
      }
      try
      {
        Bundle localBundle = localaov.a(str, 128).metaData;
        if (localBundle == null)
        {
          monitorexit;
          continue;
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        localBundle.getString("com.google.app.id");
        c = localBundle.getInt("com.google.android.gms.version");
        monitorexit;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        while (true)
          Log.wtf("MetadataValueReader", "This should never happen.", localNameNotFoundException);
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ant
 * JD-Core Version:    0.6.0
 */