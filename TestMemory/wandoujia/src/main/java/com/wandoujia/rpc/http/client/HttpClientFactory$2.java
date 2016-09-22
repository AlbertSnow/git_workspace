package com.wandoujia.rpc.http.client;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

final class HttpClientFactory$2 extends DefaultHttpClient
{
  protected final HttpContext createHttpContext()
  {
    BasicHttpContext localBasicHttpContext = new BasicHttpContext();
    localBasicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
    localBasicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
    localBasicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
    return localBasicHttpContext;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.HttpClientFactory.2
 * JD-Core Version:    0.6.0
 */