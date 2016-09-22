package com.wandoujia.download2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build.VERSION;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.alipay.android.app.exception.NetErrorException;
import com.alipay.wandoujia.i;
import com.alipay.wandoujia.id;
import com.alipay.wandoujia.x;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpParams;

public final class g
{
  private Context a;
  private String b;

  public g(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
  }

  private URL b()
  {
    try
    {
      new StringBuilder("mUrl : ").append(this.b);
      com.wandoujia.image.c.a.a().d();
      URL localURL = new URL(this.b);
      return localURL;
    }
    catch (Exception localException)
    {
      b.b(localException);
    }
    return null;
  }

  private NetworkInfo c()
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
      return localNetworkInfo;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final String a()
  {
    return this.b;
  }

  public final HttpResponse a(String paramString, com.wandoujia.clean.b.a parama)
  {
    if (x.b(this.a) == id.o)
      throw new NetErrorException();
    com.wandoujia.game_launcher.a locala = com.wandoujia.game_launcher.a.a();
    HttpResponse localHttpResponse;
    while (true)
    {
      try
      {
        HttpParams localHttpParams = locala.c();
        if (Build.VERSION.SDK_INT < 11)
          continue;
        URL localURL = b();
        if (localURL == null)
          break label719;
        if (!"https".equalsIgnoreCase(localURL.getProtocol()))
          continue;
        String str5 = System.getProperty("https.proxyHost");
        String str6 = System.getProperty("https.proxyPort");
        Object localObject2 = str5;
        Object localObject3 = str6;
        if (TextUtils.isEmpty((CharSequence)localObject2))
          break label719;
        localHttpHost = new HttpHost((String)localObject2, Integer.parseInt((String)localObject3));
        if (localHttpHost == null)
          continue;
        localHttpParams.setParameter("http.route.default-proxy", localHttpHost);
        new StringBuilder("requestUrl : ").append(this.b);
        com.wandoujia.image.c.a.a().d();
        com.wandoujia.image.c.a.a().d();
        if (!TextUtils.isEmpty(paramString))
          continue;
        localObject1 = new HttpGet(this.b);
        if (parama == null)
          continue;
        ArrayList localArrayList = parama.a();
        if (localArrayList == null)
          continue;
        localIterator = localArrayList.iterator();
        if (localIterator.hasNext())
          continue;
        if (!com.wandoujia.image.c.a.a().d())
          continue;
        ((HttpUriRequest)localObject1).addHeader("OS", "Android");
        com.wandoujia.image.c.a.a().d();
        localHttpResponse = locala.a((HttpUriRequest)localObject1);
        com.wandoujia.image.c.a.a().d();
        Header[] arrayOfHeader1 = localHttpResponse.getHeaders("X-Hostname");
        if ((arrayOfHeader1 == null) || (arrayOfHeader1.length <= 0) || (arrayOfHeader1[0] == null))
          continue;
        localHttpResponse.getHeaders("X-Hostname")[0].toString();
        com.wandoujia.image.c.a.a().d();
        Header[] arrayOfHeader2 = localHttpResponse.getHeaders("X-ExecuteTime");
        if ((arrayOfHeader2 == null) || (arrayOfHeader2.length <= 0) || (arrayOfHeader2[0] == null))
          break;
        localHttpResponse.getHeaders("X-ExecuteTime")[0].toString();
        com.wandoujia.image.c.a.a().d();
        return localHttpResponse;
        String str3 = System.getProperty("http.proxyHost");
        String str4 = System.getProperty("http.proxyPort");
        localObject2 = str3;
        localObject3 = str4;
        continue;
        NetworkInfo localNetworkInfo = c();
        if ((localNetworkInfo == null) || (!localNetworkInfo.isAvailable()) || (localNetworkInfo.getType() != 0))
          break label713;
        String str2 = Proxy.getDefaultHost();
        int i = Proxy.getDefaultPort();
        if (str2 == null)
          break label713;
        localHttpHost = new HttpHost(str2, i);
        continue;
      }
      catch (NetErrorException localNetErrorException)
      {
        throw localNetErrorException;
        localObject1 = new HttpPost(this.b);
        if (parama != null)
        {
          str1 = parama.b();
          if (TextUtils.isEmpty(parama.c()))
            continue;
          paramString = parama.c() + "=" + paramString;
          if (!TextUtils.isEmpty(str1))
            continue;
          str1 = "application/octet-stream;binary/octet-stream";
          ByteArrayEntity localByteArrayEntity = new ByteArrayEntity(paramString.getBytes("utf-8"));
          localByteArrayEntity.setContentType(str1);
          ((HttpPost)localObject1).setEntity(localByteArrayEntity);
          ((HttpUriRequest)localObject1).addHeader("Accept-Charset", "UTF-8");
          ((HttpUriRequest)localObject1).addHeader("Accept-Encoding", "gzip");
          continue;
        }
      }
      catch (ConnectTimeoutException localConnectTimeoutException)
      {
        Object localObject1;
        Iterator localIterator;
        if (locala == null)
          continue;
        locala.b();
        i.a().c(localConnectTimeoutException, "connction time out");
        b.b(localConnectTimeoutException);
        throw new NetErrorException();
        ((HttpUriRequest)localObject1).addHeader((Header)localIterator.next());
        continue;
      }
      catch (SocketException localSocketException)
      {
        i.a().c(localSocketException, "connect reset");
        b.b(localSocketException);
        throw new NetErrorException();
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        i.a().c(localSocketTimeoutException, "socket time out");
        b.b(localSocketTimeoutException);
        throw new NetErrorException();
      }
      catch (Exception localException)
      {
        i.a().c(localException, "connction net error");
        b.b(localException);
        throw new NetErrorException();
      }
      String str1 = null;
      continue;
      label713: HttpHost localHttpHost = null;
      continue;
      label719: localHttpHost = null;
    }
    return (HttpResponse)(HttpResponse)(HttpResponse)localHttpResponse;
  }

  public final void a(String paramString)
  {
    this.b = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.g
 * JD-Core Version:    0.6.0
 */