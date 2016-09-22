package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.f;
import com.android.volley.m;
import com.android.volley.n;
import com.wandoujia.log.toolkit.LaunchLogger;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

public final class a
  implements f
{
  private static boolean a = n.a;
  private static int b = 3000;
  private static int c = 4096;
  private g d;
  private b e;

  public a(g paramg)
  {
    this(paramg, new b(c));
  }

  public a(g paramg, b paramb)
  {
    this.d = paramg;
    this.e = paramb;
  }

  private static Map<String, String> a(Header[] paramArrayOfHeader)
  {
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < paramArrayOfHeader.length; i++)
      localHashMap.put(paramArrayOfHeader[i].getName(), paramArrayOfHeader[i].getValue());
    return localHashMap;
  }

  private static void a(String paramString, Request<?> paramRequest, VolleyError paramVolleyError)
  {
    m localm = paramRequest.q();
    int i = paramRequest.p();
    try
    {
      localm.a(paramVolleyError);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = paramString;
      arrayOfObject2[1] = Integer.valueOf(i);
      paramRequest.a(String.format("%s-retry [timeout=%s]", arrayOfObject2));
      return;
    }
    catch (VolleyError localVolleyError)
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = paramString;
      arrayOfObject1[1] = Integer.valueOf(i);
      paramRequest.a(String.format("%s-timeout-giveup [timeout=%s]", arrayOfObject1));
    }
    throw localVolleyError;
  }

  // ERROR //
  private byte[] a(org.apache.http.HttpEntity paramHttpEntity)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 109 1 0
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +11 -> 19
    //   11: new 111	com/android/volley/ServerError
    //   14: dup
    //   15: invokespecial 112	com/android/volley/ServerError:<init>	()V
    //   18: athrow
    //   19: aload_0
    //   20: getfield 42	com/android/volley/toolbox/a:e	Lcom/android/volley/toolbox/b;
    //   23: aload_2
    //   24: aload_1
    //   25: invokeinterface 116 1 0
    //   30: l2i
    //   31: iconst_0
    //   32: invokestatic 121	android/support/v4/app/b:a	(Lcom/android/volley/toolbox/b;Ljava/io/InputStream;IZ)[B
    //   35: astore 7
    //   37: aload_1
    //   38: invokeinterface 124 1 0
    //   43: aload 7
    //   45: areturn
    //   46: astore 8
    //   48: ldc 126
    //   50: iconst_0
    //   51: anewarray 4	java/lang/Object
    //   54: invokestatic 129	com/android/volley/n:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   57: aload 7
    //   59: areturn
    //   60: astore 5
    //   62: aload_1
    //   63: invokeinterface 124 1 0
    //   68: aconst_null
    //   69: areturn
    //   70: astore 6
    //   72: ldc 126
    //   74: iconst_0
    //   75: anewarray 4	java/lang/Object
    //   78: invokestatic 129	com/android/volley/n:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: goto -13 -> 68
    //   84: astore_3
    //   85: aload_1
    //   86: invokeinterface 124 1 0
    //   91: aload_3
    //   92: athrow
    //   93: astore 4
    //   95: ldc 126
    //   97: iconst_0
    //   98: anewarray 4	java/lang/Object
    //   101: invokestatic 129	com/android/volley/n:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   104: goto -13 -> 91
    //
    // Exception table:
    //   from	to	target	type
    //   37	43	46	java/io/IOException
    //   19	37	60	java/lang/InterruptedException
    //   62	68	70	java/io/IOException
    //   19	37	84	finally
    //   85	91	93	java/io/IOException
  }

  public final com.wandoujia.nirvana.framework.network.a.a a(Request<?> paramRequest)
  {
    long l1 = SystemClock.elapsedRealtime();
    while (true)
    {
      HttpResponse localHttpResponse = null;
      byte[] arrayOfByte = null;
      Object localObject1 = new HashMap();
      try
      {
        HashMap localHashMap = new HashMap();
        LaunchLogger localLaunchLogger = paramRequest.e();
        arrayOfByte = null;
        localHttpResponse = null;
        if (localLaunchLogger != null)
        {
          if (localLaunchLogger.b != null)
            localHashMap.put("If-None-Match", localLaunchLogger.b);
          boolean bool = localLaunchLogger.c < 0L;
          arrayOfByte = null;
          localHttpResponse = null;
          if (bool)
            localHashMap.put("If-Modified-Since", DateUtils.formatDate(new Date(localLaunchLogger.c)));
        }
        localHttpResponse = this.d.a(paramRequest, localHashMap);
        StatusLine localStatusLine = localHttpResponse.getStatusLine();
        int j = localStatusLine.getStatusCode();
        localObject1 = a(localHttpResponse.getAllHeaders());
        arrayOfByte = null;
        if (j == 304)
          return new com.wandoujia.nirvana.framework.network.a.a(paramRequest.e().a, (Map)localObject1, true);
        arrayOfByte = a(localHttpResponse.getEntity());
        long l2 = SystemClock.elapsedRealtime() - l1;
        if ((a) || (l2 > b))
        {
          Object[] arrayOfObject2 = new Object[5];
          arrayOfObject2[0] = paramRequest;
          arrayOfObject2[1] = Long.valueOf(l2);
          if (arrayOfByte != null)
          {
            localObject2 = Integer.valueOf(arrayOfByte.length);
            arrayOfObject2[2] = localObject2;
            arrayOfObject2[3] = Integer.valueOf(localStatusLine.getStatusCode());
            arrayOfObject2[4] = Integer.valueOf(paramRequest.q().b());
            n.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", arrayOfObject2);
          }
        }
        else
        {
          if ((j == 200) || (j == 204))
            break label345;
          throw new IOException();
        }
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        while (true)
        {
          a("socket", paramRequest, new TimeoutError());
          break;
          Object localObject2 = "null";
        }
        com.wandoujia.nirvana.framework.network.a.a locala2 = new com.wandoujia.nirvana.framework.network.a.a(arrayOfByte, (Map)localObject1, false);
        return locala2;
      }
      catch (ConnectTimeoutException localConnectTimeoutException)
      {
        a("connection", paramRequest, new TimeoutError());
      }
      catch (MalformedURLException localMalformedURLException)
      {
        throw new RuntimeException("Bad URL " + paramRequest.c(), localMalformedURLException);
      }
      catch (IOException localIOException)
      {
        label345: com.wandoujia.nirvana.framework.network.a.a locala1;
        if (localHttpResponse != null)
        {
          int i = localHttpResponse.getStatusLine().getStatusCode();
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = Integer.valueOf(i);
          arrayOfObject1[1] = paramRequest.c();
          n.c("Unexpected response code %d for %s", arrayOfObject1);
          if (arrayOfByte == null)
            break label535;
          locala1 = new com.wandoujia.nirvana.framework.network.a.a(arrayOfByte, (Map)localObject1, false);
          if ((i == 401) || (i == 403))
          {
            a("auth", paramRequest, new AuthFailureError(locala1));
            continue;
          }
        }
        else
        {
          throw new NoConnectionError(localIOException);
        }
        throw new ServerError(locala1);
        label535: throw new NetworkError(null);
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
      }
    }
    throw new ParseError();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.a
 * JD-Core Version:    0.6.0
 */