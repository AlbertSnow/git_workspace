package com.wandoujia.account.b;

import com.wandoujia.account.dto.AccountResponse;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.listener.b;

final class n
  implements Runnable
{
  n(l paraml, AccountResponse paramAccountResponse)
  {
  }

  public final void run()
  {
    if (a.f(this.b.a.a) != null)
      a.f(this.b.a.a).a(new WandouResponse(this.a.getError(), this.a.getMsg()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.n
 * JD-Core Version:    0.6.0
 */