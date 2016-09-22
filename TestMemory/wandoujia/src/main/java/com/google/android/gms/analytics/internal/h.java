package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.internal.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class h extends u
{
  private static final byte[] c = "\n".getBytes();
  private final String a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { "GoogleAnalytics", v.a, Build.VERSION.RELEASE, m.a(Locale.getDefault()), Build.MODEL, Build.ID });
  private final l b;

  h(w paramw)
  {
    super(paramw);
    this.b = new l(paramw.c());
  }

  private int a(URL paramURL)
  {
    android.support.v4.app.d.a(paramURL);
    b("GET request", paramURL);
    HttpURLConnection localHttpURLConnection = null;
    try
    {
      localHttpURLConnection = b(paramURL);
      localHttpURLConnection.connect();
      a(localHttpURLConnection);
      int i = localHttpURLConnection.getResponseCode();
      if (i == 200)
        p().f();
      b("GET status", Integer.valueOf(i));
      return i;
    }
    catch (IOException localIOException)
    {
      d("Network GET connection error", localIOException);
      return 0;
    }
    finally
    {
      if (localHttpURLConnection != null)
        localHttpURLConnection.disconnect();
    }
    throw localObject;
  }

  // ERROR //
  private int a(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: invokestatic 85	android/support/v4/app/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_2
    //   8: invokestatic 85	android/support/v4/app/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: aload_0
    //   13: ldc 133
    //   15: aload_2
    //   16: arraylength
    //   17: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   20: aload_1
    //   21: invokevirtual 136	com/google/android/gms/analytics/internal/h:b	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   24: invokestatic 140	com/google/android/gms/analytics/internal/h:x	()Z
    //   27: ifeq +17 -> 44
    //   30: aload_0
    //   31: ldc 142
    //   33: new 16	java/lang/String
    //   36: dup
    //   37: aload_2
    //   38: invokespecial 145	java/lang/String:<init>	([B)V
    //   41: invokevirtual 147	com/google/android/gms/analytics/internal/h:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   44: aload_0
    //   45: aload_1
    //   46: invokespecial 93	com/google/android/gms/analytics/internal/h:b	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   49: astore 11
    //   51: aload 11
    //   53: astore 7
    //   55: aload 7
    //   57: iconst_1
    //   58: invokevirtual 151	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   61: aload 7
    //   63: aload_2
    //   64: arraylength
    //   65: invokevirtual 155	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   68: aload 7
    //   70: invokevirtual 98	java/net/HttpURLConnection:connect	()V
    //   73: aload 7
    //   75: invokevirtual 159	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   78: astore_3
    //   79: aload_3
    //   80: aload_2
    //   81: invokevirtual 164	java/io/OutputStream:write	([B)V
    //   84: aload_0
    //   85: aload 7
    //   87: invokespecial 101	com/google/android/gms/analytics/internal/h:a	(Ljava/net/HttpURLConnection;)V
    //   90: aload 7
    //   92: invokevirtual 105	java/net/HttpURLConnection:getResponseCode	()I
    //   95: istore 12
    //   97: iload 12
    //   99: sipush 200
    //   102: if_icmpne +10 -> 112
    //   105: aload_0
    //   106: invokevirtual 109	com/google/android/gms/analytics/internal/h:p	()Lcom/google/android/gms/analytics/internal/o;
    //   109: invokevirtual 114	com/google/android/gms/analytics/internal/o:f	()V
    //   112: aload_0
    //   113: ldc 166
    //   115: iload 12
    //   117: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   120: invokevirtual 90	com/google/android/gms/analytics/internal/h:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   123: aload_3
    //   124: ifnull +7 -> 131
    //   127: aload_3
    //   128: invokevirtual 169	java/io/OutputStream:close	()V
    //   131: aload 7
    //   133: ifnull +8 -> 141
    //   136: aload 7
    //   138: invokevirtual 125	java/net/HttpURLConnection:disconnect	()V
    //   141: iload 12
    //   143: ireturn
    //   144: astore 13
    //   146: aload_0
    //   147: ldc 171
    //   149: aload 13
    //   151: invokevirtual 174	com/google/android/gms/analytics/internal/h:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   154: goto -23 -> 131
    //   157: astore 9
    //   159: aconst_null
    //   160: astore 7
    //   162: aload_0
    //   163: ldc 176
    //   165: aload 9
    //   167: invokevirtual 130	com/google/android/gms/analytics/internal/h:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   170: aload_3
    //   171: ifnull +7 -> 178
    //   174: aload_3
    //   175: invokevirtual 169	java/io/OutputStream:close	()V
    //   178: aload 7
    //   180: ifnull +8 -> 188
    //   183: aload 7
    //   185: invokevirtual 125	java/net/HttpURLConnection:disconnect	()V
    //   188: iconst_0
    //   189: ireturn
    //   190: astore 10
    //   192: aload_0
    //   193: ldc 171
    //   195: aload 10
    //   197: invokevirtual 174	com/google/android/gms/analytics/internal/h:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   200: goto -22 -> 178
    //   203: astore 6
    //   205: aconst_null
    //   206: astore 7
    //   208: aload_3
    //   209: ifnull +7 -> 216
    //   212: aload_3
    //   213: invokevirtual 169	java/io/OutputStream:close	()V
    //   216: aload 7
    //   218: ifnull +8 -> 226
    //   221: aload 7
    //   223: invokevirtual 125	java/net/HttpURLConnection:disconnect	()V
    //   226: aload 6
    //   228: athrow
    //   229: astore 8
    //   231: aload_0
    //   232: ldc 171
    //   234: aload 8
    //   236: invokevirtual 174	com/google/android/gms/analytics/internal/h:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   239: goto -23 -> 216
    //   242: astore 6
    //   244: goto -36 -> 208
    //   247: astore 9
    //   249: goto -87 -> 162
    //
    // Exception table:
    //   from	to	target	type
    //   127	131	144	java/io/IOException
    //   44	51	157	java/io/IOException
    //   174	178	190	java/io/IOException
    //   44	51	203	finally
    //   212	216	229	java/io/IOException
    //   55	97	242	finally
    //   105	112	242	finally
    //   112	123	242	finally
    //   162	170	242	finally
    //   55	97	247	java/io/IOException
    //   105	112	247	java/io/IOException
    //   112	123	247	java/io/IOException
  }

  private URL a(d paramd)
  {
    String str;
    if (paramd.e())
      str = as.h() + as.j();
    try
    {
      while (true)
      {
        URL localURL = new URL(str);
        return localURL;
        str = as.i() + as.j();
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      e("Error trying to parse the hardcoded host url", localMalformedURLException);
    }
    return null;
  }

  private URL a(d paramd, String paramString)
  {
    String str;
    if (paramd.e())
      str = as.h() + as.j() + "?" + paramString;
    try
    {
      while (true)
      {
        URL localURL = new URL(str);
        return localURL;
        str = as.i() + as.j() + "?" + paramString;
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      e("Error trying to parse the hardcoded host url", localMalformedURLException);
    }
    return null;
  }

  private static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if (paramStringBuilder.length() != 0)
      paramStringBuilder.append('&');
    paramStringBuilder.append(URLEncoder.encode(paramString1, "UTF-8"));
    paramStringBuilder.append('=');
    paramStringBuilder.append(URLEncoder.encode(paramString2, "UTF-8"));
  }

  private void a(HttpURLConnection paramHttpURLConnection)
  {
    InputStream localInputStream = null;
    try
    {
      localInputStream = paramHttpURLConnection.getInputStream();
      byte[] arrayOfByte = new byte[1024];
      int i;
      do
        i = localInputStream.read(arrayOfByte);
      while (i > 0);
      if (localInputStream != null);
      try
      {
        localInputStream.close();
        return;
      }
      catch (IOException localIOException2)
      {
        e("Error closing http connection input stream", localIOException2);
        return;
      }
    }
    finally
    {
      if (localInputStream == null);
    }
    try
    {
      localInputStream.close();
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      while (true)
        e("Error closing http connection input stream", localIOException1);
    }
  }

  // ERROR //
  private int b(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: invokestatic 85	android/support/v4/app/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_2
    //   8: invokestatic 85	android/support/v4/app/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: new 246	java/io/ByteArrayOutputStream
    //   15: dup
    //   16: invokespecial 247	java/io/ByteArrayOutputStream:<init>	()V
    //   19: astore 6
    //   21: new 249	java/util/zip/GZIPOutputStream
    //   24: dup
    //   25: aload 6
    //   27: invokespecial 252	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   30: astore 7
    //   32: aload 7
    //   34: aload_2
    //   35: invokevirtual 253	java/util/zip/GZIPOutputStream:write	([B)V
    //   38: aload 7
    //   40: invokevirtual 254	java/util/zip/GZIPOutputStream:close	()V
    //   43: aload 6
    //   45: invokevirtual 255	java/io/ByteArrayOutputStream:close	()V
    //   48: aload 6
    //   50: invokevirtual 258	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   53: astore 14
    //   55: aload_0
    //   56: ldc_w 260
    //   59: aload 14
    //   61: arraylength
    //   62: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   65: ldc2_w 261
    //   68: aload 14
    //   70: arraylength
    //   71: i2l
    //   72: lmul
    //   73: aload_2
    //   74: arraylength
    //   75: i2l
    //   76: ldiv
    //   77: invokestatic 267	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   80: aload_1
    //   81: invokevirtual 270	com/google/android/gms/analytics/internal/h:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   84: aload 14
    //   86: arraylength
    //   87: aload_2
    //   88: arraylength
    //   89: if_icmple +21 -> 110
    //   92: aload_0
    //   93: ldc_w 272
    //   96: aload 14
    //   98: arraylength
    //   99: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   102: aload_2
    //   103: arraylength
    //   104: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   107: invokevirtual 274	com/google/android/gms/analytics/internal/h:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   110: invokestatic 140	com/google/android/gms/analytics/internal/h:x	()Z
    //   113: ifeq +33 -> 146
    //   116: aload_0
    //   117: ldc_w 276
    //   120: new 185	java/lang/StringBuilder
    //   123: dup
    //   124: ldc 14
    //   126: invokespecial 277	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   129: new 16	java/lang/String
    //   132: dup
    //   133: aload_2
    //   134: invokespecial 145	java/lang/String:<init>	([B)V
    //   137: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   143: invokevirtual 147	com/google/android/gms/analytics/internal/h:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   146: aload_0
    //   147: aload_1
    //   148: invokespecial 93	com/google/android/gms/analytics/internal/h:b	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   151: astore 15
    //   153: aload 15
    //   155: astore 9
    //   157: aload 9
    //   159: iconst_1
    //   160: invokevirtual 151	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   163: aload 9
    //   165: ldc_w 279
    //   168: ldc_w 281
    //   171: invokevirtual 285	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: aload 9
    //   176: aload 14
    //   178: arraylength
    //   179: invokevirtual 155	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   182: aload 9
    //   184: invokevirtual 98	java/net/HttpURLConnection:connect	()V
    //   187: aload 9
    //   189: invokevirtual 159	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   192: astore 16
    //   194: aload 16
    //   196: aload 14
    //   198: invokevirtual 164	java/io/OutputStream:write	([B)V
    //   201: aload 16
    //   203: invokevirtual 169	java/io/OutputStream:close	()V
    //   206: aload_0
    //   207: aload 9
    //   209: invokespecial 101	com/google/android/gms/analytics/internal/h:a	(Ljava/net/HttpURLConnection;)V
    //   212: aload 9
    //   214: invokevirtual 105	java/net/HttpURLConnection:getResponseCode	()I
    //   217: istore 17
    //   219: iload 17
    //   221: sipush 200
    //   224: if_icmpne +10 -> 234
    //   227: aload_0
    //   228: invokevirtual 109	com/google/android/gms/analytics/internal/h:p	()Lcom/google/android/gms/analytics/internal/o;
    //   231: invokevirtual 114	com/google/android/gms/analytics/internal/o:f	()V
    //   234: aload_0
    //   235: ldc 166
    //   237: iload 17
    //   239: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   242: invokevirtual 90	com/google/android/gms/analytics/internal/h:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   245: aload 9
    //   247: ifnull +8 -> 255
    //   250: aload 9
    //   252: invokevirtual 125	java/net/HttpURLConnection:disconnect	()V
    //   255: iload 17
    //   257: ireturn
    //   258: astore 11
    //   260: aconst_null
    //   261: astore 12
    //   263: aload_0
    //   264: ldc_w 287
    //   267: aload 11
    //   269: invokevirtual 130	com/google/android/gms/analytics/internal/h:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   272: aload_3
    //   273: ifnull +7 -> 280
    //   276: aload_3
    //   277: invokevirtual 169	java/io/OutputStream:close	()V
    //   280: aload 12
    //   282: ifnull +8 -> 290
    //   285: aload 12
    //   287: invokevirtual 125	java/net/HttpURLConnection:disconnect	()V
    //   290: iconst_0
    //   291: ireturn
    //   292: astore 13
    //   294: aload_0
    //   295: ldc_w 289
    //   298: aload 13
    //   300: invokevirtual 174	com/google/android/gms/analytics/internal/h:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   303: goto -23 -> 280
    //   306: astore 8
    //   308: aconst_null
    //   309: astore 9
    //   311: aload_3
    //   312: ifnull +7 -> 319
    //   315: aload_3
    //   316: invokevirtual 169	java/io/OutputStream:close	()V
    //   319: aload 9
    //   321: ifnull +8 -> 329
    //   324: aload 9
    //   326: invokevirtual 125	java/net/HttpURLConnection:disconnect	()V
    //   329: aload 8
    //   331: athrow
    //   332: astore 10
    //   334: aload_0
    //   335: ldc_w 289
    //   338: aload 10
    //   340: invokevirtual 174	com/google/android/gms/analytics/internal/h:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   343: goto -24 -> 319
    //   346: astore 8
    //   348: aconst_null
    //   349: astore_3
    //   350: goto -39 -> 311
    //   353: astore 8
    //   355: aload 16
    //   357: astore_3
    //   358: goto -47 -> 311
    //   361: astore 8
    //   363: aload 12
    //   365: astore 9
    //   367: goto -56 -> 311
    //   370: astore 11
    //   372: aload 9
    //   374: astore 12
    //   376: aconst_null
    //   377: astore_3
    //   378: goto -115 -> 263
    //   381: astore 11
    //   383: aload 16
    //   385: astore_3
    //   386: aload 9
    //   388: astore 12
    //   390: goto -127 -> 263
    //
    // Exception table:
    //   from	to	target	type
    //   12	110	258	java/io/IOException
    //   110	146	258	java/io/IOException
    //   146	153	258	java/io/IOException
    //   276	280	292	java/io/IOException
    //   12	110	306	finally
    //   110	146	306	finally
    //   146	153	306	finally
    //   315	319	332	java/io/IOException
    //   157	194	346	finally
    //   206	219	346	finally
    //   227	234	346	finally
    //   234	245	346	finally
    //   194	206	353	finally
    //   263	272	361	finally
    //   157	194	370	java/io/IOException
    //   206	219	370	java/io/IOException
    //   227	234	370	java/io/IOException
    //   234	245	370	java/io/IOException
    //   194	206	381	java/io/IOException
  }

  private HttpURLConnection b(URL paramURL)
  {
    URLConnection localURLConnection = paramURL.openConnection();
    if (!(localURLConnection instanceof HttpURLConnection))
      throw new IOException("Failed to obtain http connection");
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURLConnection;
    localHttpURLConnection.setDefaultUseCaches(false);
    localHttpURLConnection.setConnectTimeout(((Integer)az.w.a()).intValue());
    localHttpURLConnection.setReadTimeout(((Integer)az.x.a()).intValue());
    localHttpURLConnection.setInstanceFollowRedirects(false);
    localHttpURLConnection.setRequestProperty("User-Agent", this.a);
    localHttpURLConnection.setDoInput(true);
    return localHttpURLConnection;
  }

  private List<Long> b(List<d> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    d locald;
    boolean bool;
    label58: String str1;
    int i;
    if (localIterator.hasNext())
    {
      locald = (d)localIterator.next();
      android.support.v4.app.d.a(locald);
      if (locald.e())
        break label122;
      bool = true;
      str1 = a(locald, bool);
      if (str1 != null)
        break label128;
      l().a(locald, "Error formatting hit for upload");
      i = 1;
    }
    while (true)
    {
      if (i != 0)
      {
        localArrayList.add(Long.valueOf(locald.c()));
        if (localArrayList.size() < as.f())
          break;
      }
      return localArrayList;
      label122: bool = false;
      break label58;
      label128: URL localURL2;
      if (str1.length() <= ((Integer)az.o.a()).intValue())
      {
        localURL2 = a(locald, str1);
        if (localURL2 == null)
          g("Failed to build collect GET endpoint url");
      }
      byte[] arrayOfByte;
      URL localURL1;
      label298: 
      do
        while (true)
        {
          i = 0;
          break;
          if (a(localURL2) == 200)
          {
            i = 1;
            break;
          }
          i = 0;
          break;
          String str2 = a(locald, false);
          if (str2 == null)
          {
            l().a(locald, "Error formatting hit for POST upload");
            i = 1;
            break;
          }
          arrayOfByte = str2.getBytes();
          if (arrayOfByte.length > ((Integer)az.s.a()).intValue())
          {
            l().a(locald, "Hit payload exceeds size limit");
            i = 1;
            break;
          }
          localURL1 = a(locald);
          if (localURL1 != null)
            break label298;
          g("Failed to build collect POST endpoint url");
        }
      while (a(localURL1, arrayOfByte) != 200);
      i = 1;
    }
  }

  private URL d()
  {
    String str = as.h() + (String)az.n.a();
    try
    {
      URL localURL = new URL(str);
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      e("Error trying to parse the hardcoded host url", localMalformedURLException);
    }
    return null;
  }

  final String a(d paramd, boolean paramBoolean)
  {
    android.support.v4.app.d.a(paramd);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      Iterator localIterator = paramd.b().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str2 = (String)localEntry.getKey();
        if (("ht".equals(str2)) || ("qt".equals(str2)) || ("AppUID".equals(str2)) || ("z".equals(str2)) || ("_gmsv".equals(str2)))
          continue;
        a(localStringBuilder, str2, (String)localEntry.getValue());
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      e("Failed to encode name or value", localUnsupportedEncodingException);
      return null;
    }
    a(localStringBuilder, "ht", String.valueOf(paramd.d()));
    a(localStringBuilder, "qt", String.valueOf(j().a() - paramd.d()));
    long l;
    if (paramBoolean)
    {
      l = paramd.f();
      if (l == 0L)
        break label232;
    }
    label232: String str1;
    for (Object localObject = String.valueOf(l); ; localObject = str1)
    {
      a(localStringBuilder, "z", (String)localObject);
      return localStringBuilder.toString();
      str1 = String.valueOf(paramd.c());
    }
  }

  public final List<Long> a(List<d> paramList)
  {
    boolean bool1 = true;
    w.r();
    z();
    android.support.v4.app.d.a(paramList);
    int i;
    boolean bool2;
    if ((m().k().isEmpty()) || (!this.b.a(1000L * ((Integer)az.v.a()).intValue())))
    {
      i = 0;
      bool2 = false;
      if (i == 0)
        break label377;
      if (paramList.isEmpty())
        break label230;
    }
    i locali;
    ArrayList localArrayList;
    while (true)
    {
      android.support.v4.app.d.b(bool1);
      a("Uploading batched hits. compression, count", Boolean.valueOf(bool2), Integer.valueOf(paramList.size()));
      locali = new i(this);
      localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (!locali.a(locald))
          break;
        localArrayList.add(Long.valueOf(locald.c()));
      }
      if (zzm.zzbc((String)az.p.a()) != zzm.zzKz);
      for (i = bool1; ; i = 0)
      {
        if (zzo.zzbd((String)az.q.a()) != zzo.zzKL)
          break label228;
        bool2 = bool1;
        break;
      }
      label228: break;
      label230: bool1 = false;
    }
    if (locali.a() == 0)
      return localArrayList;
    URL localURL = d();
    if (localURL == null)
      g("Failed to build batching endpoint url");
    while (true)
    {
      return Collections.emptyList();
      if (bool2);
      for (int j = b(localURL, locali.b()); 200 == j; j = a(localURL, locali.b()))
      {
        a("Batched upload completed. Hits batched", Integer.valueOf(locali.a()));
        return localArrayList;
      }
      a("Network error uploading hits. status code", Integer.valueOf(j));
      if (!m().k().contains(Integer.valueOf(j)))
        continue;
      f("Server instructed the client to stop batching");
      this.b.a();
    }
    label377: return b(paramList);
  }

  protected final void a()
  {
    a("Network initialized. User agent", this.a);
  }

  public final boolean b()
  {
    w.r();
    z();
    ConnectivityManager localConnectivityManager = (ConnectivityManager)k().getSystemService("connectivity");
    try
    {
      NetworkInfo localNetworkInfo2 = localConnectivityManager.getActiveNetworkInfo();
      localNetworkInfo1 = localNetworkInfo2;
      if ((localNetworkInfo1 == null) || (!localNetworkInfo1.isConnected()))
      {
        c("No network connectivity");
        return false;
      }
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
        NetworkInfo localNetworkInfo1 = null;
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.h
 * JD-Core Version:    0.6.0
 */