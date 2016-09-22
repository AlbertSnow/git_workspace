package com.wandoujia.rpc.http.callback;

public abstract interface Callback<V, E extends Exception>
{
  public abstract void onError(E paramE);

  public abstract void onSuccess(V paramV);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.rpc.http.callback.Callback
 * JD-Core Version:    0.6.0
 */