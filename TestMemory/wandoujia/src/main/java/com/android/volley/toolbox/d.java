package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.n;
import com.wandoujia.log.toolkit.LaunchLogger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class d
  implements com.android.volley.a
{
  protected final Map<String, com.wandoujia.p4.app.c.a> a = new LinkedHashMap(16, 0.75F, true);
  protected final File b;
  private long c = 0L;
  private final int d;

  public d(File paramFile)
  {
    this(paramFile, 5242880);
  }

  public d(File paramFile, int paramInt)
  {
    this.b = paramFile;
    this.d = paramInt;
  }

  protected static byte[] a(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      if (j == -1)
        break;
      i += j;
    }
    if (i != paramInt)
      throw new IOException("Expected " + paramInt + " bytes, read " + i + " bytes");
    return arrayOfByte;
  }

  protected static String c(String paramString)
  {
    int i = paramString.length() / 2;
    String str = String.valueOf(paramString.substring(0, i).hashCode());
    return str + String.valueOf(paramString.substring(i).hashCode());
  }

  // ERROR //
  public LaunchLogger a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	com/android/volley/toolbox/d:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 100 2 0
    //   12: checkcast 102	com/wandoujia/p4/app/c/a
    //   15: astore_3
    //   16: aload_3
    //   17: ifnonnull +11 -> 28
    //   20: aconst_null
    //   21: astore 9
    //   23: aload_0
    //   24: monitorexit
    //   25: aload 9
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual 105	com/android/volley/toolbox/d:d	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 4
    //   35: new 107	com/android/volley/toolbox/e
    //   38: dup
    //   39: new 109	java/io/FileInputStream
    //   42: dup
    //   43: aload 4
    //   45: invokespecial 111	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   48: invokespecial 114	com/android/volley/toolbox/e:<init>	(Ljava/io/InputStream;)V
    //   51: astore 5
    //   53: aload 5
    //   55: invokestatic 117	com/wandoujia/p4/app/c/a:a	(Ljava/io/InputStream;)Lcom/wandoujia/p4/app/c/a;
    //   58: pop
    //   59: aload_3
    //   60: aload 5
    //   62: aload 4
    //   64: invokevirtual 122	java/io/File:length	()J
    //   67: aload 5
    //   69: getfield 124	com/android/volley/toolbox/e:a	I
    //   72: i2l
    //   73: lsub
    //   74: l2i
    //   75: invokestatic 126	com/android/volley/toolbox/d:a	(Ljava/io/InputStream;I)[B
    //   78: invokevirtual 129	com/wandoujia/p4/app/c/a:a	([B)Lcom/wandoujia/log/toolkit/LaunchLogger;
    //   81: astore 16
    //   83: aload 16
    //   85: astore 9
    //   87: aload 5
    //   89: invokevirtual 132	com/android/volley/toolbox/e:close	()V
    //   92: goto -69 -> 23
    //   95: astore 17
    //   97: aconst_null
    //   98: astore 9
    //   100: goto -77 -> 23
    //   103: astore 6
    //   105: aconst_null
    //   106: astore 5
    //   108: iconst_2
    //   109: anewarray 4	java/lang/Object
    //   112: astore 10
    //   114: aload 10
    //   116: iconst_0
    //   117: aload 4
    //   119: invokevirtual 135	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   122: aastore
    //   123: aload 10
    //   125: iconst_1
    //   126: aload 6
    //   128: invokevirtual 136	java/io/IOException:toString	()Ljava/lang/String;
    //   131: aastore
    //   132: ldc 138
    //   134: aload 10
    //   136: invokestatic 143	com/android/volley/n:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: aload_0
    //   140: aload_1
    //   141: invokevirtual 145	com/android/volley/toolbox/d:b	(Ljava/lang/String;)V
    //   144: aload 5
    //   146: ifnull +8 -> 154
    //   149: aload 5
    //   151: invokevirtual 132	com/android/volley/toolbox/e:close	()V
    //   154: aconst_null
    //   155: astore 9
    //   157: goto -134 -> 23
    //   160: astore 11
    //   162: aconst_null
    //   163: astore 9
    //   165: goto -142 -> 23
    //   168: astore 12
    //   170: aconst_null
    //   171: astore 5
    //   173: iconst_2
    //   174: anewarray 4	java/lang/Object
    //   177: astore 13
    //   179: aload 13
    //   181: iconst_0
    //   182: aload 4
    //   184: invokevirtual 135	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   187: aastore
    //   188: aload 13
    //   190: iconst_1
    //   191: aload 12
    //   193: invokevirtual 146	java/lang/OutOfMemoryError:toString	()Ljava/lang/String;
    //   196: aastore
    //   197: ldc 138
    //   199: aload 13
    //   201: invokestatic 143	com/android/volley/n:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   204: aload_0
    //   205: aload_1
    //   206: invokevirtual 145	com/android/volley/toolbox/d:b	(Ljava/lang/String;)V
    //   209: aload 5
    //   211: ifnull +8 -> 219
    //   214: aload 5
    //   216: invokevirtual 132	com/android/volley/toolbox/e:close	()V
    //   219: aconst_null
    //   220: astore 9
    //   222: goto -199 -> 23
    //   225: astore 14
    //   227: aconst_null
    //   228: astore 9
    //   230: goto -207 -> 23
    //   233: astore 7
    //   235: aconst_null
    //   236: astore 5
    //   238: aload 5
    //   240: ifnull +8 -> 248
    //   243: aload 5
    //   245: invokevirtual 132	com/android/volley/toolbox/e:close	()V
    //   248: aload 7
    //   250: athrow
    //   251: astore_2
    //   252: aload_0
    //   253: monitorexit
    //   254: aload_2
    //   255: athrow
    //   256: astore 8
    //   258: aconst_null
    //   259: astore 9
    //   261: goto -238 -> 23
    //   264: astore 7
    //   266: goto -28 -> 238
    //   269: astore 12
    //   271: goto -98 -> 173
    //   274: astore 6
    //   276: goto -168 -> 108
    //
    // Exception table:
    //   from	to	target	type
    //   87	92	95	java/io/IOException
    //   35	53	103	java/io/IOException
    //   149	154	160	java/io/IOException
    //   35	53	168	java/lang/OutOfMemoryError
    //   214	219	225	java/io/IOException
    //   35	53	233	finally
    //   2	16	251	finally
    //   28	35	251	finally
    //   87	92	251	finally
    //   149	154	251	finally
    //   214	219	251	finally
    //   243	248	251	finally
    //   248	251	251	finally
    //   243	248	256	java/io/IOException
    //   53	83	264	finally
    //   108	144	264	finally
    //   173	209	264	finally
    //   53	83	269	java/lang/OutOfMemoryError
    //   53	83	274	java/io/IOException
  }

  // ERROR //
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	com/android/volley/toolbox/d:b	Ljava/io/File;
    //   6: invokevirtual 150	java/io/File:exists	()Z
    //   9: ifne +40 -> 49
    //   12: aload_0
    //   13: getfield 36	com/android/volley/toolbox/d:b	Ljava/io/File;
    //   16: invokevirtual 153	java/io/File:mkdirs	()Z
    //   19: ifne +27 -> 46
    //   22: iconst_1
    //   23: anewarray 4	java/lang/Object
    //   26: astore 17
    //   28: aload 17
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield 36	com/android/volley/toolbox/d:b	Ljava/io/File;
    //   35: invokevirtual 135	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: aastore
    //   39: ldc 155
    //   41: aload 17
    //   43: invokestatic 157	com/android/volley/n:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: aload_0
    //   50: getfield 36	com/android/volley/toolbox/d:b	Ljava/io/File;
    //   53: invokevirtual 161	java/io/File:listFiles	()[Ljava/io/File;
    //   56: astore_2
    //   57: aload_2
    //   58: ifnull -12 -> 46
    //   61: aload_2
    //   62: arraylength
    //   63: istore_3
    //   64: iconst_0
    //   65: istore 4
    //   67: iload 4
    //   69: iload_3
    //   70: if_icmpge -24 -> 46
    //   73: aload_2
    //   74: iload 4
    //   76: aaload
    //   77: astore 5
    //   79: aconst_null
    //   80: astore 6
    //   82: new 109	java/io/FileInputStream
    //   85: dup
    //   86: aload 5
    //   88: invokespecial 111	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   91: astore 7
    //   93: aload 7
    //   95: invokestatic 117	com/wandoujia/p4/app/c/a:a	(Ljava/io/InputStream;)Lcom/wandoujia/p4/app/c/a;
    //   98: astore 14
    //   100: aload 14
    //   102: aload 5
    //   104: invokevirtual 122	java/io/File:length	()J
    //   107: putfield 163	com/wandoujia/p4/app/c/a:a	J
    //   110: aload_0
    //   111: aload 14
    //   113: getfield 166	com/wandoujia/p4/app/c/a:b	Ljava/lang/String;
    //   116: aload 14
    //   118: invokevirtual 169	com/android/volley/toolbox/d:a	(Ljava/lang/String;Lcom/wandoujia/p4/app/c/a;)V
    //   121: aload 7
    //   123: invokevirtual 170	java/io/FileInputStream:close	()V
    //   126: iinc 4 1
    //   129: goto -62 -> 67
    //   132: astore 16
    //   134: aconst_null
    //   135: astore 7
    //   137: aload 5
    //   139: ifnull +9 -> 148
    //   142: aload 5
    //   144: invokevirtual 173	java/io/File:delete	()Z
    //   147: pop
    //   148: aload 7
    //   150: ifnull -24 -> 126
    //   153: aload 7
    //   155: invokevirtual 170	java/io/FileInputStream:close	()V
    //   158: goto -32 -> 126
    //   161: astore 9
    //   163: goto -37 -> 126
    //   166: astore 11
    //   168: aload 6
    //   170: ifnull +8 -> 178
    //   173: aload 6
    //   175: invokevirtual 170	java/io/FileInputStream:close	()V
    //   178: aload 11
    //   180: athrow
    //   181: astore_1
    //   182: aload_0
    //   183: monitorexit
    //   184: aload_1
    //   185: athrow
    //   186: astore 15
    //   188: goto -62 -> 126
    //   191: astore 12
    //   193: goto -15 -> 178
    //   196: astore 10
    //   198: aload 7
    //   200: astore 6
    //   202: aload 10
    //   204: astore 11
    //   206: goto -38 -> 168
    //   209: astore 8
    //   211: goto -74 -> 137
    //
    // Exception table:
    //   from	to	target	type
    //   82	93	132	java/io/IOException
    //   153	158	161	java/io/IOException
    //   82	93	166	finally
    //   2	46	181	finally
    //   49	57	181	finally
    //   61	64	181	finally
    //   73	79	181	finally
    //   121	126	181	finally
    //   153	158	181	finally
    //   173	178	181	finally
    //   178	181	181	finally
    //   121	126	186	java/io/IOException
    //   173	178	191	java/io/IOException
    //   93	121	196	finally
    //   142	148	196	finally
    //   93	121	209	java/io/IOException
  }

  protected final void a(int paramInt)
  {
    if (this.c + paramInt < this.d);
    label257: 
    while (true)
    {
      return;
      if (n.a)
        n.a("Pruning old cache entries.", new Object[0]);
      long l1 = this.c;
      long l2 = SystemClock.elapsedRealtime();
      Iterator localIterator = this.a.entrySet().iterator();
      int i = 0;
      com.wandoujia.p4.app.c.a locala;
      label120: int j;
      if (localIterator.hasNext())
      {
        locala = (com.wandoujia.p4.app.c.a)((Map.Entry)localIterator.next()).getValue();
        if (d(locala.b).delete())
        {
          this.c -= locala.a;
          localIterator.remove();
          j = i + 1;
          if ((float)(this.c + paramInt) >= 0.9F * this.d)
            break label245;
        }
      }
      while (true)
      {
        if (!n.a)
          break label257;
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = Integer.valueOf(j);
        arrayOfObject1[1] = Long.valueOf(this.c - l1);
        arrayOfObject1[2] = Long.valueOf(SystemClock.elapsedRealtime() - l2);
        n.a("pruned %d files, %d bytes, %d ms", arrayOfObject1);
        return;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = locala.b;
        arrayOfObject2[1] = c(locala.b);
        n.b("Could not delete cache entry for key=%s, filename=%s", arrayOfObject2);
        break label120;
        label245: i = j;
        break;
        j = i;
      }
    }
  }

  public void a(String paramString, LaunchLogger paramLaunchLogger)
  {
    monitorenter;
    try
    {
      a(paramLaunchLogger.a.length);
      File localFile = d(paramString);
      try
      {
        FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
        com.wandoujia.p4.app.c.a locala = new com.wandoujia.p4.app.c.a(paramString, paramLaunchLogger);
        locala.a(localFileOutputStream);
        localFileOutputStream.write(paramLaunchLogger.a);
        localFileOutputStream.close();
        a(paramString, locala);
        monitorexit;
        return;
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          if (localFile.delete())
            continue;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = localFile.getAbsolutePath();
          n.b("Could not clean up file %s", arrayOfObject);
        }
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  protected final void a(String paramString, com.wandoujia.p4.app.c.a parama)
  {
    if (!this.a.containsKey(paramString))
      this.c += parama.a;
    while (true)
    {
      this.a.put(paramString, parama);
      return;
      com.wandoujia.p4.app.c.a locala = (com.wandoujia.p4.app.c.a)this.a.get(paramString);
      this.c += parama.a - locala.a;
    }
  }

  public void b(String paramString)
  {
    monitorenter;
    try
    {
      boolean bool = d(paramString).delete();
      com.wandoujia.p4.app.c.a locala = (com.wandoujia.p4.app.c.a)this.a.get(paramString);
      if (locala != null)
      {
        this.c -= locala.a;
        this.a.remove(paramString);
      }
      if (!bool)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString;
        arrayOfObject[1] = c(paramString);
        n.b("Could not delete cache entry for key=%s, filename=%s", arrayOfObject);
      }
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final File d(String paramString)
  {
    return new File(this.b, c(paramString));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.d
 * JD-Core Version:    0.6.0
 */