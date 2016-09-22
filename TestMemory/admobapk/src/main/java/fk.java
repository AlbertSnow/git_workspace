import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public final class fk
  implements eq
{
  private static boolean a = fh.b;
  private static int b = 3000;
  private static int c = 4096;
  private ft d;
  private fl e;

  public fk(ft paramft)
  {
    this(paramft, new fl(c));
  }

  private fk(ft paramft, fl paramfl)
  {
    this.d = paramft;
    this.e = paramfl;
  }

  private static Map a(Header[] paramArrayOfHeader)
  {
    TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    for (int i = 0; i < paramArrayOfHeader.length; i++)
      localTreeMap.put(paramArrayOfHeader[i].getName(), paramArrayOfHeader[i].getValue());
    return localTreeMap;
  }

  private static void a(String paramString, ev paramev, fg paramfg)
  {
    fd localfd = paramev.j;
    int i = paramev.e();
    try
    {
      localfd.a(paramfg);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = paramString;
      arrayOfObject2[1] = Integer.valueOf(i);
      paramev.a(String.format("%s-retry [timeout=%s]", arrayOfObject2));
      return;
    }
    catch (fg localfg)
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = paramString;
      arrayOfObject1[1] = Integer.valueOf(i);
      paramev.a(String.format("%s-timeout-giveup [timeout=%s]", arrayOfObject1));
    }
    throw localfg;
  }

  private final byte[] a(HttpEntity paramHttpEntity)
  {
    fw localfw = new fw(this.e, (int)paramHttpEntity.getContentLength());
    byte[] arrayOfByte1 = null;
    InputStream localInputStream;
    try
    {
      localInputStream = paramHttpEntity.getContent();
      arrayOfByte1 = null;
      if (localInputStream == null)
        throw new fe();
    }
    finally
    {
    }
    try
    {
      paramHttpEntity.consumeContent();
      this.e.a(arrayOfByte1);
      localfw.close();
      throw localObject;
      arrayOfByte1 = this.e.a(1024);
      while (true)
      {
        int i = localInputStream.read(arrayOfByte1);
        if (i == -1)
          break;
        localfw.write(arrayOfByte1, 0, i);
      }
      byte[] arrayOfByte2 = localfw.toByteArray();
      try
      {
        paramHttpEntity.consumeContent();
        this.e.a(arrayOfByte1);
        localfw.close();
        return arrayOfByte2;
      }
      catch (IOException localIOException2)
      {
        while (true)
          fh.a("Error occured when calling consumingContent", new Object[0]);
      }
    }
    catch (IOException localIOException1)
    {
      while (true)
        fh.a("Error occured when calling consumingContent", new Object[0]);
    }
  }

  // ERROR //
  public final et a(ev paramev)
  {
    // Byte code:
    //   0: invokestatic 168	android/os/SystemClock:elapsedRealtime	()J
    //   3: lstore_2
    //   4: aconst_null
    //   5: astore 4
    //   7: invokestatic 174	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   10: astore 5
    //   12: new 176	java/util/HashMap
    //   15: dup
    //   16: invokespecial 177	java/util/HashMap:<init>	()V
    //   19: astore 6
    //   21: aload_1
    //   22: getfield 181	ev:k	Lej;
    //   25: astore 17
    //   27: aload 17
    //   29: ifnull +61 -> 90
    //   32: aload 17
    //   34: getfield 186	ej:b	Ljava/lang/String;
    //   37: ifnull +18 -> 55
    //   40: aload 6
    //   42: ldc 188
    //   44: aload 17
    //   46: getfield 186	ej:b	Ljava/lang/String;
    //   49: invokeinterface 70 3 0
    //   54: pop
    //   55: aload 17
    //   57: getfield 191	ej:d	J
    //   60: lconst_0
    //   61: lcmp
    //   62: ifle +28 -> 90
    //   65: aload 6
    //   67: ldc 193
    //   69: new 195	java/util/Date
    //   72: dup
    //   73: aload 17
    //   75: getfield 191	ej:d	J
    //   78: invokespecial 198	java/util/Date:<init>	(J)V
    //   81: invokestatic 204	org/apache/http/impl/cookie/DateUtils:formatDate	(Ljava/util/Date;)Ljava/lang/String;
    //   84: invokeinterface 70 3 0
    //   89: pop
    //   90: aload_0
    //   91: getfield 41	fk:d	Lft;
    //   94: aload_1
    //   95: aload 6
    //   97: invokeinterface 209 3 0
    //   102: astore 18
    //   104: aload 18
    //   106: invokeinterface 215 1 0
    //   111: astore 19
    //   113: aload 19
    //   115: invokeinterface 220 1 0
    //   120: istore 20
    //   122: aload 18
    //   124: invokeinterface 224 1 0
    //   129: invokestatic 226	fk:a	([Lorg/apache/http/Header;)Ljava/util/Map;
    //   132: astore 5
    //   134: iload 20
    //   136: sipush 304
    //   139: if_icmpne +73 -> 212
    //   142: aload_1
    //   143: getfield 181	ev:k	Lej;
    //   146: astore 21
    //   148: aload 21
    //   150: ifnonnull +23 -> 173
    //   153: new 228	et
    //   156: dup
    //   157: sipush 304
    //   160: aconst_null
    //   161: aload 5
    //   163: iconst_1
    //   164: invokestatic 168	android/os/SystemClock:elapsedRealtime	()J
    //   167: lload_2
    //   168: lsub
    //   169: invokespecial 231	et:<init>	(I[BLjava/util/Map;ZJ)V
    //   172: areturn
    //   173: aload 21
    //   175: getfield 235	ej:g	Ljava/util/Map;
    //   178: aload 5
    //   180: invokeinterface 239 2 0
    //   185: new 228	et
    //   188: dup
    //   189: sipush 304
    //   192: aload 21
    //   194: getfield 242	ej:a	[B
    //   197: aload 21
    //   199: getfield 235	ej:g	Ljava/util/Map;
    //   202: iconst_1
    //   203: invokestatic 168	android/os/SystemClock:elapsedRealtime	()J
    //   206: lload_2
    //   207: lsub
    //   208: invokespecial 231	et:<init>	(I[BLjava/util/Map;ZJ)V
    //   211: areturn
    //   212: aload 18
    //   214: invokeinterface 246 1 0
    //   219: ifnull +150 -> 369
    //   222: aload_0
    //   223: aload 18
    //   225: invokeinterface 246 1 0
    //   230: invokespecial 248	fk:a	(Lorg/apache/http/HttpEntity;)[B
    //   233: astore 27
    //   235: aload 27
    //   237: astore 8
    //   239: invokestatic 168	android/os/SystemClock:elapsedRealtime	()J
    //   242: lload_2
    //   243: lsub
    //   244: lstore 22
    //   246: getstatic 23	fk:a	Z
    //   249: ifne +13 -> 262
    //   252: lload 22
    //   254: getstatic 25	fk:b	I
    //   257: i2l
    //   258: lcmp
    //   259: ifle +391 -> 650
    //   262: iconst_5
    //   263: anewarray 4	java/lang/Object
    //   266: astore 24
    //   268: aload 24
    //   270: iconst_0
    //   271: aload_1
    //   272: aastore
    //   273: aload 24
    //   275: iconst_1
    //   276: lload 22
    //   278: invokestatic 253	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   281: aastore
    //   282: aload 8
    //   284: ifnull +93 -> 377
    //   287: aload 8
    //   289: arraylength
    //   290: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   293: astore 25
    //   295: aload 24
    //   297: iconst_2
    //   298: aload 25
    //   300: aastore
    //   301: aload 24
    //   303: iconst_3
    //   304: aload 19
    //   306: invokeinterface 220 1 0
    //   311: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   314: aastore
    //   315: aload 24
    //   317: iconst_4
    //   318: aload_1
    //   319: getfield 79	ev:j	Lfd;
    //   322: invokeinterface 255 1 0
    //   327: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   330: aastore
    //   331: ldc_w 257
    //   334: aload 24
    //   336: invokestatic 259	fh:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   339: goto +311 -> 650
    //   342: new 107	java/io/IOException
    //   345: dup
    //   346: invokespecial 260	java/io/IOException:<init>	()V
    //   349: athrow
    //   350: astore 16
    //   352: ldc_w 262
    //   355: aload_1
    //   356: new 264	ff
    //   359: dup
    //   360: invokespecial 265	ff:<init>	()V
    //   363: invokestatic 267	fk:a	(Ljava/lang/String;Lev;Lfg;)V
    //   366: goto -362 -> 4
    //   369: iconst_0
    //   370: newarray byte
    //   372: astore 8
    //   374: goto -135 -> 239
    //   377: ldc_w 269
    //   380: astore 25
    //   382: goto -87 -> 295
    //   385: new 228	et
    //   388: dup
    //   389: iload 20
    //   391: aload 8
    //   393: aload 5
    //   395: iconst_0
    //   396: invokestatic 168	android/os/SystemClock:elapsedRealtime	()J
    //   399: lload_2
    //   400: lsub
    //   401: invokespecial 231	et:<init>	(I[BLjava/util/Map;ZJ)V
    //   404: astore 26
    //   406: aload 26
    //   408: areturn
    //   409: astore 15
    //   411: ldc_w 271
    //   414: aload_1
    //   415: new 264	ff
    //   418: dup
    //   419: invokespecial 265	ff:<init>	()V
    //   422: invokestatic 267	fk:a	(Ljava/lang/String;Lev;Lfg;)V
    //   425: goto -421 -> 4
    //   428: astore 12
    //   430: aload_1
    //   431: getfield 273	ev:c	Ljava/lang/String;
    //   434: invokestatic 276	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   437: astore 13
    //   439: aload 13
    //   441: invokevirtual 279	java/lang/String:length	()I
    //   444: ifeq +25 -> 469
    //   447: ldc_w 281
    //   450: aload 13
    //   452: invokevirtual 285	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   455: astore 14
    //   457: new 287	java/lang/RuntimeException
    //   460: dup
    //   461: aload 14
    //   463: aload 12
    //   465: invokespecial 290	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   468: athrow
    //   469: new 48	java/lang/String
    //   472: dup
    //   473: ldc_w 281
    //   476: invokespecial 292	java/lang/String:<init>	(Ljava/lang/String;)V
    //   479: astore 14
    //   481: goto -24 -> 457
    //   484: astore 7
    //   486: aconst_null
    //   487: astore 8
    //   489: aload 4
    //   491: ifnull +109 -> 600
    //   494: aload 4
    //   496: invokeinterface 215 1 0
    //   501: invokeinterface 220 1 0
    //   506: istore 9
    //   508: iconst_2
    //   509: anewarray 4	java/lang/Object
    //   512: astore 10
    //   514: aload 10
    //   516: iconst_0
    //   517: iload 9
    //   519: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   522: aastore
    //   523: aload 10
    //   525: iconst_1
    //   526: aload_1
    //   527: getfield 273	ev:c	Ljava/lang/String;
    //   530: aastore
    //   531: ldc_w 294
    //   534: aload 10
    //   536: invokestatic 296	fh:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   539: aload 8
    //   541: ifnull +79 -> 620
    //   544: new 228	et
    //   547: dup
    //   548: iload 9
    //   550: aload 8
    //   552: aload 5
    //   554: iconst_0
    //   555: invokestatic 168	android/os/SystemClock:elapsedRealtime	()J
    //   558: lload_2
    //   559: lsub
    //   560: invokespecial 231	et:<init>	(I[BLjava/util/Map;ZJ)V
    //   563: astore 11
    //   565: iload 9
    //   567: sipush 401
    //   570: if_icmpeq +11 -> 581
    //   573: iload 9
    //   575: sipush 403
    //   578: if_icmpne +32 -> 610
    //   581: ldc_w 298
    //   584: aload_1
    //   585: new 300	eh
    //   588: dup
    //   589: aload 11
    //   591: invokespecial 303	eh:<init>	(Let;)V
    //   594: invokestatic 267	fk:a	(Ljava/lang/String;Lev;Lfg;)V
    //   597: goto -593 -> 4
    //   600: new 305	eu
    //   603: dup
    //   604: aload 7
    //   606: invokespecial 308	eu:<init>	(Ljava/lang/Throwable;)V
    //   609: athrow
    //   610: new 124	fe
    //   613: dup
    //   614: aload 11
    //   616: invokespecial 309	fe:<init>	(Let;)V
    //   619: athrow
    //   620: new 311	es
    //   623: dup
    //   624: aconst_null
    //   625: invokespecial 312	es:<init>	(Let;)V
    //   628: athrow
    //   629: astore 7
    //   631: aload 18
    //   633: astore 4
    //   635: aconst_null
    //   636: astore 8
    //   638: goto -149 -> 489
    //   641: astore 7
    //   643: aload 18
    //   645: astore 4
    //   647: goto -158 -> 489
    //   650: iload 20
    //   652: sipush 200
    //   655: if_icmplt -313 -> 342
    //   658: iload 20
    //   660: sipush 299
    //   663: if_icmple -278 -> 385
    //   666: goto -324 -> 342
    //
    // Exception table:
    //   from	to	target	type
    //   12	27	350	java/net/SocketTimeoutException
    //   32	55	350	java/net/SocketTimeoutException
    //   55	90	350	java/net/SocketTimeoutException
    //   90	104	350	java/net/SocketTimeoutException
    //   104	134	350	java/net/SocketTimeoutException
    //   142	148	350	java/net/SocketTimeoutException
    //   153	173	350	java/net/SocketTimeoutException
    //   173	212	350	java/net/SocketTimeoutException
    //   212	235	350	java/net/SocketTimeoutException
    //   239	262	350	java/net/SocketTimeoutException
    //   262	282	350	java/net/SocketTimeoutException
    //   287	295	350	java/net/SocketTimeoutException
    //   295	339	350	java/net/SocketTimeoutException
    //   342	350	350	java/net/SocketTimeoutException
    //   369	374	350	java/net/SocketTimeoutException
    //   385	406	350	java/net/SocketTimeoutException
    //   12	27	409	org/apache/http/conn/ConnectTimeoutException
    //   32	55	409	org/apache/http/conn/ConnectTimeoutException
    //   55	90	409	org/apache/http/conn/ConnectTimeoutException
    //   90	104	409	org/apache/http/conn/ConnectTimeoutException
    //   104	134	409	org/apache/http/conn/ConnectTimeoutException
    //   142	148	409	org/apache/http/conn/ConnectTimeoutException
    //   153	173	409	org/apache/http/conn/ConnectTimeoutException
    //   173	212	409	org/apache/http/conn/ConnectTimeoutException
    //   212	235	409	org/apache/http/conn/ConnectTimeoutException
    //   239	262	409	org/apache/http/conn/ConnectTimeoutException
    //   262	282	409	org/apache/http/conn/ConnectTimeoutException
    //   287	295	409	org/apache/http/conn/ConnectTimeoutException
    //   295	339	409	org/apache/http/conn/ConnectTimeoutException
    //   342	350	409	org/apache/http/conn/ConnectTimeoutException
    //   369	374	409	org/apache/http/conn/ConnectTimeoutException
    //   385	406	409	org/apache/http/conn/ConnectTimeoutException
    //   12	27	428	java/net/MalformedURLException
    //   32	55	428	java/net/MalformedURLException
    //   55	90	428	java/net/MalformedURLException
    //   90	104	428	java/net/MalformedURLException
    //   104	134	428	java/net/MalformedURLException
    //   142	148	428	java/net/MalformedURLException
    //   153	173	428	java/net/MalformedURLException
    //   173	212	428	java/net/MalformedURLException
    //   212	235	428	java/net/MalformedURLException
    //   239	262	428	java/net/MalformedURLException
    //   262	282	428	java/net/MalformedURLException
    //   287	295	428	java/net/MalformedURLException
    //   295	339	428	java/net/MalformedURLException
    //   342	350	428	java/net/MalformedURLException
    //   369	374	428	java/net/MalformedURLException
    //   385	406	428	java/net/MalformedURLException
    //   12	27	484	java/io/IOException
    //   32	55	484	java/io/IOException
    //   55	90	484	java/io/IOException
    //   90	104	484	java/io/IOException
    //   104	134	629	java/io/IOException
    //   142	148	629	java/io/IOException
    //   153	173	629	java/io/IOException
    //   173	212	629	java/io/IOException
    //   212	235	629	java/io/IOException
    //   369	374	629	java/io/IOException
    //   239	262	641	java/io/IOException
    //   262	282	641	java/io/IOException
    //   287	295	641	java/io/IOException
    //   295	339	641	java/io/IOException
    //   342	350	641	java/io/IOException
    //   385	406	641	java/io/IOException
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fk
 * JD-Core Version:    0.6.0
 */