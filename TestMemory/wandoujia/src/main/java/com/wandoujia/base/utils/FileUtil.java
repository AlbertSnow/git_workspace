package com.wandoujia.base.utils;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.reflect.JavaCalls;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil
{
  private static final String APP_FILE_DIRECTORY = Environment.getExternalStorageDirectory().getPath() + "/ripple/download/app/";
  private static final String PATH_PLACEHOLDER_EXTERNAL = "%EXTERNAL%";
  private static final String PATH_PLACEHOLDER_HOME = "%HOME%";
  private static final String PATH_PREFIX_EXTERNAL = "/mnt/sdcard";
  private static final String PATH_PREFIX_EXTERNAL_SDCARD = "/sdcard";
  private static final String VIDEO_FILE_DIRECTORY = Environment.getExternalStorageDirectory().getPath() + "/ripple/download/video/";

  public static boolean canWrite(File paramFile)
  {
    boolean bool;
    if ((paramFile == null) || (!paramFile.exists()))
      bool = false;
    File localFile;
    do
    {
      return bool;
      localFile = new File(paramFile, "." + System.currentTimeMillis());
      bool = localFile.mkdir();
    }
    while (!bool);
    return localFile.delete();
  }

  public static void clearPath(String paramString)
  {
    File localFile1 = new File(paramString);
    if ((!localFile1.exists()) || (!localFile1.isDirectory()))
      return;
    String[] arrayOfString = localFile1.list();
    int i = arrayOfString.length;
    int j = 0;
    label35: String str1;
    if (j < i)
    {
      str1 = arrayOfString[j];
      if (!paramString.endsWith(File.separator))
        break label122;
    }
    label122: for (String str2 = paramString + str1; ; str2 = paramString + File.separator + str1)
    {
      File localFile2 = new File(str2);
      if (localFile2.isFile())
        localFile2.delete();
      if (localFile2.isDirectory())
        deletePath(str2);
      j++;
      break label35;
      break;
    }
  }

  public static boolean copyFile(File paramFile1, File paramFile2)
  {
    if ((!paramFile1.exists()) || (!paramFile1.isFile()) || (paramFile2.isDirectory()))
      return false;
    if (paramFile2.exists())
      paramFile2.delete();
    try
    {
      byte[] arrayOfByte = new byte[2048];
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile1));
      BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(paramFile2));
      while (true)
      {
        int i = localBufferedInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        localBufferedOutputStream.write(arrayOfByte, 0, i);
      }
      localBufferedInputStream.close();
      localBufferedOutputStream.flush();
      localBufferedOutputStream.close();
      return true;
    }
    catch (IOException localIOException)
    {
    }
    return false;
  }

  public static boolean copyFile(String paramString1, String paramString2)
  {
    return copyFile(new File(paramString1), new File(paramString2));
  }

  public static void deleteFile(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    File localFile;
    do
    {
      return;
      localFile = new File(paramString);
    }
    while ((!localFile.exists()) || (!localFile.isFile()));
    localFile.delete();
  }

  public static void deletePath(String paramString)
  {
    File localFile1 = new File(paramString);
    if (!localFile1.exists());
    String[] arrayOfString;
    do
    {
      return;
      if (localFile1.isFile())
      {
        localFile1.delete();
        return;
      }
      arrayOfString = localFile1.list();
    }
    while (arrayOfString == null);
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str1 = arrayOfString[j];
      if (str1 != null)
        if (!paramString.endsWith(File.separator))
          break label137;
      label137: for (String str2 = paramString + str1; ; str2 = paramString + File.separator + str1)
      {
        File localFile2 = new File(str2);
        if (localFile2.isFile())
          localFile2.delete();
        if (localFile2.isDirectory())
          deletePath(str2);
        j++;
        break;
      }
    }
    localFile1.delete();
  }

  public static boolean exists(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    return new File(paramString).exists();
  }

  public static String formatExternalPath(String paramString)
  {
    String str = formatExternalPath(paramString, Environment.getExternalStorageDirectory().getAbsolutePath());
    if (!exists(str))
      return paramString;
    return str;
  }

  private static String formatExternalPath(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString1))
    {
      if (paramString1.startsWith("%EXTERNAL%"))
        paramString1 = paramString1.replace("%EXTERNAL%", paramString2);
    }
    else
      return paramString1;
    if (paramString1.startsWith("/mnt/sdcard"))
      return paramString1.replace("/mnt/sdcard", paramString2);
    if (paramString1.startsWith("/sdcard"))
      return paramString1.replace("/sdcard", paramString2);
    return PathAdjustUtil.adjustSdcardPathForApp(paramString1);
  }

  public static String formatHomePath(Context paramContext, String paramString)
  {
    if (paramString.startsWith("%HOME%"))
    {
      if (Environment.getExternalStorageState().equals("mounted"))
        paramString = paramString.replace("%HOME%", Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + GlobalConfig.getAppRootDir() + "/");
    }
    else
      return paramString;
    return paramString.replace("%HOME%", paramContext.getFilesDir().getAbsolutePath());
  }

  public static String formatPath(Context paramContext, String paramString)
  {
    if (paramString.startsWith("%HOME%"))
      return formatHomePath(paramContext, paramString);
    return formatExternalPath(paramString);
  }

  public static long getAllBytes(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return 0L;
      try
      {
        if ((TextUtils.isEmpty(paramString)) || (!new File(paramString).exists()))
          continue;
        StatFs localStatFs = new StatFs(paramString);
        long l = localStatFs.getBlockCount();
        int i = localStatFs.getBlockSize();
        return l * i;
      }
      catch (Exception localException)
      {
      }
    }
    return 0L;
  }

  public static long getAvailableBytes(String paramString)
  {
    try
    {
      if ((!TextUtils.isEmpty(paramString)) && (new File(paramString).exists()))
      {
        StatFs localStatFs = new StatFs(paramString);
        long l = localStatFs.getAvailableBlocks();
        int i = localStatFs.getBlockSize();
        return l * i;
      }
    }
    catch (Exception localException)
    {
    }
    return 0L;
  }

  public static String getFileExtension(String paramString)
  {
    int i = paramString.lastIndexOf(".");
    if ((i >= 0) && (i < -1 + paramString.length()))
      return paramString.substring(i + 1).toUpperCase();
    return "";
  }

  public static String getFileName(String paramString)
  {
    if (paramString.endsWith("/"))
      paramString = paramString.substring(0, -1 + paramString.length());
    int i = paramString.lastIndexOf("/");
    if ((i > 0) && (i < -1 + paramString.length()))
      paramString = paramString.substring(i + 1);
    return paramString;
  }

  public static String getFileNameWithoutExtension(String paramString)
  {
    String str = getFileName(paramString);
    if ((str != null) && (str.length() > 0))
    {
      int i = str.lastIndexOf('.');
      if (i > 0)
        str = str.substring(0, i);
    }
    return str;
  }

  public static long getFileSize(String paramString)
  {
    long l1;
    if (TextUtils.isEmpty(paramString))
      l1 = 0L;
    File[] arrayOfFile;
    do
    {
      File localFile1;
      do
      {
        return l1;
        localFile1 = new File(paramString);
        if (!localFile1.exists())
          return 0L;
        l1 = localFile1.length();
      }
      while (!localFile1.isDirectory());
      arrayOfFile = localFile1.listFiles();
    }
    while (arrayOfFile == null);
    int i = arrayOfFile.length;
    int j = 0;
    while (j < i)
    {
      File localFile2 = arrayOfFile[j];
      try
      {
        long l2 = getFileSize(localFile2.getAbsolutePath());
        long l3 = l2 + l1;
        j++;
        l1 = l3;
      }
      catch (StackOverflowError localStackOverflowError)
      {
        return 0L;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
      }
    }
    return 0L;
  }

  public static String getParentFilePath(String paramString)
  {
    if (paramString.endsWith("/"))
      paramString = paramString.substring(0, -1 + paramString.length());
    int i = paramString.lastIndexOf("/");
    if (i >= 0)
      return paramString.substring(0, i);
    return null;
  }

  public static String getVideoFilePath(String paramString)
  {
    return VIDEO_FILE_DIRECTORY + paramString.hashCode();
  }

  public static boolean isExternalFile(Context paramContext, String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      return paramString.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath());
    return false;
  }

  public static boolean isExternalPath(String paramString)
  {
    return !paramString.startsWith("%HOME%");
  }

  public static boolean mkdir(String paramString)
  {
    return new File(paramString).mkdirs();
  }

  // ERROR //
  public static String readFileFirstLine(String paramString)
  {
    // Byte code:
    //   0: new 279	java/io/BufferedReader
    //   3: dup
    //   4: new 281	java/io/FileReader
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 282	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   12: invokespecial 285	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   15: astore_1
    //   16: aload_1
    //   17: invokevirtual 288	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   20: astore_3
    //   21: aload_1
    //   22: invokevirtual 289	java/io/BufferedReader:close	()V
    //   25: aload_1
    //   26: invokevirtual 289	java/io/BufferedReader:close	()V
    //   29: aload_3
    //   30: areturn
    //   31: astore 9
    //   33: aconst_null
    //   34: astore_1
    //   35: ldc 239
    //   37: astore_3
    //   38: aload_1
    //   39: ifnull -10 -> 29
    //   42: aload_1
    //   43: invokevirtual 289	java/io/BufferedReader:close	()V
    //   46: aload_3
    //   47: areturn
    //   48: astore 4
    //   50: aload_3
    //   51: areturn
    //   52: astore 8
    //   54: aconst_null
    //   55: astore_1
    //   56: aload 8
    //   58: astore 5
    //   60: aload_1
    //   61: ifnull +7 -> 68
    //   64: aload_1
    //   65: invokevirtual 289	java/io/BufferedReader:close	()V
    //   68: aload 5
    //   70: athrow
    //   71: astore 7
    //   73: aload_3
    //   74: areturn
    //   75: astore 6
    //   77: goto -9 -> 68
    //   80: astore 5
    //   82: goto -22 -> 60
    //   85: astore_2
    //   86: goto -51 -> 35
    //
    // Exception table:
    //   from	to	target	type
    //   0	16	31	java/lang/Exception
    //   42	46	48	java/io/IOException
    //   0	16	52	finally
    //   25	29	71	java/io/IOException
    //   64	68	75	java/io/IOException
    //   16	25	80	finally
    //   16	25	85	java/lang/Exception
  }

  public static boolean renameFile(String paramString1, String paramString2)
  {
    File localFile1 = new File(paramString1);
    File localFile2 = new File(paramString2);
    if (!localFile1.exists())
      return false;
    return localFile1.renameTo(localFile2);
  }

  public static void setPermissions(String paramString, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Integer.valueOf(-1);
    arrayOfObject[2] = Integer.valueOf(-1);
    JavaCalls.callStaticMethod("android.os.FileUtils", paramString, arrayOfObject);
  }

  // ERROR //
  public static void write(String paramString1, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 34	java/io/File
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 85	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: astore 4
    //   12: aload 4
    //   14: invokevirtual 60	java/io/File:exists	()Z
    //   17: ifne +18 -> 35
    //   20: aload 4
    //   22: invokevirtual 315	java/io/File:getParentFile	()Ljava/io/File;
    //   25: invokevirtual 276	java/io/File:mkdirs	()Z
    //   28: pop
    //   29: aload 4
    //   31: invokevirtual 318	java/io/File:createNewFile	()Z
    //   34: pop
    //   35: new 320	java/io/FileWriter
    //   38: dup
    //   39: aload_0
    //   40: iload_2
    //   41: invokespecial 323	java/io/FileWriter:<init>	(Ljava/lang/String;Z)V
    //   44: astore 6
    //   46: aload 6
    //   48: aload_1
    //   49: invokevirtual 325	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   52: aload 6
    //   54: invokevirtual 326	java/io/FileWriter:close	()V
    //   57: return
    //   58: astore 11
    //   60: aload_3
    //   61: ifnull -4 -> 57
    //   64: aload_3
    //   65: invokevirtual 326	java/io/FileWriter:close	()V
    //   68: return
    //   69: astore 12
    //   71: return
    //   72: astore 9
    //   74: aload_3
    //   75: ifnull -18 -> 57
    //   78: aload_3
    //   79: invokevirtual 326	java/io/FileWriter:close	()V
    //   82: return
    //   83: astore 10
    //   85: return
    //   86: astore 5
    //   88: aconst_null
    //   89: astore 6
    //   91: aload 5
    //   93: astore 7
    //   95: aload 6
    //   97: ifnull +8 -> 105
    //   100: aload 6
    //   102: invokevirtual 326	java/io/FileWriter:close	()V
    //   105: aload 7
    //   107: athrow
    //   108: astore 15
    //   110: return
    //   111: astore 8
    //   113: goto -8 -> 105
    //   116: astore 7
    //   118: goto -23 -> 95
    //   121: astore 14
    //   123: aload 6
    //   125: astore_3
    //   126: goto -52 -> 74
    //   129: astore 13
    //   131: aload 6
    //   133: astore_3
    //   134: goto -74 -> 60
    //
    // Exception table:
    //   from	to	target	type
    //   2	35	58	java/io/IOException
    //   35	46	58	java/io/IOException
    //   64	68	69	java/lang/Exception
    //   2	35	72	java/lang/Throwable
    //   35	46	72	java/lang/Throwable
    //   78	82	83	java/lang/Exception
    //   2	35	86	finally
    //   35	46	86	finally
    //   52	57	108	java/lang/Exception
    //   100	105	111	java/lang/Exception
    //   46	52	116	finally
    //   46	52	121	java/lang/Throwable
    //   46	52	129	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.FileUtil
 * JD-Core Version:    0.6.0
 */