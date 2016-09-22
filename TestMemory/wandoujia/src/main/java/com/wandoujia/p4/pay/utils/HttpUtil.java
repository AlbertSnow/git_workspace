package com.wandoujia.p4.pay.utils;

import java.io.IOException;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

public class HttpUtil
{
  private static final String CHARSET = "UTF-8";
  public static final String NETWORK_ERROR = "NETWORK_ERROR";
  public static final String SERVER_ERROR = "SERVER_ERROR";
  static final String TAG = "HttpUtil";
  private static HttpClient customerHttpClient;

  private static void consumeContent(HttpResponse paramHttpResponse)
  {
    HttpEntity localHttpEntity;
    if (paramHttpResponse != null)
    {
      localHttpEntity = paramHttpResponse.getEntity();
      if (localHttpEntity == null);
    }
    try
    {
      localHttpEntity.consumeContent();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.getMessage();
    }
  }

  public static HttpClient getHttpClient()
  {
    monitorenter;
    try
    {
      if (customerHttpClient == null)
      {
        BasicHttpParams localBasicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
        HttpProtocolParams.setUseExpectContinue(localBasicHttpParams, true);
        HttpProtocolParams.setUserAgent(localBasicHttpParams, "WandouPaySDK,0.1");
        ConnManagerParams.setTimeout(localBasicHttpParams, 1000L);
        HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 8000);
        HttpConnectionParams.setSoTimeout(localBasicHttpParams, 8000);
        SchemeRegistry localSchemeRegistry = new SchemeRegistry();
        KeyStore localKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        localKeyStore.load(null, null);
        HttpUtil.MySSLSocketFactory localMySSLSocketFactory = new HttpUtil.MySSLSocketFactory(localKeyStore);
        localMySSLSocketFactory.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        localSchemeRegistry.register(new Scheme("https", localMySSLSocketFactory, 443));
        customerHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
      }
      HttpClient localHttpClient = customerHttpClient;
      return localHttpClient;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static String post(String paramString, Map<String, String> paramMap, CookieStore paramCookieStore)
  {
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.keySet().iterator();
      String str3;
      for (str1 = ""; localIterator.hasNext(); str1 = str1 + str3 + "=" + (String)paramMap.get(str3) + "&")
        str3 = (String)localIterator.next();
    }
    String str1 = "";
    SLog.w("HttpUtil", paramString + "?" + str1);
    int i = 0;
    String str2;
    if (i < 3)
      str2 = null;
    while (true)
    {
      int j;
      try
      {
        str2 = post0(paramString, paramMap, paramCookieStore);
        SLog.i("post-respone", paramString + ":" + str2);
        int n = i;
        m = 1;
        k = n;
        if (m == 0)
          break label320;
        return str2;
      }
      catch (Exception localException)
      {
        SLog.e("HttpUtil", "count=" + i + "," + paramString + "," + localException.toString());
        j = i + 1;
        new StringBuilder().append(j).append(" times on:").append(paramString);
        if (j != 3)
          break label351;
      }
      if (localException.toString().contains("SERVER_ERROR"))
        throw localException;
      throw new Exception("NETWORK_ERROR:" + localException + "," + paramString, localException);
      label320: i = k;
      break;
      throw new RuntimeException("TimeOut:" + paramString);
      label351: int k = j;
      int m = 0;
    }
  }

  // ERROR //
  public static String post0(String paramString, Map<String, String> paramMap, CookieStore paramCookieStore)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 249	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 250	java/util/ArrayList:<init>	()V
    //   9: astore 4
    //   11: aconst_null
    //   12: astore_3
    //   13: aload_1
    //   14: ifnull +89 -> 103
    //   17: aload_1
    //   18: invokeinterface 158 1 0
    //   23: invokeinterface 164 1 0
    //   28: astore 7
    //   30: aload 7
    //   32: invokeinterface 172 1 0
    //   37: istore 8
    //   39: aconst_null
    //   40: astore_3
    //   41: iload 8
    //   43: ifeq +60 -> 103
    //   46: aload 7
    //   48: invokeinterface 176 1 0
    //   53: checkcast 178	java/lang/String
    //   56: astore 9
    //   58: aload 4
    //   60: new 252	org/apache/http/message/BasicNameValuePair
    //   63: dup
    //   64: aload 9
    //   66: aload_1
    //   67: aload 9
    //   69: invokeinterface 191 2 0
    //   74: checkcast 178	java/lang/String
    //   77: invokespecial 254	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   80: invokeinterface 260 2 0
    //   85: pop
    //   86: goto -56 -> 30
    //   89: astore 6
    //   91: aload 6
    //   93: athrow
    //   94: astore 5
    //   96: aload_3
    //   97: invokestatic 262	com/wandoujia/p4/pay/utils/HttpUtil:consumeContent	(Lorg/apache/http/HttpResponse;)V
    //   100: aload 5
    //   102: athrow
    //   103: new 264	org/apache/http/client/entity/UrlEncodedFormEntity
    //   106: dup
    //   107: aload 4
    //   109: ldc 8
    //   111: invokespecial 267	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   114: astore 11
    //   116: new 269	org/apache/http/client/methods/HttpPost
    //   119: dup
    //   120: aload_0
    //   121: invokespecial 270	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   124: astore 12
    //   126: aload 12
    //   128: aload 11
    //   130: invokevirtual 274	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   133: invokestatic 276	com/wandoujia/p4/pay/utils/HttpUtil:getHttpClient	()Lorg/apache/http/client/HttpClient;
    //   136: astore 13
    //   138: new 278	org/apache/http/protocol/BasicHttpContext
    //   141: dup
    //   142: invokespecial 279	org/apache/http/protocol/BasicHttpContext:<init>	()V
    //   145: astore 14
    //   147: aload 14
    //   149: ldc_w 281
    //   152: aload_2
    //   153: invokeinterface 287 3 0
    //   158: aload 13
    //   160: aload 12
    //   162: aload 14
    //   164: invokeinterface 293 3 0
    //   169: astore 15
    //   171: aload 15
    //   173: invokeinterface 297 1 0
    //   178: invokeinterface 303 1 0
    //   183: sipush 200
    //   186: if_icmpeq +48 -> 234
    //   189: new 152	java/lang/Exception
    //   192: dup
    //   193: new 180	java/lang/StringBuilder
    //   196: dup
    //   197: ldc_w 305
    //   200: invokespecial 219	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   203: aload 15
    //   205: invokeinterface 297 1 0
    //   210: invokeinterface 303 1 0
    //   215: invokevirtual 222	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   218: ldc 224
    //   220: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload_0
    //   224: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: invokespecial 306	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   233: athrow
    //   234: aload 15
    //   236: invokeinterface 31 1 0
    //   241: astore 16
    //   243: aload 16
    //   245: ifnonnull +14 -> 259
    //   248: aconst_null
    //   249: astore 18
    //   251: aload 15
    //   253: invokestatic 262	com/wandoujia/p4/pay/utils/HttpUtil:consumeContent	(Lorg/apache/http/HttpResponse;)V
    //   256: aload 18
    //   258: areturn
    //   259: aload 16
    //   261: ldc 8
    //   263: invokestatic 311	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   266: astore 17
    //   268: aload 17
    //   270: astore 18
    //   272: goto -21 -> 251
    //   275: astore 5
    //   277: aload 15
    //   279: astore_3
    //   280: goto -184 -> 96
    //   283: astore 6
    //   285: aload 15
    //   287: astore_3
    //   288: goto -197 -> 91
    //
    // Exception table:
    //   from	to	target	type
    //   2	11	89	java/lang/Exception
    //   17	30	89	java/lang/Exception
    //   30	39	89	java/lang/Exception
    //   46	86	89	java/lang/Exception
    //   103	171	89	java/lang/Exception
    //   2	11	94	finally
    //   17	30	94	finally
    //   30	39	94	finally
    //   46	86	94	finally
    //   91	94	94	finally
    //   103	171	94	finally
    //   171	234	275	finally
    //   234	243	275	finally
    //   259	268	275	finally
    //   171	234	283	java/lang/Exception
    //   234	243	283	java/lang/Exception
    //   259	268	283	java/lang/Exception
  }

  // ERROR //
  public static int sendPost(org.apache.http.client.methods.HttpPost paramHttpPost)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: iload_1
    //   7: iconst_5
    //   8: if_icmpge +40 -> 48
    //   11: invokestatic 276	com/wandoujia/p4/pay/utils/HttpUtil:getHttpClient	()Lorg/apache/http/client/HttpClient;
    //   14: aload_0
    //   15: invokeinterface 316 2 0
    //   20: astore_3
    //   21: aload_3
    //   22: invokeinterface 297 1 0
    //   27: invokeinterface 303 1 0
    //   32: istore_2
    //   33: aload_3
    //   34: invokestatic 262	com/wandoujia/p4/pay/utils/HttpUtil:consumeContent	(Lorg/apache/http/HttpResponse;)V
    //   37: iload_2
    //   38: sipush 200
    //   41: if_icmpne +9 -> 50
    //   44: aload_3
    //   45: invokestatic 262	com/wandoujia/p4/pay/utils/HttpUtil:consumeContent	(Lorg/apache/http/HttpResponse;)V
    //   48: iload_2
    //   49: ireturn
    //   50: aload_3
    //   51: invokestatic 262	com/wandoujia/p4/pay/utils/HttpUtil:consumeContent	(Lorg/apache/http/HttpResponse;)V
    //   54: iinc 1 1
    //   57: goto -51 -> 6
    //   60: astore 5
    //   62: aload_3
    //   63: invokestatic 262	com/wandoujia/p4/pay/utils/HttpUtil:consumeContent	(Lorg/apache/http/HttpResponse;)V
    //   66: goto -12 -> 54
    //   69: astore 4
    //   71: aload_3
    //   72: invokestatic 262	com/wandoujia/p4/pay/utils/HttpUtil:consumeContent	(Lorg/apache/http/HttpResponse;)V
    //   75: aload 4
    //   77: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   11	37	60	java/lang/Exception
    //   11	37	69	finally
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.HttpUtil
 * JD-Core Version:    0.6.0
 */