package com.sina.weibo.sdk;

import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.f;
import java.util.concurrent.CountDownLatch;

final class d
  implements f
{
  d(b paramb)
  {
  }

  public final void a(WeiboException paramWeiboException)
  {
    b.b();
    new StringBuilder("requestNotificationInfo WeiboException Msg : ").append(paramWeiboException.getMessage());
    b.c(this.a).countDown();
  }

  public final void a(String paramString)
  {
    b.a(this.a, new e(paramString));
    b.c(this.a).countDown();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.d
 * JD-Core Version:    0.6.0
 */