package com.wandoujia.nirvana.framework.network.page;

public abstract class h<T>
  implements DataLoadListener<T>
{
  DataLoadListener<T> a;

  public h(DataLoadListener<T> paramDataLoadListener)
  {
    this.a = paramDataLoadListener;
  }

  public final void a(DataLoadListener.Op paramOp)
  {
    this.a.a(paramOp);
  }

  public final void a(DataLoadListener.Op paramOp, g<T> paramg)
  {
    this.a.a(paramOp, paramg);
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    this.a.a(paramOp, paramException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.page.h
 * JD-Core Version:    0.6.0
 */