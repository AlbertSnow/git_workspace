package com.wandoujia.rpc.http.delegate;

import com.wandoujia.rpc.http.processor.EmptyResponseProcessor;
import com.wandoujia.rpc.http.request.HttpRequestBuilder;

public class SubmitDelegate<U extends HttpRequestBuilder> extends HttpDelegate<U, Void>
{
  public SubmitDelegate(U paramU)
  {
    super(paramU, new EmptyResponseProcessor());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.delegate.SubmitDelegate
 * JD-Core Version:    0.6.0
 */