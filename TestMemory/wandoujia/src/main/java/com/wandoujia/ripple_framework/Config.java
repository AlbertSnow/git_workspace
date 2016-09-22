package com.wandoujia.ripple_framework;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.shared_storage.SharedSettings;

@SuppressLint({"CommitPrefEdits"})
public final class Config
{
  private static SharedPreferences a;
  private static String b;
  private static String c;
  private static String d;
  private static Boolean e;

  static
  {
    new String[] { "app", "music", "video", "image", "book", "backup", "diagnosis", "export", ".config", ".md5", "data", ".client", "capture", "wandoujia photos", "misc", "mario", "community" };
    b = null;
    c = null;
    d = null;
    e = null;
  }

  public static String a()
  {
    return s().getString("KEY_USES_FEATURE_COOKIE", "");
  }

  // ERROR //
  private static String a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 81	java/io/BufferedReader
    //   5: dup
    //   6: new 83	java/io/InputStreamReader
    //   9: dup
    //   10: aload_0
    //   11: invokevirtual 89	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   14: ldc 91
    //   16: invokevirtual 97	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   19: invokespecial 101	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   22: invokespecial 104	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   25: astore_2
    //   26: aload_2
    //   27: invokevirtual 107	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   30: astore 5
    //   32: aload 5
    //   34: invokestatic 113	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   37: ifeq +10 -> 47
    //   40: aload_2
    //   41: invokestatic 119	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   44: ldc 121
    //   46: areturn
    //   47: aload_2
    //   48: invokestatic 119	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   51: aload 5
    //   53: areturn
    //   54: astore 7
    //   56: aload_1
    //   57: invokestatic 119	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   60: ldc 121
    //   62: areturn
    //   63: astore 6
    //   65: aconst_null
    //   66: astore_2
    //   67: aload 6
    //   69: astore 4
    //   71: aload_2
    //   72: invokestatic 119	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   75: aload 4
    //   77: athrow
    //   78: astore 4
    //   80: goto -9 -> 71
    //   83: astore_3
    //   84: aload_2
    //   85: astore_1
    //   86: goto -30 -> 56
    //
    // Exception table:
    //   from	to	target	type
    //   2	26	54	java/lang/Exception
    //   2	26	63	finally
    //   26	40	78	finally
    //   26	40	83	java/lang/Exception
  }

  public static void a(String paramString)
  {
    SharedPreferences.Editor localEditor = s().edit();
    localEditor.putString("KEY_USES_FEATURE_COOKIE", paramString);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = s().edit();
    localEditor.putBoolean("KEY_DOWNLOAD_HTTPS_ENABLE", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b(String paramString)
  {
    monitorenter;
    try
    {
      if (!TextUtils.isEmpty(paramString))
      {
        SharedPreferences.Editor localEditor = s().edit();
        localEditor.putString("server_channel", paramString);
        SharePrefSubmitor.submit(localEditor);
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public static void b(boolean paramBoolean)
  {
    monitorenter;
    try
    {
      SharedPreferences.Editor localEditor = s().edit();
      localEditor.putBoolean("is_paid", paramBoolean);
      SharePrefSubmitor.submit(localEditor);
      e = Boolean.valueOf(paramBoolean);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public static boolean b()
  {
    return s().getBoolean("KEY_DOWNLOAD_HTTPS_ENABLE", false);
  }

  public static String c()
  {
    monitorenter;
    try
    {
      if (TextUtils.isEmpty(b))
      {
        String str2 = SharedSettings.a().a("first_channel", "");
        b = str2;
        if (TextUtils.isEmpty(str2))
        {
          String str3 = a(GlobalConfig.getAppContext());
          b = str3;
          c = str3;
          SharedSettings.a().b("first_channel", b);
        }
      }
      String str1 = b;
      return str1;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void c(String paramString)
  {
    SharedPreferences.Editor localEditor = s().edit();
    localEditor.putString("KEY_APP_DEFAULT_DOWNLOAD_FOLDER", paramString);
    SharePrefSubmitor.submit(localEditor);
  }

  public static String d()
  {
    monitorenter;
    try
    {
      if (TextUtils.isEmpty(d))
      {
        String str2 = s().getString("server_channel", "");
        d = str2;
        if (TextUtils.isEmpty(str2))
          d = f();
      }
      String str1 = d;
      return str1;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static boolean e()
  {
    monitorenter;
    try
    {
      if (e == null)
        e = Boolean.valueOf(s().getBoolean("is_paid", false));
      boolean bool = e.booleanValue();
      return bool;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static String f()
  {
    monitorenter;
    try
    {
      if (TextUtils.isEmpty(c))
        c = a(GlobalConfig.getAppContext());
      String str = c;
      return str;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void g()
  {
    SharedPreferences.Editor localEditor = s().edit();
    localEditor.putBoolean("UPGRADE_NEED_UNINSTALL_NOTIFY", false);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean h()
  {
    return s().getBoolean("UPGRADE_NEED_UNINSTALL_NOTIFY", true);
  }

  public static String i()
  {
    return s().getString("GL_VERSION", "");
  }

  public static String j()
  {
    return s().getString("GL_VENDOR", "");
  }

  public static String k()
  {
    return s().getString("GL_RENDERER", "");
  }

  public static boolean l()
  {
    return s().getBoolean("KEY_AUTO_INSTALL_USER_TURN_OFF", false);
  }

  public static void m()
  {
    SharedPreferences.Editor localEditor = s().edit();
    localEditor.putInt("KEY_AUTO_INSTALL_RELOAD_TIP_SHOW_TIME", 0);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void n()
  {
    SharedPreferences.Editor localEditor = s().edit();
    localEditor.putInt("KEY_AUTO_INSTALL_RELOAD_TIP_SHOW_TIME", 1 + o());
    SharePrefSubmitor.submit(localEditor);
  }

  public static int o()
  {
    return s().getInt("KEY_AUTO_INSTALL_RELOAD_TIP_SHOW_TIME", 0);
  }

  public static void p()
  {
    SharedPreferences.Editor localEditor = s().edit();
    localEditor.putBoolean("KEY_P4_DOWNLOAD_DB_MIGRATED", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean q()
  {
    return s().getBoolean("KEY_P4_DOWNLOAD_DB_MIGRATED", false);
  }

  public static String r()
  {
    return s().getString("KEY_APP_DEFAULT_DOWNLOAD_FOLDER", null);
  }

  private static SharedPreferences s()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = i.k().g().getSharedPreferences("com.wandoujia.phoenix2", 2);
      SharedPreferences localSharedPreferences = a;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.Config
 * JD-Core Version:    0.6.0
 */