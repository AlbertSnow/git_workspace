package com.wandoujia.base.utils;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LibraryLoaderHelper
{
  private static final String LIB_DIR = "lib_so";
  private static final String TAG = "LibraryLoaderHelper";
  private static List<String> loadedLibNames = new ArrayList();

  private static void deleteDirectorySync(File paramFile)
  {
    while (true)
    {
      int j;
      try
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile == null)
          continue;
        int i = arrayOfFile.length;
        j = 0;
        if (j >= i)
          continue;
        File localFile = arrayOfFile[j];
        localFile.getName();
        if (!localFile.delete())
        {
          new StringBuilder("Failed to remove ").append(localFile.getAbsolutePath());
          break label89;
          if (paramFile.delete())
            continue;
          new StringBuilder("Failed to remove ").append(paramFile.getAbsolutePath());
          return;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      label89: j++;
    }
  }

  private static File getWorkaroundLibDir(Context paramContext)
  {
    File localFile = new File(paramContext.getFilesDir(), "lib_so");
    if (!localFile.exists())
      localFile.mkdirs();
    return localFile;
  }

  private static File getWorkaroundLibFile(Context paramContext, String paramString)
  {
    String str = System.mapLibraryName(paramString);
    return new File(getWorkaroundLibDir(paramContext), str);
  }

  public static boolean loadLibrarySafety(Context paramContext, String paramString)
  {
    int i = 1;
    monitorenter;
    try
    {
      boolean bool1 = loadedLibNames.contains(paramString);
      if (bool1);
      while (true)
      {
        return i;
        File localFile = getWorkaroundLibFile(paramContext, paramString);
        try
        {
          System.loadLibrary(paramString);
          loadedLibNames.add(paramString);
        }
        catch (UnsatisfiedLinkError localUnsatisfiedLinkError1)
        {
          if (!localFile.exists())
          {
            boolean bool2 = unpackLibrariesOnce(paramContext, paramString);
            if (!bool2)
            {
              i = 0;
              continue;
            }
          }
          try
          {
            System.load(localFile.getAbsolutePath());
            loadedLibNames.add(paramString);
          }
          catch (UnsatisfiedLinkError localUnsatisfiedLinkError2)
          {
            i = 0;
          }
        }
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  private static boolean unpackLibrariesOnce(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokestatic 83	com/wandoujia/base/utils/LibraryLoaderHelper:getWorkaroundLibDir	(Landroid/content/Context;)Ljava/io/File;
    //   6: astore_3
    //   7: aload_3
    //   8: invokestatic 113	com/wandoujia/base/utils/LibraryLoaderHelper:deleteDirectorySync	(Ljava/io/File;)V
    //   11: aload_0
    //   12: invokevirtual 117	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   15: astore 15
    //   17: new 119	java/util/zip/ZipFile
    //   20: dup
    //   21: new 30	java/io/File
    //   24: dup
    //   25: aload 15
    //   27: getfield 124	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   30: invokespecial 125	java/io/File:<init>	(Ljava/lang/String;)V
    //   33: iconst_1
    //   34: invokespecial 128	java/util/zip/ZipFile:<init>	(Ljava/io/File;I)V
    //   37: astore 10
    //   39: new 44	java/lang/StringBuilder
    //   42: dup
    //   43: ldc 130
    //   45: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   48: getstatic 135	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   51: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: ldc 137
    //   56: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: aload_1
    //   60: invokestatic 81	java/lang/System:mapLibraryName	(Ljava/lang/String;)Ljava/lang/String;
    //   63: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: astore 18
    //   71: aload 10
    //   73: aload 18
    //   75: invokevirtual 144	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   78: astore 19
    //   80: aload 19
    //   82: ifnonnull +157 -> 239
    //   85: new 44	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 145	java/lang/StringBuilder:<init>	()V
    //   92: aload 15
    //   94: getfield 124	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   97: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: ldc 147
    //   102: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: aload 18
    //   107: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: getstatic 135	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   114: bipush 45
    //   116: invokevirtual 153	java/lang/String:indexOf	(I)I
    //   119: istore 21
    //   121: new 44	java/lang/StringBuilder
    //   124: dup
    //   125: ldc 130
    //   127: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: astore 22
    //   132: getstatic 135	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   135: astore 23
    //   137: iload 21
    //   139: ifle +89 -> 228
    //   142: aload 22
    //   144: aload 23
    //   146: iconst_0
    //   147: iload 21
    //   149: invokevirtual 157	java/lang/String:substring	(II)Ljava/lang/String;
    //   152: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: ldc 137
    //   157: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: aload_1
    //   161: invokestatic 81	java/lang/System:mapLibraryName	(Ljava/lang/String;)Ljava/lang/String;
    //   164: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: astore 24
    //   172: aload 10
    //   174: aload 24
    //   176: invokevirtual 144	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   179: astore 19
    //   181: aload 19
    //   183: ifnonnull +56 -> 239
    //   186: new 44	java/lang/StringBuilder
    //   189: dup
    //   190: invokespecial 145	java/lang/StringBuilder:<init>	()V
    //   193: aload 15
    //   195: getfield 124	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   198: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: ldc 147
    //   203: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: aload 24
    //   208: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: aload 10
    //   214: invokevirtual 160	java/util/zip/ZipFile:close	()V
    //   217: aload_3
    //   218: invokestatic 113	com/wandoujia/base/utils/LibraryLoaderHelper:deleteDirectorySync	(Ljava/io/File;)V
    //   221: aload 10
    //   223: invokevirtual 160	java/util/zip/ZipFile:close	()V
    //   226: iconst_0
    //   227: ireturn
    //   228: getstatic 135	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   231: invokevirtual 164	java/lang/String:length	()I
    //   234: istore 21
    //   236: goto -94 -> 142
    //   239: aload_0
    //   240: aload_1
    //   241: invokestatic 95	com/wandoujia/base/utils/LibraryLoaderHelper:getWorkaroundLibFile	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   244: astore 27
    //   246: new 44	java/lang/StringBuilder
    //   249: dup
    //   250: ldc 166
    //   252: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   255: aload 27
    //   257: invokevirtual 52	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   260: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: pop
    //   264: aload 27
    //   266: invokevirtual 169	java/io/File:createNewFile	()Z
    //   269: istore 29
    //   271: iload 29
    //   273: ifne +14 -> 287
    //   276: aload 10
    //   278: invokevirtual 160	java/util/zip/ZipFile:close	()V
    //   281: iconst_0
    //   282: ireturn
    //   283: astore 39
    //   285: iconst_0
    //   286: ireturn
    //   287: aload 10
    //   289: aload 19
    //   291: invokevirtual 173	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   294: astore 30
    //   296: aload 30
    //   298: astore 9
    //   300: new 175	java/io/FileOutputStream
    //   303: dup
    //   304: aload 27
    //   306: invokespecial 177	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   309: astore 31
    //   311: sipush 16384
    //   314: newarray byte
    //   316: astore 34
    //   318: aload 9
    //   320: aload 34
    //   322: invokevirtual 183	java/io/InputStream:read	([B)I
    //   325: istore 35
    //   327: iload 35
    //   329: ifle +70 -> 399
    //   332: aload 31
    //   334: aload 34
    //   336: iconst_0
    //   337: iload 35
    //   339: invokevirtual 187	java/io/FileOutputStream:write	([BII)V
    //   342: goto -24 -> 318
    //   345: astore 33
    //   347: aload 31
    //   349: astore 5
    //   351: aload 9
    //   353: astore 6
    //   355: aload 10
    //   357: astore 7
    //   359: aload_3
    //   360: invokestatic 113	com/wandoujia/base/utils/LibraryLoaderHelper:deleteDirectorySync	(Ljava/io/File;)V
    //   363: aload 5
    //   365: ifnull +8 -> 373
    //   368: aload 5
    //   370: invokevirtual 188	java/io/FileOutputStream:close	()V
    //   373: aload 6
    //   375: ifnull +8 -> 383
    //   378: aload 6
    //   380: invokevirtual 189	java/io/InputStream:close	()V
    //   383: aload 7
    //   385: ifnull -159 -> 226
    //   388: aload 7
    //   390: invokevirtual 160	java/util/zip/ZipFile:close	()V
    //   393: iconst_0
    //   394: ireturn
    //   395: astore 12
    //   397: iconst_0
    //   398: ireturn
    //   399: aload 27
    //   401: invokevirtual 52	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   404: sipush 493
    //   407: invokestatic 195	com/wandoujia/base/utils/FileUtil:setPermissions	(Ljava/lang/String;I)V
    //   410: aload 31
    //   412: invokevirtual 188	java/io/FileOutputStream:close	()V
    //   415: aload 9
    //   417: ifnull +8 -> 425
    //   420: aload 9
    //   422: invokevirtual 189	java/io/InputStream:close	()V
    //   425: aload 10
    //   427: invokevirtual 160	java/util/zip/ZipFile:close	()V
    //   430: iconst_1
    //   431: ireturn
    //   432: astore 13
    //   434: aconst_null
    //   435: astore 9
    //   437: aconst_null
    //   438: astore 10
    //   440: aload_2
    //   441: ifnull +7 -> 448
    //   444: aload_2
    //   445: invokevirtual 188	java/io/FileOutputStream:close	()V
    //   448: aload 9
    //   450: ifnull +8 -> 458
    //   453: aload 9
    //   455: invokevirtual 189	java/io/InputStream:close	()V
    //   458: aload 10
    //   460: ifnull -234 -> 226
    //   463: aload 10
    //   465: invokevirtual 160	java/util/zip/ZipFile:close	()V
    //   468: iconst_0
    //   469: ireturn
    //   470: astore 14
    //   472: iconst_0
    //   473: ireturn
    //   474: astore 8
    //   476: aconst_null
    //   477: astore 9
    //   479: aconst_null
    //   480: astore 10
    //   482: aload_2
    //   483: ifnull +7 -> 490
    //   486: aload_2
    //   487: invokevirtual 188	java/io/FileOutputStream:close	()V
    //   490: aload 9
    //   492: ifnull +8 -> 500
    //   495: aload 9
    //   497: invokevirtual 189	java/io/InputStream:close	()V
    //   500: aload 10
    //   502: ifnull +8 -> 510
    //   505: aload 10
    //   507: invokevirtual 160	java/util/zip/ZipFile:close	()V
    //   510: aload 8
    //   512: athrow
    //   513: astore 26
    //   515: iconst_0
    //   516: ireturn
    //   517: astore 11
    //   519: goto -9 -> 510
    //   522: astore 8
    //   524: aconst_null
    //   525: astore_2
    //   526: aconst_null
    //   527: astore 9
    //   529: goto -47 -> 482
    //   532: astore 8
    //   534: aconst_null
    //   535: astore_2
    //   536: goto -54 -> 482
    //   539: astore 8
    //   541: aload 31
    //   543: astore_2
    //   544: goto -62 -> 482
    //   547: astore 8
    //   549: aload 6
    //   551: astore 9
    //   553: aload 7
    //   555: astore 10
    //   557: aload 5
    //   559: astore_2
    //   560: goto -78 -> 482
    //   563: astore 17
    //   565: aconst_null
    //   566: astore_2
    //   567: aconst_null
    //   568: astore 9
    //   570: goto -130 -> 440
    //   573: astore 38
    //   575: aconst_null
    //   576: astore_2
    //   577: goto -137 -> 440
    //   580: astore 32
    //   582: aload 31
    //   584: astore_2
    //   585: goto -145 -> 440
    //   588: astore 4
    //   590: aconst_null
    //   591: astore 5
    //   593: aconst_null
    //   594: astore 6
    //   596: aconst_null
    //   597: astore 7
    //   599: goto -240 -> 359
    //   602: astore 16
    //   604: aload 10
    //   606: astore 7
    //   608: aconst_null
    //   609: astore 5
    //   611: aconst_null
    //   612: astore 6
    //   614: goto -255 -> 359
    //   617: astore 37
    //   619: aload 10
    //   621: astore 7
    //   623: aload 9
    //   625: astore 6
    //   627: aconst_null
    //   628: astore 5
    //   630: goto -271 -> 359
    //   633: astore 36
    //   635: goto -205 -> 430
    //
    // Exception table:
    //   from	to	target	type
    //   276	281	283	java/io/IOException
    //   311	318	345	java/io/IOException
    //   318	327	345	java/io/IOException
    //   332	342	345	java/io/IOException
    //   399	410	345	java/io/IOException
    //   368	373	395	java/io/IOException
    //   378	383	395	java/io/IOException
    //   388	393	395	java/io/IOException
    //   11	39	432	java/lang/NoSuchMethodError
    //   444	448	470	java/io/IOException
    //   453	458	470	java/io/IOException
    //   463	468	470	java/io/IOException
    //   11	39	474	finally
    //   221	226	513	java/io/IOException
    //   486	490	517	java/io/IOException
    //   495	500	517	java/io/IOException
    //   505	510	517	java/io/IOException
    //   39	80	522	finally
    //   85	137	522	finally
    //   142	181	522	finally
    //   186	221	522	finally
    //   228	236	522	finally
    //   239	271	522	finally
    //   287	296	522	finally
    //   300	311	532	finally
    //   311	318	539	finally
    //   318	327	539	finally
    //   332	342	539	finally
    //   399	410	539	finally
    //   359	363	547	finally
    //   39	80	563	java/lang/NoSuchMethodError
    //   85	137	563	java/lang/NoSuchMethodError
    //   142	181	563	java/lang/NoSuchMethodError
    //   186	221	563	java/lang/NoSuchMethodError
    //   228	236	563	java/lang/NoSuchMethodError
    //   239	271	563	java/lang/NoSuchMethodError
    //   287	296	563	java/lang/NoSuchMethodError
    //   300	311	573	java/lang/NoSuchMethodError
    //   311	318	580	java/lang/NoSuchMethodError
    //   318	327	580	java/lang/NoSuchMethodError
    //   332	342	580	java/lang/NoSuchMethodError
    //   399	410	580	java/lang/NoSuchMethodError
    //   11	39	588	java/io/IOException
    //   39	80	602	java/io/IOException
    //   85	137	602	java/io/IOException
    //   142	181	602	java/io/IOException
    //   186	221	602	java/io/IOException
    //   228	236	602	java/io/IOException
    //   239	271	602	java/io/IOException
    //   287	296	602	java/io/IOException
    //   300	311	617	java/io/IOException
    //   410	415	633	java/io/IOException
    //   420	425	633	java/io/IOException
    //   425	430	633	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.LibraryLoaderHelper
 * JD-Core Version:    0.6.0
 */