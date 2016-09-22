package com.wandoujia.rpc.http.processor;

import java.util.concurrent.ExecutionException;

public class ProcessorConnector<U, V, T>
  implements Processor<U, T, ExecutionException>
{
  private final Processor<V, T, ? extends Exception> downstreamProcessor;
  private final Processor<U, V, ? extends Exception> upstreamProcessor;

  private ProcessorConnector(Processor<U, V, ? extends Exception> paramProcessor, Processor<V, T, ? extends Exception> paramProcessor1)
  {
    this.upstreamProcessor = paramProcessor;
    this.downstreamProcessor = paramProcessor1;
  }

  public static <U, V, T> ProcessorConnector<U, V, T> connect(Processor<U, V, ? extends Exception> paramProcessor, Processor<V, T, ? extends Exception> paramProcessor1)
  {
    return new ProcessorConnector(paramProcessor, paramProcessor1);
  }

  public <R> ProcessorConnector<U, T, R> connect(Processor<T, R, ? extends Exception> paramProcessor)
  {
    return new ProcessorConnector(this, paramProcessor);
  }

  public T process(U paramU)
  {
    try
    {
      Object localObject = this.downstreamProcessor.process(this.upstreamProcessor.process(paramU));
      return localObject;
    }
    catch (Exception localException)
    {
    }
    throw new ExecutionException(localException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.processor.ProcessorConnector
 * JD-Core Version:    0.6.0
 */