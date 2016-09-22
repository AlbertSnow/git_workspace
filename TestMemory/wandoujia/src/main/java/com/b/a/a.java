package com.b.a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  implements Closeable
{
  private static Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
  private static final OutputStream n = new c();
  private final File b;
  private final File c;
  private final File d;
  private final File e;
  private long f;
  private long g = 0L;
  private Writer h;
  private final LinkedHashMap<String, f> i = new LinkedHashMap(0, 0.75F, true);
  private int j;
  private long k = 0L;
  private ThreadPoolExecutor l = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private final Callable<Void> m = new b(this);

  private a(File paramFile)
  {
    this.b = paramFile;
    this.c = new File(paramFile, "journal");
    this.d = new File(paramFile, "journal.tmp");
    this.e = new File(paramFile, "journal.bkp");
    this.f = 10485760L;
  }

  public static a a(File paramFile)
  {
    if (10485760L <= 0L)
      throw new IllegalArgumentException("maxSize <= 0");
    File localFile1 = new File(paramFile, "journal.bkp");
    File localFile2;
    if (localFile1.exists())
    {
      localFile2 = new File(paramFile, "journal");
      if (!localFile2.exists())
        break label121;
      localFile1.delete();
    }
    while (true)
    {
      a locala1 = new a(paramFile);
      if (locala1.c.exists())
        try
        {
          locala1.e();
          locala1.f();
          locala1.h = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(locala1.c, true), j.a));
          return locala1;
          label121: a(localFile1, localFile2, false);
        }
        catch (IOException localIOException)
        {
          System.out.println("DiskLruCache " + paramFile + " is corrupt: " + localIOException.getMessage() + ", removing");
          locala1.b();
        }
    }
    paramFile.mkdirs();
    a locala2 = new a(paramFile);
    locala2.g();
    return locala2;
  }

  private void a(d paramd, boolean paramBoolean)
  {
    monitorenter;
    f localf;
    try
    {
      localf = d.a(paramd);
      if (f.b(localf) != paramd)
        throw new IllegalStateException();
    }
    finally
    {
      monitorexit;
    }
    int i1 = 0;
    if (paramBoolean)
    {
      boolean bool = f.e(localf);
      i1 = 0;
      if (!bool)
        for (int i2 = 0; ; i2++)
        {
          i1 = 0;
          if (i2 > 0)
            break;
          if (d.b(paramd)[0] == 0)
          {
            paramd.c();
            throw new IllegalStateException("Newly created entry didn't create value for index 0");
          }
          if (localf.b(0).exists())
            continue;
          paramd.c();
          monitorexit;
          return;
        }
    }
    while (true)
    {
      if (i1 <= 0)
      {
        File localFile1 = localf.b(0);
        if (paramBoolean)
        {
          if (localFile1.exists())
          {
            File localFile2 = localf.a(0);
            localFile1.renameTo(localFile2);
            long l2 = f.c(localf)[0];
            long l3 = localFile2.length();
            f.c(localf)[0] = l3;
            this.g = (l3 + (this.g - l2));
          }
        }
        else
          b(localFile1);
      }
      else
      {
        this.j = (1 + this.j);
        f.a(localf, null);
        if ((paramBoolean | f.e(localf)))
        {
          f.a(localf);
          this.h.write("CLEAN " + f.d(localf) + localf.a() + '\n');
          if (paramBoolean)
          {
            long l1 = this.k;
            this.k = (1L + l1);
            f.a(localf, l1);
          }
        }
        while (true)
        {
          this.h.flush();
          if ((this.g <= this.f) && (!h()))
            break;
          this.l.submit(this.m);
          break;
          this.i.remove(f.d(localf));
          this.h.write("REMOVE " + f.d(localf) + '\n');
        }
      }
      i1++;
    }
  }

  private static void a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if (paramBoolean)
      b(paramFile2);
    if (!paramFile1.renameTo(paramFile2))
      throw new IOException();
  }

  private static void b(File paramFile)
  {
    if ((paramFile.exists()) && (!paramFile.delete()))
      throw new IOException();
  }

  private d d(String paramString)
  {
    monitorenter;
    while (true)
    {
      f localf1;
      d locald2;
      try
      {
        i();
        e(paramString);
        localf1 = (f)this.i.get(paramString);
        if (-1L == -1L)
          continue;
        if (localf1 == null)
          continue;
        long l1 = f.f(localf1);
        if (l1 == -1L)
          continue;
        locald2 = null;
        return locald2;
        if (localf1 == null)
        {
          f localf3 = new f(this, paramString, 0);
          this.i.put(paramString, localf3);
          localf2 = localf3;
          locald2 = new d(this, localf2, 0);
          f.a(localf2, locald2);
          this.h.write("DIRTY " + paramString + '\n');
          this.h.flush();
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      d locald1 = f.b(localf1);
      if (locald1 != null)
      {
        locald2 = null;
        continue;
      }
      f localf2 = localf1;
    }
  }

  // ERROR //
  private void e()
  {
    // Byte code:
    //   0: new 324	com/b/a/h
    //   3: dup
    //   4: new 326	java/io/FileInputStream
    //   7: dup
    //   8: aload_0
    //   9: getfield 100	com/b/a/a:c	Ljava/io/File;
    //   12: invokespecial 327	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: getstatic 149	com/b/a/j:a	Ljava/nio/charset/Charset;
    //   18: invokespecial 330	com/b/a/h:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   21: astore_1
    //   22: aload_1
    //   23: invokevirtual 331	com/b/a/h:a	()Ljava/lang/String;
    //   26: astore_3
    //   27: aload_1
    //   28: invokevirtual 331	com/b/a/h:a	()Ljava/lang/String;
    //   31: astore 4
    //   33: aload_1
    //   34: invokevirtual 331	com/b/a/h:a	()Ljava/lang/String;
    //   37: astore 5
    //   39: aload_1
    //   40: invokevirtual 331	com/b/a/h:a	()Ljava/lang/String;
    //   43: astore 6
    //   45: aload_1
    //   46: invokevirtual 331	com/b/a/h:a	()Ljava/lang/String;
    //   49: astore 7
    //   51: ldc_w 333
    //   54: aload_3
    //   55: invokevirtual 339	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifeq +49 -> 107
    //   61: ldc_w 341
    //   64: aload 4
    //   66: invokevirtual 339	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   69: ifeq +38 -> 107
    //   72: iconst_1
    //   73: invokestatic 346	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   76: aload 5
    //   78: invokevirtual 339	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   81: ifeq +26 -> 107
    //   84: iconst_1
    //   85: invokestatic 346	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   88: aload 6
    //   90: invokevirtual 339	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   93: ifeq +14 -> 107
    //   96: ldc_w 348
    //   99: aload 7
    //   101: invokevirtual 339	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   104: ifne +74 -> 178
    //   107: new 115	java/io/IOException
    //   110: dup
    //   111: new 168	java/lang/StringBuilder
    //   114: dup
    //   115: ldc_w 350
    //   118: invokespecial 171	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   121: aload_3
    //   122: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: ldc_w 352
    //   128: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: aload 4
    //   133: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: ldc_w 352
    //   139: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: aload 6
    //   144: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: ldc_w 352
    //   150: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: aload 7
    //   155: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: ldc_w 354
    //   161: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokespecial 355	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   170: athrow
    //   171: astore_2
    //   172: aload_1
    //   173: invokestatic 358	com/b/a/j:a	(Ljava/io/Closeable;)V
    //   176: aload_2
    //   177: athrow
    //   178: iconst_0
    //   179: istore 8
    //   181: aload_1
    //   182: invokevirtual 331	com/b/a/h:a	()Ljava/lang/String;
    //   185: astore 10
    //   187: aload 10
    //   189: bipush 32
    //   191: invokevirtual 362	java/lang/String:indexOf	(I)I
    //   194: istore 11
    //   196: iload 11
    //   198: iconst_m1
    //   199: if_icmpne +50 -> 249
    //   202: new 115	java/io/IOException
    //   205: dup
    //   206: new 168	java/lang/StringBuilder
    //   209: dup
    //   210: ldc_w 364
    //   213: invokespecial 171	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   216: aload 10
    //   218: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   224: invokespecial 355	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   227: athrow
    //   228: astore 9
    //   230: aload_0
    //   231: iload 8
    //   233: aload_0
    //   234: getfield 62	com/b/a/a:i	Ljava/util/LinkedHashMap;
    //   237: invokevirtual 367	java/util/LinkedHashMap:size	()I
    //   240: isub
    //   241: putfield 250	com/b/a/a:j	I
    //   244: aload_1
    //   245: invokestatic 358	com/b/a/j:a	(Ljava/io/Closeable;)V
    //   248: return
    //   249: iload 11
    //   251: iconst_1
    //   252: iadd
    //   253: istore 12
    //   255: aload 10
    //   257: bipush 32
    //   259: iload 12
    //   261: invokevirtual 370	java/lang/String:indexOf	(II)I
    //   264: istore 13
    //   266: iload 13
    //   268: iconst_m1
    //   269: if_icmpne +43 -> 312
    //   272: aload 10
    //   274: iload 12
    //   276: invokevirtual 373	java/lang/String:substring	(I)Ljava/lang/String;
    //   279: astore 14
    //   281: iload 11
    //   283: bipush 6
    //   285: if_icmpne +237 -> 522
    //   288: aload 10
    //   290: ldc_w 375
    //   293: invokevirtual 379	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   296: ifeq +226 -> 522
    //   299: aload_0
    //   300: getfield 62	com/b/a/a:i	Ljava/util/LinkedHashMap;
    //   303: aload 14
    //   305: invokevirtual 286	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   308: pop
    //   309: goto +220 -> 529
    //   312: aload 10
    //   314: iload 12
    //   316: iload 13
    //   318: invokevirtual 382	java/lang/String:substring	(II)Ljava/lang/String;
    //   321: astore 15
    //   323: aload_0
    //   324: getfield 62	com/b/a/a:i	Ljava/util/LinkedHashMap;
    //   327: aload 15
    //   329: invokevirtual 301	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   332: checkcast 213	com/b/a/f
    //   335: astore 16
    //   337: aload 16
    //   339: ifnonnull +28 -> 367
    //   342: new 213	com/b/a/f
    //   345: dup
    //   346: aload_0
    //   347: aload 15
    //   349: iconst_0
    //   350: invokespecial 309	com/b/a/f:<init>	(Lcom/b/a/a;Ljava/lang/String;B)V
    //   353: astore 16
    //   355: aload_0
    //   356: getfield 62	com/b/a/a:i	Ljava/util/LinkedHashMap;
    //   359: aload 15
    //   361: aload 16
    //   363: invokevirtual 313	java/util/LinkedHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   366: pop
    //   367: iload 13
    //   369: iconst_m1
    //   370: if_icmpeq +60 -> 430
    //   373: iload 11
    //   375: iconst_5
    //   376: if_icmpne +54 -> 430
    //   379: aload 10
    //   381: ldc_w 384
    //   384: invokevirtual 379	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   387: ifeq +43 -> 430
    //   390: aload 10
    //   392: iload 13
    //   394: iconst_1
    //   395: iadd
    //   396: invokevirtual 373	java/lang/String:substring	(I)Ljava/lang/String;
    //   399: ldc_w 386
    //   402: invokevirtual 390	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   405: astore 19
    //   407: aload 16
    //   409: invokestatic 255	com/b/a/f:a	(Lcom/b/a/f;)Z
    //   412: pop
    //   413: aload 16
    //   415: aconst_null
    //   416: invokestatic 253	com/b/a/f:a	(Lcom/b/a/f;Lcom/b/a/d;)Lcom/b/a/d;
    //   419: pop
    //   420: aload 16
    //   422: aload 19
    //   424: invokestatic 393	com/b/a/f:a	(Lcom/b/a/f;[Ljava/lang/String;)V
    //   427: goto +102 -> 529
    //   430: iload 13
    //   432: iconst_m1
    //   433: if_icmpne +40 -> 473
    //   436: iload 11
    //   438: iconst_5
    //   439: if_icmpne +34 -> 473
    //   442: aload 10
    //   444: ldc_w 395
    //   447: invokevirtual 379	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   450: ifeq +23 -> 473
    //   453: aload 16
    //   455: new 208	com/b/a/d
    //   458: dup
    //   459: aload_0
    //   460: aload 16
    //   462: iconst_0
    //   463: invokespecial 316	com/b/a/d:<init>	(Lcom/b/a/a;Lcom/b/a/f;B)V
    //   466: invokestatic 253	com/b/a/f:a	(Lcom/b/a/f;Lcom/b/a/d;)Lcom/b/a/d;
    //   469: pop
    //   470: goto +59 -> 529
    //   473: iload 13
    //   475: iconst_m1
    //   476: if_icmpne +20 -> 496
    //   479: iload 11
    //   481: iconst_4
    //   482: if_icmpne +14 -> 496
    //   485: aload 10
    //   487: ldc_w 397
    //   490: invokevirtual 379	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   493: ifne +36 -> 529
    //   496: new 115	java/io/IOException
    //   499: dup
    //   500: new 168	java/lang/StringBuilder
    //   503: dup
    //   504: ldc_w 364
    //   507: invokespecial 171	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   510: aload 10
    //   512: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   518: invokespecial 355	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   521: athrow
    //   522: aload 14
    //   524: astore 15
    //   526: goto -203 -> 323
    //   529: iinc 8 1
    //   532: goto -351 -> 181
    //
    // Exception table:
    //   from	to	target	type
    //   22	107	171	finally
    //   107	171	171	finally
    //   181	196	171	finally
    //   202	228	171	finally
    //   230	244	171	finally
    //   255	266	171	finally
    //   272	281	171	finally
    //   288	309	171	finally
    //   312	323	171	finally
    //   323	337	171	finally
    //   342	367	171	finally
    //   379	427	171	finally
    //   442	470	171	finally
    //   485	496	171	finally
    //   496	522	171	finally
    //   181	196	228	java/io/EOFException
    //   202	228	228	java/io/EOFException
    //   255	266	228	java/io/EOFException
    //   272	281	228	java/io/EOFException
    //   288	309	228	java/io/EOFException
    //   312	323	228	java/io/EOFException
    //   323	337	228	java/io/EOFException
    //   342	367	228	java/io/EOFException
    //   379	427	228	java/io/EOFException
    //   442	470	228	java/io/EOFException
    //   485	496	228	java/io/EOFException
    //   496	522	228	java/io/EOFException
  }

  private static void e(String paramString)
  {
    if (!a.matcher(paramString).matches())
      throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + paramString + "\"");
  }

  private void f()
  {
    b(this.d);
    Iterator localIterator = this.i.values().iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      if (f.b(localf) == null)
      {
        for (int i2 = 0; i2 <= 0; i2++)
          this.g += f.c(localf)[0];
        continue;
      }
      f.a(localf, null);
      for (int i1 = 0; i1 <= 0; i1++)
      {
        b(localf.a(0));
        b(localf.b(0));
      }
      localIterator.remove();
    }
  }

  private void g()
  {
    monitorenter;
    BufferedWriter localBufferedWriter;
    while (true)
    {
      f localf;
      try
      {
        if (this.h == null)
          continue;
        this.h.close();
        localBufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), j.a));
        try
        {
          localBufferedWriter.write("libcore.io.DiskLruCache");
          localBufferedWriter.write("\n");
          localBufferedWriter.write("1");
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(1));
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(1));
          localBufferedWriter.write("\n");
          localBufferedWriter.write("\n");
          Iterator localIterator = this.i.values().iterator();
          if (!localIterator.hasNext())
            break;
          localf = (f)localIterator.next();
          if (f.b(localf) != null)
          {
            localBufferedWriter.write("DIRTY " + f.d(localf) + '\n');
            continue;
          }
        }
        finally
        {
          localBufferedWriter.close();
        }
      }
      finally
      {
        monitorexit;
      }
      localBufferedWriter.write("CLEAN " + f.d(localf) + localf.a() + '\n');
    }
    localBufferedWriter.close();
    if (this.c.exists())
      a(this.c, this.e, true);
    a(this.d, this.c, false);
    this.e.delete();
    this.h = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), j.a));
    monitorexit;
  }

  private boolean h()
  {
    return (this.j >= 2000) && (this.j >= this.i.size());
  }

  private void i()
  {
    if (this.h == null)
      throw new IllegalStateException("cache is closed");
  }

  private void j()
  {
    while (this.g > this.f)
      c((String)((Map.Entry)this.i.entrySet().iterator().next()).getKey());
  }

  public final long a()
  {
    monitorenter;
    try
    {
      long l1 = this.g;
      monitorexit;
      return l1;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final g a(String paramString)
  {
    monitorenter;
    while (true)
    {
      try
      {
        i();
        e(paramString);
        f localf = (f)this.i.get(paramString);
        if (localf != null)
          continue;
        localg = null;
        return localg;
        if (f.e(localf))
          continue;
        localg = null;
        continue;
        InputStream[] arrayOfInputStream = new InputStream[1];
        int i1 = 0;
        if (i1 > 0)
          continue;
        int i2;
        try
        {
          arrayOfInputStream[0] = new FileInputStream(localf.a(0));
          i1++;
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          i2 = 0;
        }
        if ((i2 <= 0) && (arrayOfInputStream[0] != null))
        {
          j.a(arrayOfInputStream[0]);
          i2++;
          continue;
          this.j = (1 + this.j);
          this.h.append("READ " + paramString + '\n');
          if (!h())
            continue;
          this.l.submit(this.m);
          localg = new g(arrayOfInputStream, 0);
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      g localg = null;
    }
  }

  public final d b(String paramString)
  {
    return d(paramString);
  }

  public final void b()
  {
    close();
    j.a(this.b);
  }

  public final boolean c(String paramString)
  {
    monitorenter;
    while (true)
    {
      try
      {
        i();
        e(paramString);
        f localf = (f)this.i.get(paramString);
        if (localf == null)
          continue;
        d locald = f.b(localf);
        int i1 = 0;
        if (locald == null)
          continue;
        i2 = 0;
        return i2;
        this.g -= f.c(localf)[0];
        f.c(localf)[0] = 0L;
        i1++;
        if (i1 <= 0)
        {
          File localFile = localf.a(0);
          if ((!localFile.exists()) || (localFile.delete()))
            continue;
          throw new IOException("failed to delete " + localFile);
        }
      }
      finally
      {
        monitorexit;
      }
      this.j = (1 + this.j);
      this.h.append("REMOVE " + paramString + '\n');
      this.i.remove(paramString);
      if (h())
        this.l.submit(this.m);
      int i2 = 1;
    }
  }

  public final void close()
  {
    monitorenter;
    while (true)
    {
      try
      {
        Writer localWriter = this.h;
        if (localWriter == null)
          return;
        Iterator localIterator = new ArrayList(this.i.values()).iterator();
        if (localIterator.hasNext())
        {
          f localf = (f)localIterator.next();
          if (f.b(localf) == null)
            continue;
          f.b(localf).c();
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      j();
      this.h.close();
      this.h = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.b.a.a
 * JD-Core Version:    0.6.0
 */