package com.wandoujia.account.b;

import com.wandoujia.account.dto.AccountResponse;
import com.wandoujia.account.listener.b;

final class v
  implements Runnable
{
  v(u paramu, AccountResponse paramAccountResponse)
  {
  }

  public final void run()
  {
    if (a.f(this.b.a.a) != null)
    {
      b localb = a.f(this.b.a.a);
      this.a.getMember();
      localb.a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.v
 * JD-Core Version:    0.6.0
 */