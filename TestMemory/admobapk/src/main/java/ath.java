import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.logging.Logger;

public final class ath
{
  private static final Logger b = aso.a("AppStreamingFragment", "ProvisioningClient");
  int a = 103;
  private HttpURLConnection c;
  private final atx d;
  private final aul e;

  public ath(atx paramatx, aul paramaul)
  {
    anw.a(paramatx);
    anw.a(paramaul);
    this.d = paramatx;
    this.e = paramaul;
  }

  private final void a(int paramInt)
  {
    if (paramInt >= 400);
    for (this.a = paramInt; ; this.a = 103)
    {
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(this.c.getErrorStream()));
      while (true)
      {
        String str1 = localBufferedReader.readLine();
        if (str1 == null)
          break;
        b.log(asn.a, str1);
      }
    }
    String str2 = String.valueOf(this.c.getResponseMessage());
    throw new IOException(12 + String.valueOf(str2).length() + paramInt + " " + str2);
  }

  private final auz b()
  {
    byte[] arrayOfByte = new byte[2048];
    InputStream localInputStream = this.c.getInputStream();
    int i = 0;
    while (true)
    {
      int j = 2048 - i;
      try
      {
        int k = localInputStream.read(arrayOfByte, i, j);
        if (k <= 0)
          break;
        i += k;
        if (i < 2048)
          continue;
        throw new IOException("buffer is too small to hold a provisioning response");
      }
      finally
      {
        localInputStream.close();
      }
    }
    localInputStream.close();
    avs localavs = avs.a(arrayOfByte, 0, i);
    return ((avq)new avq().a(localavs)).a;
  }

  // ERROR //
  public final auz a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	ath:c	Ljava/net/HttpURLConnection;
    //   4: ifnonnull +101 -> 105
    //   7: aload_0
    //   8: getfield 40	ath:d	Latx;
    //   11: getfield 148	atx:e	Ljava/lang/String;
    //   14: astore 12
    //   16: ldc 150
    //   18: invokestatic 85	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   21: astore 13
    //   23: ldc 152
    //   25: invokestatic 85	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   28: astore 14
    //   30: aload_0
    //   31: new 154	java/net/URL
    //   34: dup
    //   35: new 89	java/lang/StringBuilder
    //   38: dup
    //   39: iconst_5
    //   40: aload 12
    //   42: invokestatic 85	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   45: invokevirtual 93	java/lang/String:length	()I
    //   48: iadd
    //   49: aload 13
    //   51: invokestatic 85	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   54: invokevirtual 93	java/lang/String:length	()I
    //   57: iadd
    //   58: aload 14
    //   60: invokestatic 85	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   63: invokevirtual 93	java/lang/String:length	()I
    //   66: iadd
    //   67: invokespecial 95	java/lang/StringBuilder:<init>	(I)V
    //   70: aload 12
    //   72: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: aload 13
    //   77: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: ldc 156
    //   82: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload 14
    //   87: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokespecial 157	java/net/URL:<init>	(Ljava/lang/String;)V
    //   96: invokevirtual 161	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   99: checkcast 51	java/net/HttpURLConnection
    //   102: putfield 49	ath:c	Ljava/net/HttpURLConnection;
    //   105: aload_0
    //   106: getfield 49	ath:c	Ljava/net/HttpURLConnection;
    //   109: sipush 2000
    //   112: invokevirtual 164	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   115: aload_0
    //   116: getfield 49	ath:c	Ljava/net/HttpURLConnection;
    //   119: sipush 2000
    //   122: invokevirtual 167	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   125: aload_0
    //   126: getfield 49	ath:c	Ljava/net/HttpURLConnection;
    //   129: ldc 169
    //   131: ldc 171
    //   133: invokevirtual 175	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: aload_0
    //   137: getfield 49	ath:c	Ljava/net/HttpURLConnection;
    //   140: iconst_1
    //   141: invokevirtual 179	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   144: aload_0
    //   145: getfield 40	ath:d	Latx;
    //   148: astore_3
    //   149: new 181	avp
    //   152: dup
    //   153: invokespecial 182	avp:<init>	()V
    //   156: astore 4
    //   158: new 184	auy
    //   161: dup
    //   162: invokespecial 185	auy:<init>	()V
    //   165: astore 5
    //   167: aload 5
    //   169: aload_3
    //   170: getfield 187	atx:a	Ljava/lang/String;
    //   173: putfield 188	auy:a	Ljava/lang/String;
    //   176: aload 5
    //   178: aload_0
    //   179: getfield 42	ath:e	Laul;
    //   182: putfield 190	auy:d	Laul;
    //   185: invokestatic 196	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   188: astore 6
    //   190: aload 5
    //   192: aload 6
    //   194: invokevirtual 199	java/util/Locale:getLanguage	()Ljava/lang/String;
    //   197: putfield 201	auy:b	Ljava/lang/String;
    //   200: aload 5
    //   202: aload 6
    //   204: invokevirtual 204	java/util/Locale:getCountry	()Ljava/lang/String;
    //   207: putfield 206	auy:c	Ljava/lang/String;
    //   210: aload 5
    //   212: invokestatic 212	java/lang/System:nanoTime	()J
    //   215: putfield 215	auy:e	J
    //   218: aload 5
    //   220: aload_3
    //   221: getfield 219	atx:i	Z
    //   224: putfield 222	auy:f	Z
    //   227: aload_3
    //   228: getfield 226	atx:g	Landroid/location/Location;
    //   231: ifnull +78 -> 309
    //   234: new 228	auq
    //   237: dup
    //   238: invokespecial 229	auq:<init>	()V
    //   241: astore 7
    //   243: aload 7
    //   245: aload_3
    //   246: getfield 226	atx:g	Landroid/location/Location;
    //   249: invokevirtual 235	android/location/Location:getLatitude	()D
    //   252: putfield 238	auq:a	D
    //   255: aload 7
    //   257: aload_3
    //   258: getfield 226	atx:g	Landroid/location/Location;
    //   261: invokevirtual 241	android/location/Location:getLongitude	()D
    //   264: putfield 243	auq:b	D
    //   267: aload 7
    //   269: aload_3
    //   270: getfield 226	atx:g	Landroid/location/Location;
    //   273: invokevirtual 247	android/location/Location:getAccuracy	()F
    //   276: putfield 250	auq:c	F
    //   279: aload 7
    //   281: getstatic 256	java/util/concurrent/TimeUnit:NANOSECONDS	Ljava/util/concurrent/TimeUnit;
    //   284: invokestatic 261	android/os/SystemClock:elapsedRealtimeNanos	()J
    //   287: aload_3
    //   288: getfield 226	atx:g	Landroid/location/Location;
    //   291: invokevirtual 264	android/location/Location:getElapsedRealtimeNanos	()J
    //   294: lsub
    //   295: invokevirtual 268	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   298: l2i
    //   299: putfield 270	auq:d	I
    //   302: aload 5
    //   304: aload 7
    //   306: putfield 273	auy:g	Lauq;
    //   309: aload_3
    //   310: getfield 276	atx:h	Ljava/lang/String;
    //   313: ifnull +12 -> 325
    //   316: aload 5
    //   318: aload_3
    //   319: getfield 276	atx:h	Ljava/lang/String;
    //   322: putfield 277	auy:h	Ljava/lang/String;
    //   325: aload 4
    //   327: aload 5
    //   329: putfield 280	avp:a	Lauy;
    //   332: aload 4
    //   334: aload_0
    //   335: getfield 40	ath:d	Latx;
    //   338: getfield 282	atx:d	Ljava/lang/String;
    //   341: putfield 283	avp:d	Ljava/lang/String;
    //   344: aload 4
    //   346: aload_0
    //   347: getfield 40	ath:d	Latx;
    //   350: getfield 285	atx:b	J
    //   353: putfield 286	avp:b	J
    //   356: aload 4
    //   358: aload_0
    //   359: getfield 40	ath:d	Latx;
    //   362: getfield 287	atx:c	Ljava/lang/String;
    //   365: putfield 288	avp:c	Ljava/lang/String;
    //   368: aload 4
    //   370: invokevirtual 290	avp:e	()I
    //   373: newarray byte
    //   375: astore 8
    //   377: aload 4
    //   379: aload 8
    //   381: iconst_0
    //   382: aload 8
    //   384: arraylength
    //   385: invokestatic 295	avt:a	([BII)Lavt;
    //   388: invokevirtual 298	avp:a	(Lavt;)V
    //   391: new 300	java/io/BufferedOutputStream
    //   394: dup
    //   395: aload_0
    //   396: getfield 49	ath:c	Ljava/net/HttpURLConnection;
    //   399: invokevirtual 304	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   402: invokespecial 307	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   405: astore 9
    //   407: aload 9
    //   409: aload 8
    //   411: invokevirtual 313	java/io/OutputStream:write	([B)V
    //   414: aload 9
    //   416: invokevirtual 316	java/io/OutputStream:flush	()V
    //   419: aload_0
    //   420: getfield 49	ath:c	Ljava/net/HttpURLConnection;
    //   423: invokevirtual 319	java/net/HttpURLConnection:getResponseCode	()I
    //   426: istore 10
    //   428: iload 10
    //   430: sipush 200
    //   433: if_icmpne +24 -> 457
    //   436: aload_0
    //   437: invokespecial 321	ath:b	()Lauz;
    //   440: astore 11
    //   442: aload_0
    //   443: iconst_0
    //   444: putfield 33	ath:a	I
    //   447: aload_0
    //   448: getfield 49	ath:c	Ljava/net/HttpURLConnection;
    //   451: invokevirtual 324	java/net/HttpURLConnection:disconnect	()V
    //   454: aload 11
    //   456: areturn
    //   457: aload_0
    //   458: iload 10
    //   460: invokespecial 326	ath:a	(I)V
    //   463: aconst_null
    //   464: astore 11
    //   466: goto -19 -> 447
    //   469: astore_1
    //   470: aload_0
    //   471: bipush 102
    //   473: putfield 33	ath:a	I
    //   476: aload_1
    //   477: athrow
    //   478: astore_2
    //   479: aload_0
    //   480: getfield 49	ath:c	Ljava/net/HttpURLConnection;
    //   483: invokevirtual 324	java/net/HttpURLConnection:disconnect	()V
    //   486: aload_2
    //   487: athrow
    //   488: astore_1
    //   489: goto -19 -> 470
    //
    // Exception table:
    //   from	to	target	type
    //   144	309	469	java/net/SocketTimeoutException
    //   309	325	469	java/net/SocketTimeoutException
    //   325	428	469	java/net/SocketTimeoutException
    //   436	447	469	java/net/SocketTimeoutException
    //   457	463	469	java/net/SocketTimeoutException
    //   144	309	478	finally
    //   309	325	478	finally
    //   325	428	478	finally
    //   436	447	478	finally
    //   457	463	478	finally
    //   470	478	478	finally
    //   144	309	488	java/net/UnknownHostException
    //   309	325	488	java/net/UnknownHostException
    //   325	428	488	java/net/UnknownHostException
    //   436	447	488	java/net/UnknownHostException
    //   457	463	488	java/net/UnknownHostException
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ath
 * JD-Core Version:    0.6.0
 */