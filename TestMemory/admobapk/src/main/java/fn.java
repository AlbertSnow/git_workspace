import android.os.SystemClock;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class fn
  implements ei
{
  private final Map a = new LinkedHashMap(16, 0.75F, true);
  private long b = 0L;
  private final File c;
  private final int d;

  public fn(File paramFile)
  {
    this(paramFile, 5242880);
  }

  private fn(File paramFile, int paramInt)
  {
    this.c = paramFile;
    this.d = 5242880;
  }

  static int a(InputStream paramInputStream)
  {
    return 0x0 | e(paramInputStream) | e(paramInputStream) << 8 | e(paramInputStream) << 16 | e(paramInputStream) << 24;
  }

  static void a(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt & 0xFF);
    paramOutputStream.write(0xFF & paramInt >> 8);
    paramOutputStream.write(0xFF & paramInt >> 16);
    paramOutputStream.write(paramInt >>> 24);
  }

  static void a(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((byte)(int)paramLong);
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }

  static void a(OutputStream paramOutputStream, String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    a(paramOutputStream, arrayOfByte.length);
    paramOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
  }

  private final void a(String paramString, fo paramfo)
  {
    if (!this.a.containsKey(paramString))
      this.b += paramfo.a;
    while (true)
    {
      this.a.put(paramString, paramfo);
      return;
      fo localfo = (fo)this.a.get(paramString);
      this.b += paramfo.a - localfo.a;
    }
  }

  private static byte[] a(InputStream paramInputStream, int paramInt)
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
      throw new IOException(50 + "Expected " + paramInt + " bytes, read " + i + " bytes");
    return arrayOfByte;
  }

  static long b(InputStream paramInputStream)
  {
    return 0L | 0xFF & e(paramInputStream) | (0xFF & e(paramInputStream)) << 8 | (0xFF & e(paramInputStream)) << 16 | (0xFF & e(paramInputStream)) << 24 | (0xFF & e(paramInputStream)) << 32 | (0xFF & e(paramInputStream)) << 40 | (0xFF & e(paramInputStream)) << 48 | (0xFF & e(paramInputStream)) << 56;
  }

  private void b(String paramString)
  {
    monitorenter;
    try
    {
      boolean bool = d(paramString).delete();
      fo localfo = (fo)this.a.get(paramString);
      if (localfo != null)
      {
        this.b -= localfo.a;
        this.a.remove(paramString);
      }
      if (!bool)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString;
        arrayOfObject[1] = c(paramString);
        fh.b("Could not delete cache entry for key=%s, filename=%s", arrayOfObject);
      }
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  static String c(InputStream paramInputStream)
  {
    return new String(a(paramInputStream, (int)b(paramInputStream)), "UTF-8");
  }

  private static String c(String paramString)
  {
    int i = paramString.length() / 2;
    String str1 = String.valueOf(String.valueOf(paramString.substring(0, i).hashCode()));
    String str2 = String.valueOf(String.valueOf(paramString.substring(i).hashCode()));
    if (str2.length() != 0)
      return str1.concat(str2);
    return new String(str1);
  }

  private File d(String paramString)
  {
    return new File(this.c, c(paramString));
  }

  static Map d(InputStream paramInputStream)
  {
    int i = a(paramInputStream);
    if (i == 0);
    for (Object localObject = Collections.emptyMap(); ; localObject = new HashMap(i))
      for (int j = 0; j < i; j++)
        ((Map)localObject).put(c(paramInputStream).intern(), c(paramInputStream).intern());
    return (Map)localObject;
  }

  private static int e(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    if (i == -1)
      throw new EOFException();
    return i;
  }

  // ERROR //
  public final ej a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 31	fn:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 82 2 0
    //   12: checkcast 72	fo
    //   15: astore_3
    //   16: aload_3
    //   17: ifnonnull +11 -> 28
    //   20: aconst_null
    //   21: astore 10
    //   23: aload_0
    //   24: monitorexit
    //   25: aload 10
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 121	fn:d	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 4
    //   35: new 200	fp
    //   38: dup
    //   39: new 202	java/io/FileInputStream
    //   42: dup
    //   43: aload 4
    //   45: invokespecial 204	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   48: invokespecial 207	fp:<init>	(Ljava/io/InputStream;)V
    //   51: astore 5
    //   53: aload 5
    //   55: invokestatic 210	fo:a	(Ljava/io/InputStream;)Lfo;
    //   58: pop
    //   59: aload 5
    //   61: aload 4
    //   63: invokevirtual 213	java/io/File:length	()J
    //   66: aload 5
    //   68: getfield 215	fp:a	I
    //   71: i2l
    //   72: lsub
    //   73: l2i
    //   74: invokestatic 145	fn:a	(Ljava/io/InputStream;I)[B
    //   77: astore 14
    //   79: new 217	ej
    //   82: dup
    //   83: invokespecial 218	ej:<init>	()V
    //   86: astore 15
    //   88: aload 15
    //   90: aload 14
    //   92: putfield 221	ej:a	[B
    //   95: aload 15
    //   97: aload_3
    //   98: getfield 224	fo:c	Ljava/lang/String;
    //   101: putfield 226	ej:b	Ljava/lang/String;
    //   104: aload 15
    //   106: aload_3
    //   107: getfield 228	fo:d	J
    //   110: putfield 230	ej:c	J
    //   113: aload 15
    //   115: aload_3
    //   116: getfield 232	fo:e	J
    //   119: putfield 233	ej:d	J
    //   122: aload 15
    //   124: aload_3
    //   125: getfield 236	fo:f	J
    //   128: putfield 237	ej:e	J
    //   131: aload 15
    //   133: aload_3
    //   134: getfield 240	fo:g	J
    //   137: putfield 241	ej:f	J
    //   140: aload 15
    //   142: aload_3
    //   143: getfield 244	fo:h	Ljava/util/Map;
    //   146: putfield 246	ej:g	Ljava/util/Map;
    //   149: aload 5
    //   151: invokevirtual 249	fp:close	()V
    //   154: aload 15
    //   156: astore 10
    //   158: goto -135 -> 23
    //   161: astore 16
    //   163: aconst_null
    //   164: astore 10
    //   166: goto -143 -> 23
    //   169: astore 6
    //   171: aconst_null
    //   172: astore 7
    //   174: iconst_2
    //   175: anewarray 4	java/lang/Object
    //   178: astore 11
    //   180: aload 11
    //   182: iconst_0
    //   183: aload 4
    //   185: invokevirtual 252	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   188: aastore
    //   189: aload 11
    //   191: iconst_1
    //   192: aload 6
    //   194: invokevirtual 253	java/io/IOException:toString	()Ljava/lang/String;
    //   197: aastore
    //   198: ldc 255
    //   200: aload 11
    //   202: invokestatic 140	fh:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: aload_0
    //   206: aload_1
    //   207: invokespecial 257	fn:b	(Ljava/lang/String;)V
    //   210: aload 7
    //   212: ifnull +8 -> 220
    //   215: aload 7
    //   217: invokevirtual 249	fp:close	()V
    //   220: aconst_null
    //   221: astore 10
    //   223: goto -200 -> 23
    //   226: astore 12
    //   228: aconst_null
    //   229: astore 10
    //   231: goto -208 -> 23
    //   234: astore 8
    //   236: aconst_null
    //   237: astore 5
    //   239: aload 5
    //   241: ifnull +8 -> 249
    //   244: aload 5
    //   246: invokevirtual 249	fp:close	()V
    //   249: aload 8
    //   251: athrow
    //   252: astore_2
    //   253: aload_0
    //   254: monitorexit
    //   255: aload_2
    //   256: athrow
    //   257: astore 9
    //   259: aconst_null
    //   260: astore 10
    //   262: goto -239 -> 23
    //   265: astore 8
    //   267: goto -28 -> 239
    //   270: astore 8
    //   272: aload 7
    //   274: astore 5
    //   276: goto -37 -> 239
    //   279: astore 6
    //   281: aload 5
    //   283: astore 7
    //   285: goto -111 -> 174
    //
    // Exception table:
    //   from	to	target	type
    //   149	154	161	java/io/IOException
    //   35	53	169	java/io/IOException
    //   215	220	226	java/io/IOException
    //   35	53	234	finally
    //   2	16	252	finally
    //   28	35	252	finally
    //   149	154	252	finally
    //   215	220	252	finally
    //   244	249	252	finally
    //   249	252	252	finally
    //   244	249	257	java/io/IOException
    //   53	149	265	finally
    //   174	210	270	finally
    //   53	149	279	java/io/IOException
  }

  // ERROR //
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 35	fn:c	Ljava/io/File;
    //   6: invokevirtual 260	java/io/File:exists	()Z
    //   9: ifne +41 -> 50
    //   12: aload_0
    //   13: getfield 35	fn:c	Ljava/io/File;
    //   16: invokevirtual 263	java/io/File:mkdirs	()Z
    //   19: ifne +28 -> 47
    //   22: iconst_1
    //   23: anewarray 4	java/lang/Object
    //   26: astore 17
    //   28: aload 17
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield 35	fn:c	Ljava/io/File;
    //   35: invokevirtual 252	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: aastore
    //   39: ldc_w 265
    //   42: aload 17
    //   44: invokestatic 267	fh:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: aload_0
    //   48: monitorexit
    //   49: return
    //   50: aload_0
    //   51: getfield 35	fn:c	Ljava/io/File;
    //   54: invokevirtual 271	java/io/File:listFiles	()[Ljava/io/File;
    //   57: astore_2
    //   58: aload_2
    //   59: ifnull -12 -> 47
    //   62: aload_2
    //   63: arraylength
    //   64: istore_3
    //   65: iconst_0
    //   66: istore 4
    //   68: iload 4
    //   70: iload_3
    //   71: if_icmpge -24 -> 47
    //   74: aload_2
    //   75: iload 4
    //   77: aaload
    //   78: astore 5
    //   80: aconst_null
    //   81: astore 6
    //   83: new 273	java/io/BufferedInputStream
    //   86: dup
    //   87: new 202	java/io/FileInputStream
    //   90: dup
    //   91: aload 5
    //   93: invokespecial 204	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   96: invokespecial 274	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   99: astore 7
    //   101: aload 7
    //   103: invokestatic 210	fo:a	(Ljava/io/InputStream;)Lfo;
    //   106: astore 14
    //   108: aload 14
    //   110: aload 5
    //   112: invokevirtual 213	java/io/File:length	()J
    //   115: putfield 74	fo:a	J
    //   118: aload_0
    //   119: aload 14
    //   121: getfield 275	fo:b	Ljava/lang/String;
    //   124: aload 14
    //   126: invokespecial 277	fn:a	(Ljava/lang/String;Lfo;)V
    //   129: aload 7
    //   131: invokevirtual 278	java/io/BufferedInputStream:close	()V
    //   134: iinc 4 1
    //   137: goto -69 -> 68
    //   140: astore 16
    //   142: aconst_null
    //   143: astore 7
    //   145: aload 5
    //   147: ifnull +9 -> 156
    //   150: aload 5
    //   152: invokevirtual 127	java/io/File:delete	()Z
    //   155: pop
    //   156: aload 7
    //   158: ifnull -24 -> 134
    //   161: aload 7
    //   163: invokevirtual 278	java/io/BufferedInputStream:close	()V
    //   166: goto -32 -> 134
    //   169: astore 9
    //   171: goto -37 -> 134
    //   174: astore 11
    //   176: aload 6
    //   178: ifnull +8 -> 186
    //   181: aload 6
    //   183: invokevirtual 278	java/io/BufferedInputStream:close	()V
    //   186: aload 11
    //   188: athrow
    //   189: astore_1
    //   190: aload_0
    //   191: monitorexit
    //   192: aload_1
    //   193: athrow
    //   194: astore 15
    //   196: goto -62 -> 134
    //   199: astore 12
    //   201: goto -15 -> 186
    //   204: astore 10
    //   206: aload 7
    //   208: astore 6
    //   210: aload 10
    //   212: astore 11
    //   214: goto -38 -> 176
    //   217: astore 8
    //   219: goto -74 -> 145
    //
    // Exception table:
    //   from	to	target	type
    //   83	101	140	java/io/IOException
    //   161	166	169	java/io/IOException
    //   83	101	174	finally
    //   2	47	189	finally
    //   50	58	189	finally
    //   62	65	189	finally
    //   74	80	189	finally
    //   129	134	189	finally
    //   161	166	189	finally
    //   181	186	189	finally
    //   186	189	189	finally
    //   129	134	194	java/io/IOException
    //   181	186	199	java/io/IOException
    //   101	129	204	finally
    //   150	156	204	finally
    //   101	129	217	java/io/IOException
  }

  public final void a(String paramString, ej paramej)
  {
    int i = 0;
    monitorenter;
    long l1;
    long l2;
    try
    {
      int j = paramej.a.length;
      if (this.b + j < this.d)
        break label273;
      if (fh.b)
        fh.a("Pruning old cache entries.", new Object[0]);
      l1 = this.b;
      l2 = SystemClock.elapsedRealtime();
      Iterator localIterator = this.a.entrySet().iterator();
      if (localIterator.hasNext())
      {
        fo localfo2 = (fo)((Map.Entry)localIterator.next()).getValue();
        if (d(localfo2.b).delete())
          this.b -= localfo2.a;
        while (true)
        {
          localIterator.remove();
          k = i + 1;
          if ((float)(this.b + j) < 0.9F * this.d)
            break label217;
          i = k;
          break;
          Object[] arrayOfObject4 = new Object[2];
          arrayOfObject4[0] = localfo2.b;
          arrayOfObject4[1] = c(localfo2.b);
          fh.b("Could not delete cache entry for key=%s, filename=%s", arrayOfObject4);
        }
      }
    }
    finally
    {
      monitorexit;
    }
    int k = i;
    label217: if (fh.b)
    {
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = Integer.valueOf(k);
      arrayOfObject3[1] = Long.valueOf(this.b - l1);
      arrayOfObject3[2] = Long.valueOf(SystemClock.elapsedRealtime() - l2);
      fh.a("pruned %d files, %d bytes, %d ms", arrayOfObject3);
    }
    label273: File localFile = d(paramString);
    FileOutputStream localFileOutputStream;
    fo localfo1;
    try
    {
      localFileOutputStream = new FileOutputStream(localFile);
      localfo1 = new fo(paramString, paramej);
      if (!localfo1.a(localFileOutputStream))
      {
        localFileOutputStream.close();
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localFile.getAbsolutePath();
        fh.b("Failed to write header for %s", arrayOfObject2);
        throw new IOException();
      }
    }
    catch (IOException localIOException)
    {
      if (!localFile.delete())
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localFile.getAbsolutePath();
        fh.b("Could not clean up file %s", arrayOfObject1);
      }
    }
    while (true)
    {
      monitorexit;
      return;
      localFileOutputStream.write(paramej.a);
      localFileOutputStream.close();
      a(paramString, localfo1);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fn
 * JD-Core Version:    0.6.0
 */