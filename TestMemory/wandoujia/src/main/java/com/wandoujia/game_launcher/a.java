package com.wandoujia.game_launcher;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.alipay.android.app.exception.NetErrorException;
import com.alipay.wandoujia.i;
import com.alipay.wandoujia.v;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.game_launcher.models.RecommendModel;
import java.io.IOException;
import java.net.ConnectException;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class a
{
  private static a a;
  private final DefaultHttpClient b;

  private a(ClientConnectionManager paramClientConnectionManager, HttpParams paramHttpParams)
  {
    this.b = new DefaultHttpClient(paramClientConnectionManager, paramHttpParams);
  }

  private a(HttpParams paramHttpParams)
  {
    this.b = new DefaultHttpClient(paramHttpParams);
  }

  public static a a()
  {
    BasicHttpParams localBasicHttpParams;
    if (a == null)
    {
      localBasicHttpParams = new BasicHttpParams();
      HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
      HttpConnectionParams.setStaleCheckingEnabled(localBasicHttpParams, true);
      localBasicHttpParams.setBooleanParameter("http.protocol.expect-continue", false);
      ConnManagerParams.setMaxTotalConnections(localBasicHttpParams, 50);
      ConnManagerParams.setMaxConnectionsPerRoute(localBasicHttpParams, new ConnPerRouteBean(30));
      ConnManagerParams.setTimeout(localBasicHttpParams, 1000L);
      com.alipay.android.app.d locald = com.wandoujia.image.c.a.a().c();
      HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, locald.i());
      HttpConnectionParams.setSoTimeout(localBasicHttpParams, locald.j());
      HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, locald.k());
      HttpProtocolParams.setUseExpectContinue(localBasicHttpParams, false);
      HttpClientParams.setRedirecting(localBasicHttpParams, true);
      HttpClientParams.setAuthenticating(localBasicHttpParams, false);
      HttpProtocolParams.setUserAgent(localBasicHttpParams, "msp");
    }
    try
    {
      KeyStore localKeyStore = KeyStore.getInstance("BKS");
      localKeyStore.load(com.wandoujia.image.c.a.a().b().getAssets().open("android.bks"), "mobilesp".toCharArray());
      if ((Build.MODEL.contains("HTC")) && (Build.VERSION.SDK_INT <= 8));
      for (Object localObject = SSLSocketFactory.getSocketFactory(); ; localObject = new v(localKeyStore))
      {
        ((SSLSocketFactory)localObject).setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        Scheme localScheme1 = new Scheme("https", (SocketFactory)localObject, 443);
        Scheme localScheme2 = new Scheme("http", PlainSocketFactory.getSocketFactory(), 80);
        SchemeRegistry localSchemeRegistry = new SchemeRegistry();
        localSchemeRegistry.register(localScheme1);
        localSchemeRegistry.register(localScheme2);
        a = new a(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
        return a;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        i.a().c(localException, "https cert check");
        android.support.v4.app.b.b(localException);
        com.wandoujia.image.c.a.a().d();
        a = new a(localBasicHttpParams);
      }
    }
  }

  public static void a(String paramString, d<RecommendModel> paramd)
  {
    ThreadPool.execute(new b(paramString, paramd));
  }

  public final HttpResponse a(HttpUriRequest paramHttpUriRequest)
  {
    try
    {
      Iterator localIterator;
      if (com.wandoujia.image.c.a.a().d())
        localIterator = this.b.getCookieStore().getCookies().iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          return this.b.execute(paramHttpUriRequest);
        Cookie localCookie = (Cookie)localIterator.next();
        new StringBuilder("name: ").append(localCookie.getName()).append(" value: ").append(localCookie.getValue());
      }
    }
    catch (ConnectException localConnectException)
    {
      i.a().c(localConnectException, "ConnectException");
      throw new NetErrorException(localConnectException);
    }
    catch (IOException localIOException)
    {
      i.a().c(localIOException, "IOException");
    }
    throw new NetErrorException(localIOException);
  }

  public final void b()
  {
    ClientConnectionManager localClientConnectionManager = this.b.getConnectionManager();
    if (localClientConnectionManager != null)
    {
      localClientConnectionManager.shutdown();
      a = null;
    }
  }

  public final HttpParams c()
  {
    return this.b.getParams();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.a
 * JD-Core Version:    0.6.0
 */