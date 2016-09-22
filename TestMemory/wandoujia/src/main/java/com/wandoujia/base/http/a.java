package com.wandoujia.base.http;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class a
  implements X509TrustManager
{
  public final void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
  }

  public final void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
  }

  public final X509Certificate[] getAcceptedIssuers()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.http.a
 * JD-Core Version:    0.6.0
 */