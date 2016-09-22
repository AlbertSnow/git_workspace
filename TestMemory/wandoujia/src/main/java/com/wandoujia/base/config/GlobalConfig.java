package com.wandoujia.base.config;

import android.content.Context;
import android.text.TextUtils;

public class GlobalConfig
{
  private static final String ASSETS_CHANNEL_FILE_NAME = "channel.mf";
  private static final String DEFAULT_CHANNEL = "wandoujia_debug";
  private static final String INTERNAL_PACKAGE_CHANNEL = "wandoujia_internal";
  private static Context appContext;
  private static boolean debug;
  private static String packageName;
  private static String rootDir = "";
  private static String sLastChannel;

  static
  {
    debug = false;
    packageName = "com.wandoujia.phoenix2";
    sLastChannel = null;
  }

  public static Context getAppContext()
  {
    return appContext;
  }

  public static String getAppRootDir()
  {
    return rootDir;
  }

  public static String getLastChannel()
  {
    monitorenter;
    try
    {
      if (TextUtils.isEmpty(sLastChannel))
        sLastChannel = loadChannelFromAssets();
      String str = sLastChannel;
      return str;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static String getPackageName()
  {
    return packageName;
  }

  public static boolean isDebug()
  {
    return debug;
  }

  public static boolean isInternalPackage()
  {
    return "wandoujia_internal".equals(getLastChannel());
  }

  // ERROR //
  private static String loadChannelFromAssets()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: new 72	java/io/BufferedReader
    //   5: dup
    //   6: new 74	java/io/InputStreamReader
    //   9: dup
    //   10: getstatic 42	com/wandoujia/base/config/GlobalConfig:appContext	Landroid/content/Context;
    //   13: invokevirtual 80	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   16: ldc 8
    //   18: invokevirtual 86	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   21: invokespecial 89	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   24: invokespecial 92	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   27: astore_1
    //   28: aload_1
    //   29: invokevirtual 95	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   32: astore 6
    //   34: aload 6
    //   36: invokestatic 51	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   39: ifeq +10 -> 49
    //   42: aload_1
    //   43: invokevirtual 98	java/io/BufferedReader:close	()V
    //   46: ldc 11
    //   48: areturn
    //   49: aload_1
    //   50: invokevirtual 98	java/io/BufferedReader:close	()V
    //   53: aload 6
    //   55: areturn
    //   56: astore 7
    //   58: aload 6
    //   60: areturn
    //   61: astore 10
    //   63: aload_0
    //   64: ifnull +7 -> 71
    //   67: aload_0
    //   68: invokevirtual 98	java/io/BufferedReader:close	()V
    //   71: ldc 11
    //   73: areturn
    //   74: astore 9
    //   76: aconst_null
    //   77: astore_1
    //   78: aload 9
    //   80: astore 4
    //   82: aload_1
    //   83: ifnull +7 -> 90
    //   86: aload_1
    //   87: invokevirtual 98	java/io/BufferedReader:close	()V
    //   90: aload 4
    //   92: athrow
    //   93: astore 8
    //   95: ldc 11
    //   97: areturn
    //   98: astore_3
    //   99: goto -28 -> 71
    //   102: astore 5
    //   104: goto -14 -> 90
    //   107: astore 4
    //   109: goto -27 -> 82
    //   112: astore_2
    //   113: aload_1
    //   114: astore_0
    //   115: goto -52 -> 63
    //
    // Exception table:
    //   from	to	target	type
    //   49	53	56	java/io/IOException
    //   2	28	61	java/lang/Exception
    //   2	28	74	finally
    //   42	46	93	java/io/IOException
    //   67	71	98	java/io/IOException
    //   86	90	102	java/io/IOException
    //   28	42	107	finally
    //   28	42	112	java/lang/Exception
  }

  public static void setAppContext(Context paramContext)
  {
    appContext = paramContext;
  }

  public static void setAppRootDir(String paramString)
  {
    rootDir = paramString;
  }

  public static void setDebug(boolean paramBoolean)
  {
    debug = paramBoolean;
  }

  public static void setPackageName(String paramString)
  {
    packageName = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.config.GlobalConfig
 * JD-Core Version:    0.6.0
 */