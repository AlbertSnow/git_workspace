package com.wandoujia.account.g;

import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.AccountResponse;
import com.wandoujia.account.dto.WandouResponse;

final class b
  implements Runnable
{
  b(a parama, AccountResponse paramAccountResponse)
  {
  }

  public final void run()
  {
    if (this.a != null)
    {
      if (this.a.getError() == AccountError.SUCCESS.getError())
      {
        if (this.a.getMember() != null)
        {
          com.wandoujia.account.listener.a locala = this.b.a;
          this.a.getMember();
          locala.a(this.b.c);
          return;
        }
        if (this.b.b)
        {
          this.b.a.a();
          return;
        }
        this.b.a.a(this.b.c);
        return;
      }
      this.b.a.a(new WandouResponse(this.a.getError(), this.a.getMsg(), this.a.getVerificationGroups(), this.a.getArgs()));
      return;
    }
    this.b.a.a(new WandouResponse(1000003, android.support.v4.app.b.l(R.string.account_sdk_netop_server_error)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.b
 * JD-Core Version:    0.6.0
 */