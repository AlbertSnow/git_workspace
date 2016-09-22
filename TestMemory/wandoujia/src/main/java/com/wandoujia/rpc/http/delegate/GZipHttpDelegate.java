package com.wandoujia.rpc.http.delegate;

import com.wandoujia.rpc.http.processor.GZipHttpResponseProcessor;
import com.wandoujia.rpc.http.processor.Processor;
import com.wandoujia.rpc.http.processor.ProcessorConnector;
import com.wandoujia.rpc.http.request.HttpRequestBuilder;

public class GZipHttpDelegate<U extends HttpRequestBuilder, T> extends HttpDelegate<U, T>
{
  private final Processor<String, T, ? extends Exception> contentProcessor;

  public GZipHttpDelegate(U paramU, Processor<String, T, ? extends Exception> paramProcessor)
  {
    super(paramU, ProcessorConnector.connect(new GZipHttpResponseProcessor(), paramProcessor));
    this.contentProcessor = paramProcessor;
  }

  public Processor<String, T, ? extends Exception> getContentProcessor()
  {
    return this.contentProcessor;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.delegate.GZipHttpDelegate
 * JD-Core Version:    0.6.0
 */