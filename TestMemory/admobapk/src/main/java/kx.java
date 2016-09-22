import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public final class kx
  implements lc
{
  private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  private static final AtomicReference b = new AtomicReference();
  private final boolean c;
  private final int d;
  private final int e;
  private final String f;
  private final lv g;
  private final HashMap h;
  private final lm i;
  private kv j;
  private HttpURLConnection k;
  private InputStream l;
  private boolean m;
  private long n;
  private long o;
  private long p;
  private long q;

  public kx(String paramString, lv paramlv, lm paramlm, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException();
    this.f = paramString;
    this.g = null;
    this.i = paramlm;
    this.h = new HashMap();
    this.d = 8000;
    this.e = 8000;
    this.c = paramBoolean;
  }

  // ERROR //
  private static long a(HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: ldc2_w 86
    //   3: lstore_1
    //   4: aload_0
    //   5: ldc 89
    //   7: invokevirtual 95	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   10: astore_3
    //   11: aload_3
    //   12: invokestatic 62	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   15: ifne +12 -> 27
    //   18: aload_3
    //   19: invokestatic 101	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   22: lstore 19
    //   24: lload 19
    //   26: lstore_1
    //   27: aload_0
    //   28: ldc 103
    //   30: invokevirtual 95	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   33: astore 4
    //   35: aload 4
    //   37: invokestatic 62	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   40: ifne +61 -> 101
    //   43: getstatic 47	kx:a	Ljava/util/regex/Pattern;
    //   46: aload 4
    //   48: invokevirtual 107	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   51: astore 5
    //   53: aload 5
    //   55: invokevirtual 113	java/util/regex/Matcher:find	()Z
    //   58: ifeq +43 -> 101
    //   61: aload 5
    //   63: iconst_2
    //   64: invokevirtual 117	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   67: invokestatic 101	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   70: lstore 8
    //   72: aload 5
    //   74: iconst_1
    //   75: invokevirtual 117	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   78: invokestatic 101	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   81: lstore 10
    //   83: lconst_1
    //   84: lload 8
    //   86: lload 10
    //   88: lsub
    //   89: ladd
    //   90: lstore 12
    //   92: lload_1
    //   93: lconst_0
    //   94: lcmp
    //   95: ifge +53 -> 148
    //   98: lload 12
    //   100: lstore_1
    //   101: lload_1
    //   102: lreturn
    //   103: astore 17
    //   105: ldc 119
    //   107: new 121	java/lang/StringBuilder
    //   110: dup
    //   111: bipush 28
    //   113: aload_3
    //   114: invokestatic 127	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   117: invokevirtual 131	java/lang/String:length	()I
    //   120: iadd
    //   121: invokespecial 134	java/lang/StringBuilder:<init>	(I)V
    //   124: ldc 136
    //   126: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: aload_3
    //   130: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: ldc 142
    //   135: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: invokestatic 151	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   144: pop
    //   145: goto -118 -> 27
    //   148: lload_1
    //   149: lload 12
    //   151: lcmp
    //   152: ifeq -51 -> 101
    //   155: ldc 119
    //   157: new 121	java/lang/StringBuilder
    //   160: dup
    //   161: bipush 26
    //   163: aload_3
    //   164: invokestatic 127	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   167: invokevirtual 131	java/lang/String:length	()I
    //   170: iadd
    //   171: aload 4
    //   173: invokestatic 127	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   176: invokevirtual 131	java/lang/String:length	()I
    //   179: iadd
    //   180: invokespecial 134	java/lang/StringBuilder:<init>	(I)V
    //   183: ldc 153
    //   185: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: aload_3
    //   189: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: ldc 155
    //   194: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: aload 4
    //   199: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: ldc 142
    //   204: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: invokestatic 158	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   213: pop
    //   214: lload_1
    //   215: lload 12
    //   217: invokestatic 164	java/lang/Math:max	(JJ)J
    //   220: lstore 15
    //   222: lload 15
    //   224: lreturn
    //   225: astore 6
    //   227: ldc 119
    //   229: new 121	java/lang/StringBuilder
    //   232: dup
    //   233: bipush 27
    //   235: aload 4
    //   237: invokestatic 127	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   240: invokevirtual 131	java/lang/String:length	()I
    //   243: iadd
    //   244: invokespecial 134	java/lang/StringBuilder:<init>	(I)V
    //   247: ldc 166
    //   249: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: aload 4
    //   254: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: ldc 142
    //   259: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   265: invokestatic 151	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   268: pop
    //   269: lload_1
    //   270: lreturn
    //
    // Exception table:
    //   from	to	target	type
    //   18	24	103	java/lang/NumberFormatException
    //   61	83	225	java/lang/NumberFormatException
    //   155	222	225	java/lang/NumberFormatException
  }

  private final HttpURLConnection a(URL paramURL, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
    localHttpURLConnection.setConnectTimeout(this.d);
    localHttpURLConnection.setReadTimeout(this.e);
    localHttpURLConnection.setDoOutput(false);
    synchronized (this.h)
    {
      Iterator localIterator = this.h.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localHttpURLConnection.setRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    monitorexit;
    if ((paramLong1 != 0L) || (paramLong2 != -1L))
    {
      String str1 = 27 + "bytes=" + paramLong1 + "-";
      if (paramLong2 != -1L)
      {
        String str2 = String.valueOf(str1);
        long l1 = paramLong1 + paramLong2 - 1L;
        str1 = 20 + String.valueOf(str2).length() + str2 + l1;
      }
      localHttpURLConnection.setRequestProperty("Range", str1);
    }
    localHttpURLConnection.setRequestProperty("User-Agent", this.f);
    if (!paramBoolean)
      localHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
    return localHttpURLConnection;
  }

  private final void b()
  {
    if (this.k != null)
    {
      this.k.disconnect();
      this.k = null;
    }
  }

  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while (true)
    {
      byte[] arrayOfByte;
      int i3;
      try
      {
        if (this.p == this.n)
          break;
        arrayOfByte = (byte[])b.getAndSet(null);
        if (arrayOfByte != null)
          continue;
        arrayOfByte = new byte[4096];
        if (this.p == this.n)
          break label140;
        int i2 = (int)Math.min(this.n - this.p, arrayOfByte.length);
        i3 = this.l.read(arrayOfByte, 0, i2);
        if (Thread.interrupted())
          throw new InterruptedIOException();
      }
      catch (IOException localIOException)
      {
        throw new le(localIOException, this.j);
      }
      if (i3 == -1)
        throw new EOFException();
      this.p += i3;
      continue;
      label140: b.set(arrayOfByte);
    }
    if (this.o != -1L)
      paramInt2 = (int)Math.min(paramInt2, this.o - this.q);
    while (true)
    {
      int i1 = this.l.read(paramArrayOfByte, paramInt1, paramInt2);
      if (i1 == -1)
      {
        if ((this.o == -1L) || (this.o == this.q))
          break;
        throw new EOFException();
      }
      else
      {
        this.q += i1;
        return i1;
        if (paramInt2 == 0)
          return -1;
      }
    }
    return -1;
  }

  public final long a(kv paramkv)
  {
    this.j = paramkv;
    this.q = 0L;
    this.p = 0L;
    try
    {
      localObject = new URL(paramkv.a.toString());
      l1 = paramkv.b;
      l2 = paramkv.c;
      if ((0x1 & paramkv.d) != 0)
      {
        bool = true;
        if (this.c)
          break label142;
        localHttpURLConnection = a((URL)localObject, l1, l2, bool);
        localHttpURLConnection.connect();
        this.k = localHttpURLConnection;
      }
    }
    catch (IOException localIOException1)
    {
      try
      {
        HttpURLConnection localHttpURLConnection;
        label142: int i3;
        do
        {
          long l1;
          long l2;
          boolean bool;
          while (true)
          {
            i4 = this.k.getResponseCode();
            if ((i4 >= 200) && (i4 <= 299))
              break;
            Map localMap = this.k.getHeaderFields();
            b();
            throw new lg(i4, localMap, paramkv);
            bool = false;
          }
          i1 = 0;
          i2 = i1 + 1;
          if (i1 > 20)
            break;
          localHttpURLConnection = a((URL)localObject, l1, l2, bool);
          localHttpURLConnection.setInstanceFollowRedirects(false);
          localHttpURLConnection.connect();
          i3 = localHttpURLConnection.getResponseCode();
        }
        while ((i3 != 300) && (i3 != 301) && (i3 != 302) && (i3 != 303) && (i3 != 307) && (i3 != 308));
        String str3 = localHttpURLConnection.getHeaderField("Location");
        localHttpURLConnection.disconnect();
        String str1;
        if (str3 == null)
        {
          throw new ProtocolException("Null location redirect");
          localIOException1 = localIOException1;
          str1 = String.valueOf(paramkv.a.toString());
          if (str1.length() == 0)
            break label433;
        }
        label433: for (String str2 = "Unable to connect to ".concat(str1); ; str2 = new String("Unable to connect to "))
        {
          throw new le(str2, localIOException1, paramkv);
          localURL = new URL((URL)localObject, str3);
          String str4 = localURL.getProtocol();
          if (("https".equals(str4)) || ("http".equals(str4)))
            break;
          String str5 = String.valueOf(str4);
          if (str5.length() != 0);
          for (String str6 = "Unsupported protocol redirect: ".concat(str5); ; str6 = new String("Unsupported protocol redirect: "))
            throw new ProtocolException(str6);
          throw new NoRouteToHostException(31 + "Too many redirects: " + i2);
        }
      }
      catch (IOException localIOException2)
      {
        while (true)
        {
          int i4;
          int i2;
          URL localURL;
          b();
          String str7 = String.valueOf(paramkv.a.toString());
          if (str7.length() != 0);
          for (String str8 = "Unable to connect to ".concat(str7); ; str8 = new String("Unable to connect to "))
            throw new le(str8, localIOException2, paramkv);
          String str9 = this.k.getContentType();
          if ((this.g != null) && (!this.g.a(str9)))
          {
            b();
            throw new lf(str9, paramkv);
          }
          long l3;
          if ((i4 == 200) && (paramkv.b != 0L))
            l3 = paramkv.b;
          while (true)
          {
            this.n = l3;
            long l4;
            long l5;
            if ((0x1 & paramkv.d) == 0)
            {
              l4 = a(this.k);
              if (paramkv.c != -1L)
              {
                l5 = paramkv.c;
                label621: this.o = l5;
              }
            }
            try
            {
              while (true)
              {
                this.l = this.k.getInputStream();
                this.m = true;
                return this.o;
                l3 = 0L;
                break;
                if (l4 != -1L)
                {
                  l5 = l4 - this.n;
                  break label621;
                }
                l5 = -1L;
                break label621;
                this.o = paramkv.c;
              }
            }
            catch (IOException localIOException3)
            {
              b();
              throw new le(localIOException3, paramkv);
            }
          }
          Object localObject = localURL;
          int i1 = i2;
        }
      }
    }
  }

  // ERROR //
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 252	kx:l	Ljava/io/InputStream;
    //   4: ifnull +85 -> 89
    //   7: aload_0
    //   8: getfield 231	kx:k	Ljava/net/HttpURLConnection;
    //   11: astore_2
    //   12: aload_0
    //   13: getfield 281	kx:o	J
    //   16: ldc2_w 86
    //   19: lcmp
    //   20: ifne +86 -> 106
    //   23: aload_0
    //   24: getfield 281	kx:o	J
    //   27: lstore 7
    //   29: getstatic 388	ly:a	I
    //   32: bipush 19
    //   34: if_icmpeq +15 -> 49
    //   37: getstatic 388	ly:a	I
    //   40: istore 17
    //   42: iload 17
    //   44: bipush 20
    //   46: if_icmpne +31 -> 77
    //   49: aload_2
    //   50: invokevirtual 380	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   53: astore 12
    //   55: lload 7
    //   57: ldc2_w 86
    //   60: lcmp
    //   61: ifne +65 -> 126
    //   64: aload 12
    //   66: invokevirtual 390	java/io/InputStream:read	()I
    //   69: istore 13
    //   71: iload 13
    //   73: iconst_m1
    //   74: if_icmpne +61 -> 135
    //   77: aload_0
    //   78: getfield 252	kx:l	Ljava/io/InputStream;
    //   81: invokevirtual 393	java/io/InputStream:close	()V
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 252	kx:l	Ljava/io/InputStream;
    //   89: aload_0
    //   90: getfield 382	kx:m	Z
    //   93: ifeq +12 -> 105
    //   96: aload_0
    //   97: iconst_0
    //   98: putfield 382	kx:m	Z
    //   101: aload_0
    //   102: invokespecial 314	kx:b	()V
    //   105: return
    //   106: aload_0
    //   107: getfield 281	kx:o	J
    //   110: lstore_3
    //   111: aload_0
    //   112: getfield 283	kx:q	J
    //   115: lstore 5
    //   117: lload_3
    //   118: lload 5
    //   120: lsub
    //   121: lstore 7
    //   123: goto -94 -> 29
    //   126: lload 7
    //   128: ldc2_w 394
    //   131: lcmp
    //   132: ifle -55 -> 77
    //   135: aload 12
    //   137: invokevirtual 399	java/lang/Object:getClass	()Ljava/lang/Class;
    //   140: invokevirtual 404	java/lang/Class:getName	()Ljava/lang/String;
    //   143: astore 14
    //   145: aload 14
    //   147: ldc_w 406
    //   150: invokevirtual 349	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   153: ifne +14 -> 167
    //   156: aload 14
    //   158: ldc_w 408
    //   161: invokevirtual 349	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   164: ifeq -87 -> 77
    //   167: aload 12
    //   169: invokevirtual 399	java/lang/Object:getClass	()Ljava/lang/Class;
    //   172: invokevirtual 411	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   175: ldc_w 413
    //   178: iconst_0
    //   179: anewarray 401	java/lang/Class
    //   182: invokevirtual 417	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   185: astore 15
    //   187: aload 15
    //   189: iconst_1
    //   190: invokevirtual 422	java/lang/reflect/Method:setAccessible	(Z)V
    //   193: aload 15
    //   195: aload 12
    //   197: iconst_0
    //   198: anewarray 4	java/lang/Object
    //   201: invokevirtual 426	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   204: pop
    //   205: goto -128 -> 77
    //   208: astore 11
    //   210: goto -133 -> 77
    //   213: astore 10
    //   215: new 267	le
    //   218: dup
    //   219: aload 10
    //   221: aload_0
    //   222: getfield 269	kx:j	Lkv;
    //   225: invokespecial 272	le:<init>	(Ljava/io/IOException;Lkv;)V
    //   228: athrow
    //   229: astore_1
    //   230: aload_0
    //   231: getfield 382	kx:m	Z
    //   234: ifeq +12 -> 246
    //   237: aload_0
    //   238: iconst_0
    //   239: putfield 382	kx:m	Z
    //   242: aload_0
    //   243: invokespecial 314	kx:b	()V
    //   246: aload_1
    //   247: athrow
    //   248: astore 9
    //   250: goto -173 -> 77
    //
    // Exception table:
    //   from	to	target	type
    //   49	55	208	java/io/IOException
    //   64	71	208	java/io/IOException
    //   135	167	208	java/io/IOException
    //   167	205	208	java/io/IOException
    //   77	84	213	java/io/IOException
    //   0	29	229	finally
    //   29	42	229	finally
    //   49	55	229	finally
    //   64	71	229	finally
    //   77	84	229	finally
    //   84	89	229	finally
    //   106	117	229	finally
    //   135	167	229	finally
    //   167	205	229	finally
    //   215	229	229	finally
    //   49	55	248	java/lang/Exception
    //   64	71	248	java/lang/Exception
    //   135	167	248	java/lang/Exception
    //   167	205	248	java/lang/Exception
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     kx
 * JD-Core Version:    0.6.0
 */