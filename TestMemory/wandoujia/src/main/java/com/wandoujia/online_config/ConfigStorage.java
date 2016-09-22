package com.wandoujia.online_config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.shared_storage.SharedSettings;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressLint({"CommitPrefEdits"})
public final class ConfigStorage
{
  private static SharedPreferences a;
  private static String b;

  static
  {
    new String[] { "app", "music", "video", "image", "book", "backup", "diagnosis", "export", ".config", ".md5", "data", ".client", "capture", "wandoujia photos", "misc", "mario", "community" };
    b = null;
  }

  public static int a(String paramString, int paramInt)
  {
    String str = a(paramString);
    if (TextUtils.isEmpty(str))
      return paramInt;
    try
    {
      int i = Integer.valueOf(str).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return paramInt;
  }

  public static long a(String paramString, long paramLong)
  {
    String str = a(paramString);
    if (TextUtils.isEmpty(str))
      return paramLong;
    try
    {
      long l = Long.valueOf(str).longValue();
      return l;
    }
    catch (Exception localException)
    {
    }
    return paramLong;
  }

  public static String a()
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
          b = a(GlobalConfig.getAppContext());
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

  // ERROR //
  private static String a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 110	java/io/BufferedReader
    //   5: dup
    //   6: new 112	java/io/InputStreamReader
    //   9: dup
    //   10: aload_0
    //   11: invokevirtual 118	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   14: ldc 120
    //   16: invokevirtual 126	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   19: invokespecial 130	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   22: invokespecial 133	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   25: astore_2
    //   26: aload_2
    //   27: invokevirtual 136	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   30: astore 5
    //   32: aload 5
    //   34: invokestatic 63	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   37: ifeq +10 -> 47
    //   40: aload_2
    //   41: invokestatic 142	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   44: ldc 144
    //   46: areturn
    //   47: aload_2
    //   48: invokestatic 142	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   51: aload 5
    //   53: areturn
    //   54: astore 7
    //   56: aload_1
    //   57: invokestatic 142	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   60: ldc 144
    //   62: areturn
    //   63: astore 6
    //   65: aconst_null
    //   66: astore_2
    //   67: aload 6
    //   69: astore 4
    //   71: aload_2
    //   72: invokestatic 142	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
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
    return b().getString(paramString, "");
  }

  public static String a(String paramString1, String paramString2)
  {
    String str = a(paramString1);
    if (TextUtils.isEmpty(str))
      return paramString2;
    return str;
  }

  public static void a(Map<String, String> paramMap)
  {
    SharedPreferences.Editor localEditor = b().edit();
    localEditor.clear();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localEditor.putString((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean a(String paramString, boolean paramBoolean)
  {
    String str = a(paramString);
    if (TextUtils.isEmpty(str))
      return paramBoolean;
    try
    {
      boolean bool = Boolean.valueOf(str).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
    }
    return paramBoolean;
  }

  private static SharedPreferences b()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = GlobalConfig.getAppContext().getSharedPreferences("com.wandoujia.phoenix2.config", 2);
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
 * Qualified Name:     com.wandoujia.online_config.ConfigStorage
 * JD-Core Version:    0.6.0
 */