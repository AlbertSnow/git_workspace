package com.wandoujia.account.b;

import com.sina.weibo.sdk.exception.WeiboException;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.listener.b;

final class r
  implements Runnable
{
  r(j paramj, WeiboException paramWeiboException)
  {
  }

  public final void run()
  {
    if (this.a != null)
    {
      a.f(this.b.a).a(new WandouResponse(1000002, this.a.getMessage()));
      return;
    }
    a.f(this.b.a).a(new WandouResponse());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.r
 * JD-Core Version:    0.6.0
 */