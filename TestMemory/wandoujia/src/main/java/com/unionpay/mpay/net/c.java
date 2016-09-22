package com.unionpay.mpay.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.ByteArrayBuffer;

public final class c
{
  private HttpClient a = null;
  private HttpResponse b = null;
  private HttpEntity c = null;
  private byte[] d = null;
  private InputStream e = null;
  private d f = null;

  public c(d paramd)
  {
    this.f = paramd;
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    ConnManagerParams.setMaxTotalConnections(localBasicHttpParams, 20);
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 30000);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, 60000);
    HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 8192);
    HttpClientParams.setRedirecting(localBasicHttpParams, true);
    HttpProtocolParams.setUserAgent(localBasicHttpParams, "uppay");
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    localSchemeRegistry.register(new Scheme("https", new a(), 443));
    this.a = new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
  }

  public final int a()
  {
    if (this.f == null)
      return 1;
    if (this.f.a() == 1);
    for (Object localObject = new HttpPost(this.f.b()); ; localObject = new HttpGet(this.f.b()))
    {
      if (this.f.d() != null)
        ((HttpPost)localObject).setEntity(new ByteArrayEntity(this.f.d()));
      HashMap localHashMap = this.f.c();
      if (localHashMap == null)
        break;
      Iterator localIterator = localHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ((HttpUriRequest)localObject).addHeader(str, (String)localHashMap.get(str));
      }
    }
    try
    {
      this.b = this.a.execute((HttpUriRequest)localObject);
      if (this.b.getStatusLine().getStatusCode() == 200)
      {
        this.c = this.b.getEntity();
        if (this.c == null)
          break label369;
        localByteArrayBuffer = new ByteArrayBuffer(2048);
        byte[] arrayOfByte = new byte[2048];
        this.e = this.c.getContent();
        while (true)
        {
          int j = this.e.read(arrayOfByte, 0, 2048);
          if (j == -1)
            break;
          if (j <= 0)
            continue;
          localByteArrayBuffer.append(arrayOfByte, 0, j);
        }
      }
    }
    catch (SSLHandshakeException localSSLHandshakeException)
    {
      ByteArrayBuffer localByteArrayBuffer;
      new StringBuilder("e0:").append(localSSLHandshakeException.getMessage());
      i = 4;
      while (true)
      {
        return i;
        this.d = localByteArrayBuffer.toByteArray();
        i = 0;
        continue;
        if (this.b.getStatusLine().getStatusCode() == 401)
        {
          i = 8;
          continue;
        }
        new StringBuilder("http status code:").append(this.b.getStatusLine().getStatusCode());
        i = 1;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        if ("e1: " + localIOException != null)
          localIOException.getMessage();
        i = 1;
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
      {
        if ("e2: " + localIllegalStateException != null)
          localIllegalStateException.getMessage();
        i = 1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        label369: if ("e3: " + localException != null)
          localException.getMessage();
        int i = 1;
      }
    }
  }

  public final byte[] b()
  {
    return this.d;
  }

  public final String c()
  {
    if (this.d != null)
      try
      {
        this.d.toString();
        String str = new String(this.d, "utf-8");
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
      }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.net.c
 * JD-Core Version:    0.6.0
 */