package com.wandoujia.launcher_base.b;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.rpc.http.client.DataApi;
import com.wandoujia.shared_storage.SharedSettings;
import java.io.File;

public final class a
{
  private static String a;
  private static boolean b = true;
  private static DataApi c;
  private static Handler d = new Handler(Looper.getMainLooper());

  public static String a()
  {
    monitorenter;
    try
    {
      if (TextUtils.isEmpty(a))
      {
        String str2 = SharedSettings.a().a("first_channel", "");
        a = str2;
        if (TextUtils.isEmpty(str2))
        {
          a = GlobalConfig.getLastChannel();
          SharedSettings.a().b("first_channel", a);
        }
      }
      String str1 = a;
      return str1;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void a(DataApi paramDataApi)
  {
    c = paramDataApi;
  }

  public static void b()
  {
    b = false;
  }

  public static boolean c()
  {
    return b;
  }

  public static DataApi d()
  {
    monitorenter;
    try
    {
      Object localObject2;
      if (c == null)
      {
        if (!SystemUtil.isExternalSDCardMounted())
          break label97;
        File localFile = SystemUtil.getDeviceExternalCacheDir();
        if (localFile == null)
          break label69;
        localObject2 = localFile.getAbsolutePath() + "/DataCache";
      }
      while (true)
      {
        c = new com.wandoujia.launcher_base.a.a((String)localObject2);
        DataApi localDataApi = c;
        return localDataApi;
        label69: localObject2 = GlobalConfig.getAppContext().getCacheDir() + "/DataCache";
        continue;
        label97: String str = GlobalConfig.getAppContext().getCacheDir() + "/DataCache";
        localObject2 = str;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  public static Handler e()
  {
    return d;
  }

  public static Activity f()
  {
    return null;
  }

  public static void g()
  {
  }

  public static String h()
  {
    try
    {
      boolean bool = Environment.getExternalStorageState().equals("mounted");
      if (!bool);
      String str;
      File localFile;
      do
      {
        return null;
        str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/wandoujia/";
        localFile = new File(str);
      }
      while ((!localFile.exists()) && (!localFile.mkdirs()));
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static void i()
  {
    new Thread(new b()).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.b.a
 * JD-Core Version:    0.6.0
 */