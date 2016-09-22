import android.content.Context;
import android.util.Log;

public final class oz
{
  private static Context a;

  static void a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (a == null)
        if (paramContext != null)
          a = paramContext.getApplicationContext();
      while (true)
      {
        return;
        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     oz
 * JD-Core Version:    0.6.0
 */