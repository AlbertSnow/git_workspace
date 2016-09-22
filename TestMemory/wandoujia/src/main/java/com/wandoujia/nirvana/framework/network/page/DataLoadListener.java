package com.wandoujia.nirvana.framework.network.page;

public abstract interface DataLoadListener<T>
{
  public abstract void a(DataLoadListener.Op paramOp);

  public abstract void a(DataLoadListener.Op paramOp, g<T> paramg);

  public abstract void a(DataLoadListener.Op paramOp, Exception paramException);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.page.DataLoadListener
 * JD-Core Version:    0.6.0
 */