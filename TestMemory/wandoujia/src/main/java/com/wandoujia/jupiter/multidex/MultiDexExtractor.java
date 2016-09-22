package com.wandoujia.jupiter.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

final class MultiDexExtractor
{
  private static final int BUFFER_SIZE = 16384;
  private static final String DEX_PREFIX = "classes";
  private static final String DEX_SUFFIX = ".dex";
  private static final String EXTRACTED_NAME_EXT = ".classes";
  private static final String EXTRACTED_SUFFIX = ".zip";
  private static final String KEY_CRC = "crc";
  private static final String KEY_DEX_NUMBER = "dex.number";
  private static final String KEY_TIME_STAMP = "timestamp";
  private static final int MAX_EXTRACT_ATTEMPTS = 3;
  private static final long NO_VALUE = -1L;
  private static final String PREFS_FILE = "multidex.version";
  private static final String TAG = "MultiDex";
  private static Method sApplyMethod;

  static
  {
    try
    {
      sApplyMethod = SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      sApplyMethod = null;
    }
  }

  private static void apply(SharedPreferences.Editor paramEditor)
  {
    if (sApplyMethod != null);
    try
    {
      sApplyMethod.invoke(paramEditor, new Object[0]);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      paramEditor.commit();
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label20: break label20;
    }
  }

  private static void closeQuietly(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  // ERROR //
  private static void extract(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 94	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   5: astore 4
    //   7: aload_3
    //   8: ldc 20
    //   10: aload_2
    //   11: invokevirtual 100	java/io/File:getParentFile	()Ljava/io/File;
    //   14: invokestatic 104	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   17: astore 5
    //   19: new 106	java/lang/StringBuilder
    //   22: dup
    //   23: ldc 108
    //   25: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   28: aload 5
    //   30: invokevirtual 115	java/io/File:getPath	()Ljava/lang/String;
    //   33: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: new 121	java/util/zip/ZipOutputStream
    //   40: dup
    //   41: new 123	java/io/BufferedOutputStream
    //   44: dup
    //   45: new 125	java/io/FileOutputStream
    //   48: dup
    //   49: aload 5
    //   51: invokespecial 128	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   54: invokespecial 131	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   57: invokespecial 132	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   60: astore 7
    //   62: new 134	java/util/zip/ZipEntry
    //   65: dup
    //   66: ldc 136
    //   68: invokespecial 137	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   71: astore 8
    //   73: aload 8
    //   75: aload_1
    //   76: invokevirtual 141	java/util/zip/ZipEntry:getTime	()J
    //   79: invokevirtual 145	java/util/zip/ZipEntry:setTime	(J)V
    //   82: aload 7
    //   84: aload 8
    //   86: invokevirtual 149	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   89: sipush 16384
    //   92: newarray byte
    //   94: astore 12
    //   96: aload 4
    //   98: aload 12
    //   100: invokevirtual 155	java/io/InputStream:read	([B)I
    //   103: istore 13
    //   105: iload 13
    //   107: iconst_m1
    //   108: if_icmpeq +25 -> 133
    //   111: aload 7
    //   113: aload 12
    //   115: iconst_0
    //   116: iload 13
    //   118: invokevirtual 159	java/util/zip/ZipOutputStream:write	([BII)V
    //   121: aload 4
    //   123: aload 12
    //   125: invokevirtual 155	java/io/InputStream:read	([B)I
    //   128: istore 13
    //   130: goto -25 -> 105
    //   133: aload 7
    //   135: invokevirtual 162	java/util/zip/ZipOutputStream:closeEntry	()V
    //   138: aload 7
    //   140: invokevirtual 163	java/util/zip/ZipOutputStream:close	()V
    //   143: new 106	java/lang/StringBuilder
    //   146: dup
    //   147: ldc 165
    //   149: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   152: aload_2
    //   153: invokevirtual 115	java/io/File:getPath	()Ljava/lang/String;
    //   156: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload 5
    //   162: aload_2
    //   163: invokevirtual 169	java/io/File:renameTo	(Ljava/io/File;)Z
    //   166: ifne +74 -> 240
    //   169: new 81	java/io/IOException
    //   172: dup
    //   173: new 106	java/lang/StringBuilder
    //   176: dup
    //   177: ldc 171
    //   179: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   182: aload 5
    //   184: invokevirtual 174	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   187: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: ldc 176
    //   192: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: aload_2
    //   196: invokevirtual 174	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   199: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: ldc 178
    //   204: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: invokespecial 182	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   213: athrow
    //   214: astore 10
    //   216: aload 4
    //   218: invokestatic 184	com/wandoujia/jupiter/multidex/MultiDexExtractor:closeQuietly	(Ljava/io/Closeable;)V
    //   221: aload 5
    //   223: invokevirtual 187	java/io/File:delete	()Z
    //   226: pop
    //   227: aload 10
    //   229: athrow
    //   230: astore 9
    //   232: aload 7
    //   234: invokevirtual 163	java/util/zip/ZipOutputStream:close	()V
    //   237: aload 9
    //   239: athrow
    //   240: aload 4
    //   242: invokestatic 184	com/wandoujia/jupiter/multidex/MultiDexExtractor:closeQuietly	(Ljava/io/Closeable;)V
    //   245: aload 5
    //   247: invokevirtual 187	java/io/File:delete	()Z
    //   250: pop
    //   251: return
    //
    // Exception table:
    //   from	to	target	type
    //   37	62	214	finally
    //   138	214	214	finally
    //   232	240	214	finally
    //   62	105	230	finally
    //   111	130	230	finally
    //   133	138	230	finally
  }

  private static SharedPreferences getMultiDexPreferences(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 11);
    for (int i = 0; ; i = 4)
      return paramContext.getSharedPreferences("multidex.version", i);
  }

  private static long getTimeStamp(File paramFile)
  {
    long l = paramFile.lastModified();
    if (l == -1L)
      l -= 1L;
    return l;
  }

  private static long getZipCrc(File paramFile)
  {
    long l = ZipUtil.getZipCrc(paramFile);
    if (l == -1L)
      l -= 1L;
    return l;
  }

  private static boolean isModified(Context paramContext, File paramFile, long paramLong)
  {
    SharedPreferences localSharedPreferences = getMultiDexPreferences(paramContext);
    return (localSharedPreferences.getLong("timestamp", -1L) != getTimeStamp(paramFile)) || (localSharedPreferences.getLong("crc", -1L) != paramLong);
  }

  static List<File> load(Context paramContext, ApplicationInfo paramApplicationInfo, File paramFile, boolean paramBoolean)
  {
    new StringBuilder("MultiDexExtractor.load(").append(paramApplicationInfo.sourceDir).append(", ").append(paramBoolean).append(")");
    File localFile = new File(paramApplicationInfo.sourceDir);
    long l = getZipCrc(localFile);
    if ((!paramBoolean) && (!isModified(paramContext, localFile, l)));
    while (true)
    {
      try
      {
        List localList2 = loadExistingExtractions(paramContext, localFile, paramFile);
        localList1 = localList2;
        new StringBuilder("load found ").append(localList1.size()).append(" secondary dex files");
        return localList1;
      }
      catch (IOException localIOException)
      {
      }
      List localList1 = performExtractions(localFile, paramFile);
      putStoredApkInfo(paramContext, getTimeStamp(localFile), l, 1 + localList1.size());
    }
  }

  private static List<File> loadExistingExtractions(Context paramContext, File paramFile1, File paramFile2)
  {
    String str = paramFile1.getName() + ".classes";
    int i = getMultiDexPreferences(paramContext).getInt("dex.number", 1);
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 2; j <= i; j++)
    {
      File localFile = new File(paramFile2, str + j + ".zip");
      if (localFile.isFile())
      {
        localArrayList.add(localFile);
        if (verifyZipFile(localFile))
          continue;
        new StringBuilder("Invalid zip file: ").append(localFile);
        throw new IOException("Invalid ZIP file.");
      }
      throw new IOException("Missing extracted secondary dex file '" + localFile.getPath() + "'");
    }
    return localArrayList;
  }

  private static List<File> performExtractions(File paramFile1, File paramFile2)
  {
    String str1 = paramFile1.getName() + ".classes";
    prepareDexDir(paramFile2, str1);
    ArrayList localArrayList = new ArrayList();
    ZipFile localZipFile = new ZipFile(paramFile1);
    try
    {
      localObject2 = localZipFile.getEntry("classes2.dex");
      i = 2;
      if (localObject2 != null)
      {
        File localFile = new File(paramFile2, str1 + i + ".zip");
        localArrayList.add(localFile);
        new StringBuilder("Extraction is needed for file ").append(localFile);
        j = 0;
        for (k = 0; (k < 3) && (j == 0); k = n)
        {
          n = k + 1;
          extract(localZipFile, (ZipEntry)localObject2, localFile, str1);
          bool = verifyZipFile(localFile);
          StringBuilder localStringBuilder = new StringBuilder("Extraction ");
          if (!bool)
            break label409;
          str2 = "success";
          localStringBuilder.append(str2).append(" - length ").append(localFile.getAbsolutePath()).append(": ").append(localFile.length());
          if (bool)
            break label398;
          localFile.delete();
          if (!localFile.exists())
            break label398;
          new StringBuilder("Failed to delete corrupted secondary dex '").append(localFile.getPath()).append("'");
          j = bool;
        }
        if (j == 0)
          throw new IOException("Could not create zip file " + localFile.getAbsolutePath() + " for secondary dex (" + i + ")");
      }
    }
    finally
    {
      while (true)
      {
        int n;
        boolean bool;
        try
        {
          localZipFile.close();
          throw localObject1;
          int m = i + 1;
          ZipEntry localZipEntry = localZipFile.getEntry("classes" + m + ".dex");
          Object localObject2 = localZipEntry;
          int i = m;
          continue;
          try
          {
            localZipFile.close();
            return localArrayList;
          }
          catch (IOException localIOException2)
          {
            return localArrayList;
          }
        }
        catch (IOException localIOException1)
        {
          continue;
        }
        label398: int j = bool;
        int k = n;
        continue;
        label409: String str2 = "failed";
      }
    }
  }

  private static void prepareDexDir(File paramFile, String paramString)
  {
    File[] arrayOfFile = paramFile.listFiles(new MultiDexExtractor.1(paramString));
    if (arrayOfFile == null)
    {
      new StringBuilder("Failed to list secondary dex dir content (").append(paramFile.getPath()).append(").");
      return;
    }
    int i = arrayOfFile.length;
    int j = 0;
    label48: File localFile;
    if (j < i)
    {
      localFile = arrayOfFile[j];
      new StringBuilder("Trying to delete old file ").append(localFile.getPath()).append(" of size ").append(localFile.length());
      if (localFile.delete())
        break label126;
      new StringBuilder("Failed to delete old file ").append(localFile.getPath());
    }
    while (true)
    {
      j++;
      break label48;
      break;
      label126: new StringBuilder("Deleted old file ").append(localFile.getPath());
    }
  }

  private static void putStoredApkInfo(Context paramContext, long paramLong1, long paramLong2, int paramInt)
  {
    SharedPreferences.Editor localEditor = getMultiDexPreferences(paramContext).edit();
    localEditor.putLong("timestamp", paramLong1);
    localEditor.putLong("crc", paramLong2);
    localEditor.putInt("dex.number", paramInt);
    apply(localEditor);
  }

  static boolean verifyZipFile(File paramFile)
  {
    try
    {
      ZipFile localZipFile = new ZipFile(paramFile);
      try
      {
        localZipFile.close();
        return true;
      }
      catch (IOException localIOException1)
      {
        new StringBuilder("Failed to close zip file: ").append(paramFile.getAbsolutePath());
      }
      return false;
    }
    catch (ZipException localZipException)
    {
      while (true)
        new StringBuilder("File ").append(paramFile.getAbsolutePath()).append(" is not a valid zip file.");
    }
    catch (IOException localIOException2)
    {
      while (true)
        new StringBuilder("Got an IOException trying to open zip file: ").append(paramFile.getAbsolutePath());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.multidex.MultiDexExtractor
 * JD-Core Version:    0.6.0
 */