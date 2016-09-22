package com.wandoujia.p4.pay.model;

public abstract interface CallBackEx<T> extends CallBack<T>
{
  public abstract void onPending(T paramT);

  public abstract void onProcessing(T paramT);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.CallBackEx
 * JD-Core Version:    0.6.0
 */