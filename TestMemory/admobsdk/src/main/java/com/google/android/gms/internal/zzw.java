package com.google.android.gms.internal;

import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class zzw
  implements zzy
{
  protected final HttpClient zzaD;

  public zzw(HttpClient paramHttpClient)
  {
    this.zzaD = paramHttpClient;
  }

  private static void zza(HttpUriRequest paramHttpUriRequest, Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramHttpUriRequest.setHeader(str, (String)paramMap.get(str));
    }
  }

  public HttpResponse zza(zzk<?> paramzzk, Map<String, String> paramMap)
    throws IOException, zza
  {
    HttpUriRequest localHttpUriRequest = zzb(paramzzk, paramMap);
    zza(localHttpUriRequest, paramMap);
    zza(localHttpUriRequest, paramzzk.getHeaders());
    zza(localHttpUriRequest);
    HttpParams localHttpParams = localHttpUriRequest.getParams();
    int i = paramzzk.zzt();
    HttpConnectionParams.setConnectionTimeout(localHttpParams, 5000);
    HttpConnectionParams.setSoTimeout(localHttpParams, i);
    return this.zzaD.execute(localHttpUriRequest);
  }

  static HttpUriRequest zzb(zzk<?> paramzzk, Map<String, String> paramMap)
    throws zza
  {
    Object localObject;
    switch (paramzzk.getMethod())
    {
    case -1:
      localObject = paramzzk.zzm();
      if (localObject != null)
      {
        HttpPost localHttpPost = new HttpPost(paramzzk.getUrl());
        localHttpPost.addHeader("Content-Type", paramzzk.zzl());
        ByteArrayEntity localByteArrayEntity = new ByteArrayEntity(localObject);
        localHttpPost.setEntity(localByteArrayEntity);
        return localHttpPost;
      }
      return new HttpGet(paramzzk.getUrl());
    case 0:
      return new HttpGet(paramzzk.getUrl());
    case 3:
      return new HttpDelete(paramzzk.getUrl());
    case 1:
      localObject = new HttpPost(paramzzk.getUrl());
      ((HttpPost)localObject).addHeader("Content-Type", paramzzk.zzp());
      zza((HttpEntityEnclosingRequestBase)localObject, paramzzk);
      return localObject;
    case 2:
      localObject = new HttpPut(paramzzk.getUrl());
      ((HttpPut)localObject).addHeader("Content-Type", paramzzk.zzp());
      zza((HttpEntityEnclosingRequestBase)localObject, paramzzk);
      return localObject;
    case 4:
      return new HttpHead(paramzzk.getUrl());
    case 5:
      return new HttpOptions(paramzzk.getUrl());
    case 6:
      return new HttpTrace(paramzzk.getUrl());
    case 7:
      localObject = new zza(paramzzk.getUrl());
      ((zza)localObject).addHeader("Content-Type", paramzzk.zzp());
      zza((HttpEntityEnclosingRequestBase)localObject, paramzzk);
      return localObject;
    }
    throw new IllegalStateException("Unknown request method.");
  }

  private static void zza(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, zzk<?> paramzzk)
    throws zza
  {
    byte[] arrayOfByte = paramzzk.zzq();
    if (arrayOfByte != null)
    {
      ByteArrayEntity localByteArrayEntity = new ByteArrayEntity(arrayOfByte);
      paramHttpEntityEnclosingRequestBase.setEntity(localByteArrayEntity);
    }
  }

  protected void zza(HttpUriRequest paramHttpUriRequest)
    throws IOException
  {
  }

  public static final class zza extends HttpEntityEnclosingRequestBase
  {
    public zza()
    {
    }

    public zza(String paramString)
    {
      setURI(URI.create(paramString));
    }

    public String getMethod()
    {
      return "PATCH";
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzw
 * JD-Core Version:    0.6.0
 */