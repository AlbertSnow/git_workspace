package com.android.volley.toolbox;

import com.android.volley.Request;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public final class h
  implements g
{
  private final i a;

  public h()
  {
    this(null);
  }

  public h(i parami)
  {
    this(parami, 0);
  }

  private h(i parami, byte paramByte)
  {
    this.a = parami;
  }

  private static HttpEntity a(HttpURLConnection paramHttpURLConnection)
  {
    BasicHttpEntity localBasicHttpEntity = new BasicHttpEntity();
    try
    {
      InputStream localInputStream2 = paramHttpURLConnection.getInputStream();
      localInputStream1 = localInputStream2;
      localBasicHttpEntity.setContent(localInputStream1);
      localBasicHttpEntity.setContentLength(paramHttpURLConnection.getContentLength());
      localBasicHttpEntity.setContentEncoding(paramHttpURLConnection.getContentEncoding());
      localBasicHttpEntity.setContentType(paramHttpURLConnection.getContentType());
      return localBasicHttpEntity;
    }
    catch (IOException localIOException)
    {
      while (true)
        InputStream localInputStream1 = paramHttpURLConnection.getErrorStream();
    }
  }

  private static void a(HttpURLConnection paramHttpURLConnection, Request<?> paramRequest)
  {
    byte[] arrayOfByte = paramRequest.m();
    if (arrayOfByte != null)
    {
      paramHttpURLConnection.setDoOutput(true);
      paramHttpURLConnection.addRequestProperty("Content-Type", paramRequest.l());
      DataOutputStream localDataOutputStream = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.close();
    }
  }

  public final HttpResponse a(Request<?> paramRequest, Map<String, String> paramMap)
  {
    String str1 = paramRequest.c();
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(paramRequest.h());
    localHashMap.putAll(paramMap);
    String str2;
    if (this.a != null)
    {
      str2 = this.a.a(str1);
      if (str2 == null)
        throw new IOException("URL blocked by rewriter: " + str1);
    }
    else
    {
      str2 = str1;
    }
    URL localURL = new URL(str2);
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
    int i = paramRequest.p();
    localHttpURLConnection.setConnectTimeout(i);
    localHttpURLConnection.setReadTimeout(i);
    localHttpURLConnection.setUseCaches(false);
    localHttpURLConnection.setDoInput(true);
    "https".equals(localURL.getProtocol());
    Iterator localIterator1 = localHashMap.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str3 = (String)localIterator1.next();
      localHttpURLConnection.addRequestProperty(str3, (String)localHashMap.get(str3));
    }
    switch (paramRequest.a())
    {
    default:
      throw new IllegalStateException("Unknown method type.");
    case -1:
      byte[] arrayOfByte = paramRequest.j();
      if (arrayOfByte == null)
        break;
      localHttpURLConnection.setDoOutput(true);
      localHttpURLConnection.setRequestMethod("POST");
      localHttpURLConnection.addRequestProperty("Content-Type", paramRequest.i());
      DataOutputStream localDataOutputStream = new DataOutputStream(localHttpURLConnection.getOutputStream());
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.close();
    case 0:
    case 3:
    case 1:
    case 2:
    }
    ProtocolVersion localProtocolVersion;
    while (true)
    {
      localProtocolVersion = new ProtocolVersion("HTTP", 1, 1);
      if (localHttpURLConnection.getResponseCode() != -1)
        break;
      throw new IOException("Could not retrieve response code from HttpUrlConnection.");
      localHttpURLConnection.setRequestMethod("GET");
      continue;
      localHttpURLConnection.setRequestMethod("DELETE");
      continue;
      localHttpURLConnection.setRequestMethod("POST");
      a(localHttpURLConnection, paramRequest);
      continue;
      localHttpURLConnection.setRequestMethod("PUT");
      a(localHttpURLConnection, paramRequest);
    }
    BasicHttpResponse localBasicHttpResponse = new BasicHttpResponse(new BasicStatusLine(localProtocolVersion, localHttpURLConnection.getResponseCode(), localHttpURLConnection.getResponseMessage()));
    localBasicHttpResponse.setEntity(a(localHttpURLConnection));
    Iterator localIterator2 = localHttpURLConnection.getHeaderFields().entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator2.next();
      if (localEntry.getKey() == null)
        continue;
      localBasicHttpResponse.addHeader(new BasicHeader((String)localEntry.getKey(), (String)((List)localEntry.getValue()).get(0)));
    }
    return localBasicHttpResponse;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.h
 * JD-Core Version:    0.6.0
 */