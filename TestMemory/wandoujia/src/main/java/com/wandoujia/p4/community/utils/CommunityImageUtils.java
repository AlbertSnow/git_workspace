package com.wandoujia.p4.community.utils;

import android.app.Activity;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.community.http.model.CommunityImageInfo;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.configs.Config.ContentDir;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public final class CommunityImageUtils
{
  private static int a = 0;
  private static int b = 0;

  public static String a(CommunityImageInfo paramCommunityImageInfo, CommunityImageUtils.ImageType paramImageType)
  {
    int i = g.a[paramImageType.ordinal()];
    int j = 0;
    switch (i)
    {
    default:
    case 1:
    case 2:
    }
    while ((j <= 0) || (TextUtils.isEmpty(paramCommunityImageInfo.urlTemplate)))
    {
      return paramCommunityImageInfo.url;
      if (a == 0)
        a = Config.s();
      j = a;
      continue;
      if (b == 0)
        b = Config.t();
      j = b;
    }
    return paramCommunityImageInfo.urlTemplate.replace("{width}", String.valueOf(j)).replace("{height}", String.valueOf(j));
  }

  // ERROR //
  public static String a(String paramString)
  {
    // Byte code:
    //   0: new 71	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: invokevirtual 79	java/io/File:length	()J
    //   11: ldc2_w 80
    //   14: lcmp
    //   15: ifgt +38 -> 53
    //   18: aload_0
    //   19: invokestatic 87	com/wandoujia/base/utils/ImageUtil:getImageSize	(Ljava/lang/String;)Lcom/wandoujia/base/utils/ImageUtil$ImageSize;
    //   22: astore 12
    //   24: aload 12
    //   26: ifnull +25 -> 51
    //   29: aload 12
    //   31: getfield 92	com/wandoujia/base/utils/ImageUtil$ImageSize:width	I
    //   34: sipush 2048
    //   37: if_icmpge +16 -> 53
    //   40: aload 12
    //   42: getfield 95	com/wandoujia/base/utils/ImageUtil$ImageSize:height	I
    //   45: sipush 2048
    //   48: if_icmpge +5 -> 53
    //   51: aconst_null
    //   52: areturn
    //   53: aload_0
    //   54: sipush 1024
    //   57: sipush 1024
    //   60: iconst_0
    //   61: anewarray 97	android/graphics/Bitmap$Config
    //   64: invokestatic 101	com/wandoujia/base/utils/ImageUtil:decodeBitmap	(Ljava/lang/String;II[Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   67: astore_1
    //   68: aload_1
    //   69: ifnull -18 -> 51
    //   72: getstatic 107	com/wandoujia/p4/configs/Config$ContentDir:COMMUNITY	Lcom/wandoujia/p4/configs/Config$ContentDir;
    //   75: invokestatic 110	com/wandoujia/p4/configs/Config:a	(Lcom/wandoujia/p4/configs/Config$ContentDir;)Ljava/lang/String;
    //   78: astore_2
    //   79: aload_2
    //   80: invokestatic 37	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   83: ifne -32 -> 51
    //   86: new 71	java/io/File
    //   89: dup
    //   90: aload_2
    //   91: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   94: astore_3
    //   95: aload_3
    //   96: invokevirtual 114	java/io/File:exists	()Z
    //   99: ifne +10 -> 109
    //   102: aload_3
    //   103: invokevirtual 117	java/io/File:mkdirs	()Z
    //   106: ifeq -55 -> 51
    //   109: new 71	java/io/File
    //   112: dup
    //   113: aload_3
    //   114: aload_0
    //   115: invokestatic 122	com/wandoujia/base/utils/FileUtil:getFileName	(Ljava/lang/String;)Ljava/lang/String;
    //   118: invokespecial 125	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   121: astore 4
    //   123: ldc 127
    //   125: new 129	java/lang/StringBuilder
    //   128: dup
    //   129: ldc 131
    //   131: invokespecial 132	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   134: aload 4
    //   136: invokevirtual 136	java/io/File:getPath	()Ljava/lang/String;
    //   139: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: ldc 142
    //   144: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: aload_0
    //   148: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: iconst_0
    //   155: anewarray 4	java/lang/Object
    //   158: invokestatic 151	com/wandoujia/base/log/Log:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: new 153	java/io/FileOutputStream
    //   164: dup
    //   165: aload 4
    //   167: invokespecial 156	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   170: astore 5
    //   172: aload_1
    //   173: getstatic 162	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   176: bipush 90
    //   178: aload 5
    //   180: invokevirtual 168	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   183: pop
    //   184: aload 5
    //   186: invokevirtual 173	java/io/OutputStream:flush	()V
    //   189: aload 5
    //   191: invokestatic 179	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   194: aload 4
    //   196: invokevirtual 136	java/io/File:getPath	()Ljava/lang/String;
    //   199: areturn
    //   200: astore 6
    //   202: aconst_null
    //   203: astore 5
    //   205: ldc 127
    //   207: ldc 181
    //   209: aload 6
    //   211: invokestatic 185	com/wandoujia/base/log/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   214: aload 5
    //   216: invokestatic 179	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   219: aconst_null
    //   220: areturn
    //   221: astore 8
    //   223: aconst_null
    //   224: astore 5
    //   226: ldc 127
    //   228: ldc 187
    //   230: aload 8
    //   232: invokestatic 185	com/wandoujia/base/log/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   235: aload 5
    //   237: invokestatic 179	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   240: aconst_null
    //   241: areturn
    //   242: astore 9
    //   244: aconst_null
    //   245: astore 5
    //   247: ldc 127
    //   249: ldc 189
    //   251: aload 9
    //   253: invokestatic 185	com/wandoujia/base/log/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   256: aload 5
    //   258: invokestatic 179	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   261: aconst_null
    //   262: areturn
    //   263: astore 11
    //   265: aconst_null
    //   266: astore 5
    //   268: aload 11
    //   270: astore 7
    //   272: aload 5
    //   274: invokestatic 179	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   277: aload 7
    //   279: athrow
    //   280: astore 7
    //   282: goto -10 -> 272
    //   285: astore 9
    //   287: goto -40 -> 247
    //   290: astore 8
    //   292: goto -66 -> 226
    //   295: astore 6
    //   297: goto -92 -> 205
    //
    // Exception table:
    //   from	to	target	type
    //   161	172	200	java/io/FileNotFoundException
    //   161	172	221	java/io/IOException
    //   161	172	242	java/lang/OutOfMemoryError
    //   161	172	263	finally
    //   172	189	280	finally
    //   205	214	280	finally
    //   226	235	280	finally
    //   247	256	280	finally
    //   172	189	285	java/lang/OutOfMemoryError
    //   172	189	290	java/io/IOException
    //   172	189	295	java/io/FileNotFoundException
  }

  public static String a(String paramString, Map<String, String> paramMap1, Map<String, String> paramMap2, File paramFile)
  {
    String str = null;
    for (int i = 0; i < 3; i++)
    {
      str = a(paramString, paramMap1, paramMap2, paramFile, "image");
      if (!TextUtils.isEmpty(str))
        break;
    }
    Log.d("ugc", "uploadImage result " + str, new Object[0]);
    return str;
  }

  private static String a(String paramString1, Map<String, String> paramMap1, Map<String, String> paramMap2, File paramFile, String paramString2)
  {
    try
    {
      String str = b.a(paramString1, paramMap1, paramMap2, paramFile, "image/jpeg", paramString2, 60000);
      return str;
    }
    catch (IOException localIOException)
    {
      Log.d("ugc", "doUploadImage error ", new Object[] { localIOException });
    }
    return null;
  }

  public static void a()
  {
    String str = Config.a(Config.ContentDir.COMMUNITY);
    if (!TextUtils.isEmpty(str))
    {
      File localFile = new File(str);
      FileUtil.deletePath(str);
      Log.d("ugc", "clearZippedImage " + localFile.getPath() + " zippedFile " + localFile.isDirectory(), new Object[0]);
    }
  }

  public static void a(Activity paramActivity)
  {
    int i = Config.s();
    int j = Config.t();
    if ((paramActivity == null) || (paramActivity.isFinishing()));
    String str;
    do
    {
      return;
      str = SystemUtil.getDpi(paramActivity.getWindowManager());
    }
    while ((TextUtils.isEmpty(str)) || ((i > 0) && (j > 0)));
    ThreadPool.execute(new f(str));
  }

  public static String b(String paramString, Map<String, String> paramMap1, Map<String, String> paramMap2, File paramFile)
  {
    return a(paramString, paramMap1, paramMap2, paramFile, "icon");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.utils.CommunityImageUtils
 * JD-Core Version:    0.6.0
 */