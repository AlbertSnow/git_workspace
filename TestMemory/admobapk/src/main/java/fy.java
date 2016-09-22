import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;

public final class fy
{
  public static ey a(Context paramContext, ft paramft)
  {
    File localFile = new File(paramContext.getCacheDir(), "volley");
    Object localObject1 = "volley/0";
    try
    {
      String str1 = paramContext.getPackageName();
      int i = paramContext.getPackageManager().getPackageInfo(str1, 0).versionCode;
      String str2 = 12 + String.valueOf(str1).length() + str1 + "/" + i;
      localObject1 = str2;
      label79: if (Build.VERSION.SDK_INT >= 9);
      for (Object localObject2 = new fu(); ; localObject2 = new fq(AndroidHttpClient.newInstance((String)localObject1)))
      {
        fk localfk = new fk((ft)localObject2);
        ey localey = new ey(new fn(localFile), localfk);
        localey.a();
        return localey;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label79;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fy
 * JD-Core Version:    0.6.0
 */