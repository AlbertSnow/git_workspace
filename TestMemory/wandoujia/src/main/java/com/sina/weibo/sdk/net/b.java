package com.sina.weibo.sdk.net;

import com.sina.weibo.sdk.exception.WeiboException;

final class b<T>
{
  private T a;
  private WeiboException b;

  public b(WeiboException paramWeiboException)
  {
    this.b = paramWeiboException;
  }

  public b(T paramT)
  {
    this.a = paramT;
  }

  public final T a()
  {
    return this.a;
  }

  public final WeiboException b()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.net.b
 * JD-Core Version:    0.6.0
 */