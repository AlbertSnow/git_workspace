package com.google.android.gms.ads.internal.directappinstall;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@a
public final class d
{
  private static final Object a = new Object();
  private static d b;

  static
  {
    new AtomicInteger();
  }

  public static d a()
  {
    synchronized (a)
    {
      if (b == null)
        b = new d();
      d locald = b;
      return locald;
    }
  }

  public static String a(Context paramContext, Map paramMap)
  {
    String str1 = (String)paramMap.get("package_name");
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(str1, 1);
      String str2 = (String)paramMap.get("app_version");
      if (TextUtils.isEmpty(str2))
      {
        c.c("No app version provided by creative.");
        return "installed_unknown_version";
      }
      try
      {
        int i = Integer.parseInt(str2);
        if (i > localPackageInfo.versionCode)
        {
          c.b(34 + String.valueOf(str1).length() + "App " + str1 + " installed but need an update.");
          return "installed_older_version";
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        c.c("Malformated app version is provided by creative.");
        return "installed_unknown_version";
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      c.b(19 + String.valueOf(str1).length() + "App " + str1 + " not installed.");
      return "not_installed";
    }
    c.b(52 + String.valueOf(str1).length() + "App " + str1 + " already installed with current / newer version.");
    return "installed_given_version";
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.directappinstall.d
 * JD-Core Version:    0.6.0
 */