package com.wandoujia.base.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class PackageUtils
{
  public static PackageUtils.ApkPackageInfo getApkPakcageInfo(Context paramContext, String paramString)
  {
    PackageUtils.ApkPackageInfo localApkPackageInfo = new PackageUtils.ApkPackageInfo();
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageArchiveInfo(paramString, 0);
      if (localPackageInfo == null)
        return null;
      localApkPackageInfo.packageName = localPackageInfo.packageName;
      localApkPackageInfo.versionCode = localPackageInfo.versionCode;
      localApkPackageInfo.versionName = localPackageInfo.versionName;
      CharSequence localCharSequence = localPackageInfo.applicationInfo.loadLabel(paramContext.getPackageManager());
      if (localCharSequence == null);
      String str;
      for (Object localObject = ""; ; localObject = str)
      {
        localApkPackageInfo.name = ((String)localObject);
        return localApkPackageInfo;
        str = localCharSequence.toString();
      }
    }
    catch (Exception localException)
    {
    }
    return (PackageUtils.ApkPackageInfo)null;
  }

  // ERROR //
  public static String readApkAssetFile(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 70
    //   4: invokestatic 76	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   7: astore 8
    //   9: aload 8
    //   11: aconst_null
    //   12: invokevirtual 80	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   15: iconst_0
    //   16: anewarray 4	java/lang/Object
    //   19: invokevirtual 86	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast 88	android/content/res/AssetManager
    //   25: astore 9
    //   27: aload 8
    //   29: ldc 90
    //   31: iconst_1
    //   32: anewarray 72	java/lang/Class
    //   35: dup
    //   36: iconst_0
    //   37: ldc 92
    //   39: aastore
    //   40: invokevirtual 96	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   43: aload 9
    //   45: iconst_1
    //   46: anewarray 4	java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: aload_0
    //   52: aastore
    //   53: invokevirtual 102	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   56: pop
    //   57: new 104	java/io/BufferedInputStream
    //   60: dup
    //   61: aload 9
    //   63: aload_1
    //   64: invokevirtual 108	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   67: invokespecial 111	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   70: astore 11
    //   72: aload 11
    //   74: invokevirtual 115	java/io/BufferedInputStream:available	()I
    //   77: newarray byte
    //   79: astore 13
    //   81: new 92	java/lang/String
    //   84: dup
    //   85: aload 13
    //   87: iconst_0
    //   88: aload 11
    //   90: aload 13
    //   92: invokevirtual 119	java/io/BufferedInputStream:read	([B)I
    //   95: invokespecial 122	java/lang/String:<init>	([BII)V
    //   98: astore 14
    //   100: aload 11
    //   102: invokevirtual 125	java/io/BufferedInputStream:close	()V
    //   105: aload 14
    //   107: areturn
    //   108: astore 5
    //   110: aconst_null
    //   111: astore 6
    //   113: aload 6
    //   115: ifnull +8 -> 123
    //   118: aload 6
    //   120: invokevirtual 125	java/io/BufferedInputStream:close	()V
    //   123: ldc 55
    //   125: areturn
    //   126: astore_3
    //   127: aload_2
    //   128: ifnull +7 -> 135
    //   131: aload_2
    //   132: invokevirtual 125	java/io/BufferedInputStream:close	()V
    //   135: aload_3
    //   136: athrow
    //   137: astore 15
    //   139: aload 14
    //   141: areturn
    //   142: astore 7
    //   144: goto -21 -> 123
    //   147: astore 4
    //   149: goto -14 -> 135
    //   152: astore_3
    //   153: aload 11
    //   155: astore_2
    //   156: goto -29 -> 127
    //   159: astore 12
    //   161: aload 11
    //   163: astore 6
    //   165: goto -52 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   2	72	108	java/lang/Exception
    //   2	72	126	finally
    //   100	105	137	java/io/IOException
    //   118	123	142	java/io/IOException
    //   131	135	147	java/io/IOException
    //   72	100	152	finally
    //   72	100	159	java/lang/Exception
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.PackageUtils
 * JD-Core Version:    0.6.0
 */