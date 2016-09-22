package com.sina.weibo.sdk.net;

import android.text.TextUtils;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.RedirectHandler;
import org.apache.http.protocol.HttpContext;

public abstract class d
  implements RedirectHandler
{
  String a;
  private int b;
  private String c;

  static
  {
    d.class.getCanonicalName();
  }

  public URI getLocationURI(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    new StringBuilder("CustomRedirectHandler getLocationURI getRedirectUrl : ").append(this.c);
    if (!TextUtils.isEmpty(this.c))
      return URI.create(this.c);
    return null;
  }

  public boolean isRedirectRequested(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    int i = paramHttpResponse.getStatusLine().getStatusCode();
    if ((i == 301) || (i == 302))
    {
      this.c = paramHttpResponse.getFirstHeader("Location").getValue();
      if ((!TextUtils.isEmpty(this.c)) && (this.b < 15))
      {
        this.b = (1 + this.b);
        return true;
      }
    }
    else if (i == 200)
    {
      this.a = this.c;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.net.d
 * JD-Core Version:    0.6.0
 */