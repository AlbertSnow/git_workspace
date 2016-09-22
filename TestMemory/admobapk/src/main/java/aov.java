import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

public final class aov
{
  public final Context a;

  public aov(Context paramContext)
  {
    this.a = paramContext;
  }

  public final ApplicationInfo a(String paramString, int paramInt)
  {
    return this.a.getPackageManager().getApplicationInfo(paramString, paramInt);
  }

  @TargetApi(19)
  public final boolean a(int paramInt, String paramString)
  {
    if (aoq.a(19));
    try
    {
      ((AppOpsManager)this.a.getSystemService("appops")).checkPackage(paramInt, paramString);
      int i = 1;
      String[] arrayOfString;
      do
      {
        do
        {
          return i;
          arrayOfString = this.a.getPackageManager().getPackagesForUid(paramInt);
          i = 0;
        }
        while (paramString == null);
        i = 0;
      }
      while (arrayOfString == null);
      for (int j = 0; ; j++)
      {
        int k = arrayOfString.length;
        i = 0;
        if (j >= k)
          break;
        if (paramString.equals(arrayOfString[j]))
          return true;
      }
    }
    catch (SecurityException localSecurityException)
    {
    }
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aov
 * JD-Core Version:    0.6.0
 */