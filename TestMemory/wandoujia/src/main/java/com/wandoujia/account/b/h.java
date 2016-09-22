package com.wandoujia.account.b;

import com.wandoujia.account.dto.AccountResponse;
import com.wandoujia.account.listener.IAccountListener.LoginType;
import com.wandoujia.account.listener.b;

final class h
  implements Runnable
{
  h(g paramg, AccountResponse paramAccountResponse)
  {
  }

  public final void run()
  {
    if (a.f(this.b.a) != null)
    {
      b localb = a.f(this.b.a);
      this.a.getMember();
      localb.a();
      a.a(this.b.a, this.a.getMember(), IAccountListener.LoginType.LOGIN);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.h
 * JD-Core Version:    0.6.0
 */