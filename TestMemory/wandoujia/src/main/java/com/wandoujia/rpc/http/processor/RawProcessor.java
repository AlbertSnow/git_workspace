package com.wandoujia.rpc.http.processor;

public class RawProcessor<T>
  implements Processor<T, T, Exception>
{
  public T process(T paramT)
  {
    return paramT;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.processor.RawProcessor
 * JD-Core Version:    0.6.0
 */