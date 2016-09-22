package com.wandoujia.rpc.http.processor;

import com.wandoujia.rpc.http.exception.HttpException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

public class EmptyResponseProcessor
  implements Processor<HttpResponse, Void, ExecutionException>
{
  public Void process(HttpResponse paramHttpResponse)
  {
    try
    {
      int i = paramHttpResponse.getStatusLine().getStatusCode();
      switch (i)
      {
      default:
        throw new ExecutionException(new HttpException(i, paramHttpResponse.getStatusLine().toString()));
      case 200:
      }
    }
    finally
    {
    }
    try
    {
      paramHttpResponse.getEntity().consumeContent();
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      try
      {
        paramHttpResponse.getEntity().consumeContent();
        label83: return null;
        localIOException1 = localIOException1;
      }
      catch (IOException localIOException2)
      {
        break label83;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.processor.EmptyResponseProcessor
 * JD-Core Version:    0.6.0
 */