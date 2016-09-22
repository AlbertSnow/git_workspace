package com.wandoujia.jupiter.paid.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.wandoujia.appmanager.AppManager;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class a
{
  private static final Executor a = Executors.newSingleThreadExecutor();
  private static boolean b = false;

  public static void a(Context paramContext)
  {
    if (b)
      return;
    c localc = new c(paramContext);
    b = true;
    a.execute(new b(localc));
  }

  private static void b(String paramString, HashMap<String, Long> paramHashMap)
  {
    int i = 0;
    try
    {
      File localFile = new File(paramString);
      if (!localFile.exists())
        return;
      if (!com.wandoujia.clean.b.b.a(com.wandoujia.jupiter.paid.d.a.a(paramString).toLowerCase()))
        if (localFile.isDirectory())
        {
          String[] arrayOfString = localFile.list();
          if ((arrayOfString != null) && (arrayOfString.length < 1000))
          {
            int j = arrayOfString.length;
            while (i < j)
            {
              String str = arrayOfString[i];
              b(paramString + File.separatorChar + str, paramHashMap);
              i++;
            }
          }
        }
        else
        {
          boolean bool = paramString.endsWith(".apk");
          if (bool)
            try
            {
              PackageManager localPackageManager = com.wandoujia.p4.a.a().getPackageManager();
              if (localPackageManager != null)
              {
                PackageInfo localPackageInfo = localPackageManager.getPackageArchiveInfo(paramString, 0);
                if ((localPackageInfo != null) && (AppManager.a(com.wandoujia.p4.a.a(), localPackageInfo.packageName, 0) != null))
                {
                  paramHashMap.put(paramString, Long.valueOf(localFile.length()));
                  return;
                }
              }
            }
            catch (Exception localException)
            {
              return;
            }
        }
    }
    catch (StackOverflowError localStackOverflowError)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.b.a
 * JD-Core Version:    0.6.0
 */