import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class oy
{
  public static final int b = ahw.a;
  public static final oy c = new oy();

  private static String a(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("gcore_");
    localStringBuilder.append(b);
    localStringBuilder.append("-");
    if (!TextUtils.isEmpty(paramString))
      localStringBuilder.append(paramString);
    localStringBuilder.append("-");
    if (paramContext != null)
      localStringBuilder.append(paramContext.getPackageName());
    localStringBuilder.append("-");
    if (paramContext != null);
    try
    {
      localStringBuilder.append(paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode);
      label94: return localStringBuilder.toString();
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label94;
    }
  }

  public static void c(Context paramContext)
  {
    if (!ahw.b.getAndSet(true));
    try
    {
      NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
      if (localNotificationManager != null)
        localNotificationManager.cancel(10436);
      return;
    }
    catch (SecurityException localSecurityException)
    {
    }
  }

  public int a(Context paramContext)
  {
    int i = ahw.b(paramContext);
    if (ahw.b(paramContext, i))
      i = 18;
    return i;
  }

  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2)
  {
    return a(paramContext, paramInt1, paramInt2, null);
  }

  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    if ((aoo.a(paramContext)) && (paramInt1 == 2))
      paramInt1 = 42;
    Intent localIntent = a(paramContext, paramInt1, paramString);
    if (localIntent == null)
      return null;
    return PendingIntent.getActivity(paramContext, paramInt2, localIntent, 268435456);
  }

  public Intent a(Context paramContext, int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
    case 2:
      return ana.a("com.google.android.gms", a(paramContext, paramString));
    case 42:
      return ana.a();
    case 3:
    }
    return ana.a("com.google.android.gms");
  }

  public boolean a(int paramInt)
  {
    return ahw.b(paramInt);
  }

  public boolean a(Context paramContext, int paramInt)
  {
    return ahw.b(paramContext, paramInt);
  }

  public int b(Context paramContext)
  {
    return ahw.f(paramContext);
  }

  @Deprecated
  public Intent b(int paramInt)
  {
    return a(null, paramInt, null);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     oy
 * JD-Core Version:    0.6.0
 */