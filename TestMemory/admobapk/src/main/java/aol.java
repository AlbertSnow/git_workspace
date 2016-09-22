import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;

public final class aol
{
  public static boolean a()
  {
    return (amj.c) && (alp.b()) && (alp.a() == Process.myUid());
  }

  @TargetApi(12)
  public static boolean a(Context paramContext, String paramString)
  {
    if (!aoq.a(12));
    while (true)
    {
      return false;
      if (("com.google.android.gms".equals(paramString)) && (a()))
        continue;
      try
      {
        int i = aow.a.a(paramContext).a(paramString, 0).flags;
        if ((i & 0x200000) != 0)
          return true;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
      }
    }
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aol
 * JD-Core Version:    0.6.0
 */