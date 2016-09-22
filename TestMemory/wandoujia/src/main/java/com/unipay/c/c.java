package com.unipay.c;

import com.unipay.tools.MyApplication;
import com.unipay.tools.a;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class c
{
  private HttpClient a;

  private static String a(e parame)
  {
    if (parame == null)
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 1;
    int j = 0;
    while (true)
    {
      if (j < parame.a())
        if (i != 0)
          i = 0;
      try
      {
        while (true)
        {
          localStringBuilder.append(URLEncoder.encode(parame.a(j), "utf-8") + "=" + URLEncoder.encode(parame.b(j), "utf-8"));
          label79: j++;
          break;
          localStringBuilder.append("&");
        }
        return localStringBuilder.toString();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label79;
      }
    }
  }

  public final InputStream a(String paramString1, e parame, String paramString2)
  {
    while (true)
    {
      try
      {
        if (paramString2.equals("GET"))
        {
          StringBuffer localStringBuffer = new StringBuffer(paramString1);
          localStringBuffer.append(a(parame));
          HttpGet localHttpGet = new HttpGet(localStringBuffer.toString());
          localHttpGet.addHeader("x-up-calling-line-id", a.e());
          localHttpGet.addHeader("user-agent", a.j());
          localHttpGet.addHeader("handphone", a.d());
          localHttpGet.addHeader("handua", "");
          localHttpGet.addHeader("settertype", "1");
          localHttpGet.addHeader("version", MyApplication.a);
          localHttpGet.addHeader("sessionid", "");
          localHttpGet.addHeader("imei", a.i());
          localHttpGet.addHeader("imsi", a.h());
          localHttpGet.addHeader("preassemble", "");
          localHttpGet.addHeader("wostorestate", "");
          localHttpGet.addHeader("newclient", "1");
          localHttpGet.addHeader("phoneAccessMode", "3");
          localHttpGet.addHeader("usertype", "0");
          localHttpGet.addHeader("clientchannelflag", "73");
          BasicHttpParams localBasicHttpParams = new BasicHttpParams();
          HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 30000);
          HttpConnectionParams.setSoTimeout(localBasicHttpParams, 30000);
          this.a = new DefaultHttpClient(localBasicHttpParams);
          this.a.getParams().setParameter("http.protocol.allow-circular-redirects", Boolean.valueOf(false));
          HttpResponse localHttpResponse = this.a.execute(localHttpGet);
          if (localHttpResponse.getStatusLine().getStatusCode() == 200)
          {
            InputStream localInputStream2 = localHttpResponse.getEntity().getContent();
            localInputStream1 = localInputStream2;
            if (localInputStream1 == null)
              return null;
            return localInputStream1;
          }
        }
      }
      catch (Exception localException)
      {
        return null;
      }
      InputStream localInputStream1 = null;
    }
  }

  public final InputStream b(String paramString1, e parame, String paramString2)
  {
    Object localObject;
    do
    {
      try
      {
        if (paramString2.equals("GET"))
        {
          StringBuffer localStringBuffer = new StringBuffer(paramString1);
          localStringBuffer.append(a(parame));
          HttpGet localHttpGet = new HttpGet(localStringBuffer.toString());
          BasicHttpParams localBasicHttpParams = new BasicHttpParams();
          HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 30000);
          HttpConnectionParams.setSoTimeout(localBasicHttpParams, 30000);
          this.a = new DefaultHttpClient(localBasicHttpParams);
          HttpResponse localHttpResponse = this.a.execute(localHttpGet);
          if (localHttpResponse.getStatusLine().getStatusCode() == 200)
          {
            localObject = localHttpResponse.getEntity().getContent();
            continue;
          }
        }
        else if (paramString2.equals("POST"))
        {
          String str = a(parame);
          URL localURL = new URL(paramString1);
          localURL.openConnection();
          HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
          localHttpURLConnection.setDoInput(true);
          localHttpURLConnection.setDoOutput(true);
          localHttpURLConnection.setConnectTimeout(30000);
          localHttpURLConnection.setReadTimeout(30000);
          localHttpURLConnection.setRequestProperty("Content-Type", "text/xml;charset=utf-8");
          localHttpURLConnection.setRequestProperty("Content-Length", Integer.toString(str.length()));
          localHttpURLConnection.setUseCaches(false);
          DataOutputStream localDataOutputStream = new DataOutputStream(localHttpURLConnection.getOutputStream());
          localDataOutputStream.write(str.getBytes());
          localDataOutputStream.flush();
          localDataOutputStream.close();
          if (localHttpURLConnection.getResponseCode() == 200)
          {
            InputStream localInputStream = localHttpURLConnection.getInputStream();
            localObject = localInputStream;
            continue;
            return localObject;
          }
        }
      }
      catch (Exception localException)
      {
        return null;
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        return null;
      }
      localObject = null;
    }
    while (localObject != null);
    return (InputStream)null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.c.c
 * JD-Core Version:    0.6.0
 */