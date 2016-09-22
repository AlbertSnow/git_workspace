package com.tencent.open.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.io.WriteAbortedException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.charset.MalformedInputException;
import java.nio.charset.UnmappableCharacterException;
import java.security.KeyStore;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.apache.http.ConnectionClosedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static String c;
  private String a;
  private d b;
  private long d;
  private Handler e;
  private Runnable f = new c(this);

  public a(Activity paramActivity)
  {
    this.e = new b(this, paramActivity.getMainLooper());
  }

  private static int a(Context paramContext)
  {
    int i = -1;
    if (Build.VERSION.SDK_INT < 11)
      if (paramContext != null)
      {
        i = Proxy.getPort(paramContext);
        if (i < 0)
          i = Proxy.getDefaultPort();
      }
    String str;
    do
    {
      return i;
      return Proxy.getDefaultPort();
      str = System.getProperty("http.proxyPort");
    }
    while (TextUtils.isEmpty(str));
    try
    {
      int j = Integer.parseInt(str);
      return j;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return i;
  }

  public static int a(IOException paramIOException)
  {
    if ((paramIOException instanceof CharConversionException))
      return -20;
    if ((paramIOException instanceof MalformedInputException))
      return -21;
    if ((paramIOException instanceof UnmappableCharacterException))
      return -22;
    if ((paramIOException instanceof HttpResponseException))
      return -23;
    if ((paramIOException instanceof ClosedChannelException))
      return -24;
    if ((paramIOException instanceof ConnectionClosedException))
      return -25;
    if ((paramIOException instanceof EOFException))
      return -26;
    if ((paramIOException instanceof FileLockInterruptionException))
      return -27;
    if ((paramIOException instanceof FileNotFoundException))
      return -28;
    if ((paramIOException instanceof HttpRetryException))
      return -29;
    if ((paramIOException instanceof ConnectTimeoutException))
      return -7;
    if ((paramIOException instanceof SocketTimeoutException))
      return -8;
    if ((paramIOException instanceof InvalidPropertiesFormatException))
      return -30;
    if ((paramIOException instanceof MalformedChunkCodingException))
      return -31;
    if ((paramIOException instanceof MalformedURLException))
      return -3;
    if ((paramIOException instanceof NoHttpResponseException))
      return -32;
    if ((paramIOException instanceof InvalidClassException))
      return -33;
    if ((paramIOException instanceof InvalidObjectException))
      return -34;
    if ((paramIOException instanceof NotActiveException))
      return -35;
    if ((paramIOException instanceof NotSerializableException))
      return -36;
    if ((paramIOException instanceof OptionalDataException))
      return -37;
    if ((paramIOException instanceof StreamCorruptedException))
      return -38;
    if ((paramIOException instanceof WriteAbortedException))
      return -39;
    if ((paramIOException instanceof ProtocolException))
      return -40;
    if ((paramIOException instanceof SSLHandshakeException))
      return -41;
    if ((paramIOException instanceof SSLKeyException))
      return -42;
    if ((paramIOException instanceof SSLPeerUnverifiedException))
      return -43;
    if ((paramIOException instanceof SSLProtocolException))
      return -44;
    if ((paramIOException instanceof BindException))
      return -45;
    if ((paramIOException instanceof ConnectException))
      return -46;
    if ((paramIOException instanceof NoRouteToHostException))
      return -47;
    if ((paramIOException instanceof PortUnreachableException))
      return -48;
    if ((paramIOException instanceof SyncFailedException))
      return -49;
    if ((paramIOException instanceof UTFDataFormatException))
      return -50;
    if ((paramIOException instanceof UnknownHostException))
      return -51;
    if ((paramIOException instanceof UnknownServiceException))
      return -52;
    if ((paramIOException instanceof UnsupportedEncodingException))
      return -53;
    if ((paramIOException instanceof ZipException))
      return -54;
    return -2;
  }

  public static Bitmap a(String paramString)
  {
    com.tencent.open.a.f.a("AsynLoadImg", "getbitmap:" + paramString);
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
      localHttpURLConnection.setDoInput(true);
      localHttpURLConnection.connect();
      InputStream localInputStream = localHttpURLConnection.getInputStream();
      Bitmap localBitmap = BitmapFactory.decodeStream(localInputStream);
      localInputStream.close();
      com.tencent.open.a.f.a("AsynLoadImg", "image download finished." + paramString);
      return localBitmap;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      com.tencent.open.a.f.a("AsynLoadImg", "getbitmap bmp fail---");
      return null;
    }
    catch (IOException localIOException)
    {
      com.tencent.open.a.f.a("AsynLoadImg", "getbitmap bmp fail---");
    }
    return null;
  }

  public static q a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramContext != null)
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localConnectivityManager != null)
      {
        NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
        if ((localNetworkInfo == null) || (!localNetworkInfo.isAvailable()))
          throw new HttpUtils.NetworkUnavailableException("network unavailable");
      }
    }
    Bundle localBundle1;
    HttpClient localHttpClient;
    String str5;
    label170: Object localObject1;
    int i;
    if (paramBundle != null)
    {
      localBundle1 = new Bundle(paramBundle);
      String str1 = localBundle1.getString("appid_for_getting_config");
      localBundle1.remove("appid_for_getting_config");
      localHttpClient = a(paramContext, str1);
      if (!paramString2.equals("GET"))
        break label340;
      String str4 = a(localBundle1);
      int n = 0 + str4.length();
      com.tencent.open.a.f.a("openSDK_LOG.HttpUtils", "-->openUrl2 before url =" + paramString1);
      if (paramString1.indexOf("?") != -1)
        break label315;
      str5 = paramString1 + "?";
      com.tencent.open.a.f.a("openSDK_LOG.HttpUtils", "-->openUrl2 encodedParam =" + str4 + " -- url = " + str5);
      HttpGet localHttpGet = new HttpGet(str5 + str4);
      localHttpGet.addHeader("Accept-Encoding", "gzip");
      localObject1 = localHttpGet;
      i = n;
    }
    int j;
    while (true)
    {
      HttpResponse localHttpResponse = localHttpClient.execute((HttpUriRequest)localObject1);
      j = localHttpResponse.getStatusLine().getStatusCode();
      if (j != 200)
        break label749;
      return new q(a(localHttpResponse), i);
      localBundle1 = new Bundle();
      break;
      label315: str5 = paramString1 + "&";
      break label170;
      label340: boolean bool = paramString2.equals("POST");
      i = 0;
      localObject1 = null;
      if (!bool)
        continue;
      HttpPost localHttpPost = new HttpPost(paramString1);
      localHttpPost.addHeader("Accept-Encoding", "gzip");
      Bundle localBundle2 = new Bundle();
      Iterator localIterator1 = localBundle1.keySet().iterator();
      while (localIterator1.hasNext())
      {
        String str3 = (String)localIterator1.next();
        Object localObject2 = localBundle1.get(str3);
        if (!(localObject2 instanceof byte[]))
          continue;
        localBundle2.putByteArray(str3, (byte[])localObject2);
      }
      if (!localBundle1.containsKey("method"))
        localBundle1.putString("method", paramString2);
      localHttpPost.setHeader("Content-Type", "multipart/form-data; boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
      localHttpPost.setHeader("Connection", "Keep-Alive");
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      localByteArrayOutputStream.write(o.j("--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
      localByteArrayOutputStream.write(o.j(a(localBundle1, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f")));
      if (!localBundle2.isEmpty())
      {
        int k = localBundle2.size();
        localByteArrayOutputStream.write(o.j("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
        Iterator localIterator2 = localBundle2.keySet().iterator();
        int m = -1;
        while (localIterator2.hasNext())
        {
          String str2 = (String)localIterator2.next();
          m++;
          localByteArrayOutputStream.write(o.j("Content-Disposition: form-data; name=\"" + str2 + "\"; filename=\"" + str2 + "\"\r\n"));
          localByteArrayOutputStream.write(o.j("Content-Type: content/unknown\r\n\r\n"));
          byte[] arrayOfByte2 = localBundle2.getByteArray(str2);
          if (arrayOfByte2 != null)
            localByteArrayOutputStream.write(arrayOfByte2);
          if (m >= k - 1)
            continue;
          localByteArrayOutputStream.write(o.j("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
        }
      }
      localByteArrayOutputStream.write(o.j("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f--\r\n"));
      byte[] arrayOfByte1 = localByteArrayOutputStream.toByteArray();
      i = 0 + arrayOfByte1.length;
      localByteArrayOutputStream.close();
      localHttpPost.setEntity(new ByteArrayEntity(arrayOfByte1));
      localObject1 = localHttpPost;
    }
    label749: throw new HttpUtils.HttpStatusException("http status code error:" + j);
  }

  public static String a(Bundle paramBundle)
  {
    if (paramBundle == null)
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    int i = 1;
    String str;
    label86: String[] arrayOfString;
    int j;
    while (true)
    {
      if (!localIterator.hasNext())
        break label267;
      str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if ((!(localObject instanceof String)) && (!(localObject instanceof String[])))
        continue;
      if (!(localObject instanceof String[]))
        break label206;
      if (i != 0)
      {
        i = 0;
        localStringBuilder.append(URLEncoder.encode(str) + "=");
        arrayOfString = paramBundle.getStringArray(str);
        if (arrayOfString == null)
          continue;
        j = 0;
        label131: if (j >= arrayOfString.length)
          break;
        if (j != 0)
          break label174;
        localStringBuilder.append(URLEncoder.encode(arrayOfString[j]));
      }
    }
    while (true)
    {
      j++;
      break label131;
      break;
      localStringBuilder.append("&");
      break label86;
      label174: localStringBuilder.append(URLEncoder.encode("," + arrayOfString[j]));
    }
    label206: if (i != 0)
      i = 0;
    while (true)
    {
      localStringBuilder.append(URLEncoder.encode(str) + "=" + URLEncoder.encode(paramBundle.getString(str)));
      break;
      localStringBuilder.append("&");
    }
    label267: return localStringBuilder.toString();
  }

  private static String a(Bundle paramBundle, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramBundle.size();
    Iterator localIterator = paramBundle.keySet().iterator();
    int j = -1;
    while (true)
    {
      int k;
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        k = j + 1;
        Object localObject = paramBundle.get(str);
        if ((localObject instanceof String))
        {
          localStringBuilder.append("Content-Disposition: form-data; name=\"" + str + "\"\r\n\r\n" + (String)localObject);
          if (k < i - 1)
            localStringBuilder.append("\r\n--" + paramString + "\r\n");
          j = k;
          continue;
        }
      }
      else
      {
        return localStringBuilder.toString();
      }
      j = k;
    }
  }

  private static String a(HttpResponse paramHttpResponse)
  {
    InputStream localInputStream = paramHttpResponse.getEntity().getContent();
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    Header localHeader = paramHttpResponse.getFirstHeader("Content-Encoding");
    if ((localHeader != null) && (localHeader.getValue().toLowerCase().indexOf("gzip") >= 0));
    for (Object localObject = new GZIPInputStream(localInputStream); ; localObject = localInputStream)
    {
      byte[] arrayOfByte = new byte[512];
      while (true)
      {
        int i = ((InputStream)localObject).read(arrayOfByte);
        if (i == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      String str = new String(localByteArrayOutputStream.toByteArray(), "UTF-8");
      ((InputStream)localObject).close();
      return str;
    }
  }

  public static HttpClient a(Context paramContext, String paramString)
  {
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    if (Build.VERSION.SDK_INT < 16);
    while (true)
    {
      try
      {
        KeyStore localKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        localKeyStore.load(null, null);
        f localf = new f(localKeyStore);
        localf.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        localSchemeRegistry.register(new Scheme("https", localf, 443));
        BasicHttpParams localBasicHttpParams = new BasicHttpParams();
        if (paramContext == null)
          break label487;
        locali = i.a(paramContext, paramString);
        if (locali == null)
          break label478;
        j = locali.a("Common_HttpConnectionTimeout");
        i = locali.a("Common_SocketConnectionTimeout");
        if (j != 0)
          continue;
        j = 15000;
        if (i != 0)
          continue;
        i = 30000;
        HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, j);
        HttpConnectionParams.setSoTimeout(localBasicHttpParams, i);
        HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
        HttpProtocolParams.setUserAgent(localBasicHttpParams, "AndroidSDK_" + Build.VERSION.SDK + "_" + Build.DEVICE + "_" + Build.VERSION.RELEASE);
        DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
        if (paramContext == null)
          break label472;
        ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
        if (localConnectivityManager == null)
          break label472;
        NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
        if ((localNetworkInfo == null) || (localNetworkInfo.getType() != 0))
          break label472;
        if (Build.VERSION.SDK_INT >= 11)
          break label461;
        if (paramContext == null)
          break label453;
        str = Proxy.getHost(paramContext);
        if (!TextUtils.isEmpty(str))
          continue;
        str = Proxy.getDefaultHost();
        int k = a(paramContext);
        if ((TextUtils.isEmpty(str)) || (k < 0))
          break label472;
        localh = new h(str, k, 0);
        if (localh == null)
          continue;
        HttpHost localHttpHost = new HttpHost(localh.a, localh.b);
        localDefaultHttpClient.getParams().setParameter("http.route.default-proxy", localHttpHost);
        return localDefaultHttpClient;
      }
      catch (Exception localException)
      {
        localSchemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        continue;
      }
      localSchemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
      continue;
      label453: String str = Proxy.getDefaultHost();
      continue;
      label461: str = System.getProperty("http.proxyHost");
      continue;
      label472: h localh = null;
      continue;
      label478: int i = 0;
      int j = 0;
      continue;
      label487: i locali = null;
    }
  }

  public static JSONObject a(com.tencent.connect.b.c paramc, Context paramContext, String paramString1, Bundle paramBundle, String paramString2)
  {
    com.tencent.open.a.f.a("openSDK_LOG.HttpUtils", "OpenApi request");
    String str2;
    String str1;
    if (!paramString1.toLowerCase().startsWith("http"))
    {
      str2 = k.a().a(paramContext, "https://openmobile.qq.com/") + paramString1;
      str1 = k.a().a(paramContext, "https://openmobile.qq.com/") + paramString1;
    }
    while (true)
    {
      if ((paramString1.indexOf("add_share") >= 0) || (paramString1.indexOf("upload_pic") >= 0) || (paramString1.indexOf("add_topic") >= 0) || (paramString1.indexOf("set_user_face") >= 0) || (paramString1.indexOf("add_t") >= 0) || (paramString1.indexOf("add_pic_t") >= 0) || (paramString1.indexOf("add_pic_url") >= 0) || (paramString1.indexOf("add_video") >= 0))
        com.tencent.connect.a.a.a(paramContext, paramc, "requireApi", new String[] { paramString1 });
      long l1 = SystemClock.elapsedRealtime();
      int i = i.a(paramContext, paramc.b()).a("Common_HttpRetryCount");
      com.tencent.open.a.f.a("OpenConfig_test", "config 1:Common_HttpRetryCount            config_value:" + i + "   appid:" + paramc.b() + "     url:" + str1);
      int j;
      if (i == 0)
        j = 3;
      while (true)
      {
        com.tencent.open.a.f.a("OpenConfig_test", "config 1:Common_HttpRetryCount            result_value:" + j + "   appid:" + paramc.b() + "     url:" + str1);
        Object localObject1 = null;
        int k = 0;
        long l2 = l1;
        k++;
        try
        {
          q localq = a(paramContext, str2, paramString2, paramBundle);
          JSONObject localJSONObject = o.c(localq.a);
          localObject3 = localJSONObject;
          try
          {
            int i5 = ((JSONObject)localObject3).getInt("ret");
            i4 = i5;
            long l8 = localq.b;
            l7 = localq.c;
            l5 = l8;
            localObject4 = localObject3;
            n = i4;
            com.tencent.open.b.f.a().a(str1, l2, l5, l7, n);
            return localObject4;
            j = i;
          }
          catch (JSONException localJSONException2)
          {
            while (true)
              int i4 = -4;
          }
          catch (ConnectTimeoutException localConnectTimeoutException2)
          {
            while (true)
            {
              localObject2 = localConnectTimeoutException2;
              if (k >= j)
                break label476;
              l2 = SystemClock.elapsedRealtime();
              localObject1 = localObject3;
              m = -7;
              l3 = 0L;
              l4 = 0L;
              if (k < j)
                break;
              long l5 = l4;
              long l6 = l3;
              Object localObject4 = localObject1;
              int n = m;
              long l7 = l6;
            }
            com.tencent.open.b.f.a().a(str1, l2, 0L, 0L, -7);
            throw ((Throwable)localObject2);
          }
          catch (SocketTimeoutException localSocketTimeoutException2)
          {
            while (true)
            {
              label476: localObject5 = localSocketTimeoutException2;
              if (k >= j)
                break;
              l2 = SystemClock.elapsedRealtime();
              localObject1 = localObject3;
              int m = -8;
              long l3 = 0L;
              long l4 = 0L;
            }
            com.tencent.open.b.f.a().a(str1, l2, 0L, 0L, -8);
            throw ((Throwable)localObject5);
          }
        }
        catch (HttpUtils.HttpStatusException localHttpStatusException)
        {
          String str3 = localHttpStatusException.getMessage();
          try
          {
            int i3 = Integer.parseInt(str3.replace("http status code error:", ""));
            i2 = i3;
            com.tencent.open.b.f.a().a(str1, l2, 0L, 0L, i2);
            throw localHttpStatusException;
          }
          catch (Exception localException)
          {
            while (true)
              int i2 = -9;
          }
        }
        catch (HttpUtils.NetworkUnavailableException localNetworkUnavailableException)
        {
          throw localNetworkUnavailableException;
        }
        catch (MalformedURLException localMalformedURLException)
        {
          com.tencent.open.b.f.a().a(str1, l2, 0L, 0L, -3);
          throw localMalformedURLException;
        }
        catch (IOException localIOException)
        {
          int i1 = a(localIOException);
          com.tencent.open.b.f.a().a(str1, l2, 0L, 0L, i1);
          throw localIOException;
        }
        catch (JSONException localJSONException1)
        {
          com.tencent.open.b.f.a().a(str1, l2, 0L, 0L, -4);
          throw localJSONException1;
        }
        catch (SocketTimeoutException localSocketTimeoutException1)
        {
          while (true)
          {
            Object localObject5 = localSocketTimeoutException1;
            localObject3 = localObject1;
          }
        }
        catch (ConnectTimeoutException localConnectTimeoutException1)
        {
          while (true)
          {
            Object localObject2 = localConnectTimeoutException1;
            Object localObject3 = localObject1;
          }
        }
      }
      str1 = paramString1;
      str2 = paramString1;
    }
  }

  public static void a(com.tencent.connect.b.c paramc, Context paramContext, String paramString1, Bundle paramBundle, String paramString2, com.tencent.tauth.a parama)
  {
    com.tencent.open.a.f.a("openSDK_LOG.HttpUtils", "OpenApi requestAsync");
    new e(paramc, paramContext, paramString1, paramBundle, paramString2, parama).start();
  }

  // ERROR //
  public static boolean a(Bitmap paramBitmap, String paramString)
  {
    // Byte code:
    //   0: getstatic 447	com/tencent/open/utils/a:c	Ljava/lang/String;
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: new 780	java/io/File
    //   9: dup
    //   10: aload_2
    //   11: invokespecial 781	java/io/File:<init>	(Ljava/lang/String;)V
    //   14: astore 4
    //   16: aload 4
    //   18: invokevirtual 784	java/io/File:exists	()Z
    //   21: istore 9
    //   23: aconst_null
    //   24: astore_3
    //   25: iload 9
    //   27: ifne +9 -> 36
    //   30: aload 4
    //   32: invokevirtual 787	java/io/File:mkdir	()Z
    //   35: pop
    //   36: new 164	java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial 286	java/lang/StringBuilder:<init>	()V
    //   43: aload_2
    //   44: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload_1
    //   48: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: astore 11
    //   56: ldc 162
    //   58: new 164	java/lang/StringBuilder
    //   61: dup
    //   62: ldc_w 789
    //   65: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   68: aload_1
    //   69: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: invokestatic 182	com/tencent/open/a/f:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: new 791	java/io/BufferedOutputStream
    //   81: dup
    //   82: new 793	java/io/FileOutputStream
    //   85: dup
    //   86: new 780	java/io/File
    //   89: dup
    //   90: aload 11
    //   92: invokespecial 781	java/io/File:<init>	(Ljava/lang/String;)V
    //   95: invokespecial 796	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   98: invokespecial 799	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   101: astore 12
    //   103: aload_0
    //   104: getstatic 805	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   107: bipush 80
    //   109: aload 12
    //   111: invokevirtual 811	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   114: pop
    //   115: aload 12
    //   117: invokevirtual 814	java/io/BufferedOutputStream:flush	()V
    //   120: aload 12
    //   122: invokevirtual 815	java/io/BufferedOutputStream:close	()V
    //   125: iconst_1
    //   126: ireturn
    //   127: astore 7
    //   129: ldc 162
    //   131: ldc_w 817
    //   134: aload 7
    //   136: invokestatic 820	com/tencent/open/a/f:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   139: aload_3
    //   140: ifnull +7 -> 147
    //   143: aload_3
    //   144: invokevirtual 815	java/io/BufferedOutputStream:close	()V
    //   147: iconst_0
    //   148: ireturn
    //   149: astore 5
    //   151: aload_3
    //   152: ifnull +7 -> 159
    //   155: aload_3
    //   156: invokevirtual 815	java/io/BufferedOutputStream:close	()V
    //   159: aload 5
    //   161: athrow
    //   162: astore 14
    //   164: goto -39 -> 125
    //   167: astore 8
    //   169: goto -22 -> 147
    //   172: astore 6
    //   174: goto -15 -> 159
    //   177: astore 5
    //   179: aload 12
    //   181: astore_3
    //   182: goto -31 -> 151
    //   185: astore 7
    //   187: aload 12
    //   189: astore_3
    //   190: goto -61 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   6	23	127	java/io/IOException
    //   30	36	127	java/io/IOException
    //   36	103	127	java/io/IOException
    //   6	23	149	finally
    //   30	36	149	finally
    //   36	103	149	finally
    //   129	139	149	finally
    //   120	125	162	java/io/IOException
    //   143	147	167	java/io/IOException
    //   155	159	172	java/io/IOException
    //   103	120	177	finally
    //   103	120	185	java/io/IOException
  }

  public final void a(String paramString, d paramd)
  {
    com.tencent.open.a.f.a("AsynLoadImg", "--save---");
    if ((paramString == null) || (paramString.equals("")))
    {
      paramd.a(1, null);
      return;
    }
    if (!o.a())
    {
      paramd.a(2, null);
      return;
    }
    c = Environment.getExternalStorageDirectory() + "/tmp/";
    this.d = System.currentTimeMillis();
    this.a = paramString;
    this.b = paramd;
    new Thread(this.f).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.a
 * JD-Core Version:    0.6.0
 */