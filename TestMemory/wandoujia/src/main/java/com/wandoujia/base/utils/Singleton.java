package com.wandoujia.base.utils;

public abstract class Singleton<T>
{
  private T mInstance;

  protected abstract T create();

  public final T get()
  {
    monitorenter;
    try
    {
      if (this.mInstance == null)
        this.mInstance = create();
      Object localObject2 = this.mInstance;
      return localObject2;
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.Singleton
 * JD-Core Version:    0.6.0
 */