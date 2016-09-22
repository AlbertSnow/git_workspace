package com.wandoujia.log;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import com.wandoujia.base.utils.IOUtils;
import com.wandoujia.gson.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

public final class i
{
  private final c a = new c();
  private final String b;
  private final String c;
  private final String d;
  private final byte[] e = new byte[0];
  private boolean f = false;

  i(Context paramContext, String paramString)
  {
    this.b = paramString;
    this.c = a(paramContext);
    String str1 = paramContext.getFilesDir().getAbsolutePath() + "/.log/" + this.b;
    File localFile = new File(str1);
    if (!localFile.exists())
      localFile.mkdirs();
    String str2 = this.c.replaceAll("[.:]", "_") + "_" + this.b + "_.log";
    this.d = (str1 + "/" + str2);
  }

  private static String a(Context paramContext)
  {
    String str = paramContext.getPackageName();
    int i = Process.myPid();
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    if (localActivityManager != null)
    {
      List localList = localActivityManager.getRunningAppProcesses();
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          if ((localRunningAppProcessInfo != null) && (localRunningAppProcessInfo.pid == i))
            return localRunningAppProcessInfo.processName;
        }
      }
    }
    return str;
  }

  // ERROR //
  private void a()
  {
    // Byte code:
    //   0: new 46	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: getfield 85	com/wandoujia/log/i:d	Ljava/lang/String;
    //   8: invokespecial 62	java/io/File:<init>	(Ljava/lang/String;)V
    //   11: astore_1
    //   12: new 46	java/io/File
    //   15: dup
    //   16: new 37	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 38	java/lang/StringBuilder:<init>	()V
    //   23: aload_0
    //   24: getfield 85	com/wandoujia/log/i:d	Ljava/lang/String;
    //   27: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: ldc 136
    //   32: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: invokespecial 62	java/io/File:<init>	(Ljava/lang/String;)V
    //   41: astore_2
    //   42: aload_0
    //   43: getfield 21	com/wandoujia/log/i:e	[B
    //   46: astore_3
    //   47: aload_3
    //   48: monitorenter
    //   49: new 138	java/io/BufferedReader
    //   52: dup
    //   53: new 140	java/io/FileReader
    //   56: dup
    //   57: aload_1
    //   58: invokespecial 143	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   61: invokespecial 146	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   64: astore 4
    //   66: new 148	java/io/BufferedWriter
    //   69: dup
    //   70: new 150	java/io/FileWriter
    //   73: dup
    //   74: aload_2
    //   75: invokespecial 151	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   78: invokespecial 154	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   81: astore 5
    //   83: aload 4
    //   85: invokevirtual 157	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   88: astore 13
    //   90: aload 13
    //   92: ifnull +92 -> 184
    //   95: aload 13
    //   97: ldc 159
    //   99: invokevirtual 163	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   102: astore 14
    //   104: aload 14
    //   106: arraylength
    //   107: iconst_4
    //   108: if_icmplt +70 -> 178
    //   111: aload 14
    //   113: iconst_3
    //   114: aaload
    //   115: ldc 165
    //   117: invokevirtual 169	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   120: ifeq +58 -> 178
    //   123: iconst_1
    //   124: istore 15
    //   126: iload 15
    //   128: ifne -45 -> 83
    //   131: aload 5
    //   133: new 37	java/lang/StringBuilder
    //   136: dup
    //   137: invokespecial 38	java/lang/StringBuilder:<init>	()V
    //   140: aload 13
    //   142: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: ldc 171
    //   147: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokevirtual 174	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   156: goto -73 -> 83
    //   159: astore 11
    //   161: aload 4
    //   163: astore 12
    //   165: aload 12
    //   167: invokestatic 180	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   170: aload 5
    //   172: invokestatic 180	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   175: aload_3
    //   176: monitorexit
    //   177: return
    //   178: iconst_0
    //   179: istore 15
    //   181: goto -55 -> 126
    //   184: aload 4
    //   186: invokevirtual 182	java/io/BufferedReader:close	()V
    //   189: aload 5
    //   191: invokevirtual 183	java/io/BufferedWriter:close	()V
    //   194: aload_1
    //   195: invokevirtual 186	java/io/File:delete	()Z
    //   198: pop
    //   199: aload_2
    //   200: aload_1
    //   201: invokevirtual 190	java/io/File:renameTo	(Ljava/io/File;)Z
    //   204: pop
    //   205: aload 4
    //   207: invokestatic 180	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   210: aload 5
    //   212: invokestatic 180	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   215: goto -40 -> 175
    //   218: astore 7
    //   220: aload_3
    //   221: monitorexit
    //   222: aload 7
    //   224: athrow
    //   225: astore 21
    //   227: aconst_null
    //   228: astore 5
    //   230: aconst_null
    //   231: astore 4
    //   233: aload 4
    //   235: invokestatic 180	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   238: aload 5
    //   240: invokestatic 180	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   243: goto -68 -> 175
    //   246: aload 4
    //   248: invokestatic 180	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   251: aload 9
    //   253: invokestatic 180	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   256: aload 10
    //   258: athrow
    //   259: astore 10
    //   261: aconst_null
    //   262: astore 9
    //   264: goto -18 -> 246
    //   267: astore 8
    //   269: aload 5
    //   271: astore 9
    //   273: aload 8
    //   275: astore 10
    //   277: goto -31 -> 246
    //   280: astore 19
    //   282: aconst_null
    //   283: astore 5
    //   285: goto -52 -> 233
    //   288: astore 6
    //   290: goto -57 -> 233
    //   293: astore 20
    //   295: aconst_null
    //   296: astore 5
    //   298: aconst_null
    //   299: astore 12
    //   301: goto -136 -> 165
    //   304: astore 18
    //   306: aload 4
    //   308: astore 12
    //   310: aconst_null
    //   311: astore 5
    //   313: goto -148 -> 165
    //   316: astore 10
    //   318: aconst_null
    //   319: astore 9
    //   321: aconst_null
    //   322: astore 4
    //   324: goto -78 -> 246
    //
    // Exception table:
    //   from	to	target	type
    //   83	90	159	java/io/FileNotFoundException
    //   95	123	159	java/io/FileNotFoundException
    //   131	156	159	java/io/FileNotFoundException
    //   184	205	159	java/io/FileNotFoundException
    //   165	175	218	finally
    //   175	177	218	finally
    //   205	215	218	finally
    //   220	222	218	finally
    //   233	243	218	finally
    //   246	259	218	finally
    //   49	66	225	java/io/IOException
    //   66	83	259	finally
    //   83	90	267	finally
    //   95	123	267	finally
    //   131	156	267	finally
    //   184	205	267	finally
    //   66	83	280	java/io/IOException
    //   83	90	288	java/io/IOException
    //   95	123	288	java/io/IOException
    //   131	156	288	java/io/IOException
    //   184	205	288	java/io/IOException
    //   49	66	293	java/io/FileNotFoundException
    //   66	83	304	java/io/FileNotFoundException
    //   49	66	316	finally
  }

  private void a(File paramFile)
  {
    if (!paramFile.exists())
      return;
    try
    {
      synchronized (this.e)
      {
        IOUtils.write(new FileInputStream(paramFile), new FileOutputStream(new File(this.d), true));
        label45: paramFile.delete();
        return;
      }
    }
    catch (IOException localIOException)
    {
      break label45;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      break label45;
    }
  }

  private String c(long paramLong)
  {
    return this.d + "." + paramLong;
  }

  public final long a(OutputStream paramOutputStream)
  {
    long l;
    String str2;
    synchronized (this.e)
    {
      l = System.currentTimeMillis();
      String str1 = c(l);
      File localFile1 = new File(this.d);
      File localFile2 = new File(str1);
      boolean bool1 = localFile1.exists();
      str2 = null;
      if (!bool1);
      while (str2 == null)
      {
        return -1L;
        if (localFile2.exists())
        {
          boolean bool3 = localFile2.delete();
          str2 = null;
          if (!bool3)
            continue;
        }
        boolean bool2 = localFile1.renameTo(new File(str1));
        str2 = null;
        if (!bool2)
          continue;
        str2 = str1;
      }
    }
    try
    {
      IOUtils.write(new FileInputStream(str2), true, paramOutputStream, false);
      return l;
    }
    catch (IOException localIOException)
    {
      return -1L;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
    }
    return -1L;
  }

  public final void a(long paramLong)
  {
    new File(c(paramLong)).delete();
  }

  public final void a(LogEventModel paramLogEventModel)
  {
    while (true)
    {
      int k;
      synchronized (this.e)
      {
        if (this.f)
          break label136;
        File[] arrayOfFile = new File(this.d).getParentFile().listFiles();
        int j = arrayOfFile.length;
        k = 0;
        if (k < j)
        {
          File localFile2 = arrayOfFile[k];
          String str3 = localFile2.getPath();
          if (!str3.endsWith("-v2.log"))
            continue;
          a(localFile2);
          break label366;
          if ((str3.equals(this.d)) || (!str3.contains(this.c)) || (!str3.contains(this.b)))
            break label366;
          a(localFile2);
        }
      }
      this.f = true;
      label136: monitorexit;
      if (paramLogEventModel == null)
        return;
      File localFile1 = new File(this.d);
      int i;
      if (localFile1.length() >= 1048576L)
      {
        a();
        boolean bool = localFile1.length() < 1048576L;
        i = 0;
        if (bool);
      }
      while (i != 0)
      {
        String str1 = this.a.a(paramLogEventModel.b, new a().getType()).replaceAll("\t", " ");
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramLogEventModel.a).append("\t");
        localStringBuilder.append(str1).append("\t");
        localStringBuilder.append(paramLogEventModel.c).append("\t");
        localStringBuilder.append(paramLogEventModel.d.getLevel());
        String str2 = localStringBuilder.toString();
        try
        {
          synchronized (this.e)
          {
            IOUtils.writeString(str2 + "\n", new FileOutputStream(this.d, true));
            label343: return;
          }
          i = 1;
        }
        catch (IOException localIOException)
        {
          break label343;
        }
      }
      label366: k++;
    }
  }

  public final void b(long paramLong)
  {
    a(new File(c(paramLong)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.i
 * JD-Core Version:    0.6.0
 */