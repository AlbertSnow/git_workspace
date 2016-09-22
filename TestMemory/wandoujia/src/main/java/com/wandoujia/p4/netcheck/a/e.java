package com.wandoujia.p4.netcheck.a;

import com.wandoujia.p4.http.b.ac;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpParams;

public final class e extends ac
{
  private String a;

  public final e a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final HttpResponse a(HttpResponse paramHttpResponse)
  {
    return super.a(paramHttpResponse);
  }

  public final HttpUriRequest getHttpRequest()
  {
    HttpGet localHttpGet = new HttpGet(this.a);
    localHttpGet.addHeader("Range", "bytes=0-131072");
    localHttpGet.getParams().setParameter("http.protocol.handle-redirects", Boolean.valueOf(false));
    return localHttpGet;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.a.e
 * JD-Core Version:    0.6.0
 */