package com.sina.weibo.sdk.net;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.sina.weibo.sdk.exception.WeiboException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

class HttpManager
{
  private static final String a;
  private static final String b;
  private static final String c;
  private static SSLSocketFactory d;

  static
  {
    System.loadLibrary("weibosdkcore");
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 1;
    if (i >= 12)
    {
      a = localStringBuffer.toString();
      b = "--" + a;
      c = "--" + a + "--";
      return;
    }
    long l = System.currentTimeMillis() + i;
    if (l % 3L == 0L)
      localStringBuffer.append((char)(int)l % '\t');
    while (true)
    {
      i++;
      break;
      if (l % 3L == 1L)
      {
        localStringBuffer.append((char)(int)(65L + l % 26L));
        continue;
      }
      localStringBuffer.append((char)(int)(97L + l % 26L));
    }
  }

  public static String a(Context paramContext, String paramString1, String paramString2, g paramg)
  {
    return a(c(paramContext, paramString1, paramString2, paramg));
  }

  // ERROR //
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: new 77	java/io/File
    //   6: dup
    //   7: aload_1
    //   8: invokespecial 78	java/io/File:<init>	(Ljava/lang/String;)V
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual 82	java/io/File:exists	()Z
    //   16: ifne +8 -> 24
    //   19: aload_3
    //   20: invokevirtual 85	java/io/File:mkdirs	()Z
    //   23: pop
    //   24: new 77	java/io/File
    //   27: dup
    //   28: aload_3
    //   29: aload_2
    //   30: invokespecial 88	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   33: astore 5
    //   35: aload 5
    //   37: invokevirtual 82	java/io/File:exists	()Z
    //   40: ifeq +20 -> 60
    //   43: aload 5
    //   45: invokevirtual 91	java/io/File:getPath	()Ljava/lang/String;
    //   48: astore 36
    //   50: aload 36
    //   52: astore 6
    //   54: ldc 2
    //   56: monitorexit
    //   57: aload 6
    //   59: areturn
    //   60: aload_0
    //   61: invokestatic 97	android/webkit/URLUtil:isValidUrl	(Ljava/lang/String;)Z
    //   64: ifne +10 -> 74
    //   67: ldc 99
    //   69: astore 6
    //   71: goto -17 -> 54
    //   74: invokestatic 102	com/sina/weibo/sdk/net/HttpManager:a	()Lorg/apache/http/client/HttpClient;
    //   77: astore 7
    //   79: new 77	java/io/File
    //   82: dup
    //   83: aload_1
    //   84: new 33	java/lang/StringBuilder
    //   87: dup
    //   88: aload_2
    //   89: invokestatic 108	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   92: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   95: ldc 110
    //   97: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokespecial 113	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: astore 8
    //   108: aload 8
    //   110: invokevirtual 82	java/io/File:exists	()Z
    //   113: ifeq +310 -> 423
    //   116: aload 8
    //   118: invokevirtual 116	java/io/File:length	()J
    //   121: lstore 13
    //   123: new 118	org/apache/http/client/methods/HttpGet
    //   126: dup
    //   127: aload_0
    //   128: invokespecial 119	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   131: astore 15
    //   133: aload 15
    //   135: ldc 121
    //   137: new 33	java/lang/StringBuilder
    //   140: dup
    //   141: ldc 123
    //   143: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   146: lload 13
    //   148: invokevirtual 126	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   151: ldc 128
    //   153: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: invokevirtual 131	org/apache/http/client/methods/HttpGet:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   162: aload 7
    //   164: aload 15
    //   166: invokeinterface 137 2 0
    //   171: astore 16
    //   173: aload 16
    //   175: invokeinterface 143 1 0
    //   180: invokeinterface 149 1 0
    //   185: istore 17
    //   187: iload 17
    //   189: sipush 206
    //   192: if_icmpne +243 -> 435
    //   195: aload 16
    //   197: ldc 151
    //   199: invokeinterface 155 2 0
    //   204: astore 18
    //   206: aload 18
    //   208: ifnull +462 -> 670
    //   211: aload 18
    //   213: arraylength
    //   214: ifeq +456 -> 670
    //   217: aload 18
    //   219: iconst_0
    //   220: aaload
    //   221: invokeinterface 160 1 0
    //   226: astore 32
    //   228: aload 32
    //   230: iconst_1
    //   231: aload 32
    //   233: bipush 47
    //   235: invokevirtual 164	java/lang/String:indexOf	(I)I
    //   238: iadd
    //   239: invokevirtual 168	java/lang/String:substring	(I)Ljava/lang/String;
    //   242: invokestatic 174	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   245: lstore 21
    //   247: lload 13
    //   249: lstore 19
    //   251: aload 16
    //   253: invokeinterface 178 1 0
    //   258: astore 23
    //   260: aload 16
    //   262: ldc 180
    //   264: invokeinterface 184 2 0
    //   269: astore 24
    //   271: aload 24
    //   273: ifnull +276 -> 549
    //   276: aload 24
    //   278: invokeinterface 160 1 0
    //   283: invokevirtual 187	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   286: ldc 189
    //   288: invokevirtual 192	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   291: iflt +258 -> 549
    //   294: new 194	java/util/zip/GZIPInputStream
    //   297: dup
    //   298: aload 23
    //   300: invokeinterface 200 1 0
    //   305: invokespecial 203	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   308: astore 25
    //   310: new 205	java/io/RandomAccessFile
    //   313: dup
    //   314: aload 8
    //   316: ldc 207
    //   318: invokespecial 208	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   321: astore 26
    //   323: aload 26
    //   325: lload 19
    //   327: invokevirtual 212	java/io/RandomAccessFile:seek	(J)V
    //   330: sipush 1024
    //   333: newarray byte
    //   335: astore 27
    //   337: aload 25
    //   339: aload 27
    //   341: invokevirtual 218	java/io/InputStream:read	([B)I
    //   344: istore 28
    //   346: iload 28
    //   348: iconst_m1
    //   349: if_icmpne +212 -> 561
    //   352: aload 26
    //   354: invokevirtual 221	java/io/RandomAccessFile:close	()V
    //   357: aload 25
    //   359: invokevirtual 222	java/io/InputStream:close	()V
    //   362: lload 21
    //   364: lconst_0
    //   365: lcmp
    //   366: ifeq +14 -> 380
    //   369: aload 8
    //   371: invokevirtual 116	java/io/File:length	()J
    //   374: lload 21
    //   376: lcmp
    //   377: ifge +232 -> 609
    //   380: aload 8
    //   382: invokevirtual 225	java/io/File:delete	()Z
    //   385: pop
    //   386: aload 7
    //   388: invokeinterface 229 1 0
    //   393: invokeinterface 234 1 0
    //   398: aload 7
    //   400: invokeinterface 229 1 0
    //   405: ldc2_w 235
    //   408: getstatic 242	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   411: invokeinterface 246 4 0
    //   416: ldc 99
    //   418: astore 6
    //   420: goto -366 -> 54
    //   423: aload 8
    //   425: invokevirtual 249	java/io/File:createNewFile	()Z
    //   428: pop
    //   429: lconst_0
    //   430: lstore 13
    //   432: goto -309 -> 123
    //   435: iload 17
    //   437: sipush 200
    //   440: if_icmpne +45 -> 485
    //   443: aload 16
    //   445: ldc 251
    //   447: invokeinterface 184 2 0
    //   452: astore 33
    //   454: aload 33
    //   456: ifnull +205 -> 661
    //   459: aload 33
    //   461: invokeinterface 160 1 0
    //   466: invokestatic 256	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   469: invokevirtual 259	java/lang/Integer:intValue	()I
    //   472: i2l
    //   473: lstore 34
    //   475: lconst_0
    //   476: lstore 19
    //   478: lload 34
    //   480: lstore 21
    //   482: goto -231 -> 251
    //   485: new 261	com/sina/weibo/sdk/exception/WeiboHttpException
    //   488: dup
    //   489: aload 16
    //   491: invokestatic 72	com/sina/weibo/sdk/net/HttpManager:a	(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    //   494: iload 17
    //   496: invokespecial 264	com/sina/weibo/sdk/exception/WeiboHttpException:<init>	(Ljava/lang/String;I)V
    //   499: athrow
    //   500: astore 10
    //   502: aload 8
    //   504: invokevirtual 225	java/io/File:delete	()Z
    //   507: pop
    //   508: aload 7
    //   510: invokeinterface 229 1 0
    //   515: invokeinterface 234 1 0
    //   520: aload 7
    //   522: invokeinterface 229 1 0
    //   527: ldc2_w 235
    //   530: getstatic 242	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   533: invokeinterface 246 4 0
    //   538: goto -122 -> 416
    //   541: astore 4
    //   543: ldc 2
    //   545: monitorexit
    //   546: aload 4
    //   548: athrow
    //   549: aload 23
    //   551: invokeinterface 200 1 0
    //   556: astore 25
    //   558: goto -248 -> 310
    //   561: aload 26
    //   563: aload 27
    //   565: iconst_0
    //   566: iload 28
    //   568: invokevirtual 268	java/io/RandomAccessFile:write	([BII)V
    //   571: goto -234 -> 337
    //   574: astore 9
    //   576: aload 7
    //   578: invokeinterface 229 1 0
    //   583: invokeinterface 234 1 0
    //   588: aload 7
    //   590: invokeinterface 229 1 0
    //   595: ldc2_w 235
    //   598: getstatic 242	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   601: invokeinterface 246 4 0
    //   606: aload 9
    //   608: athrow
    //   609: aload 8
    //   611: aload 5
    //   613: invokevirtual 272	java/io/File:renameTo	(Ljava/io/File;)Z
    //   616: pop
    //   617: aload 5
    //   619: invokevirtual 91	java/io/File:getPath	()Ljava/lang/String;
    //   622: astore 31
    //   624: aload 31
    //   626: astore 6
    //   628: aload 7
    //   630: invokeinterface 229 1 0
    //   635: invokeinterface 234 1 0
    //   640: aload 7
    //   642: invokeinterface 229 1 0
    //   647: ldc2_w 235
    //   650: getstatic 242	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   653: invokeinterface 246 4 0
    //   658: goto -604 -> 54
    //   661: lconst_0
    //   662: lstore 19
    //   664: lconst_0
    //   665: lstore 21
    //   667: goto -416 -> 251
    //   670: lload 13
    //   672: lstore 19
    //   674: lconst_0
    //   675: lstore 21
    //   677: goto -426 -> 251
    //
    // Exception table:
    //   from	to	target	type
    //   108	123	500	java/io/IOException
    //   123	187	500	java/io/IOException
    //   195	206	500	java/io/IOException
    //   211	247	500	java/io/IOException
    //   251	271	500	java/io/IOException
    //   276	310	500	java/io/IOException
    //   310	337	500	java/io/IOException
    //   337	346	500	java/io/IOException
    //   352	362	500	java/io/IOException
    //   369	380	500	java/io/IOException
    //   380	386	500	java/io/IOException
    //   423	429	500	java/io/IOException
    //   443	454	500	java/io/IOException
    //   459	475	500	java/io/IOException
    //   485	500	500	java/io/IOException
    //   549	558	500	java/io/IOException
    //   561	571	500	java/io/IOException
    //   609	624	500	java/io/IOException
    //   3	24	541	finally
    //   24	50	541	finally
    //   60	67	541	finally
    //   74	108	541	finally
    //   386	416	541	finally
    //   508	538	541	finally
    //   576	609	541	finally
    //   628	658	541	finally
    //   108	123	574	finally
    //   123	187	574	finally
    //   195	206	574	finally
    //   211	247	574	finally
    //   251	271	574	finally
    //   276	310	574	finally
    //   310	337	574	finally
    //   337	346	574	finally
    //   352	362	574	finally
    //   369	380	574	finally
    //   380	386	574	finally
    //   423	429	574	finally
    //   443	454	574	finally
    //   459	475	574	finally
    //   485	500	574	finally
    //   502	508	574	finally
    //   549	558	574	finally
    //   561	571	574	finally
    //   609	624	574	finally
  }

  // ERROR //
  private static String a(org.apache.http.HttpResponse paramHttpResponse)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_0
    //   7: invokeinterface 178 1 0
    //   12: astore_1
    //   13: new 274	java/io/ByteArrayOutputStream
    //   16: dup
    //   17: invokespecial 275	java/io/ByteArrayOutputStream:<init>	()V
    //   20: astore_2
    //   21: aload_1
    //   22: invokeinterface 200 1 0
    //   27: astore 10
    //   29: aload 10
    //   31: astore 5
    //   33: aload_0
    //   34: ldc 180
    //   36: invokeinterface 184 2 0
    //   41: astore 11
    //   43: aload 11
    //   45: ifnull +32 -> 77
    //   48: aload 11
    //   50: invokeinterface 160 1 0
    //   55: invokevirtual 187	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   58: ldc 189
    //   60: invokevirtual 192	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   63: iflt +14 -> 77
    //   66: new 194	java/util/zip/GZIPInputStream
    //   69: dup
    //   70: aload 5
    //   72: invokespecial 203	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   75: astore 5
    //   77: sipush 8192
    //   80: newarray byte
    //   82: astore 12
    //   84: aload 5
    //   86: aload 12
    //   88: invokevirtual 218	java/io/InputStream:read	([B)I
    //   91: istore 13
    //   93: iload 13
    //   95: iconst_m1
    //   96: if_icmpne +41 -> 137
    //   99: new 104	java/lang/String
    //   102: dup
    //   103: aload_2
    //   104: invokevirtual 279	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   107: ldc_w 281
    //   110: invokespecial 284	java/lang/String:<init>	([BLjava/lang/String;)V
    //   113: astore 14
    //   115: aload 5
    //   117: ifnull +8 -> 125
    //   120: aload 5
    //   122: invokevirtual 222	java/io/InputStream:close	()V
    //   125: aload_2
    //   126: invokevirtual 285	java/io/ByteArrayOutputStream:close	()V
    //   129: aload 14
    //   131: areturn
    //   132: astore 15
    //   134: aload 14
    //   136: areturn
    //   137: aload_2
    //   138: aload 12
    //   140: iconst_0
    //   141: iload 13
    //   143: invokevirtual 286	java/io/ByteArrayOutputStream:write	([BII)V
    //   146: goto -62 -> 84
    //   149: astore 4
    //   151: new 288	com/sina/weibo/sdk/exception/WeiboException
    //   154: dup
    //   155: aload 4
    //   157: invokespecial 291	com/sina/weibo/sdk/exception/WeiboException:<init>	(Ljava/lang/Throwable;)V
    //   160: athrow
    //   161: astore 6
    //   163: aload 5
    //   165: ifnull +8 -> 173
    //   168: aload 5
    //   170: invokevirtual 222	java/io/InputStream:close	()V
    //   173: aload_2
    //   174: invokevirtual 285	java/io/ByteArrayOutputStream:close	()V
    //   177: aload 6
    //   179: athrow
    //   180: astore 16
    //   182: goto -57 -> 125
    //   185: astore 8
    //   187: goto -14 -> 173
    //   190: astore 7
    //   192: goto -15 -> 177
    //   195: astore 9
    //   197: aload 9
    //   199: astore 6
    //   201: aconst_null
    //   202: astore 5
    //   204: goto -41 -> 163
    //   207: astore_3
    //   208: aload_3
    //   209: astore 4
    //   211: aconst_null
    //   212: astore 5
    //   214: goto -63 -> 151
    //
    // Exception table:
    //   from	to	target	type
    //   125	129	132	java/io/IOException
    //   33	43	149	java/io/IOException
    //   48	77	149	java/io/IOException
    //   77	84	149	java/io/IOException
    //   84	93	149	java/io/IOException
    //   99	115	149	java/io/IOException
    //   137	146	149	java/io/IOException
    //   33	43	161	finally
    //   48	77	161	finally
    //   77	84	161	finally
    //   84	93	161	finally
    //   99	115	161	finally
    //   137	146	161	finally
    //   151	161	161	finally
    //   120	125	180	java/io/IOException
    //   168	173	185	java/io/IOException
    //   173	177	190	java/io/IOException
    //   21	29	195	finally
    //   21	29	207	java/io/IOException
  }

  private static Certificate a(String paramString)
  {
    CertificateFactory localCertificateFactory = CertificateFactory.getInstance("X.509");
    InputStream localInputStream = HttpManager.class.getResourceAsStream(paramString);
    try
    {
      Certificate localCertificate = localCertificateFactory.generateCertificate(localInputStream);
      return localCertificate;
    }
    finally
    {
      if (localInputStream != null)
        localInputStream.close();
    }
    throw localObject;
  }

  private static HttpClient a()
  {
    try
    {
      BasicHttpParams localBasicHttpParams = new BasicHttpParams();
      HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
      HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
      SchemeRegistry localSchemeRegistry = new SchemeRegistry();
      localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
      localSchemeRegistry.register(new Scheme("https", b(), 443));
      ThreadSafeClientConnManager localThreadSafeClientConnManager = new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry);
      HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 25000);
      HttpConnectionParams.setSoTimeout(localBasicHttpParams, 20000);
      DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient(localThreadSafeClientConnManager, localBasicHttpParams);
      return localDefaultHttpClient;
    }
    catch (Exception localException)
    {
    }
    return new DefaultHttpClient();
  }

  private static void a(Context paramContext, g paramg)
  {
    String str1 = "";
    if (!TextUtils.isEmpty(paramg.a()))
    {
      str1 = b.d(paramContext, paramg.a());
      if (!TextUtils.isEmpty(str1))
        paramg.a("aid", str1);
    }
    String str2 = str1;
    String str3 = String.valueOf(System.currentTimeMillis() / 1000L);
    paramg.a("oauth_timestamp", str3);
    Object localObject1 = paramg.a("access_token");
    Object localObject2 = paramg.a("refresh_token");
    String str4;
    if ((localObject1 != null) && ((localObject1 instanceof String)))
      str4 = (String)localObject1;
    while (true)
    {
      String str5 = paramg.a();
      StringBuilder localStringBuilder = new StringBuilder("");
      if (!TextUtils.isEmpty(str2))
        localStringBuilder.append(str2);
      if (!TextUtils.isEmpty(str4))
        localStringBuilder.append(str4);
      if (!TextUtils.isEmpty(str5))
        localStringBuilder.append(str5);
      paramg.a("oauth_sign", calcOauthSignNative(paramContext, localStringBuilder.toString(), str3));
      return;
      if ((localObject2 != null) && ((localObject2 instanceof String)))
      {
        str4 = (String)localObject2;
        continue;
      }
      str4 = "";
    }
  }

  private static void a(OutputStream paramOutputStream, g paramg)
  {
    while (true)
    {
      Iterator localIterator2;
      try
      {
        Set localSet = paramg.b();
        Iterator localIterator1 = localSet.iterator();
        if (localIterator1.hasNext())
          continue;
        localIterator2 = localSet.iterator();
        if (!localIterator2.hasNext())
        {
          paramOutputStream.write(("\r\n" + c).getBytes());
          return;
          String str1 = (String)localIterator1.next();
          if (!(paramg.a(str1) instanceof String))
            continue;
          StringBuilder localStringBuilder1 = new StringBuilder(100);
          localStringBuilder1.setLength(0);
          localStringBuilder1.append(b).append("\r\n");
          localStringBuilder1.append("content-disposition: form-data; name=\"").append(str1).append("\"\r\n\r\n");
          localStringBuilder1.append(paramg.a(str1)).append("\r\n");
          paramOutputStream.write(localStringBuilder1.toString().getBytes());
          continue;
        }
      }
      catch (IOException localIOException)
      {
        throw new WeiboException(localIOException);
      }
      String str2 = (String)localIterator2.next();
      Object localObject = paramg.a(str2);
      if ((localObject instanceof Bitmap))
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(b).append("\r\n");
        localStringBuilder2.append("content-disposition: form-data; name=\"").append(str2).append("\"; filename=\"file\"\r\n");
        localStringBuilder2.append("Content-Type: application/octet-stream; charset=utf-8\r\n\r\n");
        paramOutputStream.write(localStringBuilder2.toString().getBytes());
        Bitmap localBitmap = (Bitmap)localObject;
        ByteArrayOutputStream localByteArrayOutputStream1 = new ByteArrayOutputStream();
        localBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream1);
        paramOutputStream.write(localByteArrayOutputStream1.toByteArray());
        paramOutputStream.write("\r\n".getBytes());
        continue;
      }
      if (!(localObject instanceof ByteArrayOutputStream))
        continue;
      StringBuilder localStringBuilder3 = new StringBuilder();
      localStringBuilder3.append(b).append("\r\n");
      localStringBuilder3.append("content-disposition: form-data; name=\"").append(str2).append("\"; filename=\"file\"\r\n");
      localStringBuilder3.append("Content-Type: application/octet-stream; charset=utf-8\r\n\r\n");
      paramOutputStream.write(localStringBuilder3.toString().getBytes());
      ByteArrayOutputStream localByteArrayOutputStream2 = (ByteArrayOutputStream)localObject;
      paramOutputStream.write(localByteArrayOutputStream2.toByteArray());
      paramOutputStream.write("\r\n".getBytes());
      localByteArrayOutputStream2.close();
    }
  }

  private static void a(HttpClient paramHttpClient)
  {
    if (paramHttpClient != null);
    try
    {
      paramHttpClient.getConnectionManager().closeExpiredConnections();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  // ERROR //
  public static String b(Context paramContext, String paramString1, String paramString2, g paramg)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: new 478	com/sina/weibo/sdk/net/e
    //   6: dup
    //   7: invokespecial 479	com/sina/weibo/sdk/net/e:<init>	()V
    //   10: astore 5
    //   12: invokestatic 102	com/sina/weibo/sdk/net/HttpManager:a	()Lorg/apache/http/client/HttpClient;
    //   15: checkcast 372	org/apache/http/impl/client/DefaultHttpClient
    //   18: astore 8
    //   20: aload 8
    //   22: aload 5
    //   24: invokevirtual 483	org/apache/http/impl/client/DefaultHttpClient:setRedirectHandler	(Lorg/apache/http/client/RedirectHandler;)V
    //   27: aload_0
    //   28: aload_3
    //   29: invokestatic 485	com/sina/weibo/sdk/net/HttpManager:a	(Landroid/content/Context;Lcom/sina/weibo/sdk/net/g;)V
    //   32: aload 8
    //   34: invokevirtual 489	org/apache/http/impl/client/DefaultHttpClient:getParams	()Lorg/apache/http/params/HttpParams;
    //   37: ldc_w 491
    //   40: invokestatic 496	com/sina/weibo/sdk/net/NetStateManager:a	()Lorg/apache/http/HttpHost;
    //   43: invokeinterface 502 3 0
    //   48: pop
    //   49: aload_2
    //   50: ldc_w 504
    //   53: invokevirtual 508	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   56: ifeq +76 -> 132
    //   59: new 118	org/apache/http/client/methods/HttpGet
    //   62: dup
    //   63: new 33	java/lang/StringBuilder
    //   66: dup
    //   67: aload_1
    //   68: invokestatic 108	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   71: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   74: ldc_w 510
    //   77: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: aload_3
    //   81: invokevirtual 512	com/sina/weibo/sdk/net/g:c	()Ljava/lang/String;
    //   84: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: invokespecial 119	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   93: astore 12
    //   95: aload 12
    //   97: ldc_w 514
    //   100: aload_0
    //   101: invokestatic 518	android/support/v4/app/b:h	(Landroid/content/Context;)Ljava/lang/String;
    //   104: invokeinterface 521 3 0
    //   109: aload 8
    //   111: aload 12
    //   113: invokevirtual 522	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   116: pop
    //   117: aload 5
    //   119: getfield 525	com/sina/weibo/sdk/net/d:a	Ljava/lang/String;
    //   122: astore 14
    //   124: aload 8
    //   126: invokestatic 527	com/sina/weibo/sdk/net/HttpManager:a	(Lorg/apache/http/client/HttpClient;)V
    //   129: aload 14
    //   131: areturn
    //   132: aload_2
    //   133: ldc_w 529
    //   136: invokevirtual 508	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   139: istore 15
    //   141: aconst_null
    //   142: astore 12
    //   144: iload 15
    //   146: ifeq -51 -> 95
    //   149: new 531	org/apache/http/client/methods/HttpPost
    //   152: dup
    //   153: aload_1
    //   154: invokespecial 532	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   157: astore 12
    //   159: goto -64 -> 95
    //   162: astore 10
    //   164: aload 8
    //   166: astore 4
    //   168: aload 10
    //   170: astore 6
    //   172: new 288	com/sina/weibo/sdk/exception/WeiboException
    //   175: dup
    //   176: aload 6
    //   178: invokespecial 291	com/sina/weibo/sdk/exception/WeiboException:<init>	(Ljava/lang/Throwable;)V
    //   181: athrow
    //   182: astore 7
    //   184: aload 4
    //   186: invokestatic 527	com/sina/weibo/sdk/net/HttpManager:a	(Lorg/apache/http/client/HttpClient;)V
    //   189: aload 7
    //   191: athrow
    //   192: astore 9
    //   194: aload 8
    //   196: astore 4
    //   198: aload 9
    //   200: astore 7
    //   202: goto -18 -> 184
    //   205: astore 6
    //   207: aconst_null
    //   208: astore 4
    //   210: goto -38 -> 172
    //
    // Exception table:
    //   from	to	target	type
    //   20	95	162	java/io/IOException
    //   95	124	162	java/io/IOException
    //   132	141	162	java/io/IOException
    //   149	159	162	java/io/IOException
    //   3	20	182	finally
    //   172	182	182	finally
    //   20	95	192	finally
    //   95	124	192	finally
    //   132	141	192	finally
    //   149	159	192	finally
    //   3	20	205	java/io/IOException
  }

  private static SSLSocketFactory b()
  {
    if (d == null);
    try
    {
      KeyStore localKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
      localKeyStore.load(null, null);
      Certificate localCertificate1 = a("cacert_cn.cer");
      Certificate localCertificate2 = a("cacert_com.cer");
      localKeyStore.setCertificateEntry("cnca", localCertificate1);
      localKeyStore.setCertificateEntry("comca", localCertificate2);
      d = new SSLSocketFactory(localKeyStore);
      return d;
    }
    catch (Exception localException)
    {
      while (true)
        d = SSLSocketFactory.getSocketFactory();
    }
  }

  // ERROR //
  private static org.apache.http.HttpResponse c(Context paramContext, String paramString1, String paramString2, g paramg)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: invokestatic 102	com/sina/weibo/sdk/net/HttpManager:a	()Lorg/apache/http/client/HttpClient;
    //   6: astore 10
    //   8: aload 10
    //   10: astore 8
    //   12: aload 8
    //   14: invokeinterface 568 1 0
    //   19: ldc_w 491
    //   22: invokestatic 496	com/sina/weibo/sdk/net/NetStateManager:a	()Lorg/apache/http/HttpHost;
    //   25: invokeinterface 502 3 0
    //   30: pop
    //   31: aload_0
    //   32: aload_3
    //   33: invokestatic 485	com/sina/weibo/sdk/net/HttpManager:a	(Landroid/content/Context;Lcom/sina/weibo/sdk/net/g;)V
    //   36: aload_2
    //   37: ldc_w 504
    //   40: invokevirtual 508	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   43: istore 12
    //   45: aconst_null
    //   46: astore 4
    //   48: iload 12
    //   50: ifeq +127 -> 177
    //   53: new 118	org/apache/http/client/methods/HttpGet
    //   56: dup
    //   57: new 33	java/lang/StringBuilder
    //   60: dup
    //   61: aload_1
    //   62: invokestatic 108	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   65: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   68: ldc_w 510
    //   71: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: aload_3
    //   75: invokevirtual 512	com/sina/weibo/sdk/net/g:c	()Ljava/lang/String;
    //   78: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokespecial 119	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   87: astore 13
    //   89: aload 8
    //   91: aload 13
    //   93: invokeinterface 137 2 0
    //   98: astore 14
    //   100: aload 14
    //   102: invokeinterface 143 1 0
    //   107: invokeinterface 149 1 0
    //   112: istore 15
    //   114: iload 15
    //   116: sipush 200
    //   119: if_icmpeq +283 -> 402
    //   122: new 261	com/sina/weibo/sdk/exception/WeiboHttpException
    //   125: dup
    //   126: aload 14
    //   128: invokestatic 72	com/sina/weibo/sdk/net/HttpManager:a	(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    //   131: iload 15
    //   133: invokespecial 264	com/sina/weibo/sdk/exception/WeiboHttpException:<init>	(Ljava/lang/String;I)V
    //   136: athrow
    //   137: astore 5
    //   139: aload 8
    //   141: astore 6
    //   143: new 288	com/sina/weibo/sdk/exception/WeiboException
    //   146: dup
    //   147: aload 5
    //   149: invokespecial 291	com/sina/weibo/sdk/exception/WeiboException:<init>	(Ljava/lang/Throwable;)V
    //   152: athrow
    //   153: astore 7
    //   155: aload 6
    //   157: astore 8
    //   159: aload 4
    //   161: ifnull +8 -> 169
    //   164: aload 4
    //   166: invokevirtual 285	java/io/ByteArrayOutputStream:close	()V
    //   169: aload 8
    //   171: invokestatic 527	com/sina/weibo/sdk/net/HttpManager:a	(Lorg/apache/http/client/HttpClient;)V
    //   174: aload 7
    //   176: athrow
    //   177: aload_2
    //   178: ldc_w 529
    //   181: invokevirtual 508	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   184: istore 17
    //   186: aconst_null
    //   187: astore 4
    //   189: iload 17
    //   191: ifeq +173 -> 364
    //   194: new 531	org/apache/http/client/methods/HttpPost
    //   197: dup
    //   198: aload_1
    //   199: invokespecial 532	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   202: astore 18
    //   204: new 274	java/io/ByteArrayOutputStream
    //   207: dup
    //   208: invokespecial 275	java/io/ByteArrayOutputStream:<init>	()V
    //   211: astore 19
    //   213: aload_3
    //   214: invokevirtual 570	com/sina/weibo/sdk/net/g:d	()Z
    //   217: ifeq +64 -> 281
    //   220: aload 18
    //   222: ldc_w 572
    //   225: new 33	java/lang/StringBuilder
    //   228: dup
    //   229: ldc_w 574
    //   232: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   235: getstatic 31	com/sina/weibo/sdk/net/HttpManager:a	Ljava/lang/String;
    //   238: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: invokevirtual 575	org/apache/http/client/methods/HttpPost:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   247: aload 19
    //   249: aload_3
    //   250: invokestatic 577	com/sina/weibo/sdk/net/HttpManager:a	(Ljava/io/OutputStream;Lcom/sina/weibo/sdk/net/g;)V
    //   253: aload 18
    //   255: new 579	org/apache/http/entity/ByteArrayEntity
    //   258: dup
    //   259: aload 19
    //   261: invokevirtual 279	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   264: invokespecial 581	org/apache/http/entity/ByteArrayEntity:<init>	([B)V
    //   267: invokevirtual 585	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   270: aload 18
    //   272: astore 13
    //   274: aload 19
    //   276: astore 4
    //   278: goto -189 -> 89
    //   281: aload_3
    //   282: ldc_w 587
    //   285: invokevirtual 408	com/sina/weibo/sdk/net/g:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   288: astore 20
    //   290: aload 20
    //   292: ifnull +49 -> 341
    //   295: aload 20
    //   297: instanceof 104
    //   300: ifeq +41 -> 341
    //   303: aload_3
    //   304: ldc_w 587
    //   307: invokevirtual 589	com/sina/weibo/sdk/net/g:b	(Ljava/lang/String;)V
    //   310: aload 18
    //   312: ldc_w 572
    //   315: aload 20
    //   317: checkcast 104	java/lang/String
    //   320: invokevirtual 575	org/apache/http/client/methods/HttpPost:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   323: aload 19
    //   325: aload_3
    //   326: invokevirtual 512	com/sina/weibo/sdk/net/g:c	()Ljava/lang/String;
    //   329: ldc_w 281
    //   332: invokevirtual 592	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   335: invokevirtual 593	java/io/ByteArrayOutputStream:write	([B)V
    //   338: goto -85 -> 253
    //   341: aload 18
    //   343: ldc_w 572
    //   346: ldc_w 595
    //   349: invokevirtual 575	org/apache/http/client/methods/HttpPost:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   352: goto -29 -> 323
    //   355: astore 7
    //   357: aload 19
    //   359: astore 4
    //   361: goto -202 -> 159
    //   364: aload_2
    //   365: ldc_w 597
    //   368: invokevirtual 508	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   371: istore 21
    //   373: aconst_null
    //   374: astore 4
    //   376: iload 21
    //   378: ifeq +74 -> 452
    //   381: new 599	org/apache/http/client/methods/HttpDelete
    //   384: dup
    //   385: aload_1
    //   386: invokespecial 600	org/apache/http/client/methods/HttpDelete:<init>	(Ljava/lang/String;)V
    //   389: astore 13
    //   391: aconst_null
    //   392: astore 4
    //   394: goto -305 -> 89
    //   397: astore 7
    //   399: goto -240 -> 159
    //   402: aload 4
    //   404: ifnull +8 -> 412
    //   407: aload 4
    //   409: invokevirtual 285	java/io/ByteArrayOutputStream:close	()V
    //   412: aload 8
    //   414: invokestatic 527	com/sina/weibo/sdk/net/HttpManager:a	(Lorg/apache/http/client/HttpClient;)V
    //   417: aload 14
    //   419: areturn
    //   420: astore 9
    //   422: goto -253 -> 169
    //   425: astore 16
    //   427: goto -15 -> 412
    //   430: astore 7
    //   432: aconst_null
    //   433: astore 4
    //   435: aconst_null
    //   436: astore 8
    //   438: goto -279 -> 159
    //   441: astore 5
    //   443: aconst_null
    //   444: astore 4
    //   446: aconst_null
    //   447: astore 6
    //   449: goto -306 -> 143
    //   452: aconst_null
    //   453: astore 13
    //   455: aconst_null
    //   456: astore 4
    //   458: goto -369 -> 89
    //   461: astore 5
    //   463: aload 19
    //   465: astore 4
    //   467: aload 8
    //   469: astore 6
    //   471: goto -328 -> 143
    //
    // Exception table:
    //   from	to	target	type
    //   12	45	137	java/io/IOException
    //   53	89	137	java/io/IOException
    //   89	114	137	java/io/IOException
    //   122	137	137	java/io/IOException
    //   177	186	137	java/io/IOException
    //   194	213	137	java/io/IOException
    //   364	373	137	java/io/IOException
    //   381	391	137	java/io/IOException
    //   143	153	153	finally
    //   213	253	355	finally
    //   253	270	355	finally
    //   281	290	355	finally
    //   295	323	355	finally
    //   323	338	355	finally
    //   341	352	355	finally
    //   12	45	397	finally
    //   53	89	397	finally
    //   89	114	397	finally
    //   122	137	397	finally
    //   177	186	397	finally
    //   194	213	397	finally
    //   364	373	397	finally
    //   381	391	397	finally
    //   164	169	420	java/io/IOException
    //   407	412	425	java/io/IOException
    //   3	8	430	finally
    //   3	8	441	java/io/IOException
    //   213	253	461	java/io/IOException
    //   253	270	461	java/io/IOException
    //   281	290	461	java/io/IOException
    //   295	323	461	java/io/IOException
    //   323	338	461	java/io/IOException
    //   341	352	461	java/io/IOException
  }

  private static native String calcOauthSignNative(Context paramContext, String paramString1, String paramString2);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.net.HttpManager
 * JD-Core Version:    0.6.0
 */