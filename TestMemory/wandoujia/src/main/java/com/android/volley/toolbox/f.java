package com.android.volley.toolbox;

import com.android.volley.Request;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class f
  implements g
{
  private HttpClient a;

  public f(HttpClient paramHttpClient)
  {
    this.a = paramHttpClient;
  }

  private static void a(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, Request<?> paramRequest)
  {
    byte[] arrayOfByte = paramRequest.m();
    if (arrayOfByte != null)
      paramHttpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(arrayOfByte));
  }

  private static void a(HttpUriRequest paramHttpUriRequest, Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramHttpUriRequest.setHeader(str, (String)paramMap.get(str));
    }
  }

  public final HttpResponse a(Request<?> paramRequest, Map<String, String> paramMap)
  {
    Object localObject;
    switch (paramRequest.a())
    {
    default:
      throw new IllegalStateException("Unknown request method.");
    case -1:
      byte[] arrayOfByte = paramRequest.j();
      if (arrayOfByte == null)
        break;
      localObject = new HttpPost(paramRequest.c());
      ((HttpPost)localObject).addHeader("Content-Type", paramRequest.i());
      ((HttpPost)localObject).setEntity(new ByteArrayEntity(arrayOfByte));
    case 0:
    case 3:
    case 1:
    case 2:
    }
    while (true)
    {
      a((HttpUriRequest)localObject, paramMap);
      a((HttpUriRequest)localObject, paramRequest.h());
      HttpParams localHttpParams = ((HttpUriRequest)localObject).getParams();
      int i = paramRequest.p();
      HttpConnectionParams.setConnectionTimeout(localHttpParams, 5000);
      HttpConnectionParams.setSoTimeout(localHttpParams, i);
      HttpClientParams.setRedirecting(localHttpParams, true);
      return this.a.execute((HttpUriRequest)localObject);
      localObject = new HttpGet(paramRequest.c());
      continue;
      localObject = new HttpGet(paramRequest.c());
      continue;
      localObject = new HttpDelete(paramRequest.c());
      continue;
      localObject = new HttpPost(paramRequest.c());
      ((HttpPost)localObject).addHeader("Content-Type", paramRequest.l());
      a((HttpEntityEnclosingRequestBase)localObject, paramRequest);
      continue;
      localObject = new HttpPut(paramRequest.c());
      ((HttpPut)localObject).addHeader("Content-Type", paramRequest.l());
      a((HttpEntityEnclosingRequestBase)localObject, paramRequest);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.f
 * JD-Core Version:    0.6.0
 */