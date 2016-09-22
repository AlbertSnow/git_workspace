package com.wandoujia.rpc.http.delegate;

import com.wandoujia.rpc.http.processor.Processor;
import com.wandoujia.rpc.http.request.HttpRequestBuilder;
import java.util.concurrent.ExecutionException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

public class HttpDelegate<U extends HttpRequestBuilder, T>
  implements ApiDelegate<T, ExecutionException>
{
  private final Processor<HttpResponse, T, ExecutionException> processor;
  private HttpUriRequest request;
  private final U requestBuilder;

  public HttpDelegate(U paramU, Processor<HttpResponse, T, ExecutionException> paramProcessor)
  {
    this.requestBuilder = paramU;
    this.processor = paramProcessor;
  }

  public HttpUriRequest getHttpRequest()
  {
    if (this.request == null)
      this.request = this.requestBuilder.build();
    return this.request;
  }

  public U getRequestBuilder()
  {
    return this.requestBuilder;
  }

  public T processResponse(HttpResponse paramHttpResponse)
  {
    return this.processor.process(paramHttpResponse);
  }

  public HttpUriRequest rebuildHttpRequest()
  {
    this.request = this.requestBuilder.build();
    return this.request;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.delegate.HttpDelegate
 * JD-Core Version:    0.6.0
 */