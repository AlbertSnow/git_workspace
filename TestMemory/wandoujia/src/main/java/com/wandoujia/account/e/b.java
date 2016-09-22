package com.wandoujia.account.e;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

final class b extends DefaultHttpClient
{
  b(ClientConnectionManager paramClientConnectionManager, HttpParams paramHttpParams)
  {
    super(paramClientConnectionManager, paramHttpParams);
  }

  protected final HttpContext createHttpContext()
  {
    BasicHttpContext localBasicHttpContext = new BasicHttpContext();
    localBasicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
    localBasicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
    localBasicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
    return localBasicHttpContext;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.e.b
 * JD-Core Version:    0.6.0
 */