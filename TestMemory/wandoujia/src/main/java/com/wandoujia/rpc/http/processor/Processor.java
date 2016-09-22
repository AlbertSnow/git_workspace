package com.wandoujia.rpc.http.processor;

public abstract interface Processor<U, V, E extends Exception>
{
  public abstract V process(U paramU);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.processor.Processor
 * JD-Core Version:    0.6.0
 */