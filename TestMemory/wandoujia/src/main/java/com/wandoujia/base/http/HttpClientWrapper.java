package com.wandoujia.base.http;

import com.wandoujia.base.utils.FreeHttpUtils;
import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class HttpClientWrapper
  implements HttpClient
{
  public static final int HTTP_ERROR_PARAMETER = 411;
  public static final int HTTP_EXPIRED = 412;
  public static final int HTTP_MODULAR_FAILED = 413;
  public static final int HTTP_SIGNATURE_FAILED = 419;
  public static final int HTTP_SIZE_OVERFLOW = 414;
  public static HttpClientWrapper.ErrorCodeHandler errorCodeHandler;
  private HttpClient httpClient;

  public HttpClientWrapper(HttpClient paramHttpClient)
  {
    setWrappedHttpClient(paramHttpClient);
  }

  private HttpHost determineTarget(HttpUriRequest paramHttpUriRequest)
  {
    URI localURI = paramHttpUriRequest.getURI();
    boolean bool = localURI.isAbsolute();
    HttpHost localHttpHost = null;
    if (bool)
      localHttpHost = new HttpHost(localURI.getHost(), localURI.getPort(), localURI.getScheme());
    return localHttpHost;
  }

  public static HttpClientWrapper newInstance(HttpClient paramHttpClient)
  {
    return new HttpClientWrapper(paramHttpClient);
  }

  public static void setErrorCodeHandler(HttpClientWrapper.ErrorCodeHandler paramErrorCodeHandler)
  {
    errorCodeHandler = paramErrorCodeHandler;
  }

  public <T> T execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler<? extends T> paramResponseHandler)
  {
    return execute(paramHttpHost, paramHttpRequest, paramResponseHandler, null);
  }

  public <T> T execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler<? extends T> paramResponseHandler, HttpContext paramHttpContext)
  {
    HttpRequest localHttpRequest;
    if (FreeHttpUtils.isInFreeMode())
    {
      paramHttpHost = FreeHttpUtils.FREE_HTTP_HOST;
      localHttpRequest = FreeHttpUtils.buildFreeRequest(paramHttpRequest);
      new StringBuilder("Change target ").append(paramHttpHost).append(", and ").append(((HttpRequestBase)localHttpRequest).getURI());
    }
    while (true)
    {
      if ((FreeHttpUtils.isInFreeMode()) && (errorCodeHandler != null))
        return this.httpClient.execute(paramHttpHost, localHttpRequest, new c(paramResponseHandler), paramHttpContext);
      return this.httpClient.execute(paramHttpHost, localHttpRequest, paramResponseHandler, paramHttpContext);
      localHttpRequest = paramHttpRequest;
    }
  }

  public <T> T execute(HttpUriRequest paramHttpUriRequest, ResponseHandler<? extends T> paramResponseHandler)
  {
    return execute(paramHttpUriRequest, paramResponseHandler, null);
  }

  public <T> T execute(HttpUriRequest paramHttpUriRequest, ResponseHandler<? extends T> paramResponseHandler, HttpContext paramHttpContext)
  {
    return execute(determineTarget(paramHttpUriRequest), paramHttpUriRequest, paramResponseHandler, paramHttpContext);
  }

  public HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest)
  {
    try
    {
      HttpResponse localHttpResponse = execute(paramHttpHost, paramHttpRequest, null);
      return localHttpResponse;
    }
    catch (Error localError)
    {
    }
    throw new IOException(localError.getMessage());
  }

  public HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    HttpRequest localHttpRequest;
    if (FreeHttpUtils.isInFreeMode())
    {
      paramHttpHost = FreeHttpUtils.FREE_HTTP_HOST;
      localHttpRequest = FreeHttpUtils.buildFreeRequest(paramHttpRequest);
      new StringBuilder("Change target ").append(paramHttpHost).append(", and ").append(((HttpRequestBase)localHttpRequest).getURI());
    }
    while (true)
    {
      HttpResponse localHttpResponse = this.httpClient.execute(paramHttpHost, localHttpRequest, paramHttpContext);
      if ((FreeHttpUtils.isInFreeMode()) && (errorCodeHandler != null) && (localHttpResponse.getStatusLine() != null))
        errorCodeHandler.onResponse(localHttpResponse.getStatusLine().getStatusCode());
      return localHttpResponse;
      localHttpRequest = paramHttpRequest;
    }
  }

  public HttpResponse execute(HttpUriRequest paramHttpUriRequest)
  {
    return execute(paramHttpUriRequest, null);
  }

  public HttpResponse execute(HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext)
  {
    if (paramHttpUriRequest == null)
      throw new IllegalArgumentException("Request must not be null.");
    return execute(determineTarget(paramHttpUriRequest), paramHttpUriRequest, paramHttpContext);
  }

  public ClientConnectionManager getConnectionManager()
  {
    return this.httpClient.getConnectionManager();
  }

  public HttpParams getParams()
  {
    return this.httpClient.getParams();
  }

  public void setWrappedHttpClient(HttpClient paramHttpClient)
  {
    this.httpClient = paramHttpClient;
    if ((this.httpClient instanceof AbstractHttpClient))
      ((AbstractHttpClient)this.httpClient).setRedirectHandler(new b());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.http.HttpClientWrapper
 * JD-Core Version:    0.6.0
 */