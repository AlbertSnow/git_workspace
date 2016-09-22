package com.wandoujia.clean.http;

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
  private static SharedPreferences b;
  private static String c;

  static
  {
    new String[] { "app", "music", "video", "image", "book", "backup", "diagnosis", "export", ".config", ".md5", "data", ".client", "capture", "wandoujia photos", "misc", "mario", "community" };
    c = null;
  }

  public static SharedPreferences a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = b("com.wandoujia.phoenix2");
      SharedPreferences localSharedPreferences = a;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  private static String a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 65	java/io/BufferedReader
    //   5: dup
    //   6: new 67	java/io/InputStreamReader
    //   9: dup
    //   10: aload_0
    //   11: invokevirtual 73	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   14: ldc 75
    //   16: invokevirtual 81	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   19: invokespecial 85	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   22: invokespecial 88	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   25: astore_2
    //   26: aload_2
    //   27: invokevirtual 92	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   30: astore 5
    //   32: aload 5
    //   34: invokestatic 98	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   37: ifeq +10 -> 47
    //   40: aload_2
    //   41: invokestatic 104	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   44: ldc 106
    //   46: areturn
    //   47: aload_2
    //   48: invokestatic 104	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   51: aload 5
    //   53: areturn
    //   54: astore 7
    //   56: aload_1
    //   57: invokestatic 104	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   60: ldc 106
    //   62: areturn
    //   63: astore 6
    //   65: aconst_null
    //   66: astore_2
    //   67: aload 6
    //   69: astore 4
    //   71: aload_2
    //   72: invokestatic 104	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
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

  public static String a(String paramString)
  {
    return f().getString(paramString, "");
  }

  public static void a(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("KEY_LAST_GARBAGE_BACKGROUND_SCAN_TIME", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("USER_EXTERNAL_STORAGE_FOR_CACHE", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  @SuppressLint({"WorldWriteableFiles"})
  private static SharedPreferences b(String paramString)
  {
    return GlobalConfig.getAppContext().getSharedPreferences(paramString, 2);
  }

  public static String b()
  {
    monitorenter;
    try
    {
      if (TextUtils.isEmpty(c))
      {
        String str2 = SharedSettings.a().a("first_channel", "");
        c = str2;
        if (TextUtils.isEmpty(str2))
        {
          c = a(GlobalConfig.getAppContext());
          SharedSettings.a().b("first_channel", c);
        }
      }
      String str1 = c;
      return str1;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static boolean c()
  {
    return a().getBoolean("USER_EXTERNAL_STORAGE_FOR_CACHE", false);
  }

  public static boolean d()
  {
    return a().contains("USER_EXTERNAL_STORAGE_FOR_CACHE");
  }

  public static long e()
  {
    return a().getLong("KEY_LAST_GARBAGE_BACKGROUND_SCAN_TIME", 0L);
  }

  private static SharedPreferences f()
  {
    monitorenter;
    try
    {
      if (b == null)
        b = b("com.wandoujia.phoenix2.config");
      SharedPreferences localSharedPreferences = b;
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
 * Qualified Name:     com.wandoujia.clean.http.Config
 * JD-Core Version:    0.6.0
 */