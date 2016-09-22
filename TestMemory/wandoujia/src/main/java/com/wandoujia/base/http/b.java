package com.wandoujia.base.http;

import com.wandoujia.base.utils.FreeHttpUtils;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.RedirectHandler;
import org.apache.http.protocol.HttpContext;

final class b
  implements RedirectHandler
{
  public final URI getLocationURI(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    if (paramHttpResponse.containsHeader("Location"))
    {
      Header[] arrayOfHeader = paramHttpResponse.getHeaders("Location");
      if ((arrayOfHeader != null) && (arrayOfHeader.length > 0))
        return FreeHttpUtils.buildFreeURIIfNeed(URI.create(arrayOfHeader[0].getValue()));
    }
    return null;
  }

  public final boolean isRedirectRequested(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    int i = paramHttpResponse.getStatusLine().getStatusCode();
    return (i == 302) || (i == 301) || (i == 303);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.http.b
 * JD-Core Version:    0.6.0
 */